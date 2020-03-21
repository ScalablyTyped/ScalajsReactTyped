package typingsJapgolly.cosmiconfig

import typingsJapgolly.cosmiconfig.mod.Loader
import typingsJapgolly.cosmiconfig.typesMod.Cache
import typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult
import typingsJapgolly.cosmiconfig.typesMod.ExplorerOptions
import typingsJapgolly.cosmiconfig.typesMod.ExplorerOptionsSync
import typingsJapgolly.cosmiconfig.typesMod.LoadedFileContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/ExplorerBase", JSImport.Namespace)
@js.native
object explorerBaseMod extends js.Object {
  @js.native
  class ExplorerBase[T /* <: ExplorerOptions | ExplorerOptionsSync */] protected () extends js.Object {
    def this(options: T) = this()
    val config: T = js.native
    val loadCache: js.UndefOr[Cache] = js.native
    var loadPackageProp: js.Any = js.native
    val searchCache: js.UndefOr[Cache] = js.native
    var validateConfig: js.Any = js.native
    def clearCaches(): Unit = js.native
    def clearLoadCache(): Unit = js.native
    def clearSearchCache(): Unit = js.native
    /* protected */ def getLoaderEntryForFile(filepath: String): Loader = js.native
    /* protected */ def loadedContentToCosmiconfigResult(filepath: String, loadedContent: LoadedFileContent): CosmiconfigResult = js.native
    /* protected */ def nextDirectoryToSearch(currentDir: String, currentResult: CosmiconfigResult): String | Null = js.native
    /* protected */ def shouldSearchStopWithResult(result: CosmiconfigResult): Boolean = js.native
    /* protected */ def validateFilePath(filepath: String): Unit = js.native
  }
  
  def getExtensionDescription(filepath: String): String = js.native
}

