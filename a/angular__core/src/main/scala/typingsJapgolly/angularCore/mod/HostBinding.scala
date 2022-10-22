package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostBinding extends StObject {
  
  /**
    * The DOM property that is bound to a data property.
    */
  var hostPropertyName: js.UndefOr[String] = js.undefined
}
object HostBinding {
  
  @JSImport("@angular/core", "HostBinding")
  @js.native
  val ^ : HostBindingDecorator = js.native
  
  extension [Self <: HostBinding](x: Self) {
    
    inline def setHostPropertyName(value: String): Self = StObject.set(x, "hostPropertyName", value.asInstanceOf[js.Any])
    
    inline def setHostPropertyNameUndefined: Self = StObject.set(x, "hostPropertyName", js.undefined)
  }
}
