package typingsJapgolly.jestCore

import typingsJapgolly.jestCore.searchSourceMod.default
import typingsJapgolly.jestCore.testSchedulerMod.TestSchedulerContext
import typingsJapgolly.jestCore.testSchedulerMod.TestSchedulerOptions
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected () extends default {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsJapgolly.jestCore.testSchedulerMod.default {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsJapgolly.jestCore.testWatcherMod.default {
    def this(hasIsWatchMode: AnonIsWatchMode) = this()
  }
  
  def getVersion(): String = js.native
  def runCLI(argv: ArgumentsPartialallboolea, projects: js.Array[String]): js.Promise[AnonGlobalConfig] = js.native
}

