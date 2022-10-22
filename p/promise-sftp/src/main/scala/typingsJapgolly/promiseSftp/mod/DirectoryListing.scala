package typingsJapgolly.promiseSftp.mod

import typingsJapgolly.promiseSftp.anon.Group
import typingsJapgolly.promiseSftp.promiseSftpStrings.`-_`
import typingsJapgolly.promiseSftp.promiseSftpStrings.d
import typingsJapgolly.promiseSftp.promiseSftpStrings.l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Output of `PromiseSftp#list()` */
trait DirectoryListing extends StObject {
  
  /** The last modified date of the entry. */
  var date: js.Date
  
  /** The group name or ID that this entry belongs to. *NIX only */
  var group: js.UndefOr[String] = js.undefined
  
  /** The name of the entry. */
  var name: String
  
  /** The user name or ID that this entry belongs to. *NIX only */
  var owner: js.UndefOr[String] = js.undefined
  
  /** The various permissions for this entry. *NIX only */
  var rights: js.UndefOr[Group] = js.undefined
  
  /** True if the sticky bit is set for this entry */
  var sticky: js.UndefOr[Boolean] = js.undefined
  
  /** For symlink entries, this is the symlink's target. *NIX only */
  var target: js.UndefOr[String] = js.undefined
  
  /** `d` for directory, `-` for file, and `l` for symlink only on *NIX. */
  var `type`: d | `-_` | l
}
object DirectoryListing {
  
  inline def apply(date: js.Date, name: String, `type`: d | `-_` | l): DirectoryListing = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryListing]
  }
  
  extension [Self <: DirectoryListing](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRights(value: Group): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: d | `-_` | l): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
