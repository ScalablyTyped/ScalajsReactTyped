package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToolbox.componentsDatePickerDatePickerMod.DatePickerLocale
import typingsJapgolly.reactToolbox.componentsDatePickerDatePickerMod.DatePickerProps
import typingsJapgolly.reactToolbox.componentsDatePickerDatePickerMod.DatePickerTheme
import typingsJapgolly.reactToolbox.componentsDatePickerMod.default
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-cn`
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-hk`
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-tw`
import typingsJapgolly.reactToolbox.reactToolboxStrings.af
import typingsJapgolly.reactToolbox.reactToolboxStrings.ar
import typingsJapgolly.reactToolbox.reactToolboxStrings.be
import typingsJapgolly.reactToolbox.reactToolboxStrings.bg
import typingsJapgolly.reactToolbox.reactToolboxStrings.bn
import typingsJapgolly.reactToolbox.reactToolboxStrings.bo
import typingsJapgolly.reactToolbox.reactToolboxStrings.br
import typingsJapgolly.reactToolbox.reactToolboxStrings.bs
import typingsJapgolly.reactToolbox.reactToolboxStrings.ca
import typingsJapgolly.reactToolbox.reactToolboxStrings.de
import typingsJapgolly.reactToolbox.reactToolboxStrings.en
import typingsJapgolly.reactToolbox.reactToolboxStrings.es
import typingsJapgolly.reactToolbox.reactToolboxStrings.eu
import typingsJapgolly.reactToolbox.reactToolboxStrings.fr
import typingsJapgolly.reactToolbox.reactToolboxStrings.gl
import typingsJapgolly.reactToolbox.reactToolboxStrings.it
import typingsJapgolly.reactToolbox.reactToolboxStrings.no
import typingsJapgolly.reactToolbox.reactToolboxStrings.pt
import typingsJapgolly.reactToolbox.reactToolboxStrings.ru
import typingsJapgolly.reactToolbox.reactToolboxStrings.ua
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("react-toolbox/components/date_picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    
    inline def cancelLabel(value: String): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    inline def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value*))
    
    inline def enabledDates(value: js.Array[js.Date]): this.type = set("enabledDates", value.asInstanceOf[js.Any])
    
    inline def enabledDatesVarargs(value: js.Date*): this.type = set("enabledDates", js.Array(value*))
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def inputFormat(value: js.Function): this.type = set("inputFormat", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def locale(
      value: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
    ): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def okLabel(value: String): this.type = set("okLabel", value.asInstanceOf[js.Any])
    
    inline def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: js.Function): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: js.Function): this.type = set("onDismiss", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: js.Function): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: js.Function): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: js.Function): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: js.Function): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: js.Function): this.type = set("onDragExit", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: js.Function): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: js.Function): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: js.Function): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: js.Function): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    inline def onEscKeyDown(value: js.Function): this.type = set("onEscKeyDown", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: js.Function): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: js.Function): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: js.Function): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def onMouseLeave(value: js.Function): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def onMouseMove(value: js.Function): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: js.Function): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: js.Function): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: js.Function): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    inline def onOverlayClick(value: js.Function): this.type = set("onOverlayClick", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: js.Function): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: js.Function): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: js.Function): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: js.Function): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def sundayFirstDayOfWeek(value: Boolean): this.type = set("sundayFirstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def theme(value: DatePickerTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
