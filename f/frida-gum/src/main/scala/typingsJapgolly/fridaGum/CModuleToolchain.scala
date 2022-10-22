package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Toolchain to use when constructing a CModule from C source code.
  *
  * `internal`: Use TinyCC, which is statically linked into the runtime.
  *     Never touches the filesystem and works even in sandboxed processes.
  *     The generated code is however not optimized, as TinyCC optimizes for
  *     small compiler footprint and short compilation times.
  * `external`: Use toolchain provided by the target system, assuming it is
  *     accessible to the process we're executing inside.
  * `any`: Same as `internal` if `Process.arch` is supported by TinyCC, and
  *     `external` otherwise.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.any
  - typingsJapgolly.fridaGum.fridaGumStrings.internal
  - typingsJapgolly.fridaGum.fridaGumStrings.external
*/
trait CModuleToolchain extends StObject
object CModuleToolchain {
  
  inline def any: typingsJapgolly.fridaGum.fridaGumStrings.any = "any".asInstanceOf[typingsJapgolly.fridaGum.fridaGumStrings.any]
  
  inline def external: typingsJapgolly.fridaGum.fridaGumStrings.external = "external".asInstanceOf[typingsJapgolly.fridaGum.fridaGumStrings.external]
  
  inline def internal: typingsJapgolly.fridaGum.fridaGumStrings.internal = "internal".asInstanceOf[typingsJapgolly.fridaGum.fridaGumStrings.internal]
}
