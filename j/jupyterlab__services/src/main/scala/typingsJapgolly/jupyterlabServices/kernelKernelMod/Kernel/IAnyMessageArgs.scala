package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import typingsJapgolly.jupyterlabServices.ReadonlyIMessageMessageTy
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.recv
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments interface for the anyMessage signal.
  */
trait IAnyMessageArgs extends js.Object {
  /**
    * The direction of the message.
    */
  var direction: send | recv
  /**
    * The message that is being signaled.
    */
  var msg: ReadonlyIMessageMessageTy
}

object IAnyMessageArgs {
  @scala.inline
  def apply(direction: send | recv, msg: ReadonlyIMessageMessageTy): IAnyMessageArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnyMessageArgs]
  }
}

