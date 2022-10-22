package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
trait AudioListener extends StObject {
  
  /* standard dom */
  val forwardX: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val forwardY: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val forwardZ: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val positionX: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val positionY: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val positionZ: org.scalajs.dom.AudioParam
  
  /** @deprecated */
  /* standard dom */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  
  /** @deprecated */
  /* standard dom */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  /* standard dom */
  val upX: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val upY: org.scalajs.dom.AudioParam
  
  /* standard dom */
  val upZ: org.scalajs.dom.AudioParam
}
object AudioListener {
  
  inline def apply(
    forwardX: org.scalajs.dom.AudioParam,
    forwardY: org.scalajs.dom.AudioParam,
    forwardZ: org.scalajs.dom.AudioParam,
    positionX: org.scalajs.dom.AudioParam,
    positionY: org.scalajs.dom.AudioParam,
    positionZ: org.scalajs.dom.AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Callback,
    setPosition: (Double, Double, Double) => Callback,
    upX: org.scalajs.dom.AudioParam,
    upY: org.scalajs.dom.AudioParam,
    upZ: org.scalajs.dom.AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (setOrientation(t0, t1, t2, t3, t4, t5)).runNow()), setPosition = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setPosition(t0, t1, t2)).runNow()), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
  
  extension [Self <: AudioListener](x: Self) {
    
    inline def setForwardX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardX", value.asInstanceOf[js.Any])
    
    inline def setForwardY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardY", value.asInstanceOf[js.Any])
    
    inline def setForwardZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "forwardZ", value.asInstanceOf[js.Any])
    
    inline def setPositionX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setPositionZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    inline def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setOrientation", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSetPosition(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpX(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    inline def setUpY(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    inline def setUpZ(value: org.scalajs.dom.AudioParam): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
