package typingsJapgolly.reactMedia.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMedia.mod.MediaQueryValue
import typingsJapgolly.reactMedia.mod.SingleQueryProps
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMedia {
  def apply(
    query: MediaQueryValue,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Callback = null,
    render: js.UndefOr[CallbackTo[Node]] = js.undefined,
    targetWindow: Window_ = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* matches */ Boolean, Node]) | Node = null
  ): UnmountedSimple[
    SingleQueryProps, 
    MountedWithRawType[SingleQueryProps, js.Object, RawMounted[SingleQueryProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* matches */ scala.Boolean) => onChange(t0).runNow()))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactMedia.mod.SingleQueryProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMedia.mod.SingleQueryProps])
  }
  @JSImport("react-media", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

