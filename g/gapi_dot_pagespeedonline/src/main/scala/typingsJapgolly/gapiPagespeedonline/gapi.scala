package typingsJapgolly.gapiPagespeedonline

import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiPagespeedonline.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object pagespeedonline {
      
      trait pagespeedapi extends StObject {
        
        /**
          * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
          */
        def runpagespeed(`object`: Fields): HttpRequest[GoogleApiPageSpeedOnlineResource]
      }
      object pagespeedapi {
        
        inline def apply(runpagespeed: Fields => HttpRequest[GoogleApiPageSpeedOnlineResource]): pagespeedapi = {
          val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
          __obj.asInstanceOf[pagespeedapi]
        }
        
        extension [Self <: pagespeedapi](x: Self) {
          
          inline def setRunpagespeed(value: Fields => HttpRequest[GoogleApiPageSpeedOnlineResource]): Self = StObject.set(x, "runpagespeed", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
