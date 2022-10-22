package typingsJapgolly.rcTrigger.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLDocument
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcTrigger.esInterfaceMod.ActionType
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.rcTrigger.esInterfaceMod.AnimationType
import typingsJapgolly.rcTrigger.esInterfaceMod.BuildInPlacements
import typingsJapgolly.rcTrigger.esInterfaceMod.MobileConfig
import typingsJapgolly.rcTrigger.esInterfaceMod.TransitionNameType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TriggerProps_808364697[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def action(value: ActionType | js.Array[ActionType]): this.type = set("action", value.asInstanceOf[js.Any])
  
  inline def actionVarargs(value: ActionType*): this.type = set("action", js.Array(value*))
  
  inline def afterPopupVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("afterPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def alignPoint(value: Boolean): this.type = set("alignPoint", value.asInstanceOf[js.Any])
  
  inline def autoDestroy(value: Boolean): this.type = set("autoDestroy", value.asInstanceOf[js.Any])
  
  inline def blurDelay(value: Double): this.type = set("blurDelay", value.asInstanceOf[js.Any])
  
  inline def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultPopupVisible(value: Boolean): this.type = set("defaultPopupVisible", value.asInstanceOf[js.Any])
  
  inline def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
  
  inline def focusDelay(value: Double): this.type = set("focusDelay", value.asInstanceOf[js.Any])
  
  inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  inline def getDocument(value: /* element */ js.UndefOr[HTMLElement] => HTMLDocument): this.type = set("getDocument", js.Any.fromFunction1(value))
  
  inline def getPopupClassNameFromAlign(value: /* align */ AlignType => String): this.type = set("getPopupClassNameFromAlign", js.Any.fromFunction1(value))
  
  inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def getTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): this.type = set("getTriggerDOMNode", js.Any.fromFunction1(value))
  
  inline def hideAction(value: js.Array[ActionType]): this.type = set("hideAction", value.asInstanceOf[js.Any])
  
  inline def hideActionVarargs(value: ActionType*): this.type = set("hideAction", js.Array(value*))
  
  inline def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  inline def maskAnimation(value: String): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  
  inline def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  inline def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
  
  inline def maskTransitionName(value: TransitionNameType): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  inline def mobile(value: MobileConfig): this.type = set("mobile", value.asInstanceOf[js.Any])
  
  inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  inline def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Callback): this.type = set("onPopupAlign", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* align */ AlignType) => (value(t0, t1)).runNow()))
  
  inline def onPopupClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPopupClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPopupVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def popup(value: Node | js.Function0[Node]): this.type = set("popup", value.asInstanceOf[js.Any])
  
  inline def popupAlign(value: AlignType): this.type = set("popupAlign", value.asInstanceOf[js.Any])
  
  inline def popupAnimation(value: AnimationType): this.type = set("popupAnimation", value.asInstanceOf[js.Any])
  
  inline def popupCallbackTo(value: CallbackTo[Node]): this.type = set("popup", value.toJsFn)
  
  inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  inline def popupMotion(value: CSSMotionProps): this.type = set("popupMotion", value.asInstanceOf[js.Any])
  
  inline def popupNull: this.type = set("popup", null)
  
  inline def popupPlacement(value: String): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
  
  inline def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
  
  inline def popupTransitionName(value: TransitionNameType): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
  
  inline def popupVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("popup", js.Array(value*))
  
  inline def popupVdomElement(value: VdomElement): this.type = set("popup", value.rawElement.asInstanceOf[js.Any])
  
  inline def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def showAction(value: js.Array[ActionType]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  inline def showActionVarargs(value: ActionType*): this.type = set("showAction", js.Array(value*))
  
  inline def stretch(value: String): this.type = set("stretch", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
