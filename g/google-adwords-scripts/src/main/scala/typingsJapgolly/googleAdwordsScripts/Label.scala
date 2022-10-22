package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Labels
trait Label
  extends StObject
     with AdWordsEntity {
  
  def adGroups(): AdWordsSelector[AdGroup]
  
  def ads(): AdWordsSelector[Ad]
  
  def campaigns(): AdWordsSelector[Campaign]
  
  def getColor(): String
  
  def getDescription(): String
  
  def getId(): String
  
  def getName(): String
  
  def keywords(): AdWordsSelector[Keyword]
  
  def remove(): Unit
  
  def setColor(color: String): Unit
  
  def setDescription(description: String): Unit
  
  def setName(name: String): Unit
}
object Label {
  
  inline def apply(
    adGroups: CallbackTo[AdWordsSelector[AdGroup]],
    ads: CallbackTo[AdWordsSelector[Ad]],
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    getColor: CallbackTo[String],
    getDescription: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    keywords: CallbackTo[AdWordsSelector[Keyword]],
    remove: Callback,
    setColor: String => Callback,
    setDescription: String => Callback,
    setName: String => Callback
  ): Label = {
    val __obj = js.Dynamic.literal(adGroups = adGroups.toJsFn, ads = ads.toJsFn, campaigns = campaigns.toJsFn, getColor = getColor.toJsFn, getDescription = getDescription.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, keywords = keywords.toJsFn, remove = remove.toJsFn, setColor = js.Any.fromFunction1((t0: String) => setColor(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setAdGroups(value: CallbackTo[AdWordsSelector[AdGroup]]): Self = StObject.set(x, "adGroups", value.toJsFn)
    
    inline def setAds(value: CallbackTo[AdWordsSelector[Ad]]): Self = StObject.set(x, "ads", value.toJsFn)
    
    inline def setCampaigns(value: CallbackTo[AdWordsSelector[Campaign]]): Self = StObject.set(x, "campaigns", value.toJsFn)
    
    inline def setGetColor(value: CallbackTo[String]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[AdWordsSelector[Keyword]]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetColor(value: String => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
