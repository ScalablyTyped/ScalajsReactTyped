package typingsJapgolly.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotDeleteRepositoryParams extends GenericParams {
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var repository: String
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object SnapshotDeleteRepositoryParams {
  @scala.inline
  def apply(
    repository: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    timeout: TimeSpan = null
  ): SnapshotDeleteRepositoryParams = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDeleteRepositoryParams]
  }
}

