package typingsJapgolly.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.adalAngular.adalAngularStrings.LOGIN
  - typingsJapgolly.adalAngular.adalAngularStrings.RENEW_TOKEN
  - typingsJapgolly.adalAngular.adalAngularStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typingsJapgolly.adalAngular.adalAngularStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typingsJapgolly.adalAngular.adalAngularStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typingsJapgolly.adalAngular.adalAngularStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

