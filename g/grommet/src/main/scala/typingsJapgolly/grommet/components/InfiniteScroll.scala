package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.grommetStrings.window
import typingsJapgolly.grommet.infiniteScrollMod.InfiniteScrollProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InfiniteScroll {
  def apply(
    items: js.Array[_] = null,
    onMore: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    renderMarker: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    scrollableAncestor: Node | window = null,
    show: Int | Double = null,
    step: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): UnmountedWithRoot[
    InfiniteScrollProps, 
    typingsJapgolly.grommet.mod.InfiniteScroll, 
    Unit, 
    InfiniteScrollProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => children(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMore(t0).runNow()))
    if (renderMarker != null) __obj.updateDynamic("renderMarker")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => renderMarker(t0).runNow()))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.infiniteScrollMod.InfiniteScrollProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.grommet.mod.InfiniteScroll](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.infiniteScrollMod.InfiniteScrollProps])
  }
  @JSImport("grommet", "InfiniteScroll")
  @js.native
  object componentImport extends js.Object
  
}

