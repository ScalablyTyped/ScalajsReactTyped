package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RayHelper")
@js.native
open class RayHelper protected ()
  extends typingsJapgolly.babylonjs.indexMod.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see https://doc.babylonjs.com/babylon101/raycasts#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typingsJapgolly.babylonjs.cullingRayMod.Ray) = this()
}
/* static members */
object RayHelper {
  
  @JSImport("babylonjs/Legacy/legacy", "RayHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  inline def CreateAndShow(
    ray: typingsJapgolly.babylonjs.cullingRayMod.Ray,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
  ): typingsJapgolly.babylonjs.debugRayHelperMod.RayHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndShow")(ray.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.debugRayHelperMod.RayHelper]
}
