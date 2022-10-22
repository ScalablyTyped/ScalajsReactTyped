package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  def audiences(): AdWordsSelector[Audience]
  
  def keywords(): AdWordsSelector[DisplayKeyword]
  
  def placements(): AdWordsSelector[Placement]
  
  def topics(): AdWordsSelector[Topic]
}
object Display {
  
  inline def apply(
    audiences: CallbackTo[AdWordsSelector[Audience]],
    keywords: CallbackTo[AdWordsSelector[DisplayKeyword]],
    placements: CallbackTo[AdWordsSelector[Placement]],
    topics: CallbackTo[AdWordsSelector[Topic]]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, keywords = keywords.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn)
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setAudiences(value: CallbackTo[AdWordsSelector[Audience]]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[AdWordsSelector[DisplayKeyword]]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setPlacements(value: CallbackTo[AdWordsSelector[Placement]]): Self = StObject.set(x, "placements", value.toJsFn)
    
    inline def setTopics(value: CallbackTo[AdWordsSelector[Topic]]): Self = StObject.set(x, "topics", value.toJsFn)
  }
}
