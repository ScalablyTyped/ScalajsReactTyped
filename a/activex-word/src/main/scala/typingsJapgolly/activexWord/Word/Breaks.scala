package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breaks extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Break
  
  val Parent: Any
  
  /* private */ @JSName("Word.Breaks_typekey")
  var WordDotBreaks_typekey: Breaks
}
object Breaks {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Break,
    Parent: Any,
    WordDotBreaks_typekey: Breaks
  ): Breaks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Breaks_typekey")(WordDotBreaks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breaks]
  }
  
  extension [Self <: Breaks](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Break): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotBreaks_typekey(value: Breaks): Self = StObject.set(x, "Word.Breaks_typekey", value.asInstanceOf[js.Any])
  }
}
