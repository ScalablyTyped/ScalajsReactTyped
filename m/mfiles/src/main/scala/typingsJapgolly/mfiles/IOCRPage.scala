package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRPage extends StObject {
  
  def Clone(): IOCRPage
  
  var OCRZones: IOCRZones
  
  var PageNum: Double
}
object IOCRPage {
  
  inline def apply(Clone: CallbackTo[IOCRPage], OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPage]
  }
  
  extension [Self <: IOCRPage](x: Self) {
    
    inline def setClone(value: CallbackTo[IOCRPage]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setOCRZones(value: IOCRZones): Self = StObject.set(x, "OCRZones", value.asInstanceOf[js.Any])
    
    inline def setPageNum(value: Double): Self = StObject.set(x, "PageNum", value.asInstanceOf[js.Any])
  }
}
