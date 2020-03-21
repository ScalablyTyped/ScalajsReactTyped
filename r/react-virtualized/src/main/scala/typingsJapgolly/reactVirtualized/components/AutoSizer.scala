package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.esAutoSizerMod.AutoSizerProps
import typingsJapgolly.reactVirtualized.esAutoSizerMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoSizer {
  def apply(
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onResize: /* info */ Size => CallbackTo[js.Any] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Size => CallbackTo[Node]
  ): UnmountedWithRoot[AutoSizerProps, typingsJapgolly.reactVirtualized.mod.AutoSizer, Unit, AutoSizerProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esAutoSizerMod.Size) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.esAutoSizerMod.Size) => onResize(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esAutoSizerMod.AutoSizerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.AutoSizer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esAutoSizerMod.AutoSizerProps])
  }
  @JSImport("react-virtualized", "AutoSizer")
  @js.native
  object componentImport extends js.Object
  
}

