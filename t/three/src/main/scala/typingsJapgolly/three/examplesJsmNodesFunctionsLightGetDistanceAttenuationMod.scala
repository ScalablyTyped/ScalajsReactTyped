package typingsJapgolly.three

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.three.anon.CutoffDistance
import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsLightGetDistanceAttenuationMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/light/getDistanceAttenuation", JSImport.Default)
  @js.native
  val default: ShaderNode[CutoffDistance, Node] = js.native
  
  type _To = ShaderNode[CutoffDistance, Node]
  
  /* This means you don't have to write `default`, but can instead just say `examplesJsmNodesFunctionsLightGetDistanceAttenuationMod.foo` */
  override def _to: ShaderNode[CutoffDistance, Node] = default
}
