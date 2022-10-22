package typingsJapgolly.sentryCore

import typingsJapgolly.sentryCore.anon.OmitSessionContextstarted
import typingsJapgolly.sentryCore.sentryCoreStrings.ok
import typingsJapgolly.sentryTypes.typesSessionMod.Session
import typingsJapgolly.sentryTypes.typesSessionMod.SessionContext
import typingsJapgolly.sentryTypes.typesSessionMod.SessionStatus
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  @JSImport("@sentry/core/types/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closeSession_ok(session: Session, status: Exclude[SessionStatus, ok]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(session.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def makeSession(): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")().asInstanceOf[Session]
  inline def makeSession(context: OmitSessionContextstarted): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")(context.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def updateSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateSession(session: Session, context: SessionContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(session.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
