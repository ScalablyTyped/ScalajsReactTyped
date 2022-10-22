package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropState
import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
import typingsJapgolly.interactjsTypes.coreTypesMod.Target
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@interactjs/types/index", "DropEvent")
  @js.native
  open class DropEvent protected ()
    extends typingsJapgolly.interactjsTypes.actionsDropDropEventMod.DropEvent {
    /**
      * Class of events fired on dropzones during drags with acceptable targets.
      */
    def this(
      dropState: DropState,
      dragEvent: typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent[drag, EventPhase],
      `type`: String
    ) = this()
  }
  
  @JSImport("@interactjs/types/index", "Interactable")
  @js.native
  open class Interactable protected ()
    extends typingsJapgolly.interactjsTypes.coreInteractableMod.Interactable {
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
  
  @JSImport("@interactjs/types/index", "PointerEvent")
  @js.native
  open class PointerEvent[T /* <: String */] protected ()
    extends typingsJapgolly.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[T] {
    /** */
    def this(
      `type`: T,
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: Node,
      interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    def this(
      `type`: T,
      pointer: typingsJapgolly.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[Any],
      event: PointerEventType,
      eventTarget: Node,
      interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
  }
  
  type ActionProps[T /* <: ActionName */] = typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps[T]
  
  type InteractEvent[T /* <: ActionName */, P /* <: EventPhase */] = typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent[T, P]
  
  type Interaction[T /* <: ActionName */] = typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[T]
  
  type InteractionProxy[T /* <: ActionName */] = typingsJapgolly.interactjsTypes.coreInteractionMod.InteractionProxy[T]
  
  type PointerArgProps[T /* <: js.Object */] = typingsJapgolly.interactjsTypes.coreInteractionMod.PointerArgProps[T]
}
