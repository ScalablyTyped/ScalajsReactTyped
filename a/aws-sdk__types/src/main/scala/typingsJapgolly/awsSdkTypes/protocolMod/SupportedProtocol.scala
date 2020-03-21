package typingsJapgolly.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.json
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`rest-json`
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`rest-xml`
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.query
  - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.ec2
*/
trait SupportedProtocol extends js.Object

object SupportedProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ec2: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.ec2 = this.cast("ec2")
  @scala.inline
  def json: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.json = this.cast("json")
  @scala.inline
  def query: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.query = this.cast("query")
  @scala.inline
  def `rest-json`: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`rest-json` = this.cast("rest-json")
  @scala.inline
  def `rest-xml`: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.`rest-xml` = this.cast("rest-xml")
}

