package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedNegativeKeyword
  extends StObject
     with AdWordsEntity {
  
  def getMatchType(): MatchType
  
  def getNegativeKeywordList(): NegativeKeywordList
  
  def getText(): String
  
  def remove(): Unit
}
object SharedNegativeKeyword {
  
  inline def apply(
    getMatchType: CallbackTo[MatchType],
    getNegativeKeywordList: CallbackTo[NegativeKeywordList],
    getText: CallbackTo[String],
    remove: Callback
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal(getMatchType = getMatchType.toJsFn, getNegativeKeywordList = getNegativeKeywordList.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
  
  extension [Self <: SharedNegativeKeyword](x: Self) {
    
    inline def setGetMatchType(value: CallbackTo[MatchType]): Self = StObject.set(x, "getMatchType", value.toJsFn)
    
    inline def setGetNegativeKeywordList(value: CallbackTo[NegativeKeywordList]): Self = StObject.set(x, "getNegativeKeywordList", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
