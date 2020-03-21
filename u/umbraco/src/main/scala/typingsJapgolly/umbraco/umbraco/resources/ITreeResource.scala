package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
trait ITreeResource extends js.Object {
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: js.Any): Unit
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): Unit
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): Unit
}

object ITreeResource {
  @scala.inline
  def apply(loadApplication: js.Any => Callback, loadMenu: js.Any => Callback, loadNodes: js.Any => Callback): ITreeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadApplication")(js.Any.fromFunction1((t0: js.Any) => loadApplication(t0).runNow()))
    __obj.updateDynamic("loadMenu")(js.Any.fromFunction1((t0: js.Any) => loadMenu(t0).runNow()))
    __obj.updateDynamic("loadNodes")(js.Any.fromFunction1((t0: js.Any) => loadNodes(t0).runNow()))
    __obj.asInstanceOf[ITreeResource]
  }
}

