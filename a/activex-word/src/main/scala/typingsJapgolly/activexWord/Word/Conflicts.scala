package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicts extends StObject {
  
  def AcceptAll(): Unit
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): Conflict
  
  val Parent: Any
  
  def RejectAll(): Unit
  
  /* private */ @JSName("Word.Conflicts_typekey")
  var WordDotConflicts_typekey: Conflicts
}
object Conflicts {
  
  inline def apply(
    AcceptAll: Callback,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Conflict,
    Parent: Any,
    RejectAll: Callback,
    WordDotConflicts_typekey: Conflicts
  ): Conflicts = {
    val __obj = js.Dynamic.literal(AcceptAll = AcceptAll.toJsFn, Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], RejectAll = RejectAll.toJsFn)
    __obj.updateDynamic("Word.Conflicts_typekey")(WordDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  extension [Self <: Conflicts](x: Self) {
    
    inline def setAcceptAll(value: Callback): Self = StObject.set(x, "AcceptAll", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => Conflict): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRejectAll(value: Callback): Self = StObject.set(x, "RejectAll", value.toJsFn)
    
    inline def setWordDotConflicts_typekey(value: Conflicts): Self = StObject.set(x, "Word.Conflicts_typekey", value.asInstanceOf[js.Any])
  }
}
