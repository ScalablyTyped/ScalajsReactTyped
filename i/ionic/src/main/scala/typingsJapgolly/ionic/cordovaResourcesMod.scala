package typingsJapgolly.ionic

import typingsJapgolly.ionic.cordovaConfigMod.CordovaConfig
import typingsJapgolly.ionic.definitionsMod.ImageResource
import typingsJapgolly.ionic.definitionsMod.ImageResourceTransformResult
import typingsJapgolly.ionic.definitionsMod.ImageUploadResponse
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionic.definitionsMod.KnownPlatform
import typingsJapgolly.ionic.definitionsMod.ResourcesConfig
import typingsJapgolly.ionic.definitionsMod.SourceImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/resources", JSImport.Namespace)
@js.native
object cordovaResourcesMod extends js.Object {
  val RESOURCES: ResourcesConfig = js.native
  def addResourcesToConfigXml(conf: CordovaConfig, platformList: js.Array[KnownPlatform], resourceJson: ResourcesConfig): js.Promise[Unit] = js.native
  def createImgDestinationDirectories(imgResources: js.Array[ImageResource]): js.Promise[js.Array[Unit]] = js.native
  def findMostSpecificSourceImage(imageResource: ImageResource, srcImagesAvailable: js.Array[SourceImage]): js.UndefOr[SourceImage] = js.native
  def getImageResources(projectDir: String): js.Array[ImageResource] = js.native
  def getSourceImages(projectDir: String, buildPlatforms: js.Array[String], resourceTypes: js.Array[String]): js.Promise[js.Array[SourceImage]] = js.native
  def transformResourceImage(env: IonicEnvironment, resource: ImageResource): js.Promise[ImageResourceTransformResult] = js.native
  def uploadSourceImage(env: IonicEnvironment, srcImage: SourceImage): js.Promise[ImageUploadResponse] = js.native
}

