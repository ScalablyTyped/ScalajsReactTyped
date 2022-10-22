package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.end
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonBoundaryMod {
  
  /* Inlined {  START :'start',   END :'end'}[keyof {  START :'start',   END :'end'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.start
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.end
  */
  trait Boundary extends StObject
  object Boundary {
    
    @JSImport("@blueprintjs/core/lib/esm/common/boundary", "Boundary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common/boundary", "Boundary.END")
    @js.native
    def END: end = js.native
    inline def END_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/boundary", "Boundary.START")
    @js.native
    def START: start = js.native
    inline def START_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  }
}
