package typingsJapgolly.sinclairTypebox.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sinclairTypebox.anon.`1`
import typingsJapgolly.sinclairTypebox.anon.`2`
import typingsJapgolly.sinclairTypebox.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Hint: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Hint").asInstanceOf[js.Symbol]

inline def Kind: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Kind").asInstanceOf[js.Symbol]

inline def Modifier: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Modifier").asInstanceOf[js.Symbol]

inline def Type: TypeBuilder = ^.asInstanceOf[js.Dynamic].selectDynamic("Type").asInstanceOf[TypeBuilder]

type OptionalPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TOptional<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Kind] : string, [Hint] : string | undefined, [Modifier] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Modifier] : 'Optional'}? K : never}[keyof T] */ js.Any

type ReadonlyOptionalPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Kind] : string, [Hint] : string | undefined, [Modifier] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Modifier] : 'ReadonlyOptional'}? K : never}[keyof T] */ js.Any

type ReadonlyPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TReadonly<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Kind] : string, [Hint] : string | undefined, [Modifier] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Modifier] : 'Readonly'}? K : never}[keyof T] */ js.Any

type RequiredPropertyKeys[T /* <: TProperties */] = /* keyof std.Omit<T, @sinclair/typebox.@sinclair/typebox.ReadonlyOptionalPropertyKeys<T> | @sinclair/typebox.@sinclair/typebox.ReadonlyPropertyKeys<T> | @sinclair/typebox.@sinclair/typebox.OptionalPropertyKeys<T>> */ String

type Static[T /* <: TSchema */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T & @sinclair/typebox.anon.Params<P>['static'] */ js.Any

type StaticContructorParameters[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], P> : never} */ js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], P> : never} */ js.Any]

type StaticFunctionParameters[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], P> : never} */ js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], P> : never} */ js.Any]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sinclairTypebox.mod.TSchema
  - typingsJapgolly.sinclairTypebox.mod.TAny
  - typingsJapgolly.sinclairTypebox.mod.TArray[typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TBoolean
  - typingsJapgolly.sinclairTypebox.mod.TConstructor[
js.Array[typingsJapgolly.sinclairTypebox.mod.TSchema], 
typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TEnum[typingsJapgolly.std.Record[java.lang.String, java.lang.String | scala.Double]]
  - typingsJapgolly.sinclairTypebox.mod.TFunction[
js.Array[typingsJapgolly.sinclairTypebox.mod.TSchema], 
typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TInteger
  - typingsJapgolly.sinclairTypebox.mod.TLiteral[typingsJapgolly.sinclairTypebox.mod.TLiteralValue]
  - typingsJapgolly.sinclairTypebox.mod.TNull
  - typingsJapgolly.sinclairTypebox.mod.TNumber
  - typingsJapgolly.sinclairTypebox.mod.TObject[typingsJapgolly.sinclairTypebox.mod.TProperties]
  - typingsJapgolly.sinclairTypebox.mod.TPromise[typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TRecord[
typingsJapgolly.sinclairTypebox.mod.TRecordKey, 
typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TSelf
  - typingsJapgolly.sinclairTypebox.mod.TRef[typingsJapgolly.sinclairTypebox.mod.TSchema]
  - typingsJapgolly.sinclairTypebox.mod.TString[java.lang.String]
  - typingsJapgolly.sinclairTypebox.mod.TTuple[js.Array[typingsJapgolly.sinclairTypebox.mod.TSchema]]
  - typingsJapgolly.sinclairTypebox.mod.TUndefined
  - typingsJapgolly.sinclairTypebox.mod.TUnion[js.Array[typingsJapgolly.sinclairTypebox.mod.TSchema]]
  - typingsJapgolly.sinclairTypebox.mod.TUint8Array
  - typingsJapgolly.sinclairTypebox.mod.TUnknown
  - typingsJapgolly.sinclairTypebox.mod.TVoid
*/
type TAnySchema = _TAnySchema | TArray[TSchema] | (TConstructor[js.Array[TSchema], TSchema]) | (TEnum[Record[String, String | Double]]) | (TFunction[js.Array[TSchema], TSchema]) | TLiteral[TLiteralValue] | TObject[TProperties] | TPromise[TSchema] | (TRecord[TRecordKey, TSchema]) | TRef[TSchema] | TString[String] | TTuple[js.Array[TSchema]] | TUnion[js.Array[TSchema]]

type TConstructorParameters[T /* <: TConstructor[js.Array[TSchema], TSchema] */] = TTuple[
/* import warning: importer.ImportType#apply Failed type conversion: T['parameters'] */ js.Any]

type TInstanceType[T /* <: TConstructor[js.Array[TSchema], TSchema] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['returns'] */ js.Any

type TKeyOf[T /* <: TObject[TProperties] */] = TUnion[UnionLiteralsFromObject[T]]

type TLiteralValue = String | Double | Boolean

type TOptional[T /* <: TSchema */] = T & typingsJapgolly.sinclairTypebox.anon.Modifier

type TParameters[T /* <: TFunction[js.Array[TSchema], TSchema] */] = TTuple[
/* import warning: importer.ImportType#apply Failed type conversion: T['parameters'] */ js.Any]

type TPick[T /* <: TObject[TProperties] */, Properties /* <: js.Array[ObjectPropertyKeys[T]] */] = TObject[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Properties[number] ]: T['properties'][K]} */ js.Any]

type TProperties = StringDictionary[TSchema]

type TReadonly[T /* <: TSchema */] = T & `1`

type TReadonlyOptional[T /* <: TSchema */] = T & `2`

type TRecordKey = TString[String] | TNumber | TUnion[js.Array[TLiteral[Any]]]

type TReturnType[T /* <: TFunction[js.Array[TSchema], TSchema] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['returns'] */ js.Any
