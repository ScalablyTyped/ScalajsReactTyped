package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.content
import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget
import typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.button
import typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dialog extends StObject {
  
  def addFocusable(element: element): Unit = js.native
  def addFocusable(element: element, index: Double): Unit = js.native
  
  def addPage(contents: StringDictionary[Any]): Unit = js.native
  
  def click(id: String): Any = js.native
  
  def commitContent(): Unit = js.native
  
  def disableButton(id: String): Unit = js.native
  
  def enableButton(id: String): Unit = js.native
  
  def foreach(fn: js.Function0[Unit]): dialog = js.native
  
  def getButton(id: String): button = js.native
  
  def getContentElement(pageId: String, elementId: String): uiElement = js.native
  
  def getElement(): element = js.native
  
  def getName(): String = js.native
  
  def getPageCount(): Double = js.native
  
  def getParentEditor(): editor = js.native
  
  def getPosition(): StringDictionary[Any] = js.native
  
  def getSelectedElement(): element = js.native
  
  def getSize(): StringDictionary[Any] = js.native
  
  def getValueOf(pageId: String, elementId: String): Any = js.native
  
  def hide(): Unit = js.native
  
  def hidePage(id: String): Unit = js.native
  
  def layout(): Unit = js.native
  
  def move(x: Double, y: Double, save: Boolean): Unit = js.native
  
  def reset(): dialog = js.native
  
  def resize(width: Double, height: Double): Unit = js.native
  
  def selectPage(id: String): Unit = js.native
  
  def setState(state: Double): Unit = js.native
  
  def setValueOf(pageId: String, elementId: String, value: Any): Unit = js.native
  
  def setupContent(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showPage(id: String): Unit = js.native
  
  val state: Double = js.native
  
  def updateStyle(): Unit = js.native
}
object dialog {
  
  trait DialogDefinition extends StObject {
    
    var buttons: js.UndefOr[js.Array[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button]] = js.undefined
    
    var contents: js.UndefOr[js.Array[content]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resizable: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object DialogDefinition {
    
    inline def apply(): DialogDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogDefinition]
    }
    
    extension [Self <: DialogDefinition](x: Self) {
      
      inline def setButtons(value: js.Array[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setContents(value: js.Array[content]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setContentsVarargs(value: content*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnOk(value: Callback): Self = StObject.set(x, "onOk", value.toJsFn)
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  object definition {
    
    trait button
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var disabled: js.UndefOr[Boolean] = js.undefined
    }
    object button {
      
      inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button]
      }
      
      extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.button](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      }
    }
    
    trait checkbox
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var default: js.UndefOr[String] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object checkbox {
      
      inline def apply(): checkbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[checkbox]
      }
      
      extension [Self <: checkbox](x: Self) {
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait content extends StObject {
      
      var accessKey: js.UndefOr[String] = js.undefined
      
      var elements: js.UndefOr[js.Array[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object content {
      
      inline def apply(): content = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[content]
      }
      
      extension [Self <: content](x: Self) {
        
        inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        inline def setElements(value: js.Array[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
        
        inline def setElementsVarargs(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement*): Self = StObject.set(x, "elements", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait file
      extends StObject
         with labeledElement {
      
      var action: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[String] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object file {
      
      inline def apply(): file = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[file]
      }
      
      extension [Self <: file](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait fileButton
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var filebrowser: js.UndefOr[String] = js.undefined
      
      var `for`: js.UndefOr[String] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object fileButton {
      
      inline def apply(): fileButton = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[fileButton]
      }
      
      extension [Self <: fileButton](x: Self) {
        
        inline def setFilebrowser(value: String): Self = StObject.set(x, "filebrowser", value.asInstanceOf[js.Any])
        
        inline def setFilebrowserUndefined: Self = StObject.set(x, "filebrowser", js.undefined)
        
        inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
        
        inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait hbox
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var children: js.UndefOr[js.Array[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement]] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var padding: js.UndefOr[Double] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      var widths: js.UndefOr[js.Array[Double]] = js.undefined
    }
    object hbox {
      
      inline def apply(): hbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[hbox]
      }
      
      extension [Self <: hbox](x: Self) {
        
        inline def setChildren(value: js.Array[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        
        inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
        
        inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        
        inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
      }
    }
    
    trait html
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var html: js.UndefOr[String] = js.undefined
    }
    object html {
      
      inline def apply(): html = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[html]
      }
      
      extension [Self <: html](x: Self) {
        
        inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      }
    }
    
    trait labeledElement
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var controlStyle: js.UndefOr[String] = js.undefined
      
      var inputStyle: js.UndefOr[String] = js.undefined
      
      var labelLayout: js.UndefOr[String] = js.undefined
      
      var labelStyle: js.UndefOr[String] = js.undefined
      
      var widths: js.UndefOr[js.Array[Double]] = js.undefined
    }
    object labeledElement {
      
      inline def apply(): labeledElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[labeledElement]
      }
      
      extension [Self <: labeledElement](x: Self) {
        
        inline def setControlStyle(value: String): Self = StObject.set(x, "controlStyle", value.asInstanceOf[js.Any])
        
        inline def setControlStyleUndefined: Self = StObject.set(x, "controlStyle", js.undefined)
        
        inline def setInputStyle(value: String): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
        
        inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
        
        inline def setLabelLayout(value: String): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
        
        inline def setLabelLayoutUndefined: Self = StObject.set(x, "labelLayout", js.undefined)
        
        inline def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
        
        inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
        
        inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
        
        inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        
        inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
      }
    }
    
    trait radio
      extends StObject
         with labeledElement {
      
      var default: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object radio {
      
      inline def apply(): radio = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[radio]
      }
      
      extension [Self <: radio](x: Self) {
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setItems(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait select
      extends StObject
         with labeledElement {
      
      var default: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
      
      var multiple: js.UndefOr[Boolean] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object select {
      
      inline def apply(): select = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[select]
      }
      
      extension [Self <: select](x: Self) {
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setItems(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait textInput
      extends StObject
         with labeledElement {
      
      var default: js.UndefOr[String] = js.undefined
      
      var bidi: js.UndefOr[Boolean] = js.undefined
      
      var maxLength: js.UndefOr[Double] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object textInput {
      
      inline def apply(): textInput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[textInput]
      }
      
      extension [Self <: textInput](x: Self) {
        
        inline def setBidi(value: Boolean): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
        
        inline def setBidiUndefined: Self = StObject.set(x, "bidi", js.undefined)
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait textarea
      extends StObject
         with labeledElement {
      
      var default: js.UndefOr[String] = js.undefined
      
      var bidi: js.UndefOr[Boolean] = js.undefined
      
      var cols: js.UndefOr[Double] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
    }
    object textarea {
      
      inline def apply(): textarea = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[textarea]
      }
      
      extension [Self <: textarea](x: Self) {
        
        inline def setBidi(value: Boolean): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
        
        inline def setBidiUndefined: Self = StObject.set(x, "bidi", js.undefined)
        
        inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setValidate(value: CallbackTo[Boolean]): Self = StObject.set(x, "validate", value.toJsFn)
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    trait uiElement extends StObject {
      
      var align: js.UndefOr[String] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      var commit: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var onHide: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.undefined
      
      var onLoad: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.undefined
      
      var onShow: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.undefined
      
      var requiredContent: js.UndefOr[String | StringDictionary[Any] | style] = js.undefined
      
      var setup: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.undefined
      
      var style: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object uiElement {
      
      inline def apply(): typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement]
      }
      
      extension [Self <: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement](x: Self) {
        
        inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setCommit(value: /* widget */ widget => Callback): Self = StObject.set(x, "commit", js.Any.fromFunction1((t0: /* widget */ widget) => value(t0).runNow()))
        
        inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setOnHide(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement) => value(t0).runNow()))
        
        inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
        
        inline def setOnLoad(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement) => value(t0).runNow()))
        
        inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        inline def setOnShow(value: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement) => value(t0).runNow()))
        
        inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        inline def setRequiredContent(value: String | StringDictionary[Any] | style): Self = StObject.set(x, "requiredContent", value.asInstanceOf[js.Any])
        
        inline def setRequiredContentUndefined: Self = StObject.set(x, "requiredContent", js.undefined)
        
        inline def setSetup(value: /* widget */ widget => Callback): Self = StObject.set(x, "setup", js.Any.fromFunction1((t0: /* widget */ widget) => value(t0).runNow()))
        
        inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
        
        inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait vbox
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.dialog.definition.uiElement {
      
      var children: js.UndefOr[js.Array[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement]] = js.undefined
      
      var expand: js.UndefOr[Boolean] = js.undefined
      
      var heights: js.UndefOr[js.Array[Double]] = js.undefined
      
      var padding: js.UndefOr[Double] = js.undefined
      
      var styles: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[js.Array[Double]] = js.undefined
    }
    object vbox {
      
      inline def apply(): vbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[vbox]
      }
      
      extension [Self <: vbox](x: Self) {
        
        inline def setChildren(value: js.Array[typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: typingsJapgolly.ckeditor4.CKEDITOR.ui.dialog.uiElement*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
        
        inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
        
        inline def setHeights(value: js.Array[Double]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
        
        inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
        
        inline def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value*))
        
        inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        inline def setWidth(value: js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value*))
      }
    }
  }
}
