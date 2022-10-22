package typingsJapgolly.nukaCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nukaCarousel.anon.Count
import typingsJapgolly.nukaCarousel.libTypesMod.Alignment
import typingsJapgolly.nukaCarousel.libTypesMod.ControlProps
import typingsJapgolly.nukaCarousel.libTypesMod.DefaultControlsConfig
import typingsJapgolly.nukaCarousel.libTypesMod.KeyCodeConfig
import typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.fade
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.zoom
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CarouselProps1475835319 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def adaptiveHeight(value: Boolean): this.type = set("adaptiveHeight", value.asInstanceOf[js.Any])
  
  inline def adaptiveHeightAnimation(value: Boolean): this.type = set("adaptiveHeightAnimation", value.asInstanceOf[js.Any])
  
  inline def afterSlide(value: /* index */ Double => Callback): this.type = set("afterSlide", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
  
  inline def animation(value: zoom | fade): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
  
  inline def autoplayInterval(value: Double): this.type = set("autoplayInterval", value.asInstanceOf[js.Any])
  
  inline def autoplayReverse(value: Boolean): this.type = set("autoplayReverse", value.asInstanceOf[js.Any])
  
  inline def beforeSlide(value: (/* currentSlideIndex */ Double, /* endSlideIndex */ Double) => Callback): this.type = set("beforeSlide", js.Any.fromFunction2((t0: /* currentSlideIndex */ Double, t1: /* endSlideIndex */ Double) => (value(t0, t1)).runNow()))
  
  inline def cellAlign(value: Alignment): this.type = set("cellAlign", value.asInstanceOf[js.Any])
  
  inline def cellSpacing(value: Double): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
  
  inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenNull: this.type = set("children", null)
  
  inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultControlsConfig(value: DefaultControlsConfig): this.type = set("defaultControlsConfig", value.asInstanceOf[js.Any])
  
  inline def disableAnimation(value: Boolean): this.type = set("disableAnimation", value.asInstanceOf[js.Any])
  
  inline def disableEdgeSwiping(value: Boolean): this.type = set("disableEdgeSwiping", value.asInstanceOf[js.Any])
  
  inline def dragThreshold(value: Double): this.type = set("dragThreshold", value.asInstanceOf[js.Any])
  
  inline def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
  
  inline def easing(value: /* normalizedTime */ Double => Double): this.type = set("easing", js.Any.fromFunction1(value))
  
  inline def edgeEasing(value: /* normalizedTime */ Double => Double): this.type = set("edgeEasing", js.Any.fromFunction1(value))
  
  inline def enableKeyboardControls(value: Boolean): this.type = set("enableKeyboardControls", value.asInstanceOf[js.Any])
  
  inline def frameAriaLabel(value: String): this.type = set("frameAriaLabel", value.asInstanceOf[js.Any])
  
  inline def innerRef(value: MutableRefObject[HTMLDivElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def keyCodeConfig(value: KeyCodeConfig): this.type = set("keyCodeConfig", value.asInstanceOf[js.Any])
  
  inline def onDrag(
    value: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement] => Callback
  ): this.type = set("onDrag", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDragEnd(
    value: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement] => Callback
  ): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDragStart(
    value: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement] => Callback
  ): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[HTMLDivElement] | ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onUserNavigation(
    value: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element] | ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element] => Callback
  ): this.type = set("onUserNavigation", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[org.scalajs.dom.Element] | ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
  
  inline def renderAnnounceSlideMessage(value: /* props */ Count => String): this.type = set("renderAnnounceSlideMessage", js.Any.fromFunction1(value))
  
  inline def renderBottomCenterControls(value: /* props */ ControlProps => Node): this.type = set("renderBottomCenterControls", js.Any.fromFunction1(value))
  
  inline def renderBottomCenterControlsNull: this.type = set("renderBottomCenterControls", null)
  
  inline def renderBottomLeftControls(value: /* props */ ControlProps => Node): this.type = set("renderBottomLeftControls", js.Any.fromFunction1(value))
  
  inline def renderBottomLeftControlsNull: this.type = set("renderBottomLeftControls", null)
  
  inline def renderBottomRightControls(value: /* props */ ControlProps => Node): this.type = set("renderBottomRightControls", js.Any.fromFunction1(value))
  
  inline def renderBottomRightControlsNull: this.type = set("renderBottomRightControls", null)
  
  inline def renderCenterCenterControls(value: /* props */ ControlProps => Node): this.type = set("renderCenterCenterControls", js.Any.fromFunction1(value))
  
  inline def renderCenterCenterControlsNull: this.type = set("renderCenterCenterControls", null)
  
  inline def renderCenterLeftControls(value: /* props */ ControlProps => Node): this.type = set("renderCenterLeftControls", js.Any.fromFunction1(value))
  
  inline def renderCenterLeftControlsNull: this.type = set("renderCenterLeftControls", null)
  
  inline def renderCenterRightControls(value: /* props */ ControlProps => Node): this.type = set("renderCenterRightControls", js.Any.fromFunction1(value))
  
  inline def renderCenterRightControlsNull: this.type = set("renderCenterRightControls", null)
  
  inline def renderTopCenterControls(value: /* props */ ControlProps => Node): this.type = set("renderTopCenterControls", js.Any.fromFunction1(value))
  
  inline def renderTopCenterControlsNull: this.type = set("renderTopCenterControls", null)
  
  inline def renderTopLeftControls(value: /* props */ ControlProps => Node): this.type = set("renderTopLeftControls", js.Any.fromFunction1(value))
  
  inline def renderTopLeftControlsNull: this.type = set("renderTopLeftControls", null)
  
  inline def renderTopRightControls(value: /* props */ ControlProps => Node): this.type = set("renderTopRightControls", js.Any.fromFunction1(value))
  
  inline def renderTopRightControlsNull: this.type = set("renderTopRightControls", null)
  
  inline def scrollMode(value: ScrollMode): this.type = set("scrollMode", value.asInstanceOf[js.Any])
  
  inline def slideIndex(value: Double): this.type = set("slideIndex", value.asInstanceOf[js.Any])
  
  inline def slidesToScroll(value: Double): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
  
  inline def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
  
  inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def swiping(value: Boolean): this.type = set("swiping", value.asInstanceOf[js.Any])
  
  inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  inline def withoutControls(value: Boolean): this.type = set("withoutControls", value.asInstanceOf[js.Any])
  
  inline def wrapAround(value: Boolean): this.type = set("wrapAround", value.asInstanceOf[js.Any])
  
  inline def zoomScale(value: Double): this.type = set("zoomScale", value.asInstanceOf[js.Any])
}
