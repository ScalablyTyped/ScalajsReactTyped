package typingsJapgolly.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Object {
  // From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsJapgolly.parse.mod._Global_.Parse.Object.ToJSON[T]
    - js.Array[js.Any]
    - java.lang.String
    - typingsJapgolly.parse.AnonIso
    - typingsJapgolly.std.ReturnType[
  / * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
    - typingsJapgolly.parse.mod._Global_.Parse.Pointer
  */
  type Encode[T] = typingsJapgolly.parse.mod._Global_.Parse.Object._Encode[T] | js.Array[js.Any] | (typingsJapgolly.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
  ]) | T | typingsJapgolly.parse.mod._Global_.Parse.Object.ToJSON[T] | java.lang.String
  type ToJSON[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: parse.parse._Global_.Parse.Object.Encode<T[K]>}
    */ typingsJapgolly.parse.parseStrings.ToJSON with T
}
