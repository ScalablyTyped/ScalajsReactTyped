package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/session-description-handler-factory", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerFactoryMod extends js.Object {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ Session, 
    /* options */ js.UndefOr[js.Object], 
    SessionDescriptionHandler
  ]
}

