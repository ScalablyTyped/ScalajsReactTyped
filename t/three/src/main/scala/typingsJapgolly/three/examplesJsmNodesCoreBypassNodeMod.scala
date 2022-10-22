package typingsJapgolly.three

import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreBypassNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/BypassNode", JSImport.Default)
  @js.native
  open class default protected () extends BypassNode {
    def this(
      returnNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      callNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait BypassNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var callNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var isBypassNode: `true` = js.native
    
    var outputNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
  }
}
