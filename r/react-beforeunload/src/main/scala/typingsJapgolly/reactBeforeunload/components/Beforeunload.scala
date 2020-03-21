package typingsJapgolly.reactBeforeunload.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBeforeunload.AnonChildren
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beforeunload {
  def apply(
    onBeforeunload: /* arg */ Event_ => CallbackTo[js.UndefOr[String | Unit]],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnonChildren, 
    MountedWithRawType[AnonChildren, js.Object, RawMounted[AnonChildren, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onBeforeunload")(js.Any.fromFunction1((t0: /* arg */ typingsJapgolly.std.Event_) => onBeforeunload(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactBeforeunload.AnonChildren, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBeforeunload.AnonChildren])(children: _*)
  }
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  object componentImport extends js.Object
  
}

