package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiBooleans.`false`
  - typingsJapgolly.hapiHapi.hapiHapiStrings.None
  - typingsJapgolly.hapiHapi.hapiHapiStrings.Lax
  - typingsJapgolly.hapiHapi.hapiHapiStrings.Strict
*/
trait SameSitePolicy extends js.Object

object SameSitePolicy {
  @scala.inline
  def Lax: typingsJapgolly.hapiHapi.hapiHapiStrings.Lax = this.cast("Lax")
  @scala.inline
  def None: typingsJapgolly.hapiHapi.hapiHapiStrings.None = this.cast("None")
  @scala.inline
  def Strict: typingsJapgolly.hapiHapi.hapiHapiStrings.Strict = this.cast("Strict")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsJapgolly.hapiHapi.hapiHapiBooleans.`false` = this.cast(false)
}

