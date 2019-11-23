package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
import typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object TablePaginationActions {
  def apply(
    props: TablePaginationActionsProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TablePaginationActionsProps with js.Object, 
    default, 
    Unit, 
    TablePaginationActionsProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps with js.Object])(children: _*)
  }
}

