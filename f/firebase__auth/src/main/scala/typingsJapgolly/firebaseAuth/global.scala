package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.gapiDotiframes
import typingsJapgolly.firebaseAuth.gapi.LoadCallback
import typingsJapgolly.firebaseAuth.gapi.LoadOptions
import typingsJapgolly.firebaseAuth.gapi.iframes.IframesFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    @JSGlobal("gapi")
    @js.native
    val ^ : js.Any = js.native
    
    object iframes {
      
      @JSGlobal("gapi.iframes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("gapi.iframes.CROSS_ORIGIN_IFRAMES_FILTER")
      @js.native
      val CROSS_ORIGIN_IFRAMES_FILTER: IframesFilter = js.native
      
      @JSGlobal("gapi.iframes.Context")
      @js.native
      open class Context ()
        extends StObject
           with typingsJapgolly.firebaseAuth.gapi.iframes.Context
      
      @JSGlobal("gapi.iframes.Iframe")
      @js.native
      open class Iframe ()
        extends StObject
           with typingsJapgolly.firebaseAuth.gapi.iframes.Iframe
      
      inline def getContext(): typingsJapgolly.firebaseAuth.gapi.iframes.Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[typingsJapgolly.firebaseAuth.gapi.iframes.Context]
    }
    
    inline def load_gapiiframes(features: gapiDotiframes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load_gapiiframes(features: gapiDotiframes, options: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load_gapiiframes(features: gapiDotiframes, options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
