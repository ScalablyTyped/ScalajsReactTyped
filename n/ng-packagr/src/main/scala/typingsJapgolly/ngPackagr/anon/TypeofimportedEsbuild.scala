package typingsJapgolly.ngPackagr.anon

import typingsJapgolly.esbuild.anon.BuildIncrementalmetafileM
import typingsJapgolly.esbuild.anon.BuildOptionsincrementaltr
import typingsJapgolly.esbuild.anon.BuildOptionsincrementaltrAbsWorkingDir
import typingsJapgolly.esbuild.anon.BuildOptionsmetafiletrue
import typingsJapgolly.esbuild.anon.BuildOptionswritefalse
import typingsJapgolly.esbuild.anon.BuildResultmetafileMetafi
import typingsJapgolly.esbuild.anon.BuildResultoutputFilesArr
import typingsJapgolly.esbuild.mod.AnalyzeMetafileOptions
import typingsJapgolly.esbuild.mod.BuildIncremental
import typingsJapgolly.esbuild.mod.BuildOptions
import typingsJapgolly.esbuild.mod.BuildResult
import typingsJapgolly.esbuild.mod.FormatMessagesOptions
import typingsJapgolly.esbuild.mod.InitializeOptions
import typingsJapgolly.esbuild.mod.Metafile
import typingsJapgolly.esbuild.mod.PartialMessage
import typingsJapgolly.esbuild.mod.ServeOptions
import typingsJapgolly.esbuild.mod.ServeResult
import typingsJapgolly.esbuild.mod.TransformOptions
import typingsJapgolly.esbuild.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedEsbuild extends StObject {
  
  def analyzeMetafile(metafile: String): js.Promise[String] = js.native
  def analyzeMetafile(metafile: String, options: AnalyzeMetafileOptions): js.Promise[String] = js.native
  def analyzeMetafile(metafile: Metafile): js.Promise[String] = js.native
  def analyzeMetafile(metafile: Metafile, options: AnalyzeMetafileOptions): js.Promise[String] = js.native
  
  def analyzeMetafileSync(metafile: String): String = js.native
  def analyzeMetafileSync(metafile: String, options: AnalyzeMetafileOptions): String = js.native
  def analyzeMetafileSync(metafile: Metafile): String = js.native
  def analyzeMetafileSync(metafile: Metafile, options: AnalyzeMetafileOptions): String = js.native
  
  def build(options: BuildOptionsincrementaltr): js.Promise[BuildIncremental] = js.native
  def build(options: BuildOptionsincrementaltrAbsWorkingDir): js.Promise[BuildIncrementalmetafileM] = js.native
  def build(options: BuildOptionsmetafiletrue): js.Promise[BuildResultmetafileMetafi] = js.native
  def build(options: BuildOptionswritefalse): js.Promise[BuildResultoutputFilesArr] = js.native
  def build(options: BuildOptions): js.Promise[BuildResult] = js.native
  
  def buildSync(options: BuildOptionswritefalse): BuildResultoutputFilesArr = js.native
  def buildSync(options: BuildOptions): BuildResult = js.native
  
  def formatMessages(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Promise[js.Array[String]] = js.native
  
  def formatMessagesSync(messages: js.Array[PartialMessage], options: FormatMessagesOptions): js.Array[String] = js.native
  
  def initialize(options: InitializeOptions): js.Promise[Unit] = js.native
  
  def serve(serveOptions: ServeOptions, buildOptions: BuildOptions): js.Promise[ServeResult] = js.native
  
  def transform(input: String): js.Promise[TransformResult] = js.native
  def transform(input: String, options: TransformOptions): js.Promise[TransformResult] = js.native
  def transform(input: js.typedarray.Uint8Array): js.Promise[TransformResult] = js.native
  def transform(input: js.typedarray.Uint8Array, options: TransformOptions): js.Promise[TransformResult] = js.native
  
  def transformSync(input: String): TransformResult = js.native
  def transformSync(input: String, options: TransformOptions): TransformResult = js.native
  
  var version: String = js.native
}
