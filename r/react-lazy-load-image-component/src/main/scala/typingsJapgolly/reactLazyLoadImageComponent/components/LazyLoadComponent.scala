package typingsJapgolly.reactLazyLoadImageComponent.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazyLoadImageComponent.mod.DelayMethod
import typingsJapgolly.reactLazyLoadImageComponent.mod.LazyLoadComponentProps
import typingsJapgolly.reactLazyLoadImageComponent.mod.ScrollPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLoadComponent {
  def apply(
    afterLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    placeholder: VdomElement = null,
    scrollPosition: ScrollPosition = null,
    style: CSSProperties = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LazyLoadComponentProps, 
    MountedWithRawType[LazyLoadComponentProps, js.Object, RawMounted[LazyLoadComponentProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    beforeLoad.foreach(p => __obj.updateDynamic("beforeLoad")(p.toJsFn))
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawElement.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactLazyLoadImageComponent.mod.LazyLoadComponentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazyLoadImageComponent.mod.LazyLoadComponentProps])(children: _*)
  }
  @JSImport("react-lazy-load-image-component", "LazyLoadComponent")
  @js.native
  object componentImport extends js.Object
  
}

