package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BoneAxesViewer")
@js.native
open class BoneAxesViewer protected ()
  extends typingsJapgolly.babylonjs.debugIndexMod.BoneAxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone,
    mesh: Mesh
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    bone: typingsJapgolly.babylonjs.bonesBoneMod.Bone,
    mesh: Mesh,
    scaleLines: Double
  ) = this()
}
