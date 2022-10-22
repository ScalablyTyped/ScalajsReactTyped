package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.anon.Instantiable
import typingsJapgolly.three.anon.InstantiableDefault
import typingsJapgolly.three.examplesJsmNodesLightingLightsNodeMod.default
import typingsJapgolly.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "LightsNode")
@js.native
open class LightsNode () extends default {
  def this(lightNodes: js.Array[typingsJapgolly.three.examplesJsmNodesLightingLightingNodeMod.default]) = this()
}
/* static members */
object LightsNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "LightsNode")
  @js.native
  val ^ : js.Any = js.native
  
  inline def setReference[T /* <: Light */](lightClass: Instantiable[T], lightNodeClass: InstantiableDefault[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReference")(lightClass.asInstanceOf[js.Any], lightNodeClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
