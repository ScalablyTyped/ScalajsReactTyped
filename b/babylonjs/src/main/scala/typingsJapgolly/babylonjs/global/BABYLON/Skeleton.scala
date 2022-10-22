package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Skeleton")
@js.native
open class Skeleton protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Skeleton {
  /**
    * Creates a new skeleton
    * @param name defines the skeleton name
    * @param id defines the skeleton Id
    * @param scene defines the hosting scene
    */
  def this(
    /** defines the skeleton name */
  name: String,
    /** defines the skeleton Id */
  id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object Skeleton {
  
  @JSGlobal("BABYLON.Skeleton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
    * @param skeleton defines the Skeleton containing the animation range to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
    * @returns the original skeleton
    */
  inline def MakeAnimationAdditive(skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton, referenceFrame: Double, range: String): Nullable[typingsJapgolly.babylonjs.BABYLON.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Skeleton]]
  inline def MakeAnimationAdditive(skeleton: typingsJapgolly.babylonjs.BABYLON.Skeleton, referenceFrame: Unit, range: String): Nullable[typingsJapgolly.babylonjs.BABYLON.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Skeleton]]
  
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  inline def Parse(parsedSkeleton: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.Skeleton = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSkeleton.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Skeleton]
}
