package typingsJapgolly.materialUiPagination.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiPagination.mod.PaginationProps
import typingsJapgolly.materialUiPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialUiPagination {
  def apply(
    current: Double,
    display: Double,
    total: Double,
    onChange: Double => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PaginationProps, default, Unit, PaginationProps] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: scala.Double) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiPagination.mod.PaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiPagination.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiPagination.mod.PaginationProps])(children: _*)
  }
  @JSImport("material-ui-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

