package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileMod.SchemaObjCxt
import typingsJapgolly.ajv.distCompileRulesMod.JSONType
import typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt
import typingsJapgolly.ajv.distTypesMod.AddedKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.FuncKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.MacroKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateKeywordMod {
  
  @JSImport("ajv/dist/compile/validate/keyword", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def funcKeywordCode(cxt: KeywordCxt, `def`: FuncKeywordDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("funcKeywordCode")(cxt.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def macroKeywordCode(cxt: KeywordCxt, `def`: MacroKeywordDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("macroKeywordCode")(cxt.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validSchemaType(schema: Any, schemaType: js.Array[JSONType]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validSchemaType")(schema.asInstanceOf[js.Any], schemaType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validSchemaType(schema: Any, schemaType: js.Array[JSONType], allowUndefined: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validSchemaType")(schema.asInstanceOf[js.Any], schemaType.asInstanceOf[js.Any], allowUndefined.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateKeywordUsage(hasSchemaOptsSelfErrSchemaPath: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateKeywordUsage")(hasSchemaOptsSelfErrSchemaPath.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any], keyword.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
