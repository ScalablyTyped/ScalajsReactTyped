package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.tableBodyMod.TableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableBodyProps, 
    typingsJapgolly.primereact.tableBodyMod.TableBody, 
    Unit, 
    TableBodyProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.tableBodyMod.TableBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.tableBodyMod.TableBody](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.tableBodyMod.TableBodyProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/TableBody", "TableBody")
  @js.native
  object componentImport extends js.Object
  
}

