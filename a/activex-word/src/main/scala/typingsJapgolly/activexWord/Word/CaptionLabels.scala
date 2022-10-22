package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionLabels extends StObject {
  
  def Add(Name: String): CaptionLabel
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): CaptionLabel
  
  val Parent: Any
  
  /* private */ @JSName("Word.CaptionLabels_typekey")
  var WordDotCaptionLabels_typekey: CaptionLabels
}
object CaptionLabels {
  
  inline def apply(
    Add: String => CaptionLabel,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => CaptionLabel,
    Parent: Any,
    WordDotCaptionLabels_typekey: CaptionLabels
  ): CaptionLabels = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabels_typekey")(WordDotCaptionLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabels]
  }
  
  extension [Self <: CaptionLabels](x: Self) {
    
    inline def setAdd(value: String => CaptionLabel): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => CaptionLabel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotCaptionLabels_typekey(value: CaptionLabels): Self = StObject.set(x, "Word.CaptionLabels_typekey", value.asInstanceOf[js.Any])
  }
}
