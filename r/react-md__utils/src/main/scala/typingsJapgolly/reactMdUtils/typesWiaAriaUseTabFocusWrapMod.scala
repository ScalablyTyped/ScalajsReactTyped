package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaUseTabFocusWrapMod {
  
  @JSImport("@react-md/utils/types/wia-aria/useTabFocusWrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTabFocusWrap[E /* <: HTMLElement */](hasDisabledDisableFocusCacheOnKeyDown: Options[E]): js.UndefOr[KeyboardEventHandler[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabFocusWrap")(hasDisabledDisableFocusCacheOnKeyDown.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the list of focusable elements should not be cached after the
      * first tab key press. This should only be set to `true` if you have a lot of
      * dynamic content whin your element and the first and last elements change.
      */
    var disableFocusCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the focus wrap behavior should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional keydown event handler to merge with the focus wrap behavior.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
  }
  object Options {
    
    inline def apply[E /* <: HTMLElement */](): Options[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[E]]
    }
    
    extension [Self <: Options[?], E /* <: HTMLElement */](x: Self & Options[E]) {
      
      inline def setDisableFocusCache(value: Boolean): Self = StObject.set(x, "disableFocusCache", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusCacheUndefined: Self = StObject.set(x, "disableFocusCache", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
}
