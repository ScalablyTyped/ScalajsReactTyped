package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionConvertToPDF extends StObject {
  
  def Clone(): IActionConvertToPDF
  
  var FailOnUnsupportedSourceFiles: Boolean
  
  var OverwriteExistingFile: Boolean
  
  var PDFA1b: Boolean
  
  var StoreAsSeparateFile: Boolean
}
object IActionConvertToPDF {
  
  inline def apply(
    Clone: CallbackTo[IActionConvertToPDF],
    FailOnUnsupportedSourceFiles: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    StoreAsSeparateFile: Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, FailOnUnsupportedSourceFiles = FailOnUnsupportedSourceFiles.asInstanceOf[js.Any], OverwriteExistingFile = OverwriteExistingFile.asInstanceOf[js.Any], PDFA1b = PDFA1b.asInstanceOf[js.Any], StoreAsSeparateFile = StoreAsSeparateFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionConvertToPDF]
  }
  
  extension [Self <: IActionConvertToPDF](x: Self) {
    
    inline def setClone(value: CallbackTo[IActionConvertToPDF]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFailOnUnsupportedSourceFiles(value: Boolean): Self = StObject.set(x, "FailOnUnsupportedSourceFiles", value.asInstanceOf[js.Any])
    
    inline def setOverwriteExistingFile(value: Boolean): Self = StObject.set(x, "OverwriteExistingFile", value.asInstanceOf[js.Any])
    
    inline def setPDFA1b(value: Boolean): Self = StObject.set(x, "PDFA1b", value.asInstanceOf[js.Any])
    
    inline def setStoreAsSeparateFile(value: Boolean): Self = StObject.set(x, "StoreAsSeparateFile", value.asInstanceOf[js.Any])
  }
}
