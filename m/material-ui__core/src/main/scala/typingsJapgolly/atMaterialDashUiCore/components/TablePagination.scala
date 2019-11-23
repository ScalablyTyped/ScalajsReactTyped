package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.tablePaginationMod.default
import typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationMod.TablePaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object TablePagination {
  def apply(
    props: TablePaginationProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TablePaginationProps with js.Object, 
    default, 
    Unit, 
    TablePaginationProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationMod.TablePaginationProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.tablePaginationMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.tablePaginationMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationMod.TablePaginationProps with js.Object])(children: _*)
  }
}

