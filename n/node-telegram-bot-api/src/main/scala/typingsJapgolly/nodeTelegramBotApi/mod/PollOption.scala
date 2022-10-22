package typingsJapgolly.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollOption extends StObject {
  
  var text: String
  
  var voter_count: Double
}
object PollOption {
  
  inline def apply(text: String, voter_count: Double): PollOption = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], voter_count = voter_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOption]
  }
  
  extension [Self <: PollOption](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setVoter_count(value: Double): Self = StObject.set(x, "voter_count", value.asInstanceOf[js.Any])
  }
}
