package typingsJapgolly.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioContextMod {
  
  object AudioContext {
    
    @JSImport("three/src/audio/AudioContext", "AudioContext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getContext(): org.scalajs.dom.AudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[org.scalajs.dom.AudioContext]
    
    inline def setContext(context: org.scalajs.dom.AudioContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
