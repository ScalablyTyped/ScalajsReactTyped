package typingsJapgolly.webpack.mod.compilation

import typingsJapgolly.std.Map
import typingsJapgolly.tapable.mod.Tapable
import typingsJapgolly.webpack.AnonBasename
import typingsJapgolly.webpack.AnonJavascript
import typingsJapgolly.webpack.TypeofDependency
import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpack.mod.Logger
import typingsJapgolly.webpack.mod.SortableSet
import typingsJapgolly.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.Compilation")
@js.native
class Compilation () extends Tapable {
  var _modules: Map[_, _] = js.native
  var _preparedEntrypoints: js.Array[_] = js.native
  var additionalChunkAssets: js.Array[_] = js.native
  var assets: js.Any = js.native
  var bail: js.Any = js.native
  var cache: js.Any = js.native
  var children: js.Array[_] = js.native
  var childrenCounters: js.Any = js.native
  var chunkGroups: js.Array[_] = js.native
  var chunkTemplate: ChunkTemplate = js.native
  var chunks: js.Array[_] = js.native
  var compiler: Compiler_ = js.native
  var context: String = js.native
  var contextDependencies: SortableSet[String] = js.native
  var contextTimestamps: Map[String, Double] = js.native
  var dependencyFactories: Map[TypeofDependency, Tapable] = js.native
  var dependencyTemplates: Map[TypeofDependency, Tapable] = js.native
  var entries: js.Array[_] = js.native
  var entrypoints: Map[_, _] = js.native
  var errors: js.Array[_] = js.native
  var fileDependencies: SortableSet[String] = js.native
  var fileTimestamps: Map[String, Double] = js.native
  var hash: js.UndefOr[String] = js.native
  var hooks: CompilationHooks = js.native
  var hotUpdateChunkTemplate: HotUpdateChunkTemplate = js.native
  var inputFileSystem: js.Any = js.native
  var mainTemplate: MainTemplate = js.native
  var missingDependencies: SortableSet[String] = js.native
  var moduleTemplates: AnonJavascript = js.native
  var modules: js.Array[_] = js.native
  var namedChunkGroups: Map[_, _] = js.native
  var namedChunks: Map[_, _] = js.native
  var nextFreeModuleIndex: js.Any = js.native
  var nextFreeModuleIndex2: js.Any = js.native
  var outputOptions: js.Any = js.native
  var outputPath: String = js.native
  var performance: js.Any = js.native
  var profile: js.Any = js.native
  var records: js.Any = js.native
  var requestShortener: js.Any = js.native
  var resolverFactory: js.Any = js.native
  var runtimeTemplate: RuntimeTemplate = js.native
  var usedChunkIds: js.Any = js.native
  var usedModuleIds: js.Any = js.native
  var warnings: js.Array[_] = js.native
  // tslint:disable-next-line:ban-types
  def addEntry(context: js.Any, entry: js.Any, name: js.Any, callback: js.Function): Unit = js.native
  def addModule(module: CompilationModule, cacheGroup: js.Any): js.Any = js.native
  def getLogger(pluginName: String): Logger = js.native
  def getPath(filename: String, data: AnonBasename): String = js.native
  def getStats(): Stats = js.native
  def isChild(): Boolean = js.native
}

