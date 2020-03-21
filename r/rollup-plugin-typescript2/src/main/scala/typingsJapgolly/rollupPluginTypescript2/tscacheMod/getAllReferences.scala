package typingsJapgolly.rollupPluginTypescript2.tscacheMod

import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/tscache", "getAllReferences")
@js.native
object getAllReferences extends js.Object {
  def apply(importer: String, snapshot: js.UndefOr[scala.Nothing], options: CompilerOptions): js.Array[String] = js.native
  def apply(importer: String, snapshot: IScriptSnapshot, options: CompilerOptions): js.Array[String] = js.native
}

