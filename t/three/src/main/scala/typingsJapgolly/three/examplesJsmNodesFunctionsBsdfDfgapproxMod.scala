package typingsJapgolly.three

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.three.anon.Roughness
import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsBsdfDfgapproxMod extends Shortcut {
  
  // Analytical approximation of the DFG LUT, one half of the
  // split-sum approximation used in indirect specular lighting.
  // via 'environmentBRDF' from "Physically Based Shading on Mobile"
  // https://www.unrealengine.com/blog/physically-based-shading-on-mobile
  @JSImport("three/examples/jsm/nodes/functions/BSDF/DFGApprox", JSImport.Default)
  @js.native
  val default: ShaderNode[Roughness, Node] = js.native
  
  type _To = ShaderNode[Roughness, Node]
  
  /* This means you don't have to write `default`, but can instead just say `examplesJsmNodesFunctionsBsdfDfgapproxMod.foo` */
  override def _to: ShaderNode[Roughness, Node] = default
}
