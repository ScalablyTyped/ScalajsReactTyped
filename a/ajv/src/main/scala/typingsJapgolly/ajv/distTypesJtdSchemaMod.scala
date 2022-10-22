package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.boolean
import typingsJapgolly.ajv.anon.Definitions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJtdSchemaMod {
  
  /** gets only the string literals of a type or null if a type isn't a string literal */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [never] ? null : T extends string ? string extends T ? null : T : null
    }}}
    */
  @js.native
  trait EnumString[T] extends StObject
  
  /** true only if all types are array types (not tuples) */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    false extends ajv.ajv/dist/types/jtd-schema.IsUnion<T> ? [T] extends [std.Array<unknown>] ? undefined extends T[0.5] ? false : true : false : false
    }}}
    */
  @js.native
  trait IsElements[T] extends StObject
  
  /** true if type is a union of string literals */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    null extends ajv.ajv/dist/types/jtd-schema.EnumString<std.Exclude<T, null>> ? false : true
    }}}
    */
  @js.native
  trait IsEnum[T] extends StObject
  
  /** true if type is a proeprties type and Union is false, or type is a discriminator type and Union is true */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Union extends ajv.ajv/dist/types/jtd-schema.IsUnion<std.Exclude<T, null>> ? null extends ajv.ajv/dist/types/jtd-schema.EnumString<keyof std.Exclude<T, null>> ? false : true : false
    }}}
    */
  @js.native
  trait IsRecord[T, Union /* <: Boolean */] extends StObject
  
  type IsUnion[T] = IsUnion_[T, T]
  
  /** type is true if T is a union type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    false extends T extends unknown ? [U] extends [T] ? false : true : never ? false : true
    }}}
    */
  @js.native
  trait IsUnion_[T, U /* <: T */] extends StObject
  
  /** true if the the type is a values type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    false extends ajv.ajv/dist/types/jtd-schema.IsUnion<std.Exclude<T, null>> ? ajv.ajv/dist/types/jtd-schema.TypeEquality<keyof std.Exclude<T, null>, string> : false
    }}}
    */
  @js.native
  trait IsValues[T] extends StObject
  
  type JTDDataDef[S, D /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: S extends {  ref :string} ? D extends {[ K in S['ref'] ]: infer V} ? ajv.ajv/dist/types/jtd-schema.JTDDataDef<V, D> : never : S extends {  type :ajv.ajv/dist/types/jtd-schema.NumberType} ? number : S extends {  type :'boolean'} ? boolean : S extends {  type :'string'} ? string : S extends {  type :'timestamp'} ? string | std.Date : S extends {  enum :std.Array<infer E>} ? string extends E ? never : [E] extends [string] ? E : never : S extends {  elements :infer E} ? std.Array<ajv.ajv/dist/types/jtd-schema.JTDDataDef<E, D>> : S extends {  properties :std.Record<string, unknown>,   optionalProperties :std.Record<string, unknown> | undefined,   additionalProperties :boolean | undefined} ? {-readonly [ K in keyof S['properties'] ]: -? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['properties'][K], D>} & {-readonly [ K in keyof S['optionalProperties'] ]:? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['optionalProperties'][K], D>} & [S['additionalProperties']] extends [true] ? std.Record<string, unknown> : unknown : S extends {  properties :std.Record<string, unknown> | undefined,   optionalProperties :std.Record<string, unknown>,   additionalProperties :boolean | undefined} ? {-readonly [ K in keyof S['properties'] ]: -? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['properties'][K], D>} & {-readonly [ K in keyof S['optionalProperties'] ]:? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['optionalProperties'][K], D>} & [S['additionalProperties']] extends [true] ? std.Record<string, unknown> : unknown : S extends {  values :infer V} ? std.Record<string, ajv.ajv/dist/types/jtd-schema.JTDDataDef<V, D>> : S extends {  discriminator :infer M,   mapping :std.Record<string, unknown>} ? [M] extends [string] ? {[ K in keyof S['mapping'] ]: ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['mapping'][K], D> & {[ KM in M ]: K}}[keyof S['mapping']] : never : unknown */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends {  definitions :std.Record<string, unknown>} ? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S, S['definitions']> : ajv.ajv/dist/types/jtd-schema.JTDDataDef<S, std.Record<string, never>>
    }}}
    */
  @js.native
  trait JTDDataType[S] extends StObject
  
  type JTDSchemaType[T, D /* <: Record[String, Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: null extends ajv.ajv/dist/types/jtd-schema.EnumString<keyof D> ? never : {[ K in keyof D ]: [T] extends [D[K]]? {  ref :K} : never}[keyof D] & {  nullable :false | undefined} | null extends T ? {[ K in keyof D ]: [std.Exclude<T, null>] extends [std.Exclude<D[K], null>]? {  ref :K} : never}[keyof D] & {  nullable :true} : never */ js.Any) & Definitions[D]
  
  /** type is true if T or null is identically E or null*/
  type NullTypeEquality[T, E] = TypeEquality[T | Null, E | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.float32
    - typingsJapgolly.ajv.ajvStrings.float64
    - typingsJapgolly.ajv.ajvStrings.int8
    - typingsJapgolly.ajv.ajvStrings.uint8
    - typingsJapgolly.ajv.ajvStrings.int16
    - typingsJapgolly.ajv.ajvStrings.uint16
    - typingsJapgolly.ajv.ajvStrings.int32
    - typingsJapgolly.ajv.ajvStrings.uint32
  */
  trait NumberType extends StObject
  object NumberType {
    
    inline def float32: typingsJapgolly.ajv.ajvStrings.float32 = "float32".asInstanceOf[typingsJapgolly.ajv.ajvStrings.float32]
    
    inline def float64: typingsJapgolly.ajv.ajvStrings.float64 = "float64".asInstanceOf[typingsJapgolly.ajv.ajvStrings.float64]
    
    inline def int16: typingsJapgolly.ajv.ajvStrings.int16 = "int16".asInstanceOf[typingsJapgolly.ajv.ajvStrings.int16]
    
    inline def int32: typingsJapgolly.ajv.ajvStrings.int32 = "int32".asInstanceOf[typingsJapgolly.ajv.ajvStrings.int32]
    
    inline def int8: typingsJapgolly.ajv.ajvStrings.int8 = "int8".asInstanceOf[typingsJapgolly.ajv.ajvStrings.int8]
    
    inline def uint16: typingsJapgolly.ajv.ajvStrings.uint16 = "uint16".asInstanceOf[typingsJapgolly.ajv.ajvStrings.uint16]
    
    inline def uint32: typingsJapgolly.ajv.ajvStrings.uint32 = "uint32".asInstanceOf[typingsJapgolly.ajv.ajvStrings.uint32]
    
    inline def uint8: typingsJapgolly.ajv.ajvStrings.uint8 = "uint8".asInstanceOf[typingsJapgolly.ajv.ajvStrings.uint8]
  }
  
  /** optional or undifined-able keys of an object */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  /** required keys of an object, not undefined */
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? never : K}[keyof T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.anon.refstringnullablebooleanu
    - typingsJapgolly.ajv.anon.typeNumberTypeStringTypeb
    - typingsJapgolly.ajv.anon.enumArraystringnullablebo
    - typingsJapgolly.ajv.anon.elementsSomeJTDSchemaType
    - typingsJapgolly.ajv.anon.valuesSomeJTDSchemaTypenu
    - typingsJapgolly.ajv.anon.propertiesRecordstringSom
    - typingsJapgolly.ajv.anon.propertiesRecordstringSomAdditionalProperties
    - typingsJapgolly.ajv.anon.discriminatorstringmappin
    - typingsJapgolly.ajv.anon.nullablebooleanundefinedm
  */
  trait SomeJTDSchemaType extends StObject
  object SomeJTDSchemaType {
    
    inline def discriminatorstringmappin(discriminator: String, mapping: Record[String, SomeJTDSchemaType]): typingsJapgolly.ajv.anon.discriminatorstringmappin = {
      val __obj = js.Dynamic.literal(discriminator = discriminator.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.discriminatorstringmappin]
    }
    
    inline def elementsSomeJTDSchemaType(elements: SomeJTDSchemaType): typingsJapgolly.ajv.anon.elementsSomeJTDSchemaType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.elementsSomeJTDSchemaType]
    }
    
    inline def enumArraystringnullablebo(`enum`: js.Array[String]): typingsJapgolly.ajv.anon.enumArraystringnullablebo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.enumArraystringnullablebo]
    }
    
    inline def nullablebooleanundefinedm(): typingsJapgolly.ajv.anon.nullablebooleanundefinedm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.nullablebooleanundefinedm]
    }
    
    inline def propertiesRecordstringSom(properties: Record[String, SomeJTDSchemaType]): typingsJapgolly.ajv.anon.propertiesRecordstringSom = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.propertiesRecordstringSom]
    }
    
    inline def propertiesRecordstringSomAdditionalProperties(optionalProperties: Record[String, SomeJTDSchemaType]): typingsJapgolly.ajv.anon.propertiesRecordstringSomAdditionalProperties = {
      val __obj = js.Dynamic.literal(optionalProperties = optionalProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.propertiesRecordstringSomAdditionalProperties]
    }
    
    inline def refstringnullablebooleanu(ref: String): typingsJapgolly.ajv.anon.refstringnullablebooleanu = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.refstringnullablebooleanu]
    }
    
    inline def typeNumberTypeStringTypeb(`type`: NumberType | StringType | boolean): typingsJapgolly.ajv.anon.typeNumberTypeStringTypeb = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.typeNumberTypeStringTypeb]
    }
    
    inline def valuesSomeJTDSchemaTypenu(values: SomeJTDSchemaType): typingsJapgolly.ajv.anon.valuesSomeJTDSchemaTypenu = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ajv.anon.valuesSomeJTDSchemaTypenu]
    }
  }
  
  /** string strings */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.string
    - typingsJapgolly.ajv.ajvStrings.timestamp
  */
  trait StringType extends StObject
  object StringType {
    
    inline def string: typingsJapgolly.ajv.ajvStrings.string = "string".asInstanceOf[typingsJapgolly.ajv.ajvStrings.string]
    
    inline def timestamp: typingsJapgolly.ajv.ajvStrings.timestamp = "timestamp".asInstanceOf[typingsJapgolly.ajv.ajvStrings.timestamp]
  }
  
  /** type is true if T is identically E */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [E] ? [E] extends [T] ? true : false : false
    }}}
    */
  @js.native
  trait TypeEquality[T, E] extends StObject
}
