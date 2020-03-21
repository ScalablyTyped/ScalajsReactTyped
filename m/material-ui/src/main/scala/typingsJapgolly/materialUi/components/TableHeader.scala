package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderProps
import typingsJapgolly.materialUi.tableHeaderMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeader {
  def apply(
    adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    displaySelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    onSelectAll: /* checked */ Boolean => Callback = null,
    selectAllSelected: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableHeaderProps, default, Unit, TableHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(displaySelectAll)) __obj.updateDynamic("displaySelectAll")(displaySelectAll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll.asInstanceOf[js.Any])
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onSelectAll(t0).runNow()))
    if (!js.isUndefined(selectAllSelected)) __obj.updateDynamic("selectAllSelected")(selectAllSelected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.tableHeaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderProps])(children: _*)
  }
  @JSImport("material-ui/Table/TableHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

