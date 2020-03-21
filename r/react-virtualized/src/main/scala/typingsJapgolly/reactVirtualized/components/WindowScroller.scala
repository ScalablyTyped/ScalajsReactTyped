package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactVirtualized.AnonHeight
import typingsJapgolly.reactVirtualized.AnonScrollLeft
import typingsJapgolly.reactVirtualized.esWindowScrollerMod.WindowScrollerChildProps
import typingsJapgolly.reactVirtualized.esWindowScrollerMod.WindowScrollerProps
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WindowScroller {
  def apply(
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    onResize: /* params */ AnonHeight => Callback = null,
    onScroll: /* params */ AnonScrollLeft => Callback = null,
    scrollElement: (Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) | Element = null,
    scrollingResetTimeInterval: Int | Double = null,
    serverHeight: Int | Double = null,
    serverWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: WindowScrollerChildProps => CallbackTo[Node]
  ): UnmountedWithRoot[
    WindowScrollerProps, 
    typingsJapgolly.reactVirtualized.mod.WindowScroller, 
    Unit, 
    WindowScrollerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esWindowScrollerMod.WindowScrollerChildProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.AnonHeight) => onResize(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.AnonScrollLeft) => onScroll(t0).runNow()))
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (serverHeight != null) __obj.updateDynamic("serverHeight")(serverHeight.asInstanceOf[js.Any])
    if (serverWidth != null) __obj.updateDynamic("serverWidth")(serverWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esWindowScrollerMod.WindowScrollerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.WindowScroller](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esWindowScrollerMod.WindowScrollerProps])
  }
  @JSImport("react-virtualized", "WindowScroller")
  @js.native
  object componentImport extends js.Object
  
}

