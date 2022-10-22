package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectSearchResults extends StObject {
  
  def Clone(): IObjectSearchResults
  
  val Count: Double
  
  def GetAsObjectVersions(): IObjectVersions
  
  def GetScoreOfObject(ObjVer: IObjVer): Double
  
  def Item(Index: Double): IObjectVersion
  
  val MoreResults: Boolean
  
  def ScoreAt(Index: Double): Double
  
  def Sort(ObjectComparer: IObjectComparer): Unit
  
  def SortByScore(Ascending: Boolean): Unit
}
object IObjectSearchResults {
  
  inline def apply(
    Clone: CallbackTo[IObjectSearchResults],
    Count: Double,
    GetAsObjectVersions: CallbackTo[IObjectVersions],
    GetScoreOfObject: IObjVer => Double,
    Item: Double => IObjectVersion,
    MoreResults: Boolean,
    ScoreAt: Double => Double,
    Sort: IObjectComparer => Callback,
    SortByScore: Boolean => Callback
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], GetAsObjectVersions = GetAsObjectVersions.toJsFn, GetScoreOfObject = js.Any.fromFunction1(GetScoreOfObject), Item = js.Any.fromFunction1(Item), MoreResults = MoreResults.asInstanceOf[js.Any], ScoreAt = js.Any.fromFunction1(ScoreAt), Sort = js.Any.fromFunction1((t0: IObjectComparer) => Sort(t0).runNow()), SortByScore = js.Any.fromFunction1((t0: Boolean) => SortByScore(t0).runNow()))
    __obj.asInstanceOf[IObjectSearchResults]
  }
  
  extension [Self <: IObjectSearchResults](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjectSearchResults]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetAsObjectVersions(value: CallbackTo[IObjectVersions]): Self = StObject.set(x, "GetAsObjectVersions", value.toJsFn)
    
    inline def setGetScoreOfObject(value: IObjVer => Double): Self = StObject.set(x, "GetScoreOfObject", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IObjectVersion): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setScoreAt(value: Double => Double): Self = StObject.set(x, "ScoreAt", js.Any.fromFunction1(value))
    
    inline def setSort(value: IObjectComparer => Callback): Self = StObject.set(x, "Sort", js.Any.fromFunction1((t0: IObjectComparer) => value(t0).runNow()))
    
    inline def setSortByScore(value: Boolean => Callback): Self = StObject.set(x, "SortByScore", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
