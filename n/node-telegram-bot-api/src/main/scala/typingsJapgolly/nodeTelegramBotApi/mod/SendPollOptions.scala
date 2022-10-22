package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendPollOptions
  extends StObject
     with SendBasicOptions {
  
  var allows_multiple_answers: js.UndefOr[Boolean] = js.undefined
  
  var close_date: js.UndefOr[Double] = js.undefined
  
  var correct_option_id: js.UndefOr[Double] = js.undefined
  
  var explanation: js.UndefOr[String] = js.undefined
  
  var explanation_parse_mode: js.UndefOr[ParseMode] = js.undefined
  
  var is_anonymous: js.UndefOr[Boolean] = js.undefined
  
  var is_closed: js.UndefOr[Boolean] = js.undefined
  
  var open_period: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[PollType] = js.undefined
}
object SendPollOptions {
  
  inline def apply(): SendPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPollOptions]
  }
  
  extension [Self <: SendPollOptions](x: Self) {
    
    inline def setAllows_multiple_answers(value: Boolean): Self = StObject.set(x, "allows_multiple_answers", value.asInstanceOf[js.Any])
    
    inline def setAllows_multiple_answersUndefined: Self = StObject.set(x, "allows_multiple_answers", js.undefined)
    
    inline def setClose_date(value: Double): Self = StObject.set(x, "close_date", value.asInstanceOf[js.Any])
    
    inline def setClose_dateUndefined: Self = StObject.set(x, "close_date", js.undefined)
    
    inline def setCorrect_option_id(value: Double): Self = StObject.set(x, "correct_option_id", value.asInstanceOf[js.Any])
    
    inline def setCorrect_option_idUndefined: Self = StObject.set(x, "correct_option_id", js.undefined)
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setExplanation_parse_mode(value: ParseMode): Self = StObject.set(x, "explanation_parse_mode", value.asInstanceOf[js.Any])
    
    inline def setExplanation_parse_modeUndefined: Self = StObject.set(x, "explanation_parse_mode", js.undefined)
    
    inline def setIs_anonymous(value: Boolean): Self = StObject.set(x, "is_anonymous", value.asInstanceOf[js.Any])
    
    inline def setIs_anonymousUndefined: Self = StObject.set(x, "is_anonymous", js.undefined)
    
    inline def setIs_closed(value: Boolean): Self = StObject.set(x, "is_closed", value.asInstanceOf[js.Any])
    
    inline def setIs_closedUndefined: Self = StObject.set(x, "is_closed", js.undefined)
    
    inline def setOpen_period(value: Double): Self = StObject.set(x, "open_period", value.asInstanceOf[js.Any])
    
    inline def setOpen_periodUndefined: Self = StObject.set(x, "open_period", js.undefined)
    
    inline def setType(value: PollType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
