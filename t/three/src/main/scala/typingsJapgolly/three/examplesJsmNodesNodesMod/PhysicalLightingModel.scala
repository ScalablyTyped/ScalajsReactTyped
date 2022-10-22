package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.anon.AmbientOcclusion
import typingsJapgolly.three.anon.IblIrradiance
import typingsJapgolly.three.anon.Irradiance
import typingsJapgolly.three.anon.LightColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhysicalLightingModel {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.ambientOcclusion")
  @js.native
  def ambientOcclusion: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[AmbientOcclusion, Node] = js.native
  inline def ambientOcclusion_=(
    x: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[AmbientOcclusion, Node]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusion")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.direct")
  @js.native
  def direct: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[LightColor, Node] = js.native
  inline def direct_=(
    x: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[LightColor, Node]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direct")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.indirectDiffuse")
  @js.native
  def indirectDiffuse: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Irradiance, Node] = js.native
  inline def indirectDiffuse_=(
    x: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Irradiance, Node]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectDiffuse")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.indirectSpecular")
  @js.native
  def indirectSpecular: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[IblIrradiance, Node] = js.native
  inline def indirectSpecular_=(
    x: typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[IblIrradiance, Node]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectSpecular")(x.asInstanceOf[js.Any])
}
