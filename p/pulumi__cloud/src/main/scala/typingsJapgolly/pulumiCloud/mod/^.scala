package typingsJapgolly.pulumiCloud.mod

import typingsJapgolly.pulumiCloud.apiMod.APIConstructor
import typingsJapgolly.pulumiCloud.bucketMod.BucketConstructor
import typingsJapgolly.pulumiCloud.httpServerMod.HttpServerConstructor
import typingsJapgolly.pulumiCloud.serviceMod.HostPathVolumeConstructor
import typingsJapgolly.pulumiCloud.serviceMod.ServiceConstructor
import typingsJapgolly.pulumiCloud.serviceMod.SharedVolumeConstructor
import typingsJapgolly.pulumiCloud.serviceMod.TaskConstructor
import typingsJapgolly.pulumiCloud.tableMod.TableConstructor
import typingsJapgolly.pulumiCloud.topicMod.TopicConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var API: APIConstructor = js.native
  var Bucket: BucketConstructor = js.native
  var HostPathVolume: HostPathVolumeConstructor = js.native
  var HttpEndpoint: APIConstructor = js.native
  var HttpServer: HttpServerConstructor = js.native
  var Service: ServiceConstructor = js.native
  var SharedVolume: SharedVolumeConstructor = js.native
  var Table: TableConstructor = js.native
  var Task: TaskConstructor = js.native
  var Topic: TopicConstructor = js.native
}

