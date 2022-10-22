package typingsJapgolly.tsNode.anon

import typingsJapgolly.swcWasm.anon.IsModule
import typingsJapgolly.swcWasm.mod.JsMinifyOptions
import typingsJapgolly.swcWasm.mod.Module
import typingsJapgolly.swcWasm.mod.Options
import typingsJapgolly.swcWasm.mod.Output
import typingsJapgolly.swcWasm.mod.ParseOptions
import typingsJapgolly.swcWasm.mod.Program
import typingsJapgolly.swcWasm.mod.Script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofswcWasm extends StObject {
  
  def minify(src: String): js.Promise[Output] = js.native
  def minify(src: String, opts: JsMinifyOptions): js.Promise[Output] = js.native
  
  def minifySync(code: String): Output = js.native
  def minifySync(code: String, opts: JsMinifyOptions): Output = js.native
  
  def parse(src: String): js.Promise[Module] = js.native
  def parse(src: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = js.native
  
  def parseSync(src: String): Module = js.native
  def parseSync(src: String, options: ParseOptions): Module = js.native
  @JSName("parseSync")
  def parseSync_Script(src: String, options: ParseOptions & IsModule): Script = js.native
  
  def print(m: Program): js.Promise[Output] = js.native
  def print(m: Program, options: Options): js.Promise[Output] = js.native
  
  def printSync(m: Program): Output = js.native
  def printSync(m: Program, options: Options): Output = js.native
  
  def transform(code: String): js.Promise[Output] = js.native
  def transform(code: String, options: Unit, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = js.native
  def transform(code: String, options: Options): js.Promise[Output] = js.native
  def transform(code: String, options: Options, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = js.native
  def transform(code: Program): js.Promise[Output] = js.native
  def transform(code: Program, options: Unit, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = js.native
  def transform(code: Program, options: Options): js.Promise[Output] = js.native
  def transform(code: Program, options: Options, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = js.native
  
  def transformSync(code: String): Output = js.native
  def transformSync(code: String, opts: Unit, experimental_plugin_bytes_resolver: Any): Output = js.native
  def transformSync(code: String, opts: Options): Output = js.native
  def transformSync(code: String, opts: Options, experimental_plugin_bytes_resolver: Any): Output = js.native
  def transformSync(code: Program): Output = js.native
  def transformSync(code: Program, opts: Unit, experimental_plugin_bytes_resolver: Any): Output = js.native
  def transformSync(code: Program, opts: Options): Output = js.native
  def transformSync(code: Program, opts: Options, experimental_plugin_bytes_resolver: Any): Output = js.native
}
