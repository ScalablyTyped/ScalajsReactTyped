package typingsJapgolly.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KafkaIntegration {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "KafkaIntegration.KafkaDataFormatEnum")
  @js.native
  object KafkaDataFormatEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum & Double
      ] = js.native
    
    /* 1 */ val AVRO: typingsJapgolly.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum.AVRO & Double = js.native
    
    /* 0 */ val JSON: typingsJapgolly.rockset.distCodegenApiMod.KafkaIntegration.KafkaDataFormatEnum.JSON & Double = js.native
  }
}
