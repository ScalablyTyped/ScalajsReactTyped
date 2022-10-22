package typingsJapgolly.webix.mod.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.mod.Date
import typingsJapgolly.webix.mod.EventHash
import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait datepickerConfig extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var animate: js.UndefOr[Any] = js.undefined
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var bottomLabel: js.UndefOr[String] = js.undefined
  
  var bottomPadding: js.UndefOr[Double] = js.undefined
  
  var click: js.UndefOr[WebixCallback] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var editable: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String | WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var hotkey: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var icons: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var inputAlign: js.UndefOr[String] = js.undefined
  
  var inputHeight: js.UndefOr[Double] = js.undefined
  
  var inputWidth: js.UndefOr[Double] = js.undefined
  
  var invalid: js.UndefOr[Boolean] = js.undefined
  
  var invalidMessage: js.UndefOr[String] = js.undefined
  
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelAlign: js.UndefOr[String] = js.undefined
  
  var labelPosition: js.UndefOr[String] = js.undefined
  
  var labelWidth: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var multiselect: js.UndefOr[Boolean | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var point: js.UndefOr[Boolean] = js.undefined
  
  var popup: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var relatedAction: js.UndefOr[String] = js.undefined
  
  var relatedView: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var stringResult: js.UndefOr[Boolean] = js.undefined
  
  var suggest: js.UndefOr[Any] = js.undefined
  
  var timeIcon: js.UndefOr[String] = js.undefined
  
  var timepicker: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[WebixCallback] = js.undefined
  
  var validateEvent: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Date | String] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object datepickerConfig {
  
  inline def apply(): datepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[datepickerConfig]
  }
  
  extension [Self <: datepickerConfig](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    inline def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    inline def setBottomPadding(value: Double): Self = StObject.set(x, "bottomPadding", value.asInstanceOf[js.Any])
    
    inline def setBottomPaddingUndefined: Self = StObject.set(x, "bottomPadding", js.undefined)
    
    inline def setClick(value: WebixCallback): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFormat(value: String | WebixCallback): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    inline def setHotkeyUndefined: Self = StObject.set(x, "hotkey", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputAlign(value: String): Self = StObject.set(x, "inputAlign", value.asInstanceOf[js.Any])
    
    inline def setInputAlignUndefined: Self = StObject.set(x, "inputAlign", js.undefined)
    
    inline def setInputHeight(value: Double): Self = StObject.set(x, "inputHeight", value.asInstanceOf[js.Any])
    
    inline def setInputHeightUndefined: Self = StObject.set(x, "inputHeight", js.undefined)
    
    inline def setInputWidth(value: Double): Self = StObject.set(x, "inputWidth", value.asInstanceOf[js.Any])
    
    inline def setInputWidthUndefined: Self = StObject.set(x, "inputWidth", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidMessage(value: String): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMultiselect(value: Boolean | String): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRelatedAction(value: String): Self = StObject.set(x, "relatedAction", value.asInstanceOf[js.Any])
    
    inline def setRelatedActionUndefined: Self = StObject.set(x, "relatedAction", js.undefined)
    
    inline def setRelatedView(value: String): Self = StObject.set(x, "relatedView", value.asInstanceOf[js.Any])
    
    inline def setRelatedViewUndefined: Self = StObject.set(x, "relatedView", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setStringResult(value: Boolean): Self = StObject.set(x, "stringResult", value.asInstanceOf[js.Any])
    
    inline def setStringResultUndefined: Self = StObject.set(x, "stringResult", js.undefined)
    
    inline def setSuggest(value: Any): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setTimeIcon(value: String): Self = StObject.set(x, "timeIcon", value.asInstanceOf[js.Any])
    
    inline def setTimeIconUndefined: Self = StObject.set(x, "timeIcon", js.undefined)
    
    inline def setTimepicker(value: Boolean): Self = StObject.set(x, "timepicker", value.asInstanceOf[js.Any])
    
    inline def setTimepickerUndefined: Self = StObject.set(x, "timepicker", js.undefined)
    
    inline def setTooltip(value: Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidate(value: WebixCallback): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateEvent(value: String): Self = StObject.set(x, "validateEvent", value.asInstanceOf[js.Any])
    
    inline def setValidateEventUndefined: Self = StObject.set(x, "validateEvent", js.undefined)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValue(value: Date | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
