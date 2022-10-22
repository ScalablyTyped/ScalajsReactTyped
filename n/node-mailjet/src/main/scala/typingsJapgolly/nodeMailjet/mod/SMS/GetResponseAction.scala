package typingsJapgolly.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseAction extends StObject {
  
  val body: GetResponseActionData
}
object GetResponseAction {
  
  inline def apply(body: GetResponseActionData): GetResponseAction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseAction]
  }
  
  extension [Self <: GetResponseAction](x: Self) {
    
    inline def setBody(value: GetResponseActionData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
