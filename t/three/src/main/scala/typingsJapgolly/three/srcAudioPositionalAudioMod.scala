package typingsJapgolly.three

import org.scalajs.dom.PannerNode
import typingsJapgolly.three.srcAudioAudioListenerMod.AudioListener
import typingsJapgolly.three.srcAudioAudioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAudioPositionalAudioMod {
  
  @JSImport("three/src/audio/PositionalAudio", "PositionalAudio")
  @js.native
  open class PositionalAudio protected () extends Audio[PannerNode] {
    def this(listener: AudioListener) = this()
    
    def getDistanceModel(): String = js.native
    
    def getMaxDistance(): Double = js.native
    
    def getRefDistance(): Double = js.native
    
    def getRolloffFactor(): Double = js.native
    
    var panner: PannerNode = js.native
    
    def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native
    
    def setDistanceModel(value: String): this.type = js.native
    
    def setMaxDistance(value: Double): this.type = js.native
    
    def setRefDistance(value: Double): this.type = js.native
    
    def setRolloffFactor(value: Double): this.type = js.native
  }
}
