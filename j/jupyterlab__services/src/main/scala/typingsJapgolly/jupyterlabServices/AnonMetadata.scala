package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var data: IMimeBundle
  var execution_count: ExecutionCount
  var metadata: OutputMetadata
  var transient: js.UndefOr[AnonDisplayid] = js.undefined
}

object AnonMetadata {
  @scala.inline
  def apply(
    data: IMimeBundle,
    metadata: OutputMetadata,
    execution_count: Int | Double = null,
    transient: AnonDisplayid = null
  ): AnonMetadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    if (transient != null) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetadata]
  }
}

