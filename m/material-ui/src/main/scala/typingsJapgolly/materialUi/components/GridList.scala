package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.GridList.GridListProps
import typingsJapgolly.materialUi.gridListMod.default
import typingsJapgolly.materialUi.materialUiStrings.auto
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridList {
  def apply(
    cellHeight: Double | auto = null,
    cols: Int | Double = null,
    padding: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridListProps, default, Unit, GridListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.GridList.GridListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.gridListMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.GridList.GridListProps])(children: _*)
  }
  @JSImport("material-ui/GridList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

