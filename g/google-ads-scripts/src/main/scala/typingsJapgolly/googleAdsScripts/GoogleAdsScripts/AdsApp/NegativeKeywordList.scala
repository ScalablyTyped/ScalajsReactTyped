package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a negative keyword list. */
trait NegativeKeywordList extends StObject {
  
  /** Adds a SharedNegativeKeyword to a negative keyword list. */
  def addNegativeKeyword(keywordText: String): Unit
  
  /** Adds a list of SharedNegativeKeyword objects to a negative keyword list. */
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  
  /** Returns a selector of all campaigns this negative keyword list has been applied to. */
  def campaigns(): CampaignSelector
  
  /** Returns the type of this entity as a String, in this case, "NegativeKeywordList". */
  def getEntityType(): String
  
  /** Returns the ID of the negative keyword list. */
  def getId(): Double
  
  /** Returns the name of a negative keyword list. */
  def getName(): String
  
  /** Returns a selector of the shared negative keywords in a negative keyword list. */
  def negativeKeywords(): SharedNegativeKeywordSelector
  
  /** Sets the name of a negative keyword list. */
  def setName(name: String): Unit
}
object NegativeKeywordList {
  
  inline def apply(
    addNegativeKeyword: String => Callback,
    addNegativeKeywords: js.Array[String] => Callback,
    campaigns: CallbackTo[CampaignSelector],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    negativeKeywords: CallbackTo[SharedNegativeKeywordSelector],
    setName: String => Callback
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1((t0: String) => addNegativeKeyword(t0).runNow()), addNegativeKeywords = js.Any.fromFunction1((t0: js.Array[String]) => addNegativeKeywords(t0).runNow()), campaigns = campaigns.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, negativeKeywords = negativeKeywords.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  extension [Self <: NegativeKeywordList](x: Self) {
    
    inline def setAddNegativeKeyword(value: String => Callback): Self = StObject.set(x, "addNegativeKeyword", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddNegativeKeywords(value: js.Array[String] => Callback): Self = StObject.set(x, "addNegativeKeywords", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setCampaigns(value: CallbackTo[CampaignSelector]): Self = StObject.set(x, "campaigns", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setNegativeKeywords(value: CallbackTo[SharedNegativeKeywordSelector]): Self = StObject.set(x, "negativeKeywords", value.toJsFn)
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
