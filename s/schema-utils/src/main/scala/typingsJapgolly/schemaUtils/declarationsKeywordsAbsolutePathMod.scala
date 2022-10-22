package typingsJapgolly.schemaUtils

import typingsJapgolly.ajv.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsKeywordsAbsolutePathMod {
  
  @JSImport("schema-utils/declarations/keywords/absolutePath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param {Ajv} ajv
    * @returns {Ajv}
    */
  inline def default(ajv: Ajv): Ajv = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[Ajv]
  
  type Ajv = default
  
  type AnySchemaObject = typingsJapgolly.ajv.distTypesMod.AnySchemaObject
  
  type SchemaUtilErrorObject = typingsJapgolly.schemaUtils.declarationsValidateMod.SchemaUtilErrorObject
  
  type SchemaValidateFunction = typingsJapgolly.ajv.distTypesMod.SchemaValidateFunction
}
