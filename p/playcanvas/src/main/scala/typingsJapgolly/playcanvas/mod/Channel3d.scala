package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.GainNode
import org.scalajs.dom.PannerNode
import typingsJapgolly.std.DistanceModelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 3D audio channel.
  *
  * @ignore
  */
trait Channel3d
  extends StObject
     with Channel {
  
  var distanceModel: String
  
  def getDistanceModel(): DistanceModelType
  
  def getMaxDistance(): Double
  
  def getMinDistance(): Double
  
  def getPosition(): Vec3
  
  def getRollOffFactor(): Double
  
  def getVelocity(): Vec3
  
  var maxDistance: Double
  
  var minDistance: Double
  
  var panner: PannerNode
  
  var position: Vec3
  
  var rollOffFactor: Double
  
  def setDistanceModel(distanceModel: Any): Unit
  
  def setMaxDistance(max: Any): Unit
  
  def setMinDistance(min: Any): Unit
  
  def setPosition(position: Any): Unit
  
  def setRollOffFactor(factor: Any): Unit
  
  def setVelocity(velocity: Any): Unit
  
  var velocity: Vec3
}
object Channel3d {
  
  inline def apply(
    _createSource: Callback,
    distanceModel: String,
    gain: GainNode,
    getDistanceModel: CallbackTo[DistanceModelType],
    getDuration: CallbackTo[Any],
    getLoop: CallbackTo[Boolean],
    getMaxDistance: CallbackTo[Double],
    getMinDistance: CallbackTo[Double],
    getPitch: CallbackTo[Double],
    getPosition: CallbackTo[Vec3],
    getRollOffFactor: CallbackTo[Double],
    getVelocity: CallbackTo[Vec3],
    getVolume: CallbackTo[Double],
    isPlaying: CallbackTo[Boolean],
    loop: Boolean,
    manager: SoundManager,
    maxDistance: Double,
    minDistance: Double,
    onManagerResume: Callback,
    onManagerSuspend: Callback,
    onManagerVolumeChange: Callback,
    panner: PannerNode,
    pause: Callback,
    paused: Boolean,
    pitch: Double,
    play: Callback,
    position: Vec3,
    rollOffFactor: Double,
    setDistanceModel: Any => Callback,
    setLoop: Boolean => Callback,
    setMaxDistance: Any => Callback,
    setMinDistance: Any => Callback,
    setPitch: Any => Callback,
    setPosition: Any => Callback,
    setRollOffFactor: Any => Callback,
    setVelocity: Any => Callback,
    setVolume: Double => Callback,
    sound: Sound,
    source: org.scalajs.dom.Node,
    startOffset: Double,
    startTime: Double,
    stop: Callback,
    suspended: Boolean,
    unpause: Callback,
    velocity: Vec3,
    volume: Double
  ): Channel3d = {
    val __obj = js.Dynamic.literal(_createSource = _createSource.toJsFn, distanceModel = distanceModel.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any], getDistanceModel = getDistanceModel.toJsFn, getDuration = getDuration.toJsFn, getLoop = getLoop.toJsFn, getMaxDistance = getMaxDistance.toJsFn, getMinDistance = getMinDistance.toJsFn, getPitch = getPitch.toJsFn, getPosition = getPosition.toJsFn, getRollOffFactor = getRollOffFactor.toJsFn, getVelocity = getVelocity.toJsFn, getVolume = getVolume.toJsFn, isPlaying = isPlaying.toJsFn, loop = loop.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], onManagerResume = onManagerResume.toJsFn, onManagerSuspend = onManagerSuspend.toJsFn, onManagerVolumeChange = onManagerVolumeChange.toJsFn, panner = panner.asInstanceOf[js.Any], pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], play = play.toJsFn, position = position.asInstanceOf[js.Any], rollOffFactor = rollOffFactor.asInstanceOf[js.Any], setDistanceModel = js.Any.fromFunction1((t0: Any) => setDistanceModel(t0).runNow()), setLoop = js.Any.fromFunction1((t0: Boolean) => setLoop(t0).runNow()), setMaxDistance = js.Any.fromFunction1((t0: Any) => setMaxDistance(t0).runNow()), setMinDistance = js.Any.fromFunction1((t0: Any) => setMinDistance(t0).runNow()), setPitch = js.Any.fromFunction1((t0: Any) => setPitch(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Any) => setPosition(t0).runNow()), setRollOffFactor = js.Any.fromFunction1((t0: Any) => setRollOffFactor(t0).runNow()), setVelocity = js.Any.fromFunction1((t0: Any) => setVelocity(t0).runNow()), setVolume = js.Any.fromFunction1((t0: Double) => setVolume(t0).runNow()), sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = stop.toJsFn, suspended = suspended.asInstanceOf[js.Any], unpause = unpause.toJsFn, velocity = velocity.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel3d]
  }
  
  extension [Self <: Channel3d](x: Self) {
    
    inline def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    inline def setGetDistanceModel(value: CallbackTo[DistanceModelType]): Self = StObject.set(x, "getDistanceModel", value.toJsFn)
    
    inline def setGetMaxDistance(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxDistance", value.toJsFn)
    
    inline def setGetMinDistance(value: CallbackTo[Double]): Self = StObject.set(x, "getMinDistance", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Vec3]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetRollOffFactor(value: CallbackTo[Double]): Self = StObject.set(x, "getRollOffFactor", value.toJsFn)
    
    inline def setGetVelocity(value: CallbackTo[Vec3]): Self = StObject.set(x, "getVelocity", value.toJsFn)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setPanner(value: PannerNode): Self = StObject.set(x, "panner", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRollOffFactor(value: Double): Self = StObject.set(x, "rollOffFactor", value.asInstanceOf[js.Any])
    
    inline def setSetDistanceModel(value: Any => Callback): Self = StObject.set(x, "setDistanceModel", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMaxDistance(value: Any => Callback): Self = StObject.set(x, "setMaxDistance", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMinDistance(value: Any => Callback): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetPosition(value: Any => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetRollOffFactor(value: Any => Callback): Self = StObject.set(x, "setRollOffFactor", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetVelocity(value: Any => Callback): Self = StObject.set(x, "setVelocity", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setVelocity(value: Vec3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
