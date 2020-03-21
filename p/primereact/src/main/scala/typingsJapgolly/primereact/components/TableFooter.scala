package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.tableFooterMod.TableFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFooter {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableFooterProps, 
    typingsJapgolly.primereact.tableFooterMod.TableFooter, 
    Unit, 
    TableFooterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.tableFooterMod.TableFooterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.tableFooterMod.TableFooter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.tableFooterMod.TableFooterProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/TableFooter", "TableFooter")
  @js.native
  object componentImport extends js.Object
  
}

