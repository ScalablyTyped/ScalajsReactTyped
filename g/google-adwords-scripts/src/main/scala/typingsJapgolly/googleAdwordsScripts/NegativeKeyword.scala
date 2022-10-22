package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Negative Keywords
trait NegativeKeyword
  extends StObject
     with AdWordsEntity
     with isAdGroupChild {
  
  def getMatchType(): MatchType
  
  def getText(): String
  
  def remove(): Unit
}
object NegativeKeyword {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getMatchType: CallbackTo[MatchType],
    getText: CallbackTo[String],
    remove: Callback
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getCampaign = getCampaign.toJsFn, getMatchType = getMatchType.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  extension [Self <: NegativeKeyword](x: Self) {
    
    inline def setGetMatchType(value: CallbackTo[MatchType]): Self = StObject.set(x, "getMatchType", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
