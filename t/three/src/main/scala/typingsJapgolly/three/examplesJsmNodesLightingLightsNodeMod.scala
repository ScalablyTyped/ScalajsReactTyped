package typingsJapgolly.three

import typingsJapgolly.three.anon.Instantiable
import typingsJapgolly.three.anon.InstantiableDefault
import typingsJapgolly.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLightingLightsNodeMod {
  
  @JSImport("three/examples/jsm/nodes/lighting/LightsNode", JSImport.Default)
  @js.native
  open class default () extends LightsNode {
    def this(lightNodes: js.Array[typingsJapgolly.three.examplesJsmNodesLightingLightingNodeMod.default]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/lighting/LightsNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def setReference[T /* <: Light */](lightClass: Instantiable[T], lightNodeClass: InstantiableDefault[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReference")(lightClass.asInstanceOf[js.Any], lightNodeClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait LightsNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    def fromLights(lights: js.Array[Light]): this.type = js.native
    
    def getLightNodeByHash(hash: String): typingsJapgolly.three.examplesJsmNodesLightingLightingNodeMod.default | Null = js.native
    
    def hasLight: Boolean = js.native
    
    var lightNodes: js.Array[typingsJapgolly.three.examplesJsmNodesLightingLightingNodeMod.default] = js.native
  }
}
