package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.fileContainerInterfacesMod.FileContainer
import typingsJapgolly.vsoNodeApi.fileContainerInterfacesMod.FileContainerItem
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/FileContainerApiBase", JSImport.Namespace)
@js.native
object fileContainerApiBaseMod extends js.Object {
  @js.native
  class FileContainerApiBase protected () extends IFileContainerApiBase {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IFileContainerApiBase extends ClientApiBase {
    def createItems(items: VssJsonCollectionWrapperV[js.Array[FileContainerItem]], containerId: Double): js.Promise[js.Array[FileContainerItem]] = js.native
    def createItems(items: VssJsonCollectionWrapperV[js.Array[FileContainerItem]], containerId: Double, scope: String): js.Promise[js.Array[FileContainerItem]] = js.native
    def deleteItem(containerId: Double, itemPath: String): js.Promise[Unit] = js.native
    def deleteItem(containerId: Double, itemPath: String, scope: String): js.Promise[Unit] = js.native
    def getContainers(): js.Promise[js.Array[FileContainer]] = js.native
    def getContainers(scope: String): js.Promise[js.Array[FileContainer]] = js.native
    def getContainers(scope: String, artifactUris: String): js.Promise[js.Array[FileContainer]] = js.native
    def getItems(
      containerId: Double,
      scope: js.UndefOr[String],
      itemPath: js.UndefOr[String],
      metadata: js.UndefOr[Boolean],
      format: js.UndefOr[String],
      downloadFileName: js.UndefOr[String],
      includeDownloadTickets: js.UndefOr[Boolean],
      isShallow: js.UndefOr[Boolean]
    ): js.Promise[js.Array[FileContainerItem]] = js.native
  }
  
}

