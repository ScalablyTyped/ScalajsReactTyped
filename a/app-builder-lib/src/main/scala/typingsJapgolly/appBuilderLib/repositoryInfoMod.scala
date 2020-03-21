package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.coreMod.SourceRepositoryInfo
import typingsJapgolly.appBuilderLib.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/repositoryInfo", JSImport.Namespace)
@js.native
object repositoryInfoMod extends js.Object {
  def getRepositoryInfo(projectDir: String): js.Promise[SourceRepositoryInfo | Null] = js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
  def getRepositoryInfo(projectDir: String, metadata: Metadata, devMetadata: Metadata): js.Promise[SourceRepositoryInfo | Null] = js.native
}

