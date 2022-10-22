package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGetObjectOptions.
  */
trait INxGetObjectOptions extends StObject {
  
  /**
    * Set of data.
    */
  var qData: Any
  
  /**
    * Set to true to include session objects.
    *
    * Default: false
    */
  var qIncludeSessionObjects: Boolean
  
  /**
    * List of object types..
    */
  var qTypes: js.Array[String]
}
object INxGetObjectOptions {
  
  inline def apply(qData: Any, qIncludeSessionObjects: Boolean, qTypes: js.Array[String]): INxGetObjectOptions = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qIncludeSessionObjects = qIncludeSessionObjects.asInstanceOf[js.Any], qTypes = qTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGetObjectOptions]
  }
  
  extension [Self <: INxGetObjectOptions](x: Self) {
    
    inline def setQData(value: Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQIncludeSessionObjects(value: Boolean): Self = StObject.set(x, "qIncludeSessionObjects", value.asInstanceOf[js.Any])
    
    inline def setQTypes(value: js.Array[String]): Self = StObject.set(x, "qTypes", value.asInstanceOf[js.Any])
    
    inline def setQTypesVarargs(value: String*): Self = StObject.set(x, "qTypes", js.Array(value*))
  }
}
