package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPreviewerActiveXCtrl extends StObject {
  
  def ClearPreview(): Double
  
  def ShowFilePreview(bstrFilename: String): Double
  
  def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: Any,
    bstrSearchConditions: String
  ): Double
}
object IPreviewerActiveXCtrl {
  
  inline def apply(
    ClearPreview: CallbackTo[Double],
    ShowFilePreview: String => Double,
    ShowHitHighlightedFilePreview: (String, Double, Double, Double, Double, Double, Any, String) => Double
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal(ClearPreview = ClearPreview.toJsFn, ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowHitHighlightedFilePreview = js.Any.fromFunction8(ShowHitHighlightedFilePreview))
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
  
  extension [Self <: IPreviewerActiveXCtrl](x: Self) {
    
    inline def setClearPreview(value: CallbackTo[Double]): Self = StObject.set(x, "ClearPreview", value.toJsFn)
    
    inline def setShowFilePreview(value: String => Double): Self = StObject.set(x, "ShowFilePreview", js.Any.fromFunction1(value))
    
    inline def setShowHitHighlightedFilePreview(value: (String, Double, Double, Double, Double, Double, Any, String) => Double): Self = StObject.set(x, "ShowHitHighlightedFilePreview", js.Any.fromFunction8(value))
  }
}
