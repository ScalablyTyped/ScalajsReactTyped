package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmazonElasticsearchParameters extends js.Object {
  /**
    * The Amazon Elasticsearch Service domain.
    */
  var Domain: typingsJapgolly.awsSdk.quicksightMod.Domain = js.native
}

object AmazonElasticsearchParameters {
  @scala.inline
  def apply(Domain: Domain): AmazonElasticsearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmazonElasticsearchParameters]
  }
}

