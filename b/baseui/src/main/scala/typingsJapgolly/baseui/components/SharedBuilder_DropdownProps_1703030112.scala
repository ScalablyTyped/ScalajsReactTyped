package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.selectTypesMod.OverridesDropdown
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownProps_1703030112[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def innerRef(value: Ref[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def innerRefFunction1(value: HTMLElement | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
  
  inline def innerRefNull: this.type = set("innerRef", null)
  
  inline def keyboardControlNode(value: Ref[HTMLElement]): this.type = set("keyboardControlNode", value.asInstanceOf[js.Any])
  
  inline def keyboardControlNodeFunction1(value: HTMLElement | Null => Callback): this.type = set("keyboardControlNode", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
  
  inline def keyboardControlNodeNull: this.type = set("keyboardControlNode", null)
  
  inline def noResultsMsg(value: VdomNode): this.type = set("noResultsMsg", value.rawNode.asInstanceOf[js.Any])
  
  inline def noResultsMsgNull: this.type = set("noResultsMsg", null)
  
  inline def noResultsMsgVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noResultsMsg", js.Array(value*))
  
  inline def noResultsMsgVdomElement(value: VdomElement): this.type = set("noResultsMsg", value.rawElement.asInstanceOf[js.Any])
  
  inline def onActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): this.type = set("onActiveDescendantChange", js.Any.fromFunction1(value))
  
  inline def overrides(value: OverridesDropdown): this.type = set("overrides", value.asInstanceOf[js.Any])
  
  inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def widthNull: this.type = set("width", null)
}
