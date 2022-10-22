package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMaterialsMaterialMod.MaterialParameters
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsShadowMaterialMod {
  
  @JSImport("three/src/materials/ShadowMaterial", "ShadowMaterial")
  @js.native
  open class ShadowMaterial () extends Material {
    def this(parameters: ShadowMaterialParameters) = this()
    
    /**
      * @default new THREE.Color( 0x000000 )
      */
    var color: Color = js.native
    
    /**
      * Whether the material is affected by fog. Default is true.
      * @default fog
      */
    var fog: Boolean = js.native
  }
  
  trait ShadowMaterialParameters
    extends StObject
       with MaterialParameters {
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
  }
  object ShadowMaterialParameters {
    
    inline def apply(): ShadowMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShadowMaterialParameters]
    }
    
    extension [Self <: ShadowMaterialParameters](x: Self) {
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
    }
  }
}
