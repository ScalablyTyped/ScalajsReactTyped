package typingsJapgolly.playerframework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft")
@js.native
object Microsoft extends js.Object {
  @js.native
  object PlayerFramework extends js.Object {
    @js.native
    object Js extends js.Object {
      @js.native
      object Advertising extends js.Object {
        /**
        	* Provides an ad source that requires a Url to be downloaded and turned into a stream before passing to the ad handler.
        	**/
        @js.native
        class RemoteAdSource () extends js.Object
        
      }
      
    }
    
  }
  
  @js.native
  object VideoAdvertising extends js.Object {
    @js.native
    class Extensions () extends js.Object
    
    @js.native
    class VastAdPayloadHandler () extends js.Object
    
    /* static members */
    @js.native
    object Extensions extends js.Object {
      var defaultUserAgent: String = js.native
    }
    
    /* static members */
    @js.native
    object VastAdPayloadHandler extends js.Object {
      var adType: String = js.native
    }
    
  }
  
}

