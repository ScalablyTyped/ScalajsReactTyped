package typingsJapgolly.jupyterlabApplication.layoutrestorerMod.LayoutRestorer

import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsJapgolly.phosphorCommands.mod.CommandRegistry
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for layout restorer instantiation.
  */
trait IOptions extends js.Object {
  /**
    * The data connector used for layout saving and fetching.
    */
  var connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String]
  /**
    * The initial promise that has to be resolved before restoration.
    *
    * #### Notes
    * This promise should equal the JupyterLab application `started` notifier.
    */
  var first: js.Promise[_]
  /**
    * The application command registry.
    */
  var registry: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(
    connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String],
    first: js.Promise[_],
    registry: CommandRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

