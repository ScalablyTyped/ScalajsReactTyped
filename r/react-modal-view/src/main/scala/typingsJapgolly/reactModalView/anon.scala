package typingsJapgolly.reactModalView

import typingsJapgolly.reactModalView.reactModalViewStrings.notice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: Null
    
    var `type`: notice
  }
  object Message {
    
    inline def apply(message: Null): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("notice")
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: Null): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: notice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Visible extends StObject {
    
    var visible: Boolean
  }
  object Visible {
    
    inline def apply(visible: Boolean): Visible = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visible]
    }
    
    extension [Self <: Visible](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
