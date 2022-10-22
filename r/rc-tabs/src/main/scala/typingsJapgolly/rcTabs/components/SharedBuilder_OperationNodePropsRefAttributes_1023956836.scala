package typingsJapgolly.rcTabs.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_OperationNodePropsRefAttributes_1023956836[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
  
  inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def locale(value: TabsLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def moreIcon(value: VdomNode): this.type = set("moreIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def moreIconNull: this.type = set("moreIcon", null)
  
  inline def moreIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("moreIcon", js.Array(value*))
  
  inline def moreIconVdomElement(value: VdomElement): this.type = set("moreIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def moreTransitionName(value: String): this.type = set("moreTransitionName", value.asInstanceOf[js.Any])
  
  inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  inline def removeAriaLabel(value: String): this.type = set("removeAriaLabel", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  
  inline def tabMoving(value: Boolean): this.type = set("tabMoving", value.asInstanceOf[js.Any])
}
