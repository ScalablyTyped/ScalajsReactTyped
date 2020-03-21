package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
trait ContainerStateTerminated extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  val containerID: String
  /**
    * Exit status from the last termination of the container
    */
  val exitCode: Double
  /**
    * Time at which the container last terminated
    */
  val finishedAt: String
  /**
    * Message regarding the last termination of the container
    */
  val message: String
  /**
    * (brief) reason from the last termination of the container
    */
  val reason: String
  /**
    * Signal from the last termination of the container
    */
  val signal: Double
  /**
    * Time at which previous execution of the container started
    */
  val startedAt: String
}

object ContainerStateTerminated {
  @scala.inline
  def apply(
    containerID: String,
    exitCode: Double,
    finishedAt: String,
    message: String,
    reason: String,
    signal: Double,
    startedAt: String
  ): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerStateTerminated]
  }
}

