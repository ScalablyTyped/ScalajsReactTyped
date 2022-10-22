package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads draft.
  * Drafts can be used to prepare changes to campaigns, either by applying them directly or running an experiment.
  * For more information, refer to our guide to Drafts and Experiments.
  */
trait Draft extends StObject {
  
  /** Returns the base campaign to which this draft belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the draft campaign associated with this draft. */
  def getDraftCampaign(): Campaign
  
  /** Returns the type of this entity as a String, in this case, "Draft". */
  def getEntityType(): String
  
  /** Returns the ID of the draft. */
  def getId(): Double
  
  /** Returns the name of the draft. */
  def getName(): String
  
  /** Returns the status of the draft. */
  def getStatus(): String
  
  /** Returns true if the draft has a currently-running experiment. */
  def hasRunningExperiment(): Boolean
  
  /** Returns a new experiment builder for this draft. */
  def newExperimentBuilder(): ExperimentBuilder
  
  /** Removes the draft, thereby removing its associated draft campaign, but not removing the associated base campaign. */
  def remove(): Unit
  
  /** Sets the name of the draft. */
  def setName(name: String): Unit
  
  /** Starts applying the draft's changes back to the base campaign. */
  def startApplying(): Unit
}
object Draft {
  
  inline def apply(
    getBaseCampaign: CallbackTo[Campaign],
    getDraftCampaign: CallbackTo[Campaign],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getStatus: CallbackTo[String],
    hasRunningExperiment: CallbackTo[Boolean],
    newExperimentBuilder: CallbackTo[ExperimentBuilder],
    remove: Callback,
    setName: String => Callback,
    startApplying: Callback
  ): Draft = {
    val __obj = js.Dynamic.literal(getBaseCampaign = getBaseCampaign.toJsFn, getDraftCampaign = getDraftCampaign.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getStatus = getStatus.toJsFn, hasRunningExperiment = hasRunningExperiment.toJsFn, newExperimentBuilder = newExperimentBuilder.toJsFn, remove = remove.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), startApplying = startApplying.toJsFn)
    __obj.asInstanceOf[Draft]
  }
  
  extension [Self <: Draft](x: Self) {
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetDraftCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getDraftCampaign", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetStatus(value: CallbackTo[String]): Self = StObject.set(x, "getStatus", value.toJsFn)
    
    inline def setHasRunningExperiment(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasRunningExperiment", value.toJsFn)
    
    inline def setNewExperimentBuilder(value: CallbackTo[ExperimentBuilder]): Self = StObject.set(x, "newExperimentBuilder", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartApplying(value: Callback): Self = StObject.set(x, "startApplying", value.toJsFn)
  }
}
