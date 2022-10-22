package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCaptions extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def CancelAutoInsert(): Unit
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): AutoCaption
  
  val Parent: Any
  
  /* private */ @JSName("Word.AutoCaptions_typekey")
  var WordDotAutoCaptions_typekey: AutoCaptions
}
object AutoCaptions {
  
  inline def apply(
    Application: Application,
    CancelAutoInsert: Callback,
    Count: Double,
    Creator: Double,
    Item: Any => AutoCaption,
    Parent: Any,
    WordDotAutoCaptions_typekey: AutoCaptions
  ): AutoCaptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CancelAutoInsert = CancelAutoInsert.toJsFn, Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaptions_typekey")(WordDotAutoCaptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaptions]
  }
  
  extension [Self <: AutoCaptions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCancelAutoInsert(value: Callback): Self = StObject.set(x, "CancelAutoInsert", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => AutoCaption): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoCaptions_typekey(value: AutoCaptions): Self = StObject.set(x, "Word.AutoCaptions_typekey", value.asInstanceOf[js.Any])
  }
}
