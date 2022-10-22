package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collection {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "Collection.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum & Double] = js.native
    
    /* 7 */ val BULKINGESTMODE: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.BULKINGESTMODE & Double = js.native
    
    /* 1 */ val CREATED: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.CREATED & Double = js.native
    
    /* 4 */ val DELETED: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.DELETED & Double = js.native
    
    /* 8 */ val EXITINGBULKINGESTMODE: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.EXITINGBULKINGESTMODE & Double = js.native
    
    /* 0 */ val INITIALIZED: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.INITIALIZED & Double = js.native
    
    /* 3 */ val PAUSED: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.PAUSED & Double = js.native
    
    /* 5 */ val PAUSING: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.PAUSING & Double = js.native
    
    /* 2 */ val READY: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.READY & Double = js.native
    
    /* 6 */ val RESUMING: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.RESUMING & Double = js.native
    
    /* 9 */ val UNKNOWN: typingsJapgolly.rockset.distCodegenApiMod.Collection.StatusEnum.UNKNOWN & Double = js.native
  }
}
