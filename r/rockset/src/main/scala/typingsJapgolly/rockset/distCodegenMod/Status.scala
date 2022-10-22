package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Status {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "Status.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum & Double] = js.native
    
    /* 3 */ val COMPLETED: typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum.COMPLETED & Double = js.native
    
    /* 4 */ val ERROR: typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum.ERROR & Double = js.native
    
    /* 0 */ val INITIALIZING: typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum.INITIALIZING & Double = js.native
    
    /* 2 */ val PROCESSING: typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum.PROCESSING & Double = js.native
    
    /* 1 */ val WATCHING: typingsJapgolly.rockset.distCodegenApiMod.Status.StateEnum.WATCHING & Double = js.native
  }
}
