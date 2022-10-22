package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Shared Sets
trait ExcludedPlacementList
  extends StObject
     with AdWordsEntity {
  
  def addExcludedPlacement(url: String): Unit
  
  def addExcludedPlacements(urls: js.Array[String]): Unit
  
  def campaigns(): AdWordsSelector[Campaign]
  
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  
  def getId(): Double
  
  def getName(): String
  
  def setName(name: String): Unit
}
object ExcludedPlacementList {
  
  inline def apply(
    addExcludedPlacement: String => Callback,
    addExcludedPlacements: js.Array[String] => Callback,
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    excludedPlacements: CallbackTo[AdWordsSelector[SharedExcludedPlacement]],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    setName: String => Callback
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1((t0: String) => addExcludedPlacement(t0).runNow()), addExcludedPlacements = js.Any.fromFunction1((t0: js.Array[String]) => addExcludedPlacements(t0).runNow()), campaigns = campaigns.toJsFn, excludedPlacements = excludedPlacements.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
  
  extension [Self <: ExcludedPlacementList](x: Self) {
    
    inline def setAddExcludedPlacement(value: String => Callback): Self = StObject.set(x, "addExcludedPlacement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddExcludedPlacements(value: js.Array[String] => Callback): Self = StObject.set(x, "addExcludedPlacements", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setCampaigns(value: CallbackTo[AdWordsSelector[Campaign]]): Self = StObject.set(x, "campaigns", value.toJsFn)
    
    inline def setExcludedPlacements(value: CallbackTo[AdWordsSelector[SharedExcludedPlacement]]): Self = StObject.set(x, "excludedPlacements", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
