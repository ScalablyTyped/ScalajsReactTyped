package typingsJapgolly.jupyterlabRunning.mod.RunningSessions

import typingsJapgolly.jupyterlabServices.libManagerMod.ServiceManager.IManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a running sessions widget.
  */
trait IOptions extends js.Object {
  /**
    * A service manager instance.
    */
  var manager: IManager
}

object IOptions {
  @scala.inline
  def apply(manager: IManager): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

