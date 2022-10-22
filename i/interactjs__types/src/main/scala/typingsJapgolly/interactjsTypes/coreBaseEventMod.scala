package typingsJapgolly.interactjsTypes

import org.scalajs.dom.EventTarget
import org.scalajs.dom.Node
import typingsJapgolly.interactjsTypes.anon.InteractableActions
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.coreInteractionMod.InteractionProxy
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreBaseEventMod {
  
  @JSImport("@interactjs/core/BaseEvent", "BaseEvent")
  @js.native
  open class BaseEvent[T /* <: ActionName | Null */] protected () extends StObject {
    def this(interaction: Interaction[T]) = this()
    
    var _interaction: Interaction[T] = js.native
    
    var currentTarget: Node = js.native
    
    var immediatePropagationStopped: Boolean = js.native
    
    var interactable: InteractableActions = js.native
    
    var interaction: InteractionProxy[T] = js.native
    
    def preventDefault(): Unit = js.native
    
    var propagationStopped: Boolean = js.native
    
    /**
      * Don't call listeners on the remaining targets
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * Don't call any other listeners (even on the current target)
      */
    def stopPropagation(): Unit = js.native
    
    var target: EventTarget = js.native
    
    var timeStamp: Double = js.native
    
    var `type`: String = js.native
  }
}
