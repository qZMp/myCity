/**
 * 
 */
package edu.ucsd.mycity.usercontent;

import com.google.android.maps.OverlayItem;

/**
 * @author FLL
 * 
 */
public class UserContOverlayItem extends OverlayItem
{
	private UserContEntry entry;

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	public UserContOverlayItem(UserContEntry entry)
	{
		super(entry.getLocation(), entry.getName(), entry.getDescription());
		this.entry = entry;
	}

	public UserContEntry getEntry()
	{
		return this.entry;
	}

}
