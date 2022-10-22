package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPlacementList extends StObject {
  
  /** Adds a SharedExcludedPlacement to an excluded placement list. */
  def addExcludedPlacement(url: String): Unit
  
  /** Adds a list of SharedExcludedPlacement objects to an excluded placement list. */
  def addExcludedPlacements(urls: js.Array[String]): Unit
  
  /** Returns a selector of all campaigns this excluded placement list has been applied to. */
  def campaigns(): CampaignSelector
  
  /** Returns a selector of the shared excluded placements in an excluded placement list. */
  def excludedPlacements(): SharedExcludedPlacementSelector
  
  /** Returns the type of this entity as a String, in this case, "ExcludedPlacementList". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded placement list. */
  def getId(): Double
  
  /** Returns the name of an excluded placement list. */
  def getName(): String
  
  /** Sets the name of an excluded placement list. */
  def setName(name: String): Unit
}
object ExcludedPlacementList {
  
  inline def apply(
    addExcludedPlacement: String => Callback,
    addExcludedPlacements: js.Array[String] => Callback,
    campaigns: CallbackTo[CampaignSelector],
    excludedPlacements: CallbackTo[SharedExcludedPlacementSelector],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    setName: String => Callback
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1((t0: String) => addExcludedPlacement(t0).runNow()), addExcludedPlacements = js.Any.fromFunction1((t0: js.Array[String]) => addExcludedPlacements(t0).runNow()), campaigns = campaigns.toJsFn, excludedPlacements = excludedPlacements.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
  
  extension [Self <: ExcludedPlacementList](x: Self) {
    
    inline def setAddExcludedPlacement(value: String => Callback): Self = StObject.set(x, "addExcludedPlacement", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddExcludedPlacements(value: js.Array[String] => Callback): Self = StObject.set(x, "addExcludedPlacements", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setCampaigns(value: CallbackTo[CampaignSelector]): Self = StObject.set(x, "campaigns", value.toJsFn)
    
    inline def setExcludedPlacements(value: CallbackTo[SharedExcludedPlacementSelector]): Self = StObject.set(x, "excludedPlacements", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
