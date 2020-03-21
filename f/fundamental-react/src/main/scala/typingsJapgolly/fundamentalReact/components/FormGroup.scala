package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StringDictionary[js.Any], 
    MountedWithRawType[StringDictionary[js.Any], js.Object, RawMounted[StringDictionary[js.Any], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  org.scalablytyped.runtime.StringDictionary[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.Any]])(children: _*)
  }
  @JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

