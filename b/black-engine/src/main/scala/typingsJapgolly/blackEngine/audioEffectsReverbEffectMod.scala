package typingsJapgolly.blackEngine

import org.scalajs.dom.AudioBuffer
import typingsJapgolly.blackEngine.audioSoundEffectMod.SoundEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioEffectsReverbEffectMod {
  
  @JSImport("black-engine/audio/effects/ReverbEffect", "ReverbEffect")
  @js.native
  open class ReverbEffect protected () extends SoundEffect {
    def this(IRBuffer: AudioBuffer) = this()
    
    def dry: Double = js.native
    def dry_=(arg: Double): Unit = js.native
    
    /* private */ var mConvolver: Any = js.native
    
    /* private */ var mDry: Any = js.native
    
    /* private */ var mTone: Any = js.native
    
    /* private */ var mWet: Any = js.native
    
    def tone: Double = js.native
    def tone_=(arg: Double): Unit = js.native
    
    def wet: Double = js.native
    def wet_=(arg: Double): Unit = js.native
  }
}
