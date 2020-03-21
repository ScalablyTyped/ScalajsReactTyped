package typingsJapgolly.styletronReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styletronReact.AnonChildren
import typingsJapgolly.styletronReact.mod.DebugEngine
import typingsJapgolly.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DevConsumer {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (StandardEngine, DebugEngine, Boolean) => CallbackTo[Node]
  ): UnmountedSimple[
    AnonChildren, 
    MountedWithRawType[AnonChildren, js.Object, RawMounted[AnonChildren, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction3((t0: typingsJapgolly.styletronStandard.mod.StandardEngine, t1: typingsJapgolly.styletronReact.mod.DebugEngine, t2: scala.Boolean) => children(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.styletronReact.AnonChildren, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styletronReact.AnonChildren])
  }
  @JSImport("styletron-react", "DevConsumer")
  @js.native
  object componentImport extends js.Object
  
}

