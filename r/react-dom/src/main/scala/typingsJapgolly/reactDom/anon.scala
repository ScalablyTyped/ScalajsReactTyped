package typingsJapgolly.reactDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactDom.testUtilsMod.EventSimulator
import typingsJapgolly.reactDom.testUtilsMod.MockedComponentClass
import typingsJapgolly.reactDom.testUtilsMod.ShallowRenderer
import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import typingsJapgolly.reactDom.testUtilsMod.VoidOrUndefinedOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofReactTestUtils extends StObject {
    
    val Simulate: TypeofSimulate = js.native
    
    def act(callback: js.Function0[VoidOrUndefinedOnly]): Unit = js.native
    @JSName("act")
    def act_Promise(callback: js.Function0[js.Promise[Unit]]): js.Promise[Unit] = js.native
    
    def createRenderer(): ShallowRenderer = js.native
    
    def findAllInRenderedTree(root: Component[Any & js.Object, js.Object], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
    
    def findRenderedComponentWithType[T /* <: Component[Any & js.Object, js.Object] */, C /* <: ComponentClassP[Any & js.Object] */](root: Component[Any & js.Object, js.Object], `type`: ClassType[Any, T, C]): T = js.native
    
    def findRenderedDOMComponentWithClass(root: Component[Any & js.Object, js.Object], className: String): Element = js.native
    
    def findRenderedDOMComponentWithTag(root: Component[Any & js.Object, js.Object], tagName: String): Element = js.native
    
    def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
    
    def isCompositeComponentWithType[T /* <: Component[Any & js.Object, js.Object] */, C /* <: ComponentClassP[Any & js.Object] */](instance: ReactInstance, `type`: ClassType[Any, T, C]): Boolean = js.native
    
    def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
    
    def isElement(element: Any): Boolean = js.native
    
    def isElementOfType[T /* <: HTMLElement */](element: japgolly.scalajs.react.facade.React.Element, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
    def isElementOfType[P](element: japgolly.scalajs.react.facade.React.Element, `type`: FC[P]): /* is react.react.FunctionComponentElement<P> */ Boolean = js.native
    def isElementOfType[P, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](element: japgolly.scalajs.react.facade.React.Element, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
    @JSName("isElementOfType")
    def isElementOfType_PT[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: japgolly.scalajs.react.facade.React.Element, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
    
    def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    
    def renderIntoDocument(element: FunctionComponentElement[Any]): Unit = js.native
    def renderIntoDocument[T /* <: Element */](element: DomElement): T = js.native
    def renderIntoDocument[P](element: japgolly.scalajs.react.facade.React.Element): (Component[P & js.Object, js.Object]) | Element | Unit = js.native
    def renderIntoDocument[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T]): T = js.native
    
    def scryRenderedComponentsWithType[T /* <: Component[Any & js.Object, js.Object] */, C /* <: ComponentClassP[Any & js.Object] */](root: Component[Any & js.Object, js.Object], `type`: ClassType[Any, T, C]): js.Array[T] = js.native
    
    def scryRenderedDOMComponentsWithClass(root: Component[Any & js.Object, js.Object], className: String): js.Array[Element] = js.native
    
    def scryRenderedDOMComponentsWithTag(root: Component[Any & js.Object, js.Object], tagName: String): js.Array[Element] = js.native
  }
  
  trait TypeofSimulate extends StObject {
    
    val abort: EventSimulator
    
    val animationEnd: EventSimulator
    
    val animationIteration: EventSimulator
    
    val animationStart: EventSimulator
    
    val blur: EventSimulator
    
    val canPlay: EventSimulator
    
    val canPlayThrough: EventSimulator
    
    val change: EventSimulator
    
    val click: EventSimulator
    
    val compositionEnd: EventSimulator
    
    val compositionStart: EventSimulator
    
    val compositionUpdate: EventSimulator
    
    val contextMenu: EventSimulator
    
    val copy: EventSimulator
    
    val cut: EventSimulator
    
    val doubleClick: EventSimulator
    
    val drag: EventSimulator
    
    val dragEnd: EventSimulator
    
    val dragEnter: EventSimulator
    
    val dragExit: EventSimulator
    
    val dragLeave: EventSimulator
    
    val dragOver: EventSimulator
    
    val dragStart: EventSimulator
    
    val drop: EventSimulator
    
    val durationChange: EventSimulator
    
    val emptied: EventSimulator
    
    val encrypted: EventSimulator
    
    val ended: EventSimulator
    
    val error: EventSimulator
    
    val focus: EventSimulator
    
    val input: EventSimulator
    
    val invalid: EventSimulator
    
    val keyDown: EventSimulator
    
    val keyPress: EventSimulator
    
    val keyUp: EventSimulator
    
    val load: EventSimulator
    
    val loadStart: EventSimulator
    
    val loadedData: EventSimulator
    
    val loadedMetadata: EventSimulator
    
    val mouseDown: EventSimulator
    
    val mouseEnter: EventSimulator
    
    val mouseLeave: EventSimulator
    
    val mouseMove: EventSimulator
    
    val mouseOut: EventSimulator
    
    val mouseOver: EventSimulator
    
    val mouseUp: EventSimulator
    
    val paste: EventSimulator
    
    val pause: EventSimulator
    
    val play: EventSimulator
    
    val playing: EventSimulator
    
    val progress: EventSimulator
    
    val rateChange: EventSimulator
    
    val scroll: EventSimulator
    
    val seeked: EventSimulator
    
    val seeking: EventSimulator
    
    val select: EventSimulator
    
    val stalled: EventSimulator
    
    val submit: EventSimulator
    
    val suspend: EventSimulator
    
    val timeUpdate: EventSimulator
    
    val touchCancel: EventSimulator
    
    val touchEnd: EventSimulator
    
    val touchMove: EventSimulator
    
    val touchStart: EventSimulator
    
    val transitionEnd: EventSimulator
    
    val volumeChange: EventSimulator
    
    val waiting: EventSimulator
    
    val wheel: EventSimulator
  }
  object TypeofSimulate {
    
    inline def apply(
      abort: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      animationEnd: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      animationIteration: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      animationStart: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      blur: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      canPlay: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      canPlayThrough: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      change: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      click: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      compositionEnd: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      compositionStart: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      compositionUpdate: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      contextMenu: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      copy: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      cut: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      doubleClick: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      drag: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragEnd: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragEnter: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragExit: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragLeave: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragOver: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      dragStart: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      drop: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      durationChange: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      emptied: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      encrypted: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      ended: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      error: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      focus: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      input: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      invalid: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      keyDown: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      keyPress: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      keyUp: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      load: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      loadStart: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      loadedData: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      loadedMetadata: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseDown: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseEnter: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseLeave: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseMove: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseOut: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseOver: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      mouseUp: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      paste: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      pause: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      play: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      playing: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      progress: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      rateChange: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      scroll: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      seeked: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      seeking: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      select: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      stalled: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      submit: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      suspend: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      timeUpdate: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      touchCancel: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      touchEnd: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      touchMove: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      touchStart: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      transitionEnd: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      volumeChange: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      waiting: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
      wheel: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
    ): TypeofSimulate = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (abort(t0, t1)).runNow()), animationEnd = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (animationEnd(t0, t1)).runNow()), animationIteration = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (animationIteration(t0, t1)).runNow()), animationStart = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (animationStart(t0, t1)).runNow()), blur = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (blur(t0, t1)).runNow()), canPlay = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (canPlay(t0, t1)).runNow()), canPlayThrough = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (canPlayThrough(t0, t1)).runNow()), change = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (change(t0, t1)).runNow()), click = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (click(t0, t1)).runNow()), compositionEnd = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (compositionEnd(t0, t1)).runNow()), compositionStart = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (compositionStart(t0, t1)).runNow()), compositionUpdate = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (compositionUpdate(t0, t1)).runNow()), contextMenu = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (contextMenu(t0, t1)).runNow()), copy = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (copy(t0, t1)).runNow()), cut = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (cut(t0, t1)).runNow()), doubleClick = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (doubleClick(t0, t1)).runNow()), drag = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (drag(t0, t1)).runNow()), dragEnd = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragEnd(t0, t1)).runNow()), dragEnter = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragEnter(t0, t1)).runNow()), dragExit = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragExit(t0, t1)).runNow()), dragLeave = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragLeave(t0, t1)).runNow()), dragOver = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragOver(t0, t1)).runNow()), dragStart = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (dragStart(t0, t1)).runNow()), drop = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (drop(t0, t1)).runNow()), durationChange = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (durationChange(t0, t1)).runNow()), emptied = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (emptied(t0, t1)).runNow()), encrypted = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (encrypted(t0, t1)).runNow()), ended = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (ended(t0, t1)).runNow()), error = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (error(t0, t1)).runNow()), focus = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (focus(t0, t1)).runNow()), input = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (input(t0, t1)).runNow()), invalid = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (invalid(t0, t1)).runNow()), keyDown = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (keyDown(t0, t1)).runNow()), keyPress = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (keyPress(t0, t1)).runNow()), keyUp = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (keyUp(t0, t1)).runNow()), load = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (load(t0, t1)).runNow()), loadStart = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (loadStart(t0, t1)).runNow()), loadedData = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (loadedData(t0, t1)).runNow()), loadedMetadata = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (loadedMetadata(t0, t1)).runNow()), mouseDown = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseDown(t0, t1)).runNow()), mouseEnter = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseEnter(t0, t1)).runNow()), mouseLeave = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseLeave(t0, t1)).runNow()), mouseMove = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseMove(t0, t1)).runNow()), mouseOut = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseOut(t0, t1)).runNow()), mouseOver = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseOver(t0, t1)).runNow()), mouseUp = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (mouseUp(t0, t1)).runNow()), paste = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (paste(t0, t1)).runNow()), pause = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (pause(t0, t1)).runNow()), play = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (play(t0, t1)).runNow()), playing = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (playing(t0, t1)).runNow()), progress = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (progress(t0, t1)).runNow()), rateChange = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (rateChange(t0, t1)).runNow()), scroll = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (scroll(t0, t1)).runNow()), seeked = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (seeked(t0, t1)).runNow()), seeking = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (seeking(t0, t1)).runNow()), select = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (select(t0, t1)).runNow()), stalled = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (stalled(t0, t1)).runNow()), submit = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (submit(t0, t1)).runNow()), suspend = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (suspend(t0, t1)).runNow()), timeUpdate = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (timeUpdate(t0, t1)).runNow()), touchCancel = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (touchCancel(t0, t1)).runNow()), touchEnd = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (touchEnd(t0, t1)).runNow()), touchMove = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (touchMove(t0, t1)).runNow()), touchStart = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (touchStart(t0, t1)).runNow()), transitionEnd = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (transitionEnd(t0, t1)).runNow()), volumeChange = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (volumeChange(t0, t1)).runNow()), waiting = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (waiting(t0, t1)).runNow()), wheel = js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (wheel(t0, t1)).runNow()))
      __obj.asInstanceOf[TypeofSimulate]
    }
    
    extension [Self <: TypeofSimulate](x: Self) {
      
      inline def setAbort(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setAnimationEnd(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setAnimationIteration(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setAnimationStart(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setBlur(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCanPlay(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCanPlayThrough(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setChange(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setClick(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "click", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCompositionEnd(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCompositionStart(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCompositionUpdate(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setContextMenu(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCopy(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setCut(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDoubleClick(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDrag(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragEnd(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragEnter(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragExit(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragLeave(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragOver(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDragStart(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDrop(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setDurationChange(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setEmptied(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setEncrypted(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setEnded(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setError(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setFocus(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setInput(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "input", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setInvalid(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setKeyDown(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setKeyPress(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setKeyUp(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setLoad(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "load", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setLoadStart(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setLoadedData(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setLoadedMetadata(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseDown(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseEnter(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseLeave(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseMove(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseOut(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseOver(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setMouseUp(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setPaste(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setPause(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setPlay(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "play", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setPlaying(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setProgress(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setRateChange(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setScroll(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setSeeked(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setSeeking(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setSelect(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "select", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setStalled(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setSubmit(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setSuspend(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTimeUpdate(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTouchCancel(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTouchEnd(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTouchMove(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTouchStart(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setTransitionEnd(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setVolumeChange(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setWaiting(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
      
      inline def setWheel(
        value: (/* element */ Element | (Component[Any & js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2((t0: /* element */ Element | (Component[Any & js.Object, js.Object]), t1: /* eventData */ js.UndefOr[SyntheticEventData]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
