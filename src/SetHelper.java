import java.util.HashSet;
import java.util.Set;

/**
 * Description: SetHelper class is template used performs a union, intersect,
 * difference, and symmetric difference.
 *
 * Created by Casey Morris on 1/22/15.
 */
public class SetHelper<AnyType> {

    /**
     * Description: Takes two sets and returns the intersect of the two.
     * @param s1
     * @param s2
     * @return the intersect of two sets.
     */
    public Set<AnyType> intersect(Set<AnyType> s1, Set<AnyType> s2)
    {
        Set<AnyType> intersection = new HashSet<AnyType>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    /**
     * Description: Takes two sets and returns the union
     * @param s1
     * @param s2
     * @return the union of two sets
     */
    public Set<AnyType> union(Set<AnyType> s1, Set<AnyType> s2)
    {
        Set<AnyType> union = new HashSet<AnyType>(s1);
        union.addAll(s2);
        return union;
    }

    /**
     * Description: Takes two sets and returns the difference
     * @param s1
     * @param s2
     * @return the difference of two sets
     */
    public Set<AnyType> difference(Set<AnyType> s1, Set<AnyType> s2)
    {
        Set<AnyType> difference = new HashSet<AnyType>(s1);
        difference.removeAll(s2);
        return difference;
    }

    /**
     * Description: Takes two sets and returns the symmetric difference
     * @param s1
     * @param s2
     * @return the symmetric difference to two sets
     */
    public Set<AnyType> symmetricDifference(Set<AnyType> s1, Set<AnyType> s2)
    {
        Set<AnyType> unionOfS1andS2 = union(s1,s2);
        Set<AnyType> intersectOfS1andS2 = intersect(s1, s2);
        Set<AnyType> symDiffOfS1andS2 = difference(unionOfS1andS2,intersectOfS1andS2);

        return symDiffOfS1andS2;
    }
}
