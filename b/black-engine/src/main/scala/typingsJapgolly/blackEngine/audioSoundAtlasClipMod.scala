package typingsJapgolly.blackEngine

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AudioBuffer
import typingsJapgolly.blackEngine.audioSoundClipMod.SoundClip
import typingsJapgolly.blackEngine.audioSoundInstanceMod.SoundInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioSoundAtlasClipMod {
  
  @JSImport("black-engine/audio/SoundAtlasClip", "SoundAtlasClip")
  @js.native
  open class SoundAtlasClip protected () extends SoundClip {
    def this(nativeBuffer: AudioBuffer, jsonObject: Any) = this()
    
    def addSubSound(name: String): SoundClip = js.native
    def addSubSound(name: String, offset: Double): SoundClip = js.native
    def addSubSound(name: String, offset: Double, duration: Double): SoundClip = js.native
    def addSubSound(name: String, offset: Unit, duration: Double): SoundClip = js.native
    
    /* private */ var mClips: Any = js.native
    
    def playSubSound(name: String): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Double, loop: Boolean): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Double, loop: Boolean, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Double, loop: Unit, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Unit, loop: Boolean): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Unit, loop: Boolean, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: String, volume: Unit, loop: Unit, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Double, loop: Boolean): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Double, loop: Boolean, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Double, loop: Unit, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Unit, loop: Boolean): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Unit, loop: Boolean, pan: Double): SoundInstance | Null = js.native
    def playSubSound(name: String, channel: Unit, volume: Unit, loop: Unit, pan: Double): SoundInstance | Null = js.native
    
    def removeSubSound(name: String): Unit = js.native
    
    def subSounds: StringDictionary[SoundClip] = js.native
  }
}
