package typingsJapgolly.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mongo {
  type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typingsJapgolly.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typingsJapgolly.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.std.Number]
  type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | typingsJapgolly.meteor.AnonAddToSet[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = typingsJapgolly.std.Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  ]
  type OptionalId[TSchema] = (typingsJapgolly.meteor.UnionOmit[TSchema, typingsJapgolly.meteor.meteorStrings._id]) with typingsJapgolly.meteor.AnonId
  type PartialMapTo[T, M] = typingsJapgolly.std.Partial[typingsJapgolly.std.Record[java.lang.String, M]]
  type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.Mongo.Dictionary<number>}}
    */ typingsJapgolly.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typingsJapgolly.meteor.meteorStrings.Query with js.Any with typingsJapgolly.meteor.AnonAnd with typingsJapgolly.meteor.Mongo.Dictionary[_]
  type Selector[T] = typingsJapgolly.meteor.Mongo.Query[T] | typingsJapgolly.meteor.Mongo.QueryWithModifiers[T]
}
