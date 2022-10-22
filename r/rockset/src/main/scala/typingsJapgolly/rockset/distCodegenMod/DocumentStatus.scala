package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentStatus {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "DocumentStatus.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum & Double] = js.native
    
    /* 0 */ val ADDED: typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.ADDED & Double = js.native
    
    /* 2 */ val DELETED: typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.DELETED & Double = js.native
    
    /* 4 */ val ERROR: typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.ERROR & Double = js.native
    
    /* 3 */ val PATCHED: typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.PATCHED & Double = js.native
    
    /* 1 */ val REPLACED: typingsJapgolly.rockset.distCodegenApiMod.DocumentStatus.StatusEnum.REPLACED & Double = js.native
  }
}
