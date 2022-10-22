package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.UIEvent
import typingsJapgolly.ionicCore.anon.Label
import typingsJapgolly.ionicCore.anon.X
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonLabelElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Side
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsHelpersMod {
  
  @JSImport("@ionic/core/dist/types/utils/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(el: Any, eventName: String, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addEventListener(el: Any, eventName: String, callback: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def assert(actual: Any, reason: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clamp(min: Double, n: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], n.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def componentOnReady(el: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("componentOnReady")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit], wait: Double): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def debounceEvent(event: EventEmitter[Any], wait: Double): EventEmitter[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceEvent")(event.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[EventEmitter[Any]]
  
  inline def deferEvent(event: EventEmitter[Any]): EventEmitter[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferEvent")(event.asInstanceOf[js.Any]).asInstanceOf[EventEmitter[Any]]
  
  inline def findItemLabel(componentEl: HTMLElement): HTMLIonLabelElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findItemLabel")(componentEl.asInstanceOf[js.Any]).asInstanceOf[HTMLIonLabelElement | Null]
  
  inline def focusElement(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusElement")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAriaLabel(componentEl: HTMLElement, inputId: String): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("getAriaLabel")(componentEl.asInstanceOf[js.Any], inputId.asInstanceOf[js.Any])).asInstanceOf[Label]
  
  inline def getElementRoot(el: HTMLElement): HTMLElement | ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRoot")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | ShadowRoot]
  inline def getElementRoot(el: HTMLElement, fallback: HTMLElement): HTMLElement | ShadowRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementRoot")(el.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | ShadowRoot]
  
  inline def hasShadowDom(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasShadowDom")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def inheritAriaAttributes(el: HTMLElement): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("inheritAriaAttributes")(el.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def inheritAriaAttributes(el: HTMLElement, ignoreList: js.Array[String]): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritAriaAttributes")(el.asInstanceOf[js.Any], ignoreList.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  inline def inheritAttributes(el: HTMLElement): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("inheritAttributes")(el.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  inline def inheritAttributes(el: HTMLElement, attributes: js.Array[String]): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritAttributes")(el.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  inline def isEndSide(side: Side): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEndSide")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def now(ev: UIEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(ev.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pointerCoord(ev: Any): X = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerCoord")(ev.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def raf(h: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("raf")(h.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeEventListener(el: Any, eventName: String, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def removeEventListener(el: Any, eventName: String, callback: Any, opts: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: String, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: Null, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderHiddenInput(always: Boolean, container: HTMLElement, name: String, value: Unit, disabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHiddenInput")(always.asInstanceOf[js.Any], container.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowEqualStringMap(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualStringMap")().asInstanceOf[Boolean]
  inline def shallowEqualStringMap(map1: StringDictionary[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualStringMap")(map1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shallowEqualStringMap(map1: StringDictionary[Any], map2: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualStringMap")(map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowEqualStringMap(map1: Unit, map2: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualStringMap")(map1.asInstanceOf[js.Any], map2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transitionEndAsync(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")().asInstanceOf[js.Promise[Any]]
  inline def transitionEndAsync(el: HTMLElement): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def transitionEndAsync(el: HTMLElement, expectedDuration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any], expectedDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def transitionEndAsync(el: Null, expectedDuration: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any], expectedDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  type Attributes = StringDictionary[Any]
}
