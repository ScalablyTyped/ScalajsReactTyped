package typingsJapgolly.sentryNode

import typingsJapgolly.sentryCore.mod.BaseClient
import typingsJapgolly.sentryCore.mod.Scope
import typingsJapgolly.sentryHub.mod.SessionFlusher
import typingsJapgolly.sentryNode.typesTypesMod.NodeClientOptions
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @JSImport("@sentry/node/types/client", "NodeClient")
  @js.native
  open class NodeClient protected () extends BaseClient[NodeClientOptions] {
    /**
      * Creates a new Node SDK instance.
      * @param options Configuration options for this SDK.
      */
    def this(options: NodeClientOptions) = this()
    
    /**
      * Method responsible for capturing/ending a request session by calling `incrementSessionStatusCount` to increment
      * appropriate session aggregates bucket
      */
    /* protected */ def _captureRequestSession(): Unit = js.native
    
    /* protected */ def _prepareEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[Event | Null] = js.native
    
    /* protected */ var _sessionFlusher: js.UndefOr[SessionFlusher] = js.native
    
    def captureEvent(event: Event, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureEvent(event: Event, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    def captureException(exception: Any, hint: Unit, scope: Scope): js.UndefOr[String] = js.native
    def captureException(exception: Any, hint: EventHint, scope: Scope): js.UndefOr[String] = js.native
    
    /** Method that initialises an instance of SessionFlusher on Client */
    def initSessionFlusher(): Unit = js.native
  }
}
