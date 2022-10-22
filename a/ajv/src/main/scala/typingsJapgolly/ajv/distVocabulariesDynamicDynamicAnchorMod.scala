package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesDynamicDynamicAnchorMod {
  
  @JSImport("ajv/dist/vocabularies/dynamic/dynamicAnchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/dynamic/dynamicAnchor", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def dynamicAnchor(cxt: KeywordCxt, anchor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicAnchor")(cxt.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
