/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.metacentrum.perun.voot.comparators.vootmembercomparator;

import cz.metacentrum.perun.voot.VOOTMember;
import java.util.Comparator;

/**
 * Comparator for members, which compare ascending by id.
 *
 * @author Martin Malik <374128@mail.muni.cz>
 * @version $Id: $
 */
public class VOOTMemberIdAscComparator implements Comparator<VOOTMember>{

	@Override
		public int compare(VOOTMember vootMember1, VOOTMember vootMember2) {
			return vootMember1.getId().compareTo(vootMember2.getId());
		}
}
