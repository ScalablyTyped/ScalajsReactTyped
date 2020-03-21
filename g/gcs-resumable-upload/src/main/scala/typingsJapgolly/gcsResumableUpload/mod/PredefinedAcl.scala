package typingsJapgolly.gcsResumableUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.`private`
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate
  - typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typingsJapgolly.gcsResumableUpload.gcsResumableUploadStrings.publicRead = this.cast("publicRead")
}

