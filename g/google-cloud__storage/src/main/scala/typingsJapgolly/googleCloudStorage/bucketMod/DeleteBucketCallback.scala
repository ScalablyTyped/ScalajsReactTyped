package typingsJapgolly.googleCloudStorage.bucketMod

import typingsJapgolly.googleCloudCommon.serviceObjectMod.DeleteCallback
import typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
  def apply(err: Error, apiResponse: Metadata): Unit = js.native
}

