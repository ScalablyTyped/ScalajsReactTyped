package typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
  */
trait AllowedFlexVolume extends js.Object {
  /**
    * driver is the name of the Flexvolume driver.
    */
  var driver: Input[String]
}

object AllowedFlexVolume {
  @scala.inline
  def apply(driver: Input[String]): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllowedFlexVolume]
  }
}

