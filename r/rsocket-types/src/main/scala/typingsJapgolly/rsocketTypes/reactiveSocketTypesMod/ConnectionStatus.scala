package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import typingsJapgolly.rsocketTypes.rsocketTypesStrings.CLOSED
import typingsJapgolly.rsocketTypes.rsocketTypesStrings.CONNECTED
import typingsJapgolly.rsocketTypes.rsocketTypesStrings.CONNECTING
import typingsJapgolly.rsocketTypes.rsocketTypesStrings.ERROR
import typingsJapgolly.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rsocketTypes.AnonKind
  - typingsJapgolly.rsocketTypes.Anon0
  - typingsJapgolly.rsocketTypes.Anon1
  - typingsJapgolly.rsocketTypes.Anon2
  - typingsJapgolly.rsocketTypes.AnonError
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def AnonKind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon2(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonError(error: js.Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon0(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon1(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
}

