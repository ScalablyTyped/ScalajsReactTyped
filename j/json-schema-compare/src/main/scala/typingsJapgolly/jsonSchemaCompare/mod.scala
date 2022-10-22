package typingsJapgolly.jsonSchemaCompare

import typingsJapgolly.jsonSchema.mod.JSONSchema4
import typingsJapgolly.jsonSchema.mod.JSONSchema6Definition
import typingsJapgolly.jsonSchema.mod.JSONSchema7Definition
import typingsJapgolly.jsonSchemaCompare.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compare json schemas correctly.
    *
    * - Ignores sort for arrays where sort does not matter, like required, enum, type, anyOf, oneOf, anyOf, dependencies (if array)
    * - Compares correctly type when array or string
    * - Ignores duplicate values before comparing
    * - For schemas and sub schemas `undefined`, `true` and `{}` are equal
    * - For minLength, minItems and minProperties `undefined` and `0` are equal
    * - For uniqueItems, `undefined` and `false` are equal
    */
  inline def apply(a: JSONSchemaComparee, b: JSONSchemaComparee): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(a: JSONSchemaComparee, b: JSONSchemaComparee, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("json-schema-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type JSONSchemaComparee = js.UndefOr[JSONSchema4 | JSONSchema6Definition | JSONSchema7Definition]
  
  /**
    * The `string & {''?: never}` is a workaround for
    * [Microsoft/TypeScript#29729](https://github.com/Microsoft/TypeScript/issues/29729).
    * It will be removed as soon as it's not needed anymore.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonSchemaCompare.mod.KnownKeys[typingsJapgolly.jsonSchema.mod.JSONSchema4]
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$id
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$ref
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$schema
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.multipleOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maximum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMaximum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minimum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.exclusiveMinimum
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxLength
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minLength
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.pattern
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.items
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.additionalItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.uniqueItems
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contains
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.maxProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.minProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.required
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.properties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.patternProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.additionalProperties
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.dependencies
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.propertyNames
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`enum`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.const
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`type`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.allOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.anyOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.oneOf
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.not
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.definitions
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.title
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.description
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.default
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.examples
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.format
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$comment
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.$defs
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`if`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`then`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.`else`
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contentMediaType
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.contentEncoding
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.readOnly
    - typingsJapgolly.jsonSchemaCompare.jsonSchemaCompareStrings.writeOnly
    - java.lang.String & typingsJapgolly.jsonSchemaCompare.anon._empty
  */
  type JSONSchemaKeys = _JSONSchemaKeys | KnownKeys[JSONSchema4] | (String & _empty)
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: string extends K? never : K} extends {[ _ in keyof T ]: infer U} ? U : never
    }}}
    */
  @js.native
  trait KnownKeys[T] extends StObject
  
  trait Options extends StObject {
    
    /**
      * Ignores certain keywords, useful to exclude meta keywords like title,
      * description etc or custom keywords. If all you want to know if they are
      * the same in terms of validation keywords.
      *
      * @default []
      */
    var ignore: js.UndefOr[js.Array[JSONSchemaKeys]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnore(value: js.Array[JSONSchemaKeys]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: JSONSchemaKeys*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
  
  trait _JSONSchemaKeys extends StObject
}
