package typingsJapgolly.reachRect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRect.AnonRect
import typingsJapgolly.reachRect.mod.RectProps
import typingsJapgolly.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rect {
  def apply(
    observe: js.UndefOr[Boolean] = js.undefined,
    onChange: /* rect */ DOMRect => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* args */ AnonRect => CallbackTo[Node] = null
  ): UnmountedSimple[
    RectProps, 
    MountedWithRawType[RectProps, js.Object, RawMounted[RectProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reachRect.AnonRect) => children(t0).runNow()))
    if (!js.isUndefined(observe)) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* rect */ typingsJapgolly.std.DOMRect) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reachRect.mod.RectProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRect.mod.RectProps])
  }
  @JSImport("@reach/rect", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

