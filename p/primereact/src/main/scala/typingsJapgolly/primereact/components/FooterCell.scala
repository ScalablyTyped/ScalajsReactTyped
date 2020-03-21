package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.footerCellMod.FooterCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FooterCell {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FooterCellProps, 
    typingsJapgolly.primereact.footerCellMod.FooterCell, 
    Unit, 
    FooterCellProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.footerCellMod.FooterCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.footerCellMod.FooterCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.footerCellMod.FooterCellProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/FooterCell", "FooterCell")
  @js.native
  object componentImport extends js.Object
  
}

