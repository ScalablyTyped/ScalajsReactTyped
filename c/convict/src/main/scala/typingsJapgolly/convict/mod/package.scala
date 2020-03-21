package typingsJapgolly.convict

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = typingsJapgolly.convict.convictStrings.Overwrite with T with U
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.convict.convictStrings.Asterisk
    - typingsJapgolly.convict.convictStrings.int
    - typingsJapgolly.convict.convictStrings.port
    - typingsJapgolly.convict.convictStrings.windows_named_pipe
    - typingsJapgolly.convict.convictStrings.port_or_windows_named_pipe
    - typingsJapgolly.convict.convictStrings.url
    - typingsJapgolly.convict.convictStrings.email
    - typingsJapgolly.convict.convictStrings.ipaddress
    - typingsJapgolly.convict.convictStrings.duration
    - typingsJapgolly.convict.convictStrings.timestamp
    - typingsJapgolly.convict.convictStrings.nat
    - java.lang.String
    - js.Object
    - typingsJapgolly.std.Number
    - typingsJapgolly.std.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = typingsJapgolly.convict.mod._PredefinedFormat | java.lang.String | js.Object | typingsJapgolly.std.Number | js.RegExp | scala.Boolean
  type Schema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias convict.convict.Schema<T[P]> * / object | convict.convict.SchemaObj<T[P]>}
    */ typingsJapgolly.convict.convictStrings.Schema with T
}
