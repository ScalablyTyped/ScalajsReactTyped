package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a shared negative keyword. */
trait SharedNegativeKeyword extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "SharedNegativeKeyword". */
  def getEntityType(): String
  
  /** Returns the match type of the negative keyword. */
  def getMatchType(): String
  
  /** Returns the NegativeKeywordList this keyword is in. */
  def getNegativeKeywordList(): NegativeKeywordList
  
  /** Returns the text of the negative keyword. */
  def getText(): String
  
  /** Removes the shared negative keyword. */
  def remove(): Unit
}
object SharedNegativeKeyword {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getMatchType: CallbackTo[String],
    getNegativeKeywordList: CallbackTo[NegativeKeywordList],
    getText: CallbackTo[String],
    remove: Callback
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getMatchType = getMatchType.toJsFn, getNegativeKeywordList = getNegativeKeywordList.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  
  extension [Self <: SharedNegativeKeyword](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetMatchType(value: CallbackTo[String]): Self = StObject.set(x, "getMatchType", value.toJsFn)
    
    inline def setGetNegativeKeywordList(value: CallbackTo[NegativeKeywordList]): Self = StObject.set(x, "getNegativeKeywordList", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
