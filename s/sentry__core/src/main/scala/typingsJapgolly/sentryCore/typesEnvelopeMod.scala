package typingsJapgolly.sentryCore

import typingsJapgolly.sentryTypes.typesDsnMod.DsnComponents
import typingsJapgolly.sentryTypes.typesEnvelopeMod.EventEnvelope
import typingsJapgolly.sentryTypes.typesEnvelopeMod.SessionEnvelope
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typingsJapgolly.sentryTypes.typesSessionMod.Session
import typingsJapgolly.sentryTypes.typesSessionMod.SessionAggregates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvelopeMod {
  
  @JSImport("@sentry/core/types/envelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEventEnvelope(event: Event, dsn: DsnComponents): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: Unit, tunnel: String): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: SdkMetadata): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: Unit, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: SdkMetadata): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: Unit, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: SdkMetadata): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
}
