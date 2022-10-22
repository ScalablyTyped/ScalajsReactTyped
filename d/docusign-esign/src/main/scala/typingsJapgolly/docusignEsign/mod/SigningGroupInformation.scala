package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningGroupInformation extends StObject {
  
  /**
    * A collection group objects containing information about the groups.
    */
  var groups: js.UndefOr[js.Array[SigningGroup]] = js.undefined
}
object SigningGroupInformation {
  
  inline def apply(): SigningGroupInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningGroupInformation]
  }
  
  extension [Self <: SigningGroupInformation](x: Self) {
    
    inline def setGroups(value: js.Array[SigningGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SigningGroup*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
