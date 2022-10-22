package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarElementOverrides
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarElementProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SnackbarElement {
  
  @JSImport("baseui/snackbar", "SnackbarElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actionMessage(value: String): this.type = set("actionMessage", value.asInstanceOf[js.Any])
    
    inline def actionOnClick(value: /* a */ ReactEventFrom[HTMLButtonElement] => Any): this.type = set("actionOnClick", js.Any.fromFunction1(value))
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def message(value: VdomNode): this.type = set("message", value.rawNode.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def overrides(value: SnackbarElementOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def progress(value: Boolean): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: ComponentType[SizeNumber]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SnackbarElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SnackbarElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
