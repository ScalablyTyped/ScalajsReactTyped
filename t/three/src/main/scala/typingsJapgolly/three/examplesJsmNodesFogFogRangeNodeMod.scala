package typingsJapgolly.three

import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFogFogRangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/fog/FogRangeNode", JSImport.Default)
  @js.native
  open class default protected () extends FogRangeNode {
    def this(
      colorNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      nearNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      farNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait FogRangeNode
    extends typingsJapgolly.three.examplesJsmNodesFogFogNodeMod.default {
    
    var farNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isFogRangeNode: `true` = js.native
    
    var nearNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
