package typingsJapgolly.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Client States for {@link ClientContext.getClientState clientContext.getClientState()}.
  * @see {@link XrmEnum.ClientState}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.Online
  - typingsJapgolly.xrm.xrmStrings.Offline
*/
trait ClientState extends js.Object

object ClientState {
  @scala.inline
  def Offline: typingsJapgolly.xrm.xrmStrings.Offline = this.cast("Offline")
  @scala.inline
  def Online: typingsJapgolly.xrm.xrmStrings.Online = this.cast("Online")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

