package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.tableHeaderMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableHeaderProps, 
    typingsJapgolly.primereact.tableHeaderMod.TableHeader, 
    Unit, 
    TableHeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.tableHeaderMod.TableHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.tableHeaderMod.TableHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.tableHeaderMod.TableHeaderProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/TableHeader", "TableHeader")
  @js.native
  object componentImport extends js.Object
  
}

