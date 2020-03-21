package typingsJapgolly.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployments extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDeployment] = js.native
  var position: js.UndefOr[String] = js.native
}

object Deployments {
  @scala.inline
  def apply(items: ListOfDeployment = null, position: String = null): Deployments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployments]
  }
}

