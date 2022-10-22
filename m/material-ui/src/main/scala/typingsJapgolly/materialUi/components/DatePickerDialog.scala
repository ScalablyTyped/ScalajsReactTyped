package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.DatePicker.DatePickerDialogProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.anon.TypeofDateTimeFormat
import typingsJapgolly.materialUi.datePickerDatePickerDialogMod.default
import typingsJapgolly.materialUi.materialUiStrings.`inline`
import typingsJapgolly.materialUi.materialUiStrings.dialog
import typingsJapgolly.materialUi.materialUiStrings.landscape
import typingsJapgolly.materialUi.materialUiStrings.portrait
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerDialog {
  
  @JSImport("material-ui/DatePicker/DatePickerDialog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def DateTimeFormat(value: TypeofDateTimeFormat): this.type = set("DateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def animation(value: ComponentClassP[PopoverAnimationProps & js.Object]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    
    inline def cancelLabel(value: VdomNode): this.type = set("cancelLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelLabelNull: this.type = set("cancelLabel", null)
    
    inline def cancelLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelLabel", js.Array(value*))
    
    inline def cancelLabelVdomElement(value: VdomElement): this.type = set("cancelLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def container(value: dialog | `inline`): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def disableYearSelection(value: Boolean): this.type = set("disableYearSelection", value.asInstanceOf[js.Any])
    
    inline def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def mode(value: portrait | landscape): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def okLabel(value: VdomNode): this.type = set("okLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def okLabelNull: this.type = set("okLabel", null)
    
    inline def okLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("okLabel", js.Array(value*))
    
    inline def okLabelVdomElement(value: VdomElement): this.type = set("okLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAccept(value: /* d */ js.Date => Callback): this.type = set("onAccept", js.Any.fromFunction1((t0: /* d */ js.Date) => value(t0).runNow()))
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def shouldDisableDate(value: /* day */ js.Date => Boolean): this.type = set("shouldDisableDate", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def utils(value: typingsJapgolly.materialUi.MaterialUI.propTypes.utils): this.type = set("utils", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePickerDialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
