package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.extjs.Ext.IElement
import typingsJapgolly.extjs.Ext.button.IButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileUploadField
  extends StObject
     with typingsJapgolly.extjs.Ext.form.field.ITrigger {
  
  /** [Property] (Ext.button.Button) */
  var button: js.UndefOr[IButton] = js.undefined
  
  /** [Config Option] (Object) */
  var buttonConfig: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var buttonMargin: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var buttonOnly: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var buttonText: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Only relevant if the instance s isFileUpload method returns true
    * @returns HTMLElement
    */
  @JSName("extractFileInput")
  var extractFileInput_IFileUploadField: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  
  /** [Property] (Ext.Element) */
  var fileInputEl: js.UndefOr[IElement] = js.undefined
  
  /** [Method] Gets the markup to be inserted into the subTplMarkup  */
  var getTriggerMarkup: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
    * @returns Boolean
    */
  @JSName("isFileUpload")
  var isFileUpload_IFileUploadField: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Overridden to do nothing */
  @JSName("setValue")
  var setValue_IFileUploadField: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IFileUploadField {
  
  inline def apply(): IFileUploadField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileUploadField]
  }
  
  extension [Self <: IFileUploadField](x: Self) {
    
    inline def setButton(value: IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonConfig(value: Any): Self = StObject.set(x, "buttonConfig", value.asInstanceOf[js.Any])
    
    inline def setButtonConfigUndefined: Self = StObject.set(x, "buttonConfig", js.undefined)
    
    inline def setButtonMargin(value: Double): Self = StObject.set(x, "buttonMargin", value.asInstanceOf[js.Any])
    
    inline def setButtonMarginUndefined: Self = StObject.set(x, "buttonMargin", js.undefined)
    
    inline def setButtonOnly(value: Boolean): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
    
    inline def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
    
    inline def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
    
    inline def setExtractFileInput(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "extractFileInput", value.toJsFn)
    
    inline def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    inline def setFileInputEl(value: IElement): Self = StObject.set(x, "fileInputEl", value.asInstanceOf[js.Any])
    
    inline def setFileInputElUndefined: Self = StObject.set(x, "fileInputEl", js.undefined)
    
    inline def setGetTriggerMarkup(value: Callback): Self = StObject.set(x, "getTriggerMarkup", value.toJsFn)
    
    inline def setGetTriggerMarkupUndefined: Self = StObject.set(x, "getTriggerMarkup", js.undefined)
    
    inline def setIsFileUpload(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFileUpload", value.toJsFn)
    
    inline def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setSetValue(value: Callback): Self = StObject.set(x, "setValue", value.toJsFn)
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
