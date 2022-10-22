package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusDynamoDb {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "StatusDynamoDb.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum & Double] = js.native
    
    /* 0 */ val INITIALIZING: typingsJapgolly.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.INITIALIZING & Double = js.native
    
    /* 2 */ val PROCESSINGSTREAM: typingsJapgolly.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.PROCESSINGSTREAM & Double = js.native
    
    /* 1 */ val SCANNINGTABLE: typingsJapgolly.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.SCANNINGTABLE & Double = js.native
  }
}
