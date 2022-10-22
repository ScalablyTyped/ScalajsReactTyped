package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.`object`
import typingsJapgolly.ajv.anon.AdditionalPropertyError
import typingsJapgolly.ajv.anon.MissingProperty
import typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.ajv.distTypesMod.KeywordErrorDefinition
import typingsJapgolly.ajv.distVocabulariesJtdErrorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdPropertiesMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  @js.native
  sealed trait PropError extends StObject
  @JSImport("ajv/dist/vocabularies/jtd/properties", "PropError")
  @js.native
  object PropError extends StObject {
    
    @js.native
    sealed trait Additional
      extends StObject
         with PropError
    
    @js.native
    sealed trait Missing
      extends StObject
         with PropError
  }
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", "error")
  @js.native
  val error: KeywordErrorDefinition = js.native
  
  inline def validateProperties(cxt: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateProperties")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type JTDPropertiesError = (JTDTypeError[PropKeyword, `object`, PropSchema]) | (ErrorObject[PropKeyword, AdditionalPropertyError | MissingProperty, PropSchema])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.properties
    - typingsJapgolly.ajv.ajvStrings.optionalProperties
  */
  trait PropKeyword extends StObject
  object PropKeyword {
    
    inline def optionalProperties: typingsJapgolly.ajv.ajvStrings.optionalProperties = "optionalProperties".asInstanceOf[typingsJapgolly.ajv.ajvStrings.optionalProperties]
    
    inline def properties: typingsJapgolly.ajv.ajvStrings.properties = "properties".asInstanceOf[typingsJapgolly.ajv.ajvStrings.properties]
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in string ]:? ajv.ajv/dist/types.SchemaObject}
    }}}
    */
  @js.native
  trait PropSchema extends StObject
}
