package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.SnackbarProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  inline def apply(open: Boolean): Builder = {
    val __props = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackbarProps]))
  }
  
  @JSImport("material-ui", "Snackbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Snackbar] {
    
    inline def action(value: VdomNode): this.type = set("action", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionNull: this.type = set("action", null)
    
    inline def actionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("action", js.Array(value*))
    
    inline def actionVdomElement(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def message(value: VdomNode): this.type = set("message", value.rawNode.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onActionClick(value: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onActionClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRequestClose(value: /* reason */ String => Callback): this.type = set("onRequestClose", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
