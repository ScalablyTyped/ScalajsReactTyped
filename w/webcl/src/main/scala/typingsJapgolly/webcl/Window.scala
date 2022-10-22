package typingsJapgolly.webcl

import typingsJapgolly.webcl.WEBCL.WebCL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var webcl: WebCL
}
object Window {
  
  inline def apply(webcl: WebCL): Window = {
    val __obj = js.Dynamic.literal(webcl = webcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setWebcl(value: WebCL): Self = StObject.set(x, "webcl", value.asInstanceOf[js.Any])
  }
}
