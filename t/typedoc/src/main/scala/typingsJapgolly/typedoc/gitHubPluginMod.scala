package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.converterConverterMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", JSImport.Namespace)
@js.native
object gitHubPluginMod extends js.Object {
  @js.native
  class GitHubPlugin () extends AbstractComponent[Converter] {
    var getRepository: js.Any = js.native
    var gitRevision: String = js.native
    var ignoredPaths: js.Any = js.native
    var onEndResolve: js.Any = js.native
    var repositories: js.Any = js.native
  }
  
  @js.native
  class Repository protected () extends js.Object {
    def this(path: String, gitRevision: String, repoLinks: js.Array[String]) = this()
    var branch: String = js.native
    var files: js.Array[String] = js.native
    var gitHubHostname: String = js.native
    var gitHubProject: js.UndefOr[String] = js.native
    var gitHubUser: js.UndefOr[String] = js.native
    var path: String = js.native
    def contains(fileName: String): Boolean = js.native
    def getGitHubURL(fileName: String): js.UndefOr[String] = js.native
  }
  
  /* static members */
  @js.native
  object Repository extends js.Object {
    def tryCreateRepository(path: String, gitRevision: String): js.UndefOr[Repository] = js.native
  }
  
}

