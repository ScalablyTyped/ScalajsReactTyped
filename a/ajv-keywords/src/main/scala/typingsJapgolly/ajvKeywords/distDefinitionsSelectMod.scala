package typingsJapgolly.ajvKeywords

import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.ajv.distTypesMod.KeywordDefinition
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.select
import typingsJapgolly.ajvKeywords.anon.FailingCase
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsSelectMod {
  
  @JSImport("ajv-keywords/dist/definitions/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[KeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[KeywordDefinition]]
  inline def default(opts: DefinitionOptions): js.Array[KeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeywordDefinition]]
  
  type SelectError = ErrorObject[select, FailingCase, Any]
}
