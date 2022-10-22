package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * The name of the DOM property to which the input property is bound.
    */
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}
object Input {
  
  @JSImport("@angular/core", "Input")
  @js.native
  val ^ : InputDecorator = js.native
  
  extension [Self <: Input](x: Self) {
    
    inline def setBindingPropertyName(value: String): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
    
    inline def setBindingPropertyNameUndefined: Self = StObject.set(x, "bindingPropertyName", js.undefined)
  }
}
