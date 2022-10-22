package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.anon.PlacementContainerOverrid
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarTypesMod {
  
  type Duration = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.topLeft
    - typingsJapgolly.baseui.baseuiStrings.top
    - typingsJapgolly.baseui.baseuiStrings.topRight
    - typingsJapgolly.baseui.baseuiStrings.bottomLeft
    - typingsJapgolly.baseui.baseuiStrings.bottom
    - typingsJapgolly.baseui.baseuiStrings.bottomRight
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typingsJapgolly.baseui.baseuiStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.bottom]
    
    inline def bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.bottomRight]
    
    inline def top: typingsJapgolly.baseui.baseuiStrings.top = "top".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.top]
    
    inline def topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.topLeft]
    
    inline def topRight: typingsJapgolly.baseui.baseuiStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.topRight]
  }
  
  trait SnackbarElementOverrides extends StObject {
    
    var ActionButtonContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Message: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Spinner: js.UndefOr[Override[Any]] = js.undefined
    
    var StartEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var WrapActionButtonContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object SnackbarElementOverrides {
    
    inline def apply(): SnackbarElementOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarElementOverrides]
    }
    
    extension [Self <: SnackbarElementOverrides](x: Self) {
      
      inline def setActionButtonContainer(value: Override[Any]): Self = StObject.set(x, "ActionButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setActionButtonContainerUndefined: Self = StObject.set(x, "ActionButtonContainer", js.undefined)
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setMessage(value: Override[Any]): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSpinner(value: Override[Any]): Self = StObject.set(x, "Spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "Spinner", js.undefined)
      
      inline def setStartEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "StartEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerContainerUndefined: Self = StObject.set(x, "StartEnhancerContainer", js.undefined)
      
      inline def setWrapActionButtonContainer(value: Override[Any]): Self = StObject.set(x, "WrapActionButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setWrapActionButtonContainerUndefined: Self = StObject.set(x, "WrapActionButtonContainer", js.undefined)
    }
  }
  
  trait SnackbarElementProps extends StObject {
    
    var actionMessage: js.UndefOr[String] = js.undefined
    
    var actionOnClick: js.UndefOr[js.Function1[/* a */ ReactEventFrom[HTMLButtonElement], Any]] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var message: Node
    
    var overrides: js.UndefOr[SnackbarElementOverrides] = js.undefined
    
    var progress: js.UndefOr[Boolean] = js.undefined
    
    var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  }
  object SnackbarElementProps {
    
    inline def apply(): SnackbarElementProps = {
      val __obj = js.Dynamic.literal(message = null)
      __obj.asInstanceOf[SnackbarElementProps]
    }
    
    extension [Self <: SnackbarElementProps](x: Self) {
      
      inline def setActionMessage(value: String): Self = StObject.set(x, "actionMessage", value.asInstanceOf[js.Any])
      
      inline def setActionMessageUndefined: Self = StObject.set(x, "actionMessage", js.undefined)
      
      inline def setActionOnClick(value: /* a */ ReactEventFrom[HTMLButtonElement] => Any): Self = StObject.set(x, "actionOnClick", js.Any.fromFunction1(value))
      
      inline def setActionOnClickUndefined: Self = StObject.set(x, "actionOnClick", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: SnackbarElementOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    }
  }
  
  trait SnackbarProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultDuration: js.UndefOr[Duration] = js.undefined
    
    var overrides: js.UndefOr[PlacementContainerOverrid] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object SnackbarProviderProps {
    
    inline def apply(): SnackbarProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnackbarProviderProps]
    }
    
    extension [Self <: SnackbarProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultDuration(value: Duration): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
      
      inline def setDefaultDurationUndefined: Self = StObject.set(x, "defaultDuration", js.undefined)
      
      inline def setOverrides(value: PlacementContainerOverrid): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
}
