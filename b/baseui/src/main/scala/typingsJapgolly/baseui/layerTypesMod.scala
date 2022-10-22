package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.anon.AppContainer
import typingsJapgolly.baseui.anon.ApplyReactStyle
import typingsJapgolly.baseui.anon.Arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerTypesMod {
  
  trait LayerComponentProps extends StObject {
    
    var children: Node
    
    var host: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var isHoverLayer: js.UndefOr[Boolean] = js.undefined
    
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    var onDocumentClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.undefined
    
    var onEscape: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    var onMount: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onUnmount: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LayerComponentProps {
    
    inline def apply(): LayerComponentProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[LayerComponentProps]
    }
    
    extension [Self <: LayerComponentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsHoverLayer(value: Boolean): Self = StObject.set(x, "isHoverLayer", value.asInstanceOf[js.Any])
      
      inline def setIsHoverLayerUndefined: Self = StObject.set(x, "isHoverLayer", js.undefined)
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnDocumentClick(value: /* event */ MouseEvent => Any): Self = StObject.set(x, "onDocumentClick", js.Any.fromFunction1(value))
      
      inline def setOnDocumentClickUndefined: Self = StObject.set(x, "onDocumentClick", js.undefined)
      
      inline def setOnEscape(value: CallbackTo[Any]): Self = StObject.set(x, "onEscape", value.toJsFn)
      
      inline def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMount(value: CallbackTo[Any]): Self = StObject.set(x, "onMount", value.toJsFn)
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnUnmount(value: CallbackTo[Any]): Self = StObject.set(x, "onUnmount", value.toJsFn)
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait LayerProps extends StObject {
    
    /** Content to be rendered in the Layer. */
    var children: Node
    
    /** A DOM element where the Layer will be inserted into as a child.
      The host value comes from the layers context provider.
      If there is no `LayersManager` added and therefore no host element
      in the context, `document.body` will be used as a container element. */
    var host: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /** Defines the location (child order) at which the layer will be inserted in
      the `host` element. */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Identifies if this layer is a hover layer (and subsequent document clicks
      should be triggered on the last registered non-hover layer. */
    var isHoverLayer: js.UndefOr[Boolean] = js.undefined
    
    /** A custom DOM element where the layer is inserted to as a child.
      Note that the `index` prop does not work with a custom `mountNode`. */
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    /** Handler called when mousedown event happens on the document.
      Only the top most layer's handler is called. */
    var onDocumentClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.undefined
    
    /** Handler called when escape key is pressed.
      Only the top most layer's handler is called. */
    var onEscape: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** Handler called when key down event is happened.
      Only the top most layer's handler is called. */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    /** Handler called when key press event is happened.
      Only the top most layer's handler is called. */
    var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    /** Handler called when key up event is happened.
      Only the top most layer's handler is called. */
    var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Any]] = js.undefined
    
    /** A handler that is called when the Layer is mounted. */
    var onMount: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** A handler that is called when the Layer is unmounted. */
    var onUnmount: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** A value of z-index to be set on the layer.
      The zIndex value comes from the layers context provider. */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LayerProps {
    
    inline def apply(): LayerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[LayerProps]
    }
    
    extension [Self <: LayerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsHoverLayer(value: Boolean): Self = StObject.set(x, "isHoverLayer", value.asInstanceOf[js.Any])
      
      inline def setIsHoverLayerUndefined: Self = StObject.set(x, "isHoverLayer", js.undefined)
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnDocumentClick(value: /* event */ MouseEvent => Any): Self = StObject.set(x, "onDocumentClick", js.Any.fromFunction1(value))
      
      inline def setOnDocumentClickUndefined: Self = StObject.set(x, "onDocumentClick", js.undefined)
      
      inline def setOnEscape(value: CallbackTo[Any]): Self = StObject.set(x, "onEscape", value.toJsFn)
      
      inline def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: /* event */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMount(value: CallbackTo[Any]): Self = StObject.set(x, "onMount", value.toJsFn)
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnUnmount(value: CallbackTo[Any]): Self = StObject.set(x, "onUnmount", value.toJsFn)
      
      inline def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait LayerState extends StObject {
    
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object LayerState {
    
    inline def apply(): LayerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerState]
    }
    
    extension [Self <: LayerState](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait LayersContextProps extends StObject {
    
    def addDocClickHandler(a: js.Function0[Any]): Unit
    
    def addEscapeHandler(a: js.Function0[Any]): Unit
    
    def addKeyDownHandler(a: js.Function0[Any]): Unit
    
    def addKeyPressHandler(a: js.Function0[Any]): Unit
    
    def addKeyUpHandler(a: js.Function0[Any]): Unit
    
    var host: js.UndefOr[HTMLElement | Null] = js.undefined
    
    def removeDocClickHandler(a: js.Function0[Any]): Unit
    
    def removeEscapeHandler(a: js.Function0[Any]): Unit
    
    def removeKeyDownHandler(a: js.Function0[Any]): Unit
    
    def removeKeyPressHandler(a: js.Function0[Any]): Unit
    
    def removeKeyUpHandler(a: js.Function0[Any]): Unit
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LayersContextProps {
    
    inline def apply(
      addDocClickHandler: js.Function0[Any] => Callback,
      addEscapeHandler: js.Function0[Any] => Callback,
      addKeyDownHandler: js.Function0[Any] => Callback,
      addKeyPressHandler: js.Function0[Any] => Callback,
      addKeyUpHandler: js.Function0[Any] => Callback,
      removeDocClickHandler: js.Function0[Any] => Callback,
      removeEscapeHandler: js.Function0[Any] => Callback,
      removeKeyDownHandler: js.Function0[Any] => Callback,
      removeKeyPressHandler: js.Function0[Any] => Callback,
      removeKeyUpHandler: js.Function0[Any] => Callback
    ): LayersContextProps = {
      val __obj = js.Dynamic.literal(addDocClickHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => addDocClickHandler(t0).runNow()), addEscapeHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => addEscapeHandler(t0).runNow()), addKeyDownHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => addKeyDownHandler(t0).runNow()), addKeyPressHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => addKeyPressHandler(t0).runNow()), addKeyUpHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => addKeyUpHandler(t0).runNow()), removeDocClickHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => removeDocClickHandler(t0).runNow()), removeEscapeHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => removeEscapeHandler(t0).runNow()), removeKeyDownHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => removeKeyDownHandler(t0).runNow()), removeKeyPressHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => removeKeyPressHandler(t0).runNow()), removeKeyUpHandler = js.Any.fromFunction1((t0: js.Function0[Any]) => removeKeyUpHandler(t0).runNow()))
      __obj.asInstanceOf[LayersContextProps]
    }
    
    extension [Self <: LayersContextProps](x: Self) {
      
      inline def setAddDocClickHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "addDocClickHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setAddEscapeHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "addEscapeHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setAddKeyDownHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "addKeyDownHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setAddKeyPressHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "addKeyPressHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setAddKeyUpHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "addKeyUpHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setRemoveDocClickHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "removeDocClickHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setRemoveEscapeHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "removeEscapeHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setRemoveKeyDownHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "removeKeyDownHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setRemoveKeyPressHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "removeKeyPressHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setRemoveKeyUpHandler(value: js.Function0[Any] => Callback): Self = StObject.set(x, "removeKeyUpHandler", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait LayersManagerProps extends StObject {
    
    var children: Node
    
    var overrides: js.UndefOr[AppContainer] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LayersManagerProps {
    
    inline def apply(): LayersManagerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[LayersManagerProps]
    }
    
    extension [Self <: LayersManagerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: AppContainer): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait LayersManagerState extends StObject {
    
    var docClickHandlers: js.Array[js.Function1[/* event */ MouseEvent, Any]]
    
    var escapeKeyHandlers: js.Array[js.Function0[Any]]
    
    var keyDownHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]
    
    var keyPressHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]
    
    var keyUpHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]
  }
  object LayersManagerState {
    
    inline def apply(
      docClickHandlers: js.Array[js.Function1[/* event */ MouseEvent, Any]],
      escapeKeyHandlers: js.Array[js.Function0[Any]],
      keyDownHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]],
      keyPressHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]],
      keyUpHandlers: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]
    ): LayersManagerState = {
      val __obj = js.Dynamic.literal(docClickHandlers = docClickHandlers.asInstanceOf[js.Any], escapeKeyHandlers = escapeKeyHandlers.asInstanceOf[js.Any], keyDownHandlers = keyDownHandlers.asInstanceOf[js.Any], keyPressHandlers = keyPressHandlers.asInstanceOf[js.Any], keyUpHandlers = keyUpHandlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayersManagerState]
    }
    
    extension [Self <: LayersManagerState](x: Self) {
      
      inline def setDocClickHandlers(value: js.Array[js.Function1[/* event */ MouseEvent, Any]]): Self = StObject.set(x, "docClickHandlers", value.asInstanceOf[js.Any])
      
      inline def setDocClickHandlersVarargs(value: (js.Function1[/* event */ MouseEvent, Any])*): Self = StObject.set(x, "docClickHandlers", js.Array(value*))
      
      inline def setEscapeKeyHandlers(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "escapeKeyHandlers", value.asInstanceOf[js.Any])
      
      inline def setEscapeKeyHandlersVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "escapeKeyHandlers", js.Array(value*))
      
      inline def setKeyDownHandlers(value: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]): Self = StObject.set(x, "keyDownHandlers", value.asInstanceOf[js.Any])
      
      inline def setKeyDownHandlersVarargs(value: (js.Function1[/* event */ KeyboardEvent, Any])*): Self = StObject.set(x, "keyDownHandlers", js.Array(value*))
      
      inline def setKeyPressHandlers(value: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]): Self = StObject.set(x, "keyPressHandlers", value.asInstanceOf[js.Any])
      
      inline def setKeyPressHandlersVarargs(value: (js.Function1[/* event */ KeyboardEvent, Any])*): Self = StObject.set(x, "keyPressHandlers", js.Array(value*))
      
      inline def setKeyUpHandlers(value: js.Array[js.Function1[/* event */ KeyboardEvent, Any]]): Self = StObject.set(x, "keyUpHandlers", value.asInstanceOf[js.Any])
      
      inline def setKeyUpHandlersVarargs(value: (js.Function1[/* event */ KeyboardEvent, Any])*): Self = StObject.set(x, "keyUpHandlers", js.Array(value*))
    }
  }
  
  trait NormalizedOffset extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object NormalizedOffset {
    
    inline def apply(left: Double, top: Double): NormalizedOffset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOffset]
    }
    
    extension [Self <: NormalizedOffset](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizedOffsets extends StObject {
    
    var arrow: js.UndefOr[NormalizedOffset] = js.undefined
    
    var popper: NormalizedOffset
  }
  object NormalizedOffsets {
    
    inline def apply(popper: NormalizedOffset): NormalizedOffsets = {
      val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOffsets]
    }
    
    extension [Self <: NormalizedOffsets](x: Self) {
      
      inline def setArrow(value: NormalizedOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setPopper(value: NormalizedOffset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopperDataObject extends StObject {
    
    var offsets: Arrow
    
    var placement: String
  }
  object PopperDataObject {
    
    inline def apply(offsets: Arrow, placement: String): PopperDataObject = {
      val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperDataObject]
    }
    
    extension [Self <: PopperDataObject](x: Self) {
      
      inline def setOffsets(value: Arrow): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopperOffset extends StObject {
    
    var left: js.UndefOr[Double | Null] = js.undefined
    
    var top: js.UndefOr[Double | Null] = js.undefined
  }
  object PopperOffset {
    
    inline def apply(): PopperOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperOffset]
    }
    
    extension [Self <: PopperOffset](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopNull: Self = StObject.set(x, "top", null)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait PopperOptions extends StObject {
    
    var modifiers: ApplyReactStyle
    
    var placement: String
  }
  object PopperOptions {
    
    inline def apply(modifiers: ApplyReactStyle, placement: String): PopperOptions = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperOptions]
    }
    
    extension [Self <: PopperOptions](x: Self) {
      
      inline def setModifiers(value: ApplyReactStyle): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.BottomLeft */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.auto
    - typingsJapgolly.baseui.baseuiStrings.topLeft
    - typingsJapgolly.baseui.baseuiStrings.top
    - typingsJapgolly.baseui.baseuiStrings.topRight
    - typingsJapgolly.baseui.baseuiStrings.rightTop
    - typingsJapgolly.baseui.baseuiStrings.right
    - typingsJapgolly.baseui.baseuiStrings.rightBottom
    - typingsJapgolly.baseui.baseuiStrings.bottomRight
    - typingsJapgolly.baseui.baseuiStrings.bottom
    - typingsJapgolly.baseui.baseuiStrings.bottomLeft
    - typingsJapgolly.baseui.baseuiStrings.leftBottom
    - typingsJapgolly.baseui.baseuiStrings.left
    - typingsJapgolly.baseui.baseuiStrings.leftTop
  */
  trait TetherPlacement extends StObject
  
  trait TetherProps extends StObject {
    
    /** The reference element used to position the popper. */
    var anchorRef: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /** The arrow element that is passed as an arrow modifier to alter
      the popper positioning. */
    var arrowRef: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /** Content to be rendered in the Popper. */
    var children: Node
    
    /** A handler that is called when popper positioning changes. */
    def onPopperUpdate(b: NormalizedOffsets, a: PopperDataObject): Any
    
    /** Recommended placement of the popper. */
    var placement: TetherPlacement
    
    /** Options to be passes to the Popper on its initialization.
      Refer to the [Popper documentation](https://github.com/popperjs/popper.js/blob/v1.x/docs/_includes/popper-documentation.md)
      for the full list of available options. */
    var popperOptions: Any
    
    /** The element used as a popper. */
    var popperRef: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object TetherProps {
    
    inline def apply(
      onPopperUpdate: (NormalizedOffsets, PopperDataObject) => Any,
      placement: TetherPlacement,
      popperOptions: Any
    ): TetherProps = {
      val __obj = js.Dynamic.literal(onPopperUpdate = js.Any.fromFunction2(onPopperUpdate), placement = placement.asInstanceOf[js.Any], popperOptions = popperOptions.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[TetherProps]
    }
    
    extension [Self <: TetherProps](x: Self) {
      
      inline def setAnchorRef(value: HTMLElement): Self = StObject.set(x, "anchorRef", value.asInstanceOf[js.Any])
      
      inline def setAnchorRefNull: Self = StObject.set(x, "anchorRef", null)
      
      inline def setAnchorRefUndefined: Self = StObject.set(x, "anchorRef", js.undefined)
      
      inline def setArrowRef(value: HTMLElement): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      inline def setArrowRefUndefined: Self = StObject.set(x, "arrowRef", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPopperUpdate(value: (NormalizedOffsets, PopperDataObject) => Any): Self = StObject.set(x, "onPopperUpdate", js.Any.fromFunction2(value))
      
      inline def setPlacement(value: TetherPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPopperOptions(value: Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      inline def setPopperRef(value: HTMLElement): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
      
      inline def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
      
      inline def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
    }
  }
  
  trait TetherState extends StObject {
    
    var isMounted: Boolean
  }
  object TetherState {
    
    inline def apply(isMounted: Boolean): TetherState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TetherState]
    }
    
    extension [Self <: TetherState](x: Self) {
      
      inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    }
  }
}
