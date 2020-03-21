package typingsJapgolly.jestCli

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jestCore.AnonIsWatchMode
import typingsJapgolly.jestCore.testSchedulerMod.TestSchedulerContext
import typingsJapgolly.jestCore.testSchedulerMod.TestSchedulerOptions
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-cli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SearchSource protected ()
    extends typingsJapgolly.jestCore.mod.SearchSource {
    def this(context: Context) = this()
  }
  
  @js.native
  class TestScheduler protected ()
    extends typingsJapgolly.jestCore.mod.TestScheduler {
    def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  }
  
  @js.native
  class TestWatcher protected ()
    extends typingsJapgolly.jestCore.mod.TestWatcher {
    def this(hasIsWatchMode: AnonIsWatchMode) = this()
  }
  
  var getVersion: js.Function0[String] = js.native
  var run: js.Function2[
    /* maybeArgv */ js.UndefOr[js.Array[String]], 
    /* project */ js.UndefOr[Path], 
    js.Promise[Unit]
  ] = js.native
  def runCLI(argv: ArgumentsPartialallboolea, projects: js.Array[String]): js.Promise[AnonGlobalConfig] = js.native
  @js.native
  object SearchSource
    extends TopLevel[Instantiable1[/* context */ Context, typingsJapgolly.jestCore.mod.SearchSource]]
  
  @js.native
  object TestScheduler
    extends TopLevel[
          Instantiable3[
            /* globalConfig */ GlobalConfig, 
            /* options */ TestSchedulerOptions, 
            /* context */ TestSchedulerContext, 
            typingsJapgolly.jestCore.mod.TestScheduler
          ]
        ]
  
  @js.native
  object TestWatcher
    extends TopLevel[
          Instantiable1[/* hasIsWatchMode */ AnonIsWatchMode, typingsJapgolly.jestCore.mod.TestWatcher]
        ]
  
}

