package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.anon.Updatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PointsCloudSystem")
@js.native
open class PointsCloudSystem protected ()
  extends typingsJapgolly.babylonjs.particlesIndexMod.PointsCloudSystem {
  /**
    * Creates a PCS (Points Cloud System) object
    * @param name (String) is the PCS name, this will be the underlying mesh name
    * @param pointSize (number) is the size for each point. Has no effect on a WebGPU engine.
    * @param scene (Scene) is the scene in which the PCS is added
    * @param options defines the options of the PCS e.g.
    * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
    * @param options.updatable
    */
  def this(name: String, pointSize: Double, scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    pointSize: Double,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    options: Updatable
  ) = this()
}
