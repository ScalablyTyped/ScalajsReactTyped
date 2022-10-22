package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialogs extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: WdWordDialog): Dialog
  
  val Parent: Any
  
  /* private */ @JSName("Word.Dialogs_typekey")
  var WordDotDialogs_typekey: Dialogs
}
object Dialogs {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdWordDialog => Dialog,
    Parent: Any,
    WordDotDialogs_typekey: Dialogs
  ): Dialogs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dialogs_typekey")(WordDotDialogs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialogs]
  }
  
  extension [Self <: Dialogs](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdWordDialog => Dialog): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotDialogs_typekey(value: Dialogs): Self = StObject.set(x, "Word.Dialogs_typekey", value.asInstanceOf[js.Any])
  }
}
