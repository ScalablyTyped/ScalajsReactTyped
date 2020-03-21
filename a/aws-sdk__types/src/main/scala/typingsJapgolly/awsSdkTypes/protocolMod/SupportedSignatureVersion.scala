package typingsJapgolly.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.v4
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.s3
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.s3v4
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body`
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.none
*/
trait SupportedSignatureVersion extends js.Object

object SupportedSignatureVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.none = this.cast("none")
  @scala.inline
  def s3: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.s3 = this.cast("s3")
  @scala.inline
  def s3v4: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.s3v4 = this.cast("s3v4")
  @scala.inline
  def v4: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.v4 = this.cast("v4")
  @scala.inline
  def `v4-unsigned-body`: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body` = this.cast("v4-unsigned-body")
}

