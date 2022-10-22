package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementUseActiveDescendantMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/useActiveDescendant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useActiveDescendant[E /* <: HTMLElement */](hasIdRef: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(hasIdRef.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  trait ActiveDescendantHookOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The DOM id for the element. This is required so that the
      * {@link ActiveDescendantContext.activeId} can be updated to the current
      * element as needed.
      */
    var id: String
    
    /**
      * An optional ref to merge with the ref returned by this hook.
      */
    var ref: js.UndefOr[Ref[E]] = js.undefined
  }
  object ActiveDescendantHookOptions {
    
    inline def apply[E /* <: HTMLElement */](id: String): ActiveDescendantHookOptions[E] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveDescendantHookOptions[E]]
    }
    
    extension [Self <: ActiveDescendantHookOptions[?], E /* <: HTMLElement */](x: Self & ActiveDescendantHookOptions[E]) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ActiveDescendantHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if this element is the current focus. This is useful for adding a
      * focus class name since this element actually does not gain focus while
      * active.
      */
    var active: Boolean
    
    /**
      * A ref handler that **must** be provided to the DOM element for the active
      * descendant movement to work correctly.
      */
    var ref: RefFn[E]
  }
  object ActiveDescendantHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](active: Boolean, ref: E | Null => Callback): ActiveDescendantHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], ref = js.Any.fromFunction1((t0: E | Null) => ref(t0).runNow()))
      __obj.asInstanceOf[ActiveDescendantHookReturnValue[E]]
    }
    
    extension [Self <: ActiveDescendantHookReturnValue[?], E /* <: HTMLElement */](x: Self & ActiveDescendantHookReturnValue[E]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setRef(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
    }
  }
}
