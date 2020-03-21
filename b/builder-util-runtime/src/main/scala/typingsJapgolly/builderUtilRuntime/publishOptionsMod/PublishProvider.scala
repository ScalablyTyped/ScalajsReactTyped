package typingsJapgolly.builderUtilRuntime.publishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.github
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.bintray
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.s3
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.spaces
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.generic
  - typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.custom
*/
trait PublishProvider extends js.Object

object PublishProvider {
  @scala.inline
  def bintray: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.bintray = this.cast("bintray")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.custom = this.cast("custom")
  @scala.inline
  def generic: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.generic = this.cast("generic")
  @scala.inline
  def github: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.github = this.cast("github")
  @scala.inline
  def s3: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.s3 = this.cast("s3")
  @scala.inline
  def spaces: typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.spaces = this.cast("spaces")
}

