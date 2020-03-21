package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcTable.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Body {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[FnCall, MountedWithRawType[FnCall, js.Object, RawMounted[FnCall, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[typingsJapgolly.rcTable.FnCall, japgolly.scalajs.react.Children.Varargs, js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTable.FnCall])(children: _*)
  }
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

