package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertModalFooterProps extends StObject {
  
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Any & Element], Unit]] = js.undefined
  
  /**
    * Callback function to be called prior to saving the new row.
    */
  var beforeSave: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Any & Element], Unit]] = js.undefined
  
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Custom class name for the close button.
    */
  var closeBtnClass: js.UndefOr[String] = js.undefined
  
  /**
    * Bootstrap css class name for the close button, example: 'btn-warning'
    */
  var closeBtnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Text to display on the Close button
    */
  var closeBtnText: js.UndefOr[String] = js.undefined
  
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    * Callback function to be called to save the new row.
    */
  var onSave: js.UndefOr[js.Function1[/* save */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    * Custom class name for the save button.
    */
  var saveBtnClass: js.UndefOr[String] = js.undefined
  
  /**
    * Bootstrap css class name for the save button, example: 'btn-success'
    */
  var saveBtnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Text to display on the Save button
    */
  var saveBtnText: js.UndefOr[String] = js.undefined
}
object InsertModalFooterProps {
  
  inline def apply(): InsertModalFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalFooterProps]
  }
  
  extension [Self <: InsertModalFooterProps](x: Self) {
    
    inline def setBeforeClose(value: /* e */ ReactEventFrom[Any & Element] => Callback): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setBeforeSave(value: /* e */ ReactEventFrom[Any & Element] => Callback): Self = StObject.set(x, "beforeSave", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseBtnClass(value: String): Self = StObject.set(x, "closeBtnClass", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnClassUndefined: Self = StObject.set(x, "closeBtnClass", js.undefined)
    
    inline def setCloseBtnContextual(value: String): Self = StObject.set(x, "closeBtnContextual", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnContextualUndefined: Self = StObject.set(x, "closeBtnContextual", js.undefined)
    
    inline def setCloseBtnText(value: String): Self = StObject.set(x, "closeBtnText", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnTextUndefined: Self = StObject.set(x, "closeBtnText", js.undefined)
    
    inline def setOnModalClose(value: /* closeModal */ js.Function0[Unit] => Callback): Self = StObject.set(x, "onModalClose", js.Any.fromFunction1((t0: /* closeModal */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnModalCloseUndefined: Self = StObject.set(x, "onModalClose", js.undefined)
    
    inline def setOnSave(value: /* save */ js.Function0[Unit] => Callback): Self = StObject.set(x, "onSave", js.Any.fromFunction1((t0: /* save */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
    
    inline def setSaveBtnClass(value: String): Self = StObject.set(x, "saveBtnClass", value.asInstanceOf[js.Any])
    
    inline def setSaveBtnClassUndefined: Self = StObject.set(x, "saveBtnClass", js.undefined)
    
    inline def setSaveBtnContextual(value: String): Self = StObject.set(x, "saveBtnContextual", value.asInstanceOf[js.Any])
    
    inline def setSaveBtnContextualUndefined: Self = StObject.set(x, "saveBtnContextual", js.undefined)
    
    inline def setSaveBtnText(value: String): Self = StObject.set(x, "saveBtnText", value.asInstanceOf[js.Any])
    
    inline def setSaveBtnTextUndefined: Self = StObject.set(x, "saveBtnText", js.undefined)
  }
}
