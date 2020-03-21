package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.RSA
  - typingsJapgolly.jose.joseStrings.EC
  - typingsJapgolly.jose.joseStrings.OKP
  - typingsJapgolly.jose.joseStrings.oct
*/
trait keyType extends js.Object

object keyType {
  @scala.inline
  def EC: typingsJapgolly.jose.joseStrings.EC = this.cast("EC")
  @scala.inline
  def OKP: typingsJapgolly.jose.joseStrings.OKP = this.cast("OKP")
  @scala.inline
  def RSA: typingsJapgolly.jose.joseStrings.RSA = this.cast("RSA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def oct: typingsJapgolly.jose.joseStrings.oct = this.cast("oct")
}

