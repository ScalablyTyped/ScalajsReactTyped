package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicts extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def GetFirst(): Conflict
  
  def GetLast(): Conflict
  
  def GetNext(): Conflict
  
  def GetPrevious(): Conflict
  
  def Item(Index: Any): Conflict
  
  /* private */ @JSName("Outlook.Conflicts_typekey")
  var OutlookDotConflicts_typekey: Conflicts
  
  val Parent: Any
  
  val Session: NameSpace
}
object Conflicts {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetFirst: CallbackTo[Conflict],
    GetLast: CallbackTo[Conflict],
    GetNext: CallbackTo[Conflict],
    GetPrevious: CallbackTo[Conflict],
    Item: Any => Conflict,
    OutlookDotConflicts_typekey: Conflicts,
    Parent: Any,
    Session: NameSpace
  ): Conflicts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetFirst = GetFirst.toJsFn, GetLast = GetLast.toJsFn, GetNext = GetNext.toJsFn, GetPrevious = GetPrevious.toJsFn, Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflicts_typekey")(OutlookDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  extension [Self <: Conflicts](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetFirst(value: CallbackTo[Conflict]): Self = StObject.set(x, "GetFirst", value.toJsFn)
    
    inline def setGetLast(value: CallbackTo[Conflict]): Self = StObject.set(x, "GetLast", value.toJsFn)
    
    inline def setGetNext(value: CallbackTo[Conflict]): Self = StObject.set(x, "GetNext", value.toJsFn)
    
    inline def setGetPrevious(value: CallbackTo[Conflict]): Self = StObject.set(x, "GetPrevious", value.toJsFn)
    
    inline def setItem(value: Any => Conflict): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotConflicts_typekey(value: Conflicts): Self = StObject.set(x, "Outlook.Conflicts_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
