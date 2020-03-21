package typingsJapgolly.jupyterlabStatusbar.runningSessionsMod.RunningSessions

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a RunningSessions item.
  */
trait IOptions extends js.Object {
  /**
    * The application service manager.
    */
  var serviceManager: ServiceManager
  /**
    * A click handler for the item. By defult this is used
    * to activate the running sessions side panel.
    */
  def onClick(): Unit
}

object IOptions {
  @scala.inline
  def apply(onClick: Callback, serviceManager: ServiceManager): IOptions = {
    val __obj = js.Dynamic.literal(serviceManager = serviceManager.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[IOptions]
  }
}

