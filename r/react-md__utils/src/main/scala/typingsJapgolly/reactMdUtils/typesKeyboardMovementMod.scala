package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdUtils.anon.ReadonlyActiveDescendantC
import typingsJapgolly.reactMdUtils.anon.ReadonlyKeyboardFocusCont
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantContextMod.ActiveDescendantContext
import typingsJapgolly.reactMdUtils.typesKeyboardMovementActiveDescendantMovementProviderMod.ActiveDescendantMovementProviderProps
import typingsJapgolly.reactMdUtils.typesKeyboardMovementKeyboardMovementProviderMod.KeyboardMovementProviderProps
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusContext
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantFocusMod.ActiveDescendantFocusHookReturnValue
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseActiveDescendantMod.ActiveDescendantHookReturnValue
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/keyboardMovement", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def ActiveDescendantMovementProvider(hasChildrenActiveIdSetActiveId: ActiveDescendantMovementProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(hasChildrenActiveIdSetActiveId.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_LTR_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_LTR_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfig> */
  object DEFAULT_RTL_KEYBOARD_MOVEMENT {
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.decrementKeys")
    @js.native
    val decrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.incrementKeys")
    @js.native
    val incrementKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToFirstKeys")
    @js.native
    val jumpToFirstKeys: js.Array[String] = js.native
    
    @JSImport("@react-md/utils/types/keyboardMovement", "DEFAULT_RTL_KEYBOARD_MOVEMENT.jumpToLastKeys")
    @js.native
    val jumpToLastKeys: js.Array[String] = js.native
  }
  
  @JSImport("@react-md/utils/types/keyboardMovement", "KeyboardMovementContextProvider")
  @js.native
  val KeyboardMovementContextProvider: Provider[KeyboardFocusContext] = js.native
  
  inline def KeyboardMovementProvider(
    hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys: KeyboardMovementProviderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useActiveDescendant[E /* <: HTMLElement */](hasIdRef: ActiveDescendantHookOptions[E]): ActiveDescendantHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(hasIdRef.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantHookReturnValue[E]]
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")().asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  inline def useActiveDescendantFocus[E /* <: HTMLElement */](hasDefaultActiveIdOptions: ActiveDescendantFocusHookOptions[E]): ActiveDescendantFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantFocus")(hasDefaultActiveIdOptions.asInstanceOf[js.Any]).asInstanceOf[ActiveDescendantFocusHookReturnValue[E]]
  
  inline def useKeyboardFocus[E /* <: HTMLElement */](): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")().asInstanceOf[KeyboardFocusHookReturnValue[E]]
  inline def useKeyboardFocus[E /* <: HTMLElement */](options: KeyboardFocusHookOptions[E]): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")(options.asInstanceOf[js.Any]).asInstanceOf[KeyboardFocusHookReturnValue[E]]
  
  inline def useKeyboardFocusContext(): ReadonlyKeyboardFocusCont = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusContext")().asInstanceOf[ReadonlyKeyboardFocusCont]
  
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](): RefFn[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")().asInstanceOf[RefFn[E]]
  inline def useKeyboardFocusableElement[E /* <: HTMLElement */](ref: Ref[E]): RefFn[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocusableElement")(ref.asInstanceOf[js.Any]).asInstanceOf[RefFn[E]]
}
