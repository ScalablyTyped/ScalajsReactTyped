package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRunnergroupid extends StObject {
  
  var path: OrgRunnergroupid
}
object PathOrgRunnergroupid {
  
  inline def apply(path: OrgRunnergroupid): PathOrgRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRunnergroupid]
  }
  
  extension [Self <: PathOrgRunnergroupid](x: Self) {
    
    inline def setPath(value: OrgRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
