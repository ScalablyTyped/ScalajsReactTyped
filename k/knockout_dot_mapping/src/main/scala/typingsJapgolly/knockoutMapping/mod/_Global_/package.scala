package typingsJapgolly.knockoutMapping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type KnockoutMappingOptions[T] = typingsJapgolly.knockoutMapping.mod._Global_.KnockoutMappingSpecificOptions[T] | typingsJapgolly.knockoutMapping.mod._Global_.KnockoutMappingStandardOptions
  type KnockoutMappingSpecificOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? knockout.mapping.knockout.mapping._Global_.KnockoutPropertyMappingCallBack}
    */ typingsJapgolly.knockoutMapping.knockoutMappingStrings.KnockoutMappingSpecificOptions with js.Any
  // Could not get this to return any when T is any. It returns a Union type of the possible values.
  type KnockoutObservableArrayType[T] = typingsJapgolly.knockout.KnockoutObservableArray[typingsJapgolly.knockoutMapping.mod._Global_.KnockoutObservableType[T] | T]
  type KnockoutObservableType[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends knockout.mapping.knockout.mapping.Primitives? knockout.KnockoutObservable<T[P]> : T[P] extends std.Array<any>? knockout.mapping.knockout.mapping._Global_.KnockoutObservableArrayType<T[P][number]> : T[P] extends std.ReadonlyArray<any>? knockout.mapping.knockout.mapping._Global_.KnockoutReadonlyObservableArrayType<T[P][number]> : knockout.mapping.knockout.mapping._Global_.MappedType<T[P]>}
    */ typingsJapgolly.knockoutMapping.knockoutMappingStrings.KnockoutObservableType with js.Any
  type KnockoutReadonlyObservableArrayType[T] = typingsJapgolly.knockout.KnockoutReadonlyObservableArray[typingsJapgolly.knockoutMapping.mod._Global_.KnockoutObservableType[T] | T]
  type MappedType[T] = typingsJapgolly.knockoutMapping.mod._Global_.KnockoutObservableType[T] | typingsJapgolly.knockout.KnockoutObservable[T]
}
