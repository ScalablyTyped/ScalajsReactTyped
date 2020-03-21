package typingsJapgolly.bagpipes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeworksOptions extends js.Object {
  /**
    * Adds to the pre and post queues, respectively.
    * Ensures a pipe gets fitted before or after the main execution pipeline.
    */
  var affinity: Affinity
}

object PipeworksOptions {
  @scala.inline
  def apply(affinity: Affinity): PipeworksOptions = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipeworksOptions]
  }
}

