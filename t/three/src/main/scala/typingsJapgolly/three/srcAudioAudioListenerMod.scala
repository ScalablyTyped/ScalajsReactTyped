package typingsJapgolly.three

import org.scalajs.dom.AudioContext
import org.scalajs.dom.GainNode
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioAudioListenerMod {
  
  @JSImport("three/src/audio/AudioListener", "AudioListener")
  @js.native
  open class AudioListener () extends Object3D[Event] {
    
    var context: AudioContext = js.native
    
    /**
      * @default null
      */
    var filter: Any = js.native
    
    var gain: GainNode = js.native
    
    def getFilter(): Any = js.native
    
    def getInput(): GainNode = js.native
    
    def getMasterVolume(): Double = js.native
    
    def removeFilter(): this.type = js.native
    
    def setFilter(value: Any): this.type = js.native
    
    def setMasterVolume(value: Double): this.type = js.native
    
    /**
      * @default 0
      */
    var timeDelta: Double = js.native
    
    @JSName("type")
    var type_AudioListener: typingsJapgolly.three.threeStrings.AudioListener = js.native
  }
}
