package typingsJapgolly.three

import typingsJapgolly.three.lineBasicMaterialMod.LineBasicMaterialParameters
import typingsJapgolly.three.lineDashedMaterialMod.LineDashedMaterialParameters
import typingsJapgolly.three.meshBasicMaterialMod.MeshBasicMaterialParameters
import typingsJapgolly.three.meshDepthMaterialMod.MeshDepthMaterialParameters
import typingsJapgolly.three.meshDistanceMaterialMod.MeshDistanceMaterialParameters
import typingsJapgolly.three.meshLambertMaterialMod.MeshLambertMaterialParameters
import typingsJapgolly.three.meshMatcapMaterialMod.MeshMatcapMaterialParameters
import typingsJapgolly.three.meshNormalMaterialMod.MeshNormalMaterialParameters
import typingsJapgolly.three.meshPhongMaterialMod.MeshPhongMaterialParameters
import typingsJapgolly.three.meshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typingsJapgolly.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typingsJapgolly.three.meshToonMaterialMod.MeshToonMaterialParameters
import typingsJapgolly.three.pointsMaterialMod.PointsMaterialParameters
import typingsJapgolly.three.shaderMaterialMod.ShaderMaterialParameters
import typingsJapgolly.three.spriteMaterialMod.SpriteMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/Materials", JSImport.Namespace)
@js.native
object materialsMod extends js.Object {
  @js.native
  class LineBasicMaterial ()
    extends typingsJapgolly.three.lineBasicMaterialMod.LineBasicMaterial {
    def this(parameters: LineBasicMaterialParameters) = this()
  }
  
  @js.native
  class LineDashedMaterial ()
    extends typingsJapgolly.three.lineDashedMaterialMod.LineDashedMaterial {
    def this(parameters: LineDashedMaterialParameters) = this()
  }
  
  @js.native
  class Material ()
    extends typingsJapgolly.three.materialMod.Material
  
  @js.native
  class MeshBasicMaterial ()
    extends typingsJapgolly.three.meshBasicMaterialMod.MeshBasicMaterial {
    def this(parameters: MeshBasicMaterialParameters) = this()
  }
  
  @js.native
  class MeshDepthMaterial ()
    extends typingsJapgolly.three.meshDepthMaterialMod.MeshDepthMaterial {
    def this(parameters: MeshDepthMaterialParameters) = this()
  }
  
  @js.native
  class MeshDistanceMaterial ()
    extends typingsJapgolly.three.meshDistanceMaterialMod.MeshDistanceMaterial {
    def this(parameters: MeshDistanceMaterialParameters) = this()
  }
  
  @js.native
  class MeshLambertMaterial ()
    extends typingsJapgolly.three.meshLambertMaterialMod.MeshLambertMaterial {
    def this(parameters: MeshLambertMaterialParameters) = this()
  }
  
  @js.native
  class MeshMatcapMaterial ()
    extends typingsJapgolly.three.meshMatcapMaterialMod.MeshMatcapMaterial {
    def this(parameters: MeshMatcapMaterialParameters) = this()
  }
  
  @js.native
  class MeshNormalMaterial ()
    extends typingsJapgolly.three.meshNormalMaterialMod.MeshNormalMaterial {
    def this(parameters: MeshNormalMaterialParameters) = this()
  }
  
  @js.native
  class MeshPhongMaterial ()
    extends typingsJapgolly.three.meshPhongMaterialMod.MeshPhongMaterial {
    def this(parameters: MeshPhongMaterialParameters) = this()
  }
  
  @js.native
  class MeshPhysicalMaterial protected ()
    extends typingsJapgolly.three.meshPhysicalMaterialMod.MeshPhysicalMaterial {
    def this(parameters: MeshPhysicalMaterialParameters) = this()
  }
  
  @js.native
  class MeshStandardMaterial ()
    extends typingsJapgolly.three.meshStandardMaterialMod.MeshStandardMaterial {
    def this(parameters: MeshStandardMaterialParameters) = this()
  }
  
  @js.native
  class MeshToonMaterial ()
    extends typingsJapgolly.three.meshToonMaterialMod.MeshToonMaterial {
    def this(parameters: MeshToonMaterialParameters) = this()
  }
  
  @js.native
  class MultiMaterial ()
    extends typingsJapgolly.three.pointsMaterialMod.MultiMaterial {
    def this(materials: js.Array[typingsJapgolly.three.materialMod.Material]) = this()
  }
  
  @js.native
  class PointsMaterial ()
    extends typingsJapgolly.three.pointsMaterialMod.PointsMaterial {
    def this(parameters: PointsMaterialParameters) = this()
  }
  
  @js.native
  class RawShaderMaterial ()
    extends typingsJapgolly.three.rawShaderMaterialMod.RawShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class ShaderMaterial ()
    extends typingsJapgolly.three.shaderMaterialMod.ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class ShadowMaterial ()
    extends typingsJapgolly.three.shadowMaterialMod.ShadowMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class SpriteMaterial ()
    extends typingsJapgolly.three.spriteMaterialMod.SpriteMaterial {
    def this(parameters: SpriteMaterialParameters) = this()
  }
  
  var MaterialIdCount: Double = js.native
}

