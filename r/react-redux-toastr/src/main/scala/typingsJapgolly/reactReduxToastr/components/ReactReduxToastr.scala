package typingsJapgolly.reactReduxToastr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactReduxToastr.anon.CancelText
import typingsJapgolly.reactReduxToastr.mod.ReduxToastrProps
import typingsJapgolly.reactReduxToastr.mod.ToastrState
import typingsJapgolly.reactReduxToastr.mod.default
import typingsJapgolly.reactReduxToastr.mod.positionType
import typingsJapgolly.reactReduxToastr.mod.transitionInType
import typingsJapgolly.reactReduxToastr.mod.transitionOutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactReduxToastr {
  
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnToastrClick(value: Boolean): this.type = set("closeOnToastrClick", value.asInstanceOf[js.Any])
    
    inline def confirmOptions(value: CancelText): this.type = set("confirmOptions", value.asInstanceOf[js.Any])
    
    inline def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    
    inline def options(value: Any): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def position(value: positionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def preventDuplicates(value: Boolean): this.type = set("preventDuplicates", value.asInstanceOf[js.Any])
    
    inline def progressBar(value: Boolean): this.type = set("progressBar", value.asInstanceOf[js.Any])
    
    inline def timeOut(value: Double): this.type = set("timeOut", value.asInstanceOf[js.Any])
    
    inline def toastr(value: ToastrState): this.type = set("toastr", value.asInstanceOf[js.Any])
    
    inline def transitionIn(value: transitionInType): this.type = set("transitionIn", value.asInstanceOf[js.Any])
    
    inline def transitionOut(value: transitionOutType): this.type = set("transitionOut", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactReduxToastr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReduxToastrProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
