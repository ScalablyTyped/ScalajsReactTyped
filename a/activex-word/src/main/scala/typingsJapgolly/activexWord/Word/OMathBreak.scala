package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBreak extends StObject {
  
  var AlignAt: Double
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  /* private */ @JSName("Word.OMathBreak_typekey")
  var WordDotOMathBreak_typekey: OMathBreak
}
object OMathBreak {
  
  inline def apply(
    AlignAt: Double,
    Application: Application,
    Creator: Double,
    Delete: Callback,
    Parent: Any,
    Range: Range,
    WordDotOMathBreak_typekey: OMathBreak
  ): OMathBreak = {
    val __obj = js.Dynamic.literal(AlignAt = AlignAt.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreak_typekey")(WordDotOMathBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreak]
  }
  
  extension [Self <: OMathBreak](x: Self) {
    
    inline def setAlignAt(value: Double): Self = StObject.set(x, "AlignAt", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathBreak_typekey(value: OMathBreak): Self = StObject.set(x, "Word.OMathBreak_typekey", value.asInstanceOf[js.Any])
  }
}
