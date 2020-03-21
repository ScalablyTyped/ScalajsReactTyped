package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typingsJapgolly.std.WebAssembly.Global
    - typingsJapgolly.std.WebAssembly.Memory
    - typingsJapgolly.std.WebAssembly.Table
  */
  type ExportValue = typingsJapgolly.std.WebAssembly._ExportValue | js.Function
  type Exports = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.std.WebAssembly.ExportValue]
  type ImportValue = typingsJapgolly.std.WebAssembly.ExportValue | scala.Double
  type Imports = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.std.WebAssembly.ModuleImports]
  type ModuleImports = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.std.WebAssembly.ImportValue]
  type TableKind = typingsJapgolly.std.stdStrings.anyfunc
}
