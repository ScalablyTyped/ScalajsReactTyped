package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropState
import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
import typingsJapgolly.interactjsTypes.coreTypesMod.Target
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@interactjs/types", "DropEvent")
  @js.native
  open class DropEvent protected ()
    extends typingsJapgolly.interactjsTypes.indexMod.DropEvent {
    /**
      * Class of events fired on dropzones during drags with acceptable targets.
      */
    def this(dropState: DropState, dragEvent: InteractEvent[drag, EventPhase], `type`: String) = this()
  }
  
  @JSImport("@interactjs/types", "Interactable")
  @js.native
  open class Interactable protected ()
    extends typingsJapgolly.interactjsTypes.indexMod.Interactable {
    /** */
    def this(
      target: Target,
      options: Any,
      defaultContext: Document,
      scopeEvents: ReturnType[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof install */ Any
          ]
    ) = this()
    def this(
      target: Target,
      options: Any,
      defaultContext: Element,
      scopeEvents: ReturnType[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof install */ Any
          ]
    ) = this()
  }
  
  @JSImport("@interactjs/types", "PointerEvent")
  @js.native
  open class PointerEvent[T /* <: String */] protected ()
    extends typingsJapgolly.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[T] {
    /** */
    def this(
      `type`: T,
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    def this(
      `type`: T,
      pointer: typingsJapgolly.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[Any],
      event: PointerEventType,
      eventTarget: Node,
      interaction: Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
  }
}
