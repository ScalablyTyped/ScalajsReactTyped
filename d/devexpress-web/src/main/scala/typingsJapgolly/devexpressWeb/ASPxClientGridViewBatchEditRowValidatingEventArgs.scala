package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
trait ASPxClientGridViewBatchEditRowValidatingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the row's key.
    */
  var key: Any
  
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: Any
  
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  
  inline def apply(key: Any, validationInfo: Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewBatchEditRowValidatingEventArgs](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValidationInfo(value: Any): Self = StObject.set(x, "validationInfo", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
