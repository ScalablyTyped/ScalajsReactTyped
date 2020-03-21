package typingsJapgolly.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerSchemaChangePolicy extends js.Object {
  /**
    * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
    */
  var deleteBehavior: js.UndefOr[String] = js.native
  /**
    * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
    */
  var updateBehavior: js.UndefOr[String] = js.native
}

object CrawlerSchemaChangePolicy {
  @scala.inline
  def apply(deleteBehavior: String = null, updateBehavior: String = null): CrawlerSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior.asInstanceOf[js.Any])
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerSchemaChangePolicy]
  }
}

