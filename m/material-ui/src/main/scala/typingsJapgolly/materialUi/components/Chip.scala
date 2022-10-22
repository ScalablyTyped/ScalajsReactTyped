package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.ChipProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chip {
  
  @JSImport("material-ui", "Chip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Chip] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: Node | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def containerElementNull: this.type = set("containerElement", null)
    
    inline def containerElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("containerElement", js.Array(value*))
    
    inline def containerElementVdomElement(value: VdomElement): this.type = set("containerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def deleteIconStyle(value: CSSProperties): this.type = set("deleteIconStyle", value.asInstanceOf[js.Any])
    
    inline def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: ReactMouseEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRequestDelete(
      value: ReactTouchEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onRequestDelete", js.Any.fromFunction1((t0: ReactTouchEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Chip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
