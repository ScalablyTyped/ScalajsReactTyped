package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps
import typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import typingsJapgolly.reactVirtualized.mod.Index
import typingsJapgolly.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InfiniteLoader {
  def apply(
    isRowLoaded: Index => CallbackTo[Boolean],
    loadMoreRows: IndexRange => CallbackTo[js.Promise[js.Any]],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    minimumBatchSize: Int | Double = null,
    rowCount: Int | Double = null,
    threshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: InfiniteLoaderChildProps => CallbackTo[Node]
  ): UnmountedWithRoot[
    InfiniteLoaderProps, 
    typingsJapgolly.reactVirtualized.mod.InfiniteLoader, 
    Unit, 
    InfiniteLoaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps) => children(t0).runNow()))
    __obj.updateDynamic("isRowLoaded")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.mod.Index) => isRowLoaded(t0).runNow()))
    __obj.updateDynamic("loadMoreRows")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.mod.IndexRange) => loadMoreRows(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.InfiniteLoader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps])
  }
  @JSImport("react-virtualized", "InfiniteLoader")
  @js.native
  object componentImport extends js.Object
  
}

