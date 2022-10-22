package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableTrapFocusUnstableTrapFocusMod {
  
  @JSImport("@material-ui/core/Unstable_TrapFocus/Unstable_TrapFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TrapFocusProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TrapFocusProps extends StObject {
    
    /**
      * A single child content element.
      */
    var children: Node
    
    /**
      * If `true`, the trap focus will not automatically shift focus to itself when it opens, and
      * replace it to the last focused element when it closes.
      * This also works correctly with any trap focus children that have the `disableAutoFocus` prop.
      *
      * Generally this should never be set to `true` as it makes the trap focus less
      * accessible to assistive technologies, like screen readers.
      */
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the trap focus will not prevent focus from leaving the trap focus while open.
      *
      * Generally this should never be set to `true` as it makes the trap focus less
      * accessible to assistive technologies, like screen readers.
      */
    var disableEnforceFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the trap focus will not restore focus to previously focused element once
      * trap focus is hidden.
      */
    var disableRestoreFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return the document to consider.
      * We use it to implement the restore focus between different browser documents.
      */
    def getDoc(): Document
    
    /**
      * Do we still want to enforce the focus?
      * This prop helps nesting TrapFocus elements.
      */
    def isEnabled(): Boolean
    
    /**
      * If `true`, focus will be locked.
      */
    var open: Boolean
  }
  object TrapFocusProps {
    
    inline def apply(getDoc: CallbackTo[Document], isEnabled: CallbackTo[Boolean], open: Boolean): TrapFocusProps = {
      val __obj = js.Dynamic.literal(getDoc = getDoc.toJsFn, isEnabled = isEnabled.toJsFn, open = open.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[TrapFocusProps]
    }
    
    extension [Self <: TrapFocusProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setDisableEnforceFocus(value: Boolean): Self = StObject.set(x, "disableEnforceFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableEnforceFocusUndefined: Self = StObject.set(x, "disableEnforceFocus", js.undefined)
      
      inline def setDisableRestoreFocus(value: Boolean): Self = StObject.set(x, "disableRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableRestoreFocusUndefined: Self = StObject.set(x, "disableRestoreFocus", js.undefined)
      
      inline def setGetDoc(value: CallbackTo[Document]): Self = StObject.set(x, "getDoc", value.toJsFn)
      
      inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
