package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgUploadMethods extends StObject {
  
  /**
    * Append additional data field to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    *
    * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    * @param field Data field that should be appended to the formData. The object has 2 properties - value and name. If the browser supports HTML5 the data field is appended to the formData object. Otherwise it is appended as input hidden field to the <form>
    */
  def addDataField(formData: js.Object, field: js.Object): Unit
  
  /**
    * Append additional data fields to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    *
    * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    * @param fields Array of data fields that should be appended to the formData. Each data field is object with 2 properties - value and name. If the browser supports HTML5 these data fields are added to the formData. Otherwise each of these data field is appended as input hidden field to the <form>
    */
  def addDataFields(formData: js.Object, fields: js.Array[Any]): Unit
  
  /**
    * Cancel all uploading and pending files
    */
  def cancelAll(): Unit
  
  /**
    * Cancel upload for the specified file id
    *  formNumber - id of the file to be canceled
    *
    * @param formNumber id of the form which should be cancelled
    */
  def cancelUpload(formNumber: Double): Unit
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igupload#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
    */
  def changeLocale(): Unit
  
  /**
    * Hide finished files
    */
  def clearAll(): Unit
  
  /**
    * Return jquery object of fileupload container - html DOM element
    */
  def container(): Unit
  
  /**
    * Destroy the widget
    */
  def destroy(): Unit
  
  /**
    * Returns the information about the file by specified file identifier. It could be file which is uploading/uploaded or uploading is not started. If there isn"t file with the specified file id returns null
    *
    * @param fileIndex unique identifier of the file
    */
  def getFileInfo(fileIndex: Double): js.Object
  
  /**
    * Returns the information about uploading files - all files uploaded/uploading/pending
    */
  def getFileInfoData(): js.Object
  
  /**
    * Start uploading file as submitting form with the specified formNumber.
    *
    * @param formNumber id of the upload form. If left undefined and useSingleRequest is true all pending files will be uploaded.
    */
  def startUpload(formNumber: Double): Unit
  
  /**
    * Returns the current widget element
    */
  def widget(): Unit
}
object IgUploadMethods {
  
  inline def apply(
    addDataField: (js.Object, js.Object) => Callback,
    addDataFields: (js.Object, js.Array[Any]) => Callback,
    cancelAll: Callback,
    cancelUpload: Double => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    clearAll: Callback,
    container: Callback,
    destroy: Callback,
    getFileInfo: Double => js.Object,
    getFileInfoData: CallbackTo[js.Object],
    startUpload: Double => Callback,
    widget: Callback
  ): IgUploadMethods = {
    val __obj = js.Dynamic.literal(addDataField = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (addDataField(t0, t1)).runNow()), addDataFields = js.Any.fromFunction2((t0: js.Object, t1: js.Array[Any]) => (addDataFields(t0, t1)).runNow()), cancelAll = cancelAll.toJsFn, cancelUpload = js.Any.fromFunction1((t0: Double) => cancelUpload(t0).runNow()), changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, clearAll = clearAll.toJsFn, container = container.toJsFn, destroy = destroy.toJsFn, getFileInfo = js.Any.fromFunction1(getFileInfo), getFileInfoData = getFileInfoData.toJsFn, startUpload = js.Any.fromFunction1((t0: Double) => startUpload(t0).runNow()), widget = widget.toJsFn)
    __obj.asInstanceOf[IgUploadMethods]
  }
  
  extension [Self <: IgUploadMethods](x: Self) {
    
    inline def setAddDataField(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "addDataField", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setAddDataFields(value: (js.Object, js.Array[Any]) => Callback): Self = StObject.set(x, "addDataFields", js.Any.fromFunction2((t0: js.Object, t1: js.Array[Any]) => (value(t0, t1)).runNow()))
    
    inline def setCancelAll(value: Callback): Self = StObject.set(x, "cancelAll", value.toJsFn)
    
    inline def setCancelUpload(value: Double => Callback): Self = StObject.set(x, "cancelUpload", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setClearAll(value: Callback): Self = StObject.set(x, "clearAll", value.toJsFn)
    
    inline def setContainer(value: Callback): Self = StObject.set(x, "container", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetFileInfo(value: Double => js.Object): Self = StObject.set(x, "getFileInfo", js.Any.fromFunction1(value))
    
    inline def setGetFileInfoData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getFileInfoData", value.toJsFn)
    
    inline def setStartUpload(value: Double => Callback): Self = StObject.set(x, "startUpload", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWidget(value: Callback): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
