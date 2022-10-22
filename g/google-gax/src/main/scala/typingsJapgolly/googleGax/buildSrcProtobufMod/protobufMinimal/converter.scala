package typingsJapgolly.googleGax.buildSrcProtobufMod.protobufMinimal

import typingsJapgolly.protobufjs.mod.Codegen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converter {
  
  @JSImport("google-gax/build/src/protobuf", "protobufMinimal.converter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def fromObject(mtype: typingsJapgolly.protobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def toObject(mtype: typingsJapgolly.protobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
}
