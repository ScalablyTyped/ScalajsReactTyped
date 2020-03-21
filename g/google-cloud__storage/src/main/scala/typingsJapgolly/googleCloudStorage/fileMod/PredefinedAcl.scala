package typingsJapgolly.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.authenticatedRead
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.`private`
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.projectPrivate
  - typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.publicRead = this.cast("publicRead")
}

