package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointsGroup")
@js.native
open class PointsGroup protected ()
  extends typingsJapgolly.babylonjs.indexMod.PointsGroup {
  /**
    * Creates a points group object. This is an internal reference to produce particles for the PCS.
    * PCS internal tool, don't use it manually.
    * @internal
    */
  def this(
    id: Double,
    posFunction: Nullable[
        js.Function3[
          /* particle */ typingsJapgolly.babylonjs.particlesCloudPointMod.CloudPoint, 
          /* i */ js.UndefOr[Double], 
          /* s */ js.UndefOr[Double], 
          Unit
        ]
      ]
  ) = this()
}
