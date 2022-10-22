package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusKafka {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "StatusKafka.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rockset.distCodegenApiMod.StatusKafka.StateEnum & Double] = js.native
    
    /* 1 */ val ACTIVE: typingsJapgolly.rockset.distCodegenApiMod.StatusKafka.StateEnum.ACTIVE & Double = js.native
    
    /* 2 */ val DORMANT: typingsJapgolly.rockset.distCodegenApiMod.StatusKafka.StateEnum.DORMANT & Double = js.native
    
    /* 0 */ val NODOCSYET: typingsJapgolly.rockset.distCodegenApiMod.StatusKafka.StateEnum.NODOCSYET & Double = js.native
  }
}
