package typingsJapgolly.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type WatcherFunction = (data: any) => void;
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.socketclusterClient.socketclusterClientStrings.authenticated
  - typingsJapgolly.socketclusterClient.socketclusterClientStrings.unauthenticated
*/
trait AuthStates extends js.Object

object AuthStates {
  @scala.inline
  def authenticated: typingsJapgolly.socketclusterClient.socketclusterClientStrings.authenticated = this.cast("authenticated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unauthenticated: typingsJapgolly.socketclusterClient.socketclusterClientStrings.unauthenticated = this.cast("unauthenticated")
}

