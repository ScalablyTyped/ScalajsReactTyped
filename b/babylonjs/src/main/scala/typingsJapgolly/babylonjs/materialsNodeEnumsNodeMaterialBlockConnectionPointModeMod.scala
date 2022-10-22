package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeEnumsNodeMaterialBlockConnectionPointModeMod {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointMode extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointMode", "NodeMaterialBlockConnectionPointMode")
  @js.native
  object NodeMaterialBlockConnectionPointMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointMode & Double] = js.native
    
    /** Value is a mesh attribute */
    @js.native
    sealed trait Attribute
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 1 */ val Attribute: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Attribute & Double = js.native
    
    /** Mode is undefined */
    @js.native
    sealed trait Undefined
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 3 */ val Undefined: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Undefined & Double = js.native
    
    /** Value is an uniform */
    @js.native
    sealed trait Uniform
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 0 */ val Uniform: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Uniform & Double = js.native
    
    /** Value is a varying between vertex and fragment shaders */
    @js.native
    sealed trait Varying
      extends StObject
         with NodeMaterialBlockConnectionPointMode
    /* 2 */ val Varying: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointModeMod.NodeMaterialBlockConnectionPointMode.Varying & Double = js.native
  }
}
