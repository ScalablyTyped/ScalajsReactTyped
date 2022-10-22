package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedTransferSize extends StObject {
  
  var estimatedTransferSize: js.UndefOr[Double] = js.undefined
  
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  var initial: js.UndefOr[Boolean] = js.undefined
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  var rawSize: js.UndefOr[Double] = js.undefined
  
  var rendered: js.UndefOr[Boolean] = js.undefined
}
object EstimatedTransferSize {
  
  inline def apply(): EstimatedTransferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedTransferSize]
  }
  
  extension [Self <: EstimatedTransferSize](x: Self) {
    
    inline def setEstimatedTransferSize(value: Double): Self = StObject.set(x, "estimatedTransferSize", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTransferSizeUndefined: Self = StObject.set(x, "estimatedTransferSize", js.undefined)
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setRawSize(value: Double): Self = StObject.set(x, "rawSize", value.asInstanceOf[js.Any])
    
    inline def setRawSizeUndefined: Self = StObject.set(x, "rawSize", js.undefined)
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
  }
}
