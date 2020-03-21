package typingsJapgolly.activexMsxml2.MSXML2

import typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`13056`
import typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`256`
import typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`4096`
import typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`512`
import typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`8192`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags for SXH_OPTION_IGNORE_SERVER_SSL_CERT_ERROR_FLAGS option */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`13056`
  - typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`4096`
  - typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`8192`
  - typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`256`
  - typingsJapgolly.activexMsxml2.activexMsxml2Numbers.`512`
*/
trait SXH_SERVER_CERT_OPTION extends js.Object

object SXH_SERVER_CERT_OPTION {
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_ALL_SERVER_ERRORS: `13056` = this.cast(13056)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_CERT_CN_INVALID: `4096` = this.cast(4096)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_CERT_DATE_INVALID: `8192` = this.cast(8192)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_UNKNOWN_CA: `256` = this.cast(256)
  @scala.inline
  def SXH_SERVER_CERT_IGNORE_WRONG_USAGE: `512` = this.cast(512)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

