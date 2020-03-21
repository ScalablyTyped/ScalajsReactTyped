package typingsJapgolly.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Emscripten {
  type TypeCompatibleWithC = scala.Double | java.lang.String | js.Array[js.Any] | scala.Boolean
  type WebAssemblyExports = js.Array[typingsJapgolly.emscripten.AnonModule]
  type WebAssemblyImports = js.Array[typingsJapgolly.emscripten.AnonKind]
}
