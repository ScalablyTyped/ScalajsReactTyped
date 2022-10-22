package typingsJapgolly.reactResizeDetector.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactResizeDetector.anon.Leading
import typingsJapgolly.reactResizeDetector.buildResizeDetectorMod.ChildFunctionProps
import typingsJapgolly.reactResizeDetector.buildResizeDetectorMod.ReactResizeDetectorDimensions
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.throttle
import typingsJapgolly.std.ResizeObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ComponentsProps2056989417[R <: js.Object, ElementT /* <: HTMLElement */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def children(value: Node | (js.Function1[/* props */ ChildFunctionProps[ElementT], Node])): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenFunction1(value: /* props */ ChildFunctionProps[ElementT] => Node): this.type = set("children", js.Any.fromFunction1(value))
  
  inline def childrenNull: this.type = set("children", null)
  
  inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def handleHeight(value: Boolean): this.type = set("handleHeight", value.asInstanceOf[js.Any])
  
  inline def handleWidth(value: Boolean): this.type = set("handleWidth", value.asInstanceOf[js.Any])
  
  inline def nodeType(
    value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.a, typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.abbr, typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.address */ Any
  ): this.type = set("nodeType", value.asInstanceOf[js.Any])
  
  inline def observerOptions(value: ResizeObserverOptions): this.type = set("observerOptions", value.asInstanceOf[js.Any])
  
  inline def onResize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback): this.type = set("onResize", js.Any.fromFunction2((t0: /* width */ js.UndefOr[Double], t1: /* height */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
  
  inline def querySelector(value: String): this.type = set("querySelector", value.asInstanceOf[js.Any])
  
  inline def refreshMode(value: throttle | debounce): this.type = set("refreshMode", value.asInstanceOf[js.Any])
  
  inline def refreshOptions(value: Leading): this.type = set("refreshOptions", value.asInstanceOf[js.Any])
  
  inline def refreshRate(value: Double): this.type = set("refreshRate", value.asInstanceOf[js.Any])
  
  inline def render(value: /* props */ ReactResizeDetectorDimensions => Node): this.type = set("render", js.Any.fromFunction1(value))
  
  inline def skipOnMount(value: Boolean): this.type = set("skipOnMount", value.asInstanceOf[js.Any])
  
  inline def targetDomEl(value: ElementT): this.type = set("targetDomEl", value.asInstanceOf[js.Any])
  
  inline def targetRef(value: RefHandle[ElementT]): this.type = set("targetRef", value.asInstanceOf[js.Any])
}
