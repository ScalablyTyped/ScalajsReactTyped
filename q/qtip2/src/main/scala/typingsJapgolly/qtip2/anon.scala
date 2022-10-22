package typingsJapgolly.qtip2

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.qtip2.QTip2.Api
import typingsJapgolly.qtip2.QTip2.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Text extends StObject {
    
    var text: Title
  }
  object Text {
    
    inline def apply(text: Title): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: Title): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFunction2(value: (/* event */ Event, /* api */ Api) => Callback): Self = StObject.set(x, "text", js.Any.fromFunction2((t0: /* event */ Event, t1: /* api */ Api) => (value(t0, t1)).runNow()))
    }
  }
}
