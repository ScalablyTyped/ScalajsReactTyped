package typingsJapgolly.reactWindowInfiniteLoader.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactWindowInfiniteLoader.AnonOnItemsRendered
import typingsJapgolly.reactWindowInfiniteLoader.mod.InfiniteLoaderProps
import typingsJapgolly.reactWindowInfiniteLoader.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactWindowInfiniteLoader {
  def apply(
    itemCount: Double,
    isItemLoaded: Double => CallbackTo[Boolean],
    loadMoreItems: (Double, Double) => CallbackTo[js.Promise[js.Any] | Null],
    minimumBatchSize: Int | Double = null,
    threshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: AnonOnItemsRendered => CallbackTo[Node]
  ): UnmountedWithRoot[InfiniteLoaderProps, ^, Unit, InfiniteLoaderProps] = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactWindowInfiniteLoader.AnonOnItemsRendered) => children(t0).runNow()))
    __obj.updateDynamic("isItemLoaded")(js.Any.fromFunction1((t0: scala.Double) => isItemLoaded(t0).runNow()))
    __obj.updateDynamic("loadMoreItems")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => loadMoreItems(t0, t1).runNow()))
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWindowInfiniteLoader.mod.InfiniteLoaderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactWindowInfiniteLoader.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWindowInfiniteLoader.mod.InfiniteLoaderProps])
  }
  @JSImport("react-window-infinite-loader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

