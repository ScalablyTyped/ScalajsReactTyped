package typingsJapgolly.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.KeyframeTrack")
@js.native
open class KeyframeTrack protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.KeyframeTrack {
  def this(
    name: String,
    times: js.Array[Any],
    values: js.Array[Any],
    interpolation: typingsJapgolly.forgeViewer.THREE.InterpolationModes
  ) = this()
  
  /* CompleteClass */
  var DefaultInterpolation: typingsJapgolly.forgeViewer.THREE.InterpolationModes = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodDiscrete(result: Any): typingsJapgolly.forgeViewer.THREE.DiscreteInterpolant = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodLinear(result: Any): typingsJapgolly.forgeViewer.THREE.LinearInterpolant = js.native
  
  /* CompleteClass */
  override def InterpolantFactoryMethodSmooth(result: Any): typingsJapgolly.forgeViewer.THREE.CubicInterpolant = js.native
  
  /* CompleteClass */
  var TimeBufferType: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var ValueBufferType: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var ValueTypeName: String = js.native
  
  /* CompleteClass */
  override def getInterpolation(): typingsJapgolly.forgeViewer.THREE.InterpolationModes = js.native
  
  /* CompleteClass */
  override def getValuesize(): Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def optimize(): typingsJapgolly.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def scale(timeScale: Double): typingsJapgolly.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def setInterpolation(interpolation: typingsJapgolly.forgeViewer.THREE.InterpolationModes): Unit = js.native
  
  /* CompleteClass */
  override def shift(timeOffset: Double): typingsJapgolly.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  var times: js.Array[Any] = js.native
  
  /* CompleteClass */
  override def trim(startTime: Double, endTime: Double): typingsJapgolly.forgeViewer.THREE.KeyframeTrack = js.native
  
  /* CompleteClass */
  override def validate(): Boolean = js.native
  
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
object KeyframeTrack {
  
  @JSGlobal("THREE.KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(json: Any): typingsJapgolly.forgeViewer.THREE.KeyframeTrack = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.forgeViewer.THREE.KeyframeTrack]
  
  /* static member */
  inline def toJSON(track: typingsJapgolly.forgeViewer.THREE.KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
}
