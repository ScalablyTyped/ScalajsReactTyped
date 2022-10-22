package typingsJapgolly.ajvKeywords

import typingsJapgolly.ajv.distTypesMod.SchemaObject
import typingsJapgolly.ajv.mod.KeywordCxt
import typingsJapgolly.ajv.mod.Name
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsUtilMod {
  
  @JSImport("ajv-keywords/dist/definitions/_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def metaSchemaRef(): SchemaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("metaSchemaRef")().asInstanceOf[SchemaObject]
  inline def metaSchemaRef(hasDefaultMeta: DefinitionOptions): SchemaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("metaSchemaRef")(hasDefaultMeta.asInstanceOf[js.Any]).asInstanceOf[SchemaObject]
  
  inline def usePattern(hasGenHasOpts: KeywordCxt, pattern: String): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("usePattern")(hasGenHasOpts.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Name]
  inline def usePattern(hasGenHasOpts: KeywordCxt, pattern: String, flags: String): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("usePattern")(hasGenHasOpts.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Name]
}
