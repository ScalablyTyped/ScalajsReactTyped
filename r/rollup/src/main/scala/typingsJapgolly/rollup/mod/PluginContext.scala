package typingsJapgolly.rollup.mod

import typingsJapgolly.rollup.anon.Assertions
import typingsJapgolly.rollup.anon.Column
import typingsJapgolly.rollup.anon.idstringresolveDependenci
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginContext
  extends StObject
     with MinimalPluginContext {
  
  def addWatchFile(id: String): Unit = js.native
  
  var cache: PluginCache = js.native
  
  def emitFile(emittedFile: EmittedFile): String = js.native
  @JSName("emitFile")
  var emitFile_Original: EmitFile = js.native
  
  def error(error: String): scala.Nothing = js.native
  def error(error: String, pos: Double): scala.Nothing = js.native
  def error(error: String, pos: Column): scala.Nothing = js.native
  def error(error: RollupError): scala.Nothing = js.native
  def error(error: RollupError, pos: Double): scala.Nothing = js.native
  def error(error: RollupError, pos: Column): scala.Nothing = js.native
  
  def getFileName(fileReferenceId: String): String = js.native
  
  def getModuleIds(): IterableIterator[String] = js.native
  
  def getModuleInfo(moduleId: String): ModuleInfo | Null = js.native
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo = js.native
  
  def getWatchFiles(): js.Array[String] = js.native
  
  def load(options: idstringresolveDependenci): js.Promise[ModuleInfo] = js.native
  
  /** @deprecated Use `this.getModuleIds` instead */
  var moduleIds: IterableIterator[String] = js.native
  
  def parse(input: String): AcornNode = js.native
  def parse(input: String, options: Any): AcornNode = js.native
  
  def resolve(source: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: String, options: Assertions): js.Promise[ResolvedId | Null] = js.native
  def resolve(source: String, importer: Unit, options: Assertions): js.Promise[ResolvedId | Null] = js.native
  
  def setAssetSource(assetReferenceId: String, source: String): Unit = js.native
  def setAssetSource(assetReferenceId: String, source: js.typedarray.Uint8Array): Unit = js.native
  
  def warn(warning: String): Unit = js.native
  def warn(warning: String, pos: Double): Unit = js.native
  def warn(warning: String, pos: Column): Unit = js.native
  def warn(warning: RollupWarning): Unit = js.native
  def warn(warning: RollupWarning, pos: Double): Unit = js.native
  def warn(warning: RollupWarning, pos: Column): Unit = js.native
}
