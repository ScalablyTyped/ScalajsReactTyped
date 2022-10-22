package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  /**
    * @description The permission to grant to the team for this project. Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    * @enum {string}
    */
  var permission: js.UndefOr[read | write | admin] = js.undefined
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setPermission(value: read | write | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
