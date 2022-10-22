package typingsJapgolly.animeQuotesApi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anime-quotes-api", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Quote {
    
    /* CompleteClass */
    override def quotes(): js.Promise[js.Array[js.Object]] = js.native
  }
  
  trait Quote extends StObject {
    
    def quotes(): js.Promise[js.Array[js.Object]]
  }
  object Quote {
    
    inline def apply(quotes: CallbackTo[js.Promise[js.Array[js.Object]]]): Quote = {
      val __obj = js.Dynamic.literal(quotes = quotes.toJsFn)
      __obj.asInstanceOf[Quote]
    }
    
    extension [Self <: Quote](x: Self) {
      
      inline def setQuotes(value: CallbackTo[js.Promise[js.Array[js.Object]]]): Self = StObject.set(x, "quotes", value.toJsFn)
    }
  }
}
