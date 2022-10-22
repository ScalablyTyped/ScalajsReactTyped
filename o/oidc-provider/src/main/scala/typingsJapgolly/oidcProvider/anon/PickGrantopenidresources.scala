package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<oidc-provider.oidc-provider.Grant, 'openid' | 'resources'> */
trait PickGrantopenidresources extends StObject {
  
  var openid: js.UndefOr[Claims] = js.undefined
  
  var resources: js.UndefOr[StringDictionary[String]] = js.undefined
}
object PickGrantopenidresources {
  
  inline def apply(): PickGrantopenidresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickGrantopenidresources]
  }
  
  extension [Self <: PickGrantopenidresources](x: Self) {
    
    inline def setOpenid(value: Claims): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
    
    inline def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
    
    inline def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
