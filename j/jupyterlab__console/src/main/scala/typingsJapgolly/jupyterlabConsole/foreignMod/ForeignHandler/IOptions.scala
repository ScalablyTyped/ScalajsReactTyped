package typingsJapgolly.jupyterlabConsole.foreignMod.ForeignHandler

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a foreign handler.
  */
trait IOptions extends js.Object {
  /**
    * The parent into which the handler will inject code cells.
    */
  var parent: IReceiver
  /**
    * The client session used by the foreign handler.
    */
  var session: IClientSession
}

object IOptions {
  @scala.inline
  def apply(parent: IReceiver, session: IClientSession): IOptions = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

