package typingsJapgolly.reactMdStates

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RippleEvent
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RippleState
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RipplesState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRipplesReducerMod {
  
  @JSImport("@react-md/states/types/ripples/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "CANCEL")
  @js.native
  val CANCEL: /* "CANCEL" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "CREATE")
  @js.native
  val CREATE: /* "CREATE" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "ENTERED")
  @js.native
  val ENTERED: /* "ENTERED" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "RELEASE")
  @js.native
  val RELEASE: /* "RELEASE" */ String = js.native
  
  @JSImport("@react-md/states/types/ripples/reducer", "REMOVE")
  @js.native
  val REMOVE: /* "REMOVE" */ String = js.native
  
  inline def createRippleAction[E /* <: HTMLElement */](event: RippleEvent[E], disableSpacebarClick: Boolean): CreateAction[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRippleAction")(event.asInstanceOf[js.Any], disableSpacebarClick.asInstanceOf[js.Any])).asInstanceOf[CreateAction[E]]
  
  inline def reducer[E /* <: HTMLElement */](state: Unit, action: RippleStateAction[E]): RipplesState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[RipplesState]
  inline def reducer[E /* <: HTMLElement */](state: RipplesState, action: RippleStateAction[E]): RipplesState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[RipplesState]
  
  inline def useRippleTransition[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRippleTransition")().asInstanceOf[ReturnValue[E]]
  inline def useRippleTransition[E /* <: HTMLElement */](disableSpacebarClick: Boolean): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRippleTransition")(disableSpacebarClick.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  trait CancelAction
    extends StObject
       with RippleStateAction[Any] {
    
    var ease: Boolean
    
    var `type`: /* "CANCEL" */ String
  }
  object CancelAction {
    
    inline def apply(ease: Boolean, `type`: /* "CANCEL" */ String): CancelAction = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelAction]
    }
    
    extension [Self <: CancelAction](x: Self) {
      
      inline def setEase(value: Boolean): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "CANCEL" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateAction[E /* <: HTMLElement */]
    extends StObject
       with RippleStateAction[E] {
    
    var disableSpacebarClick: Boolean
    
    var event: RippleEvent[E]
    
    var `type`: /* "CREATE" */ String
  }
  object CreateAction {
    
    inline def apply[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): CreateAction[E] = {
      val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAction[E]]
    }
    
    extension [Self <: CreateAction[?], E /* <: HTMLElement */](x: Self & CreateAction[E]) {
      
      inline def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: RippleEvent[E]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "CREATE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnteredAction
    extends StObject
       with RippleStateAction[Any] {
    
    var ripple: RippleState
    
    var `type`: /* "ENTERED" */ String
  }
  object EnteredAction {
    
    inline def apply(ripple: RippleState, `type`: /* "ENTERED" */ String): EnteredAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnteredAction]
    }
    
    extension [Self <: EnteredAction](x: Self) {
      
      inline def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "ENTERED" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReleaseAction[E /* <: HTMLElement */]
    extends StObject
       with RippleStateAction[E] {
    
    var event: RippleEvent[E]
    
    var `type`: /* "RELEASE" */ String
  }
  object ReleaseAction {
    
    inline def apply[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): ReleaseAction[E] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReleaseAction[E]]
    }
    
    extension [Self <: ReleaseAction[?], E /* <: HTMLElement */](x: Self & ReleaseAction[E]) {
      
      inline def setEvent(value: RippleEvent[E]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "RELEASE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveAction
    extends StObject
       with RippleStateAction[Any] {
    
    var ripple: RippleState
    
    var `type`: /* "REMOVE" */ String
  }
  object RemoveAction {
    
    inline def apply(ripple: RippleState, `type`: /* "REMOVE" */ String): RemoveAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAction]
    }
    
    extension [Self <: RemoveAction](x: Self) {
      
      inline def setRipple(value: RippleState): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "REMOVE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(ease: Boolean): Unit = js.native
    
    def create(event: RippleEvent[E]): Unit = js.native
    
    def entered(ripple: RippleState): Unit = js.native
    
    def release(event: RippleEvent[E]): Unit = js.native
    
    def remove(ripple: RippleState): Unit = js.native
    
    var state: RipplesState = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdStates.typesRipplesReducerMod.CreateAction[E]
    - typingsJapgolly.reactMdStates.typesRipplesReducerMod.ReleaseAction[E]
    - typingsJapgolly.reactMdStates.typesRipplesReducerMod.CancelAction
    - typingsJapgolly.reactMdStates.typesRipplesReducerMod.EnteredAction
    - typingsJapgolly.reactMdStates.typesRipplesReducerMod.RemoveAction
  */
  trait RippleStateAction[E /* <: HTMLElement */] extends StObject
  object RippleStateAction {
    
    inline def CancelAction(ease: Boolean, `type`: /* "CANCEL" */ String): typingsJapgolly.reactMdStates.typesRipplesReducerMod.CancelAction = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdStates.typesRipplesReducerMod.CancelAction]
    }
    
    inline def CreateAction[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): typingsJapgolly.reactMdStates.typesRipplesReducerMod.CreateAction[E] = {
      val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdStates.typesRipplesReducerMod.CreateAction[E]]
    }
    
    inline def EnteredAction(ripple: RippleState, `type`: /* "ENTERED" */ String): typingsJapgolly.reactMdStates.typesRipplesReducerMod.EnteredAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdStates.typesRipplesReducerMod.EnteredAction]
    }
    
    inline def ReleaseAction[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): typingsJapgolly.reactMdStates.typesRipplesReducerMod.ReleaseAction[E] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdStates.typesRipplesReducerMod.ReleaseAction[E]]
    }
    
    inline def RemoveAction(ripple: RippleState, `type`: /* "REMOVE" */ String): typingsJapgolly.reactMdStates.typesRipplesReducerMod.RemoveAction = {
      val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdStates.typesRipplesReducerMod.RemoveAction]
    }
  }
}
