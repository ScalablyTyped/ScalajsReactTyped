package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeywordList
  extends StObject
     with AdWordsEntity {
  
  def addNegativeKeyword(keywordText: String): Unit
  
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  
  def campaigns(): AdWordsSelector[Campaign]
  
  def getId(): Double
  
  def getName(): String
  
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  
  def setName(): String
}
object NegativeKeywordList {
  
  inline def apply(
    addNegativeKeyword: String => Callback,
    addNegativeKeywords: js.Array[String] => Callback,
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    negativeKeywords: CallbackTo[AdWordsSelector[SharedNegativeKeyword]],
    setName: CallbackTo[String]
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal(addNegativeKeyword = js.Any.fromFunction1((t0: String) => addNegativeKeyword(t0).runNow()), addNegativeKeywords = js.Any.fromFunction1((t0: js.Array[String]) => addNegativeKeywords(t0).runNow()), campaigns = campaigns.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, negativeKeywords = negativeKeywords.toJsFn, setName = setName.toJsFn)
    __obj.asInstanceOf[NegativeKeywordList]
  }
  
  extension [Self <: NegativeKeywordList](x: Self) {
    
    inline def setAddNegativeKeyword(value: String => Callback): Self = StObject.set(x, "addNegativeKeyword", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddNegativeKeywords(value: js.Array[String] => Callback): Self = StObject.set(x, "addNegativeKeywords", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setCampaigns(value: CallbackTo[AdWordsSelector[Campaign]]): Self = StObject.set(x, "campaigns", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setNegativeKeywords(value: CallbackTo[AdWordsSelector[SharedNegativeKeyword]]): Self = StObject.set(x, "negativeKeywords", value.toJsFn)
    
    inline def setSetName(value: CallbackTo[String]): Self = StObject.set(x, "setName", value.toJsFn)
  }
}
