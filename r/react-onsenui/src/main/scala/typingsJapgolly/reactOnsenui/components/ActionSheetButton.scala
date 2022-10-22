package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheetButton {
  
  @JSImport("react-onsenui", "ActionSheetButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.ActionSheetButton] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ActionSheetButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & typingsJapgolly.reactOnsenui.anon.Icon): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
