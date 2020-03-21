package typingsJapgolly.meteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomy {
  type Enum[T] = T with typingsJapgolly.meteorAstronomy.AnonGetIdentifier
  type Fields[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ typingsJapgolly.meteorAstronomy.meteorAstronomyStrings.Fields with T
  type FunctionProperties[T] = typingsJapgolly.std.Pick[T, typingsJapgolly.meteorAstronomy.MeteorAstronomy.FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ typingsJapgolly.meteorAstronomy.meteorAstronomyStrings.Helpers with js.Any
  type Model[T] = T with typingsJapgolly.meteorAstronomy.AnonCopy[T]
  type ModelField[Field, Doc] = (typingsJapgolly.meteorAstronomy.MeteorAstronomy.ModelFullField[Field, Doc]) | typingsJapgolly.meteorAstronomy.MeteorAstronomy.TypeOptions
  type MongoQuery[T] = typingsJapgolly.meteor.Mongo.Selector[T] | typingsJapgolly.meteor.Mongo.ObjectID | java.lang.String
  type NonFunctionProperties[T] = typingsJapgolly.std.Pick[T, typingsJapgolly.meteorAstronomy.MeteorAstronomy.NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, scala.Unit]
  type TypeOptions = typingsJapgolly.meteorAstronomy.MeteorAstronomy.TypeOptionsPrimitives | js.Array[typingsJapgolly.meteorAstronomy.MeteorAstronomy.TypeOptionsPrimitives] | typingsJapgolly.meteorAstronomy.MeteorAstronomy.Class[js.Any] | typingsJapgolly.meteorAstronomy.MeteorAstronomy.Enum[js.Any]
  type TypeOptionsPrimitives = typingsJapgolly.std.StringConstructor | typingsJapgolly.std.DateConstructor | typingsJapgolly.std.BooleanConstructor | typingsJapgolly.std.ObjectConstructor | typingsJapgolly.std.NumberConstructor
}
