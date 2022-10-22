package typingsJapgolly.babylonjs.particlesIndexMod

import typingsJapgolly.babylonjs.materialsMaterialMod.Material
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "ModelShape")
@js.native
open class ModelShape protected ()
  extends typingsJapgolly.babylonjs.particlesSolidParticleMod.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @internal
    */
  def this(
    id: Double,
    shape: js.Array[Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[
        js.Function3[
          /* particle */ typingsJapgolly.babylonjs.particlesSolidParticleMod.SolidParticle, 
          /* i */ Double, 
          /* s */ Double, 
          Unit
        ]
      ],
    vtxFunction: Nullable[
        js.Function3[
          /* particle */ typingsJapgolly.babylonjs.particlesSolidParticleMod.SolidParticle, 
          /* vertex */ Vector3, 
          /* i */ Double, 
          Unit
        ]
      ],
    material: Nullable[Material]
  ) = this()
}
