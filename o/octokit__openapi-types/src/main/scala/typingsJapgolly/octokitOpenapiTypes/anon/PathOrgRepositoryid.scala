package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRepositoryid extends StObject {
  
  var path: OrgRepositoryid
}
object PathOrgRepositoryid {
  
  inline def apply(path: OrgRepositoryid): PathOrgRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRepositoryid]
  }
  
  extension [Self <: PathOrgRepositoryid](x: Self) {
    
    inline def setPath(value: OrgRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
