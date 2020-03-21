package typingsJapgolly.pulumiAws.parameterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.String
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.StringList
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.SecureString
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def SecureString: typingsJapgolly.pulumiAws.pulumiAwsStrings.SecureString = this.cast("SecureString")
  @scala.inline
  def String: typingsJapgolly.pulumiAws.pulumiAwsStrings.String = this.cast("String")
  @scala.inline
  def StringList: typingsJapgolly.pulumiAws.pulumiAwsStrings.StringList = this.cast("StringList")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

