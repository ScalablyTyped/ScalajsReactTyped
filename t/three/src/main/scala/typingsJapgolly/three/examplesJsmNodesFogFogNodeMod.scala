package typingsJapgolly.three

import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFogFogNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogNode", JSImport.Default)
  @js.native
  open class default protected () extends FogNode {
    def this(
      colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      factorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var factorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isFogNode: `true` = js.native
    
    def mix(outputNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
