package typingsJapgolly.three

import typingsJapgolly.three.anon.AmbientOcclusion
import typingsJapgolly.three.anon.IblIrradiance
import typingsJapgolly.three.anon.Irradiance
import typingsJapgolly.three.anon.LightColor
import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsPhysicalLightingModelMod {
  
  object default {
    
    @JSImport("three/examples/jsm/nodes/functions/PhysicalLightingModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/functions/PhysicalLightingModel", "default.ambientOcclusion")
    @js.native
    def ambientOcclusion: ShaderNode[AmbientOcclusion, Node] = js.native
    inline def ambientOcclusion_=(x: ShaderNode[AmbientOcclusion, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusion")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/functions/PhysicalLightingModel", "default.direct")
    @js.native
    def direct: ShaderNode[LightColor, Node] = js.native
    inline def direct_=(x: ShaderNode[LightColor, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direct")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/functions/PhysicalLightingModel", "default.indirectDiffuse")
    @js.native
    def indirectDiffuse: ShaderNode[Irradiance, Node] = js.native
    inline def indirectDiffuse_=(x: ShaderNode[Irradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectDiffuse")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/functions/PhysicalLightingModel", "default.indirectSpecular")
    @js.native
    def indirectSpecular: ShaderNode[IblIrradiance, Node] = js.native
    inline def indirectSpecular_=(x: ShaderNode[IblIrradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectSpecular")(x.asInstanceOf[js.Any])
  }
}
