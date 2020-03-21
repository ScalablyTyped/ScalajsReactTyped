package typingsJapgolly.pulumiKubernetes.outputMod.node.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overhead structure represents the resource overhead associated with running a pod.
  */
trait Overhead extends js.Object {
  /**
    * PodFixed represents the fixed resource overhead associated with running a pod.
    */
  val podFixed: js.Object
}

object Overhead {
  @scala.inline
  def apply(podFixed: js.Object): Overhead = {
    val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Overhead]
  }
}

