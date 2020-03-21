package typingsJapgolly.pulumiAws.tenancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.default
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.dedicated
*/
trait Tenancy extends js.Object

object Tenancy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typingsJapgolly.pulumiAws.pulumiAwsStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def default: typingsJapgolly.pulumiAws.pulumiAwsStrings.default = this.cast("default")
}

