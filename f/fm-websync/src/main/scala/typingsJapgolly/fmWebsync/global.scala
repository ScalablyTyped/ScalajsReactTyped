package typingsJapgolly.fmWebsync

import typingsJapgolly.fmWebsync.fm.websync.initializeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fm {
    
    object websync {
      
      @JSGlobal("fm.websync.client")
      @js.native
      open class client ()
        extends StObject
           with typingsJapgolly.fmWebsync.fm.websync.client
      object client {
        
        @JSGlobal("fm.websync.client")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Initializes the client according to the specified configuration.
          * This method must always be called first. While is always executes synchronously, callbacks are allowed for the purposes of method chaining.
          */
        /* static member */
        inline def initialize(config: initializeConfig): typingsJapgolly.fmWebsync.fm.websync.client = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fmWebsync.fm.websync.client]
      }
    }
  }
}
