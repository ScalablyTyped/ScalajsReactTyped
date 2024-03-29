package typingsJapgolly.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveContextTimeToLive extends StObject {
  
  /**
    * The number of seconds that the context should be active after it is first sent in a PostContent or PostText response. You can set the value between 5 and 86,400 seconds (24 hours).
    */
  var timeToLiveInSeconds: js.UndefOr[ActiveContextTimeToLiveInSeconds] = js.undefined
  
  /**
    * The number of conversation turns that the context should be active. A conversation turn is one PostContent or PostText request and the corresponding response from Amazon Lex.
    */
  var turnsToLive: js.UndefOr[ActiveContextTurnsToLive] = js.undefined
}
object ActiveContextTimeToLive {
  
  inline def apply(): ActiveContextTimeToLive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveContextTimeToLive]
  }
  
  extension [Self <: ActiveContextTimeToLive](x: Self) {
    
    inline def setTimeToLiveInSeconds(value: ActiveContextTimeToLiveInSeconds): Self = StObject.set(x, "timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveInSecondsUndefined: Self = StObject.set(x, "timeToLiveInSeconds", js.undefined)
    
    inline def setTurnsToLive(value: ActiveContextTurnsToLive): Self = StObject.set(x, "turnsToLive", value.asInstanceOf[js.Any])
    
    inline def setTurnsToLiveUndefined: Self = StObject.set(x, "turnsToLive", js.undefined)
  }
}
