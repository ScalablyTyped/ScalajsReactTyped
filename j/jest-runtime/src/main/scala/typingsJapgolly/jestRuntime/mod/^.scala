package typingsJapgolly.jestRuntime.mod

import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestHasteMap.mod.ModuleMap
import typingsJapgolly.jestRuntime.AnonConsole
import typingsJapgolly.jestRuntime.Recordcacheconfigdebugver
import typingsJapgolly.jestTypes.configMod.Argv
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(config: ProjectConfig, environment: JestEnvironment, resolver: typingsJapgolly.jestResolve.mod.^) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsJapgolly.jestResolve.mod.^,
    cacheFS: CacheFS
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typingsJapgolly.jestResolve.mod.^,
    cacheFS: CacheFS,
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ScriptTransformer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScriptTransformer */ js.Any = js.native
  def createContext(config: ProjectConfig, options: AnonConsole): js.Promise[typingsJapgolly.jestRuntime.typesMod.Context] = js.native
  def createHasteMap(config: ProjectConfig): typingsJapgolly.jestHasteMap.mod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typingsJapgolly.jestHasteMap.mod.^ = js.native
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typingsJapgolly.jestResolve.mod.^ = js.native
  def getCLIOptions(): Recordcacheconfigdebugver = js.native
  def runCLI(): Unit = js.native
  def runCLI(args: Argv): Unit = js.native
  def runCLI(args: Argv, info: js.Array[String]): Unit = js.native
  def shouldInstrument(
    filename: Path,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any,
    config: ProjectConfig
  ): Boolean = js.native
}

