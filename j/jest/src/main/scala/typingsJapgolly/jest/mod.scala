package typingsJapgolly.jest

import typingsJapgolly.jestCore.mod.TestScheduler
import typingsJapgolly.jestCore.mod.TestSchedulerContext
import typingsJapgolly.jestTestResult.mod.TestContext
import typingsJapgolly.jestTypes.mod.Argv
import typingsJapgolly.jestTypes.mod.GlobalConfig
import typingsJapgolly.jestTypes.mod.InitialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest", "SearchSource")
  @js.native
  open class SearchSource protected ()
    extends typingsJapgolly.jestCore.mod.SearchSource {
    def this(context: TestContext) = this()
  }
  
  inline def createTestScheduler(globalConfig: GlobalConfig, context: TestSchedulerContext): js.Promise[TestScheduler] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestScheduler")(globalConfig.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestScheduler]]
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  inline def run(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: js.Array[String], project: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: Unit, project: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def runCLI(argv: Argv, projects: js.Array[String]): js.Promise[typingsJapgolly.jestCore.anon.GlobalConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCLI")(argv.asInstanceOf[js.Any], projects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.jestCore.anon.GlobalConfig]]
  
  type Config = InitialOptions
}
