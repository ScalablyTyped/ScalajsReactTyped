package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclNumbers.`0x0900`
import typingsJapgolly.webcl.webclNumbers.`0x0901`
import typingsJapgolly.webcl.webclNumbers.`0x0902`
import typingsJapgolly.webcl.webclNumbers.`0x0903`
import typingsJapgolly.webcl.webclNumbers.`0x0904`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_platforinfo */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclNumbers.`0x0900`
  - typingsJapgolly.webcl.webclNumbers.`0x0901`
  - typingsJapgolly.webcl.webclNumbers.`0x0902`
  - typingsJapgolly.webcl.webclNumbers.`0x0903`
  - typingsJapgolly.webcl.webclNumbers.`0x0904`
*/
trait PlatformInfo extends js.Object

object PlatformInfo {
  @scala.inline
  def PLATFORM_EXTENSIONS: `0x0904` = this.cast(0x0904)
  @scala.inline
  def PLATFORM_NAME: `0x0902` = this.cast(0x0902)
  @scala.inline
  def PLATFORM_PROFILE: `0x0900` = this.cast(0x0900)
  @scala.inline
  def PLATFORM_VENDOR: `0x0903` = this.cast(0x0903)
  @scala.inline
  def PLATFORM_VERSION: `0x0901` = this.cast(0x0901)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

