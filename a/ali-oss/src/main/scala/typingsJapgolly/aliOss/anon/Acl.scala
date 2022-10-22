package typingsJapgolly.aliOss.anon

import typingsJapgolly.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acl extends StObject {
  
  var acl: String
  
  var res: NormalSuccessResponse
}
object Acl {
  
  inline def apply(acl: String, res: NormalSuccessResponse): Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
  
  extension [Self <: Acl](x: Self) {
    
    inline def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
