/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.metacentrum.perun.voot.comparators.vootmembercomparator;

import cz.metacentrum.perun.voot.VOOTMember;
import java.util.Comparator;

/**
 * Comparator for members, which compare descending by dispalay name.
 *
 * @author Martin Malik <374128@mail.muni.cz>
 * @version $Id: $
 */
public class VOOTMemberDisplayNameDescComparator implements Comparator<VOOTMember>{

	@Override
		public int compare(VOOTMember vootMember1, VOOTMember vootMember2) {
			return vootMember2.getDisplayName().compareTo(vootMember1.getDisplayName());
		}
}
