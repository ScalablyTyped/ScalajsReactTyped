package typingsJapgolly.rcMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcMenu.anon.DomEvent
import typingsJapgolly.rcMenu.esInterfaceMod.MenuInfo
import typingsJapgolly.rcMenu.esInterfaceMod.MenuTitleInfo
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconInfo
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SubMenuProps1675715244 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def eventKey(value: String): this.type = set("eventKey", value.asInstanceOf[js.Any])
  
  inline def expandIcon(value: RenderIconType): this.type = set("expandIcon", value.asInstanceOf[js.Any])
  
  inline def expandIconFunction1(value: /* props */ RenderIconInfo => Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
  
  inline def expandIconNull: this.type = set("expandIcon", null)
  
  inline def expandIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("expandIcon", js.Array(value*))
  
  inline def expandIconVdomElement(value: VdomElement): this.type = set("expandIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def internalPopupClose(value: Boolean): this.type = set("internalPopupClose", value.asInstanceOf[js.Any])
  
  inline def itemIcon(value: RenderIconType): this.type = set("itemIcon", value.asInstanceOf[js.Any])
  
  inline def itemIconFunction1(value: /* props */ RenderIconInfo => Node): this.type = set("itemIcon", js.Any.fromFunction1(value))
  
  inline def itemIconNull: this.type = set("itemIcon", null)
  
  inline def itemIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("itemIcon", js.Array(value*))
  
  inline def itemIconVdomElement(value: VdomElement): this.type = set("itemIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def onClick(value: /* info */ MenuInfo => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* info */ MenuInfo) => value(t0).runNow()))
  
  inline def onMouseEnter(value: /* info */ DomEvent => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
  
  inline def onMouseLeave(value: /* info */ DomEvent => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
  
  inline def onTitleClick(value: /* info */ MenuTitleInfo => Callback): this.type = set("onTitleClick", js.Any.fromFunction1((t0: /* info */ MenuTitleInfo) => value(t0).runNow()))
  
  inline def onTitleMouseEnter(value: /* info */ DomEvent => Callback): this.type = set("onTitleMouseEnter", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
  
  inline def onTitleMouseLeave(value: /* info */ DomEvent => Callback): this.type = set("onTitleMouseLeave", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
  
  inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  inline def popupOffset(value: js.Array[Double]): this.type = set("popupOffset", value.asInstanceOf[js.Any])
  
  inline def popupOffsetVarargs(value: Double*): this.type = set("popupOffset", js.Array(value*))
  
  inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  
  inline def warnKey(value: Boolean): this.type = set("warnKey", value.asInstanceOf[js.Any])
}
