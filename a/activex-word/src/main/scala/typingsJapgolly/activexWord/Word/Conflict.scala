package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  def Accept(): Unit
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val Index: Double
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  def Reject(): Unit
  
  val Type: WdRevisionType
  
  /* private */ @JSName("Word.Conflict_typekey")
  var WordDotConflict_typekey: Conflict
}
object Conflict {
  
  inline def apply(
    Accept: Callback,
    Application: Application,
    Creator: Double,
    Index: Double,
    Parent: Any,
    Range: Range,
    Reject: Callback,
    Type: WdRevisionType,
    WordDotConflict_typekey: Conflict
  ): Conflict = {
    val __obj = js.Dynamic.literal(Accept = Accept.toJsFn, Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = Reject.toJsFn, Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Conflict_typekey")(WordDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  
  extension [Self <: Conflict](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "Accept", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setReject(value: Callback): Self = StObject.set(x, "Reject", value.toJsFn)
    
    inline def setType(value: WdRevisionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotConflict_typekey(value: Conflict): Self = StObject.set(x, "Word.Conflict_typekey", value.asInstanceOf[js.Any])
  }
}
