package typingsJapgolly.reactInfinite.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInfinite.mod.InfiniteProps
import typingsJapgolly.reactInfinite.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInfinite {
  def apply(
    elementHeight: Double | js.Array[Double],
    className: String = null,
    containerHeight: Int | Double = null,
    displayBottomUpwards: js.UndefOr[Boolean] = js.undefined,
    handleScroll: /* node */ Element => Callback = null,
    infiniteLoadBeginBottomOffset: Int | Double = null,
    infiniteLoadBeginEdgeOffset: Int | Double = null,
    isInfiniteLoading: js.UndefOr[Boolean] = js.undefined,
    loadingSpinnerDelegate: VdomElement = null,
    onInfiniteLoad: js.UndefOr[Callback] = js.undefined,
    preloadAdditionalHeight: Double | js.Object = null,
    preloadBatchSize: Double | js.Object = null,
    timeScrollStateLastsForAfterUserScrolls: Int | Double = null,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InfiniteProps, ^, Unit, InfiniteProps] = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBottomUpwards)) __obj.updateDynamic("displayBottomUpwards")(displayBottomUpwards.asInstanceOf[js.Any])
    if (handleScroll != null) __obj.updateDynamic("handleScroll")(js.Any.fromFunction1((t0: /* node */ japgolly.scalajs.react.raw.React.Element) => handleScroll(t0).runNow()))
    if (infiniteLoadBeginBottomOffset != null) __obj.updateDynamic("infiniteLoadBeginBottomOffset")(infiniteLoadBeginBottomOffset.asInstanceOf[js.Any])
    if (infiniteLoadBeginEdgeOffset != null) __obj.updateDynamic("infiniteLoadBeginEdgeOffset")(infiniteLoadBeginEdgeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(isInfiniteLoading)) __obj.updateDynamic("isInfiniteLoading")(isInfiniteLoading.asInstanceOf[js.Any])
    if (loadingSpinnerDelegate != null) __obj.updateDynamic("loadingSpinnerDelegate")(loadingSpinnerDelegate.rawElement.asInstanceOf[js.Any])
    onInfiniteLoad.foreach(p => __obj.updateDynamic("onInfiniteLoad")(p.toJsFn))
    if (preloadAdditionalHeight != null) __obj.updateDynamic("preloadAdditionalHeight")(preloadAdditionalHeight.asInstanceOf[js.Any])
    if (preloadBatchSize != null) __obj.updateDynamic("preloadBatchSize")(preloadBatchSize.asInstanceOf[js.Any])
    if (timeScrollStateLastsForAfterUserScrolls != null) __obj.updateDynamic("timeScrollStateLastsForAfterUserScrolls")(timeScrollStateLastsForAfterUserScrolls.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInfinite.mod.InfiniteProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInfinite.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInfinite.mod.InfiniteProps])(children: _*)
  }
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

