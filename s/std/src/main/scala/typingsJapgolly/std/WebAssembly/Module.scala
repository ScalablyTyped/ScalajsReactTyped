package typingsJapgolly.std.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object

@JSGlobal("WebAssembly.Module")
@js.native
object Module extends Instantiable1[/* bytes */ BufferSource, Module] {
  def customSections(module: Module, sectionName: java.lang.String): js.Array[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def exports(module: Module): js.Array[ModuleExportDescriptor] = js.native
  def imports(module: Module): js.Array[ModuleImportDescriptor] = js.native
}

