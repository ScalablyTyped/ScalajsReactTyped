package typingsJapgolly.reactToastr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToastr.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainer {
  
  inline def apply(toastMessageFactory: Any): Builder = {
    val __props = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
  
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToastr.mod.ToastContainer] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClassName): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
