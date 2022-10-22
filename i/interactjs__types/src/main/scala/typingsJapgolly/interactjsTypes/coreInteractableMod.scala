package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Document
import org.scalajs.dom.Event
import org.scalajs.dom.Node
import org.scalajs.dom.Window
import typingsJapgolly.interactjsTypes.actionsDragPluginMod.DraggableMethod
import typingsJapgolly.interactjsTypes.actionsDragPluginMod.DraggableOptions
import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropzoneMethod
import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropzoneOptions
import typingsJapgolly.interactjsTypes.actionsGesturePluginMod.GesturableMethod
import typingsJapgolly.interactjsTypes.actionsGesturePluginMod.GesturableOptions
import typingsJapgolly.interactjsTypes.actionsResizePluginMod.ResizableMethod
import typingsJapgolly.interactjsTypes.actionsResizePluginMod.ResizableOptions
import typingsJapgolly.interactjsTypes.anon.AllowFrom
import typingsJapgolly.interactjsTypes.anon.InteractableActions
import typingsJapgolly.interactjsTypes.anon.OrBooleanOptionsActionChecker
import typingsJapgolly.interactjsTypes.anon.RequiredOptionsActionChecker
import typingsJapgolly.interactjsTypes.anon.RequiredRect
import typingsJapgolly.interactjsTypes.anon.Type
import typingsJapgolly.interactjsTypes.coreEventableMod.Eventable
import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.coreOptionsMod.OptionsArg
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.coreTypesMod.Actions
import typingsJapgolly.interactjsTypes.coreTypesMod.Context
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.EventTypes
import typingsJapgolly.interactjsTypes.coreTypesMod.Listeners
import typingsJapgolly.interactjsTypes.coreTypesMod.ListenersArg
import typingsJapgolly.interactjsTypes.coreTypesMod.OptionMethod
import typingsJapgolly.interactjsTypes.coreTypesMod.OrBoolean
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
import typingsJapgolly.interactjsTypes.coreTypesMod.Target
import typingsJapgolly.interactjsTypes.devToolsPluginMod.DevToolsOptions
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.actionChecker
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.allowFrom
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.autoScroll
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.context
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.cursorChecker
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.delay
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.deltaSource
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.devTools
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.enabled
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.hold
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.ignoreFrom
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.inertia
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.listeners
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.manualStart
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.max
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.maxPerElement
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.modifiers
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.mouseButtons
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.off
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.on
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.origin
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.pointerEvents
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.preventDefault
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.styleCursor
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Partial
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteractableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @interactjs/types.@interactjs/core/Eventable.Eventable ]:? @interactjs/types.@interactjs/core/Eventable.Eventable[P]} */ @JSImport("@interactjs/core/Interactable", "Interactable")
  @js.native
  open class Interactable protected () extends StObject {
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
    
    def __backCompatOption(optionName: String, newValue: Any): Any = js.native
    
    val _actions: Actions = js.native
    
    def _backCompatOption(
      optionName: deltaSource | cursorChecker | devTools | styleCursor | actionChecker | preventDefault | context | max | mouseButtons | ignoreFrom | enabled | origin | autoScroll | inertia | maxPerElement | modifiers | manualStart | listeners | delay | allowFrom | hold | drag | gesture | resize | pointerEvents | drop,
      newValue: Any
    ): Any = js.native
    
    val _context: Context = js.native
    
    val _doc: Document = js.native
    
    def _onOff(method: on | off, typeArg: EventTypes): this.type = js.native
    def _onOff(method: on | off, typeArg: EventTypes, listenerArg: Null, options: Any): this.type = js.native
    def _onOff(method: on | off, typeArg: EventTypes, listenerArg: Unit, options: Any): this.type = js.native
    def _onOff(method: on | off, typeArg: EventTypes, listenerArg: ListenersArg): this.type = js.native
    def _onOff(method: on | off, typeArg: EventTypes, listenerArg: ListenersArg, options: Any): this.type = js.native
    
    val _scopeEvents: ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof install */ Any
      ] = js.native
    
    val _win: Window = js.native
    
    var actionChecker: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof actionChecker */ Any = js.native
    
    def allowFrom(): Boolean = js.native
    def allowFrom(args: Any*): typingsJapgolly.interactjsTypes.autoStartInteractableMethodsMod.interactjsCoreInteractableAugmentingMod.Interactable = js.native
    
    def checkAndPreventDefault(event: Event): Unit = js.native
    
    /**
      * Gets the selector context Node of the Interactable. The default is
      * `window.document`.
      *
      * @return {Node} The context Node of this Interactable
      */
    def context(): Context = js.native
    
    /**
      * Returns or sets the mouse coordinate types used to calculate the
      * movement of the pointer.
      *
      * @param {string} [newValue] Use 'client' if you will be scrolling while
      * interacting; Use 'page' if you want autoScroll to work
      * @return {string | object} The current deltaSource or this Interactable
      */
    def deltaSource(): DeltaSource = js.native
    def deltaSource(newValue: DeltaSource): this.type = js.native
    
    def devTools(): DevToolsOptions = js.native
    def devTools(options: DevToolsOptions): Any = js.native
    @JSName("devTools")
    var devTools_Original: OptionMethod[DevToolsOptions] = js.native
    
    def draggable(): DraggableOptions = js.native
    def draggable(options: Boolean): Any = js.native
    def draggable(options: Partial[OrBoolean[DraggableOptions]]): Any = js.native
    @JSName("draggable")
    var draggable_Original: DraggableMethod = js.native
    
    def dropCheck(
      dragEvent: InteractEvent[scala.Nothing, EventPhase],
      event: PointerEventType,
      draggable: typingsJapgolly.interactjsTypes.actionsDropPluginMod.interactjsCoreInteractableAugmentingMod.Interactable,
      draggableElement: Element,
      dropElemen: Element,
      rect: Any
    ): Boolean = js.native
    
    def dropzone(): DropzoneOptions = js.native
    def dropzone(options: Boolean): InteractableActions = js.native
    def dropzone(options: DropzoneOptions): InteractableActions = js.native
    @JSName("dropzone")
    var dropzone_Original: DropzoneMethod = js.native
    
    val events: Eventable = js.native
    
    /**
      * Calls listeners for the given InteractEvent type bound globally
      * and directly to this Interactable
      *
      * @param {InteractEvent} iEvent The InteractEvent object to be fired on this
      * Interactable
      * @return {Interactable} this Interactable
      */
    def fire[E /* <: Type */](iEvent: E): this.type = js.native
    
    def gesturable(): GesturableOptions = js.native
    def gesturable(options: Boolean): Any = js.native
    def gesturable(options: Partial[OrBoolean[GesturableOptions]]): Any = js.native
    @JSName("gesturable")
    var gesturable_Original: GesturableMethod = js.native
    
    def getAction(
      pointer: PointerType,
      event: PointerEventType,
      interaction: Interaction[ActionName],
      element: Element
    ): ActionProps[scala.Nothing] | Null = js.native
    
    /**
      * The default function to get an Interactables bounding rect. Can be
      * overridden using {@link Interactable.rectChecker}.
      *
      * @param {Element} [element] The element to measure.
      * @return {Rect} The object's bounding rectangle.
      */
    def getRect(element: Element): RequiredRect = js.native
    
    def ignoreFrom(): Boolean = js.native
    def ignoreFrom(args: Any*): typingsJapgolly.interactjsTypes.autoStartInteractableMethodsMod.interactjsCoreInteractableAugmentingMod.Interactable = js.native
    
    def inContext(element: Document): Boolean = js.native
    def inContext(element: Node): Boolean = js.native
    
    /**
      * Removes an InteractEvent, pointerEvent or DOM event listener.
      *
      * @param {string | array | object} types The types of events that were
      * listened for
      * @param {function | array | object} [listener] The event listener function(s)
      * @param {object | boolean} [options] options object or useCapture flag for
      * removeEventListener
      * @return {Interactable} This Interactable
      */
    def off(types: String): this.type = js.native
    def off(types: String, listener: Unit, options: Any): this.type = js.native
    def off(types: String, listener: ListenersArg): this.type = js.native
    def off(types: String, listener: ListenersArg, options: Any): this.type = js.native
    def off(types: js.Array[String]): this.type = js.native
    def off(types: js.Array[String], listener: Unit, options: Any): this.type = js.native
    def off(types: js.Array[String], listener: ListenersArg): this.type = js.native
    def off(types: js.Array[String], listener: ListenersArg, options: Any): this.type = js.native
    def off(types: EventTypes): this.type = js.native
    def off(types: EventTypes, listener: Unit, options: Any): this.type = js.native
    def off(types: EventTypes, listener: ListenersArg): this.type = js.native
    def off(types: EventTypes, listener: ListenersArg, options: Any): this.type = js.native
    
    /**
      * Binds a listener for an InteractEvent, pointerEvent or DOM event.
      *
      * @param {string | array | object} types The types of events to listen
      * for
      * @param {function | array | object} [listener] The event listener function(s)
      * @param {object | boolean} [options] options object or useCapture flag for
      * addEventListener
      * @return {Interactable} This Interactable
      */
    def on(types: EventTypes): this.type = js.native
    def on(types: EventTypes, listener: Unit, options: Any): this.type = js.native
    def on(types: EventTypes, listener: ListenersArg): this.type = js.native
    def on(types: EventTypes, listener: ListenersArg, options: Any): this.type = js.native
    
    val options: RequiredOptionsActionChecker = js.native
    
    /**
      * Gets or sets the origin of the Interactable's element.  The x and y
      * of the origin will be subtracted from action event coordinates.
      *
      * @param {Element | object | string} [origin] An HTML or SVG Element whose
      * rect will be used, an object eg. { x: 0, y: 0 } or string 'parent', 'self'
      * or any CSS selector
      *
      * @return {object} The current origin or this Interactable
      */
    def origin(newValue: Any): Any = js.native
    
    var pointerEvents: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pointerEventsMethod */ Any = js.native
    
    var preventDefault: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof preventDefault */ Any = js.native
    
    /**
      * Returns or sets the function used to calculate the interactable's
      * element's rectangle
      *
      * @param {function} [checker] A function which returns this Interactable's
      * bounding rectangle. See {@link Interactable.getRect}
      * @return {function | object} The checker function or this Interactable
      */
    def rectChecker(): js.Function1[/* element */ Element, Any | Null] = js.native
    def rectChecker(checker: js.Function1[/* element */ Element, Any]): this.type = js.native
    
    @JSName("reflow")
    def reflow_drag(action: ActionProps[drag]): ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doReflow */ Any
      ] = js.native
    @JSName("reflow")
    def reflow_drop(action: ActionProps[drop]): ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doReflow */ Any
      ] = js.native
    @JSName("reflow")
    def reflow_gesture(action: ActionProps[gesture]): ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doReflow */ Any
      ] = js.native
    @JSName("reflow")
    def reflow_resize(action: ActionProps[resize]): ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doReflow */ Any
      ] = js.native
    
    def resizable(): ResizableOptions = js.native
    def resizable(options: Boolean): Any = js.native
    def resizable(options: Partial[OrBoolean[ResizableOptions]]): Any = js.native
    @JSName("resizable")
    var resizable_Original: ResizableMethod = js.native
    
    /**
      * Reset the options of this Interactable
      *
      * @param {object} options The new settings to apply
      * @return {object} This Interactable
      */
    def set(options: OptionsArg): this.type = js.native
    
    def setOnEvents(actionName: ActionName, phases: NonNullable[Any]): this.type = js.native
    
    def setPerAction(actionName: ActionName, options: OrBooleanOptionsActionChecker): Unit = js.native
    
    var styleCursor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof styleCursor */ Any = js.native
    
    val target: Target = js.native
    
    def testAllow(allowFrom: IgnoreValue, targetNode: Node, element: Node): Boolean = js.native
    
    def testIgnore(ignoreFrom: IgnoreValue, targetNode: Node, element: Node): Boolean = js.native
    
    def testIgnoreAllow(options: AllowFrom, targetNode: Node, eventTarget: Node): Boolean = js.native
    
    /**
      * Remove this interactable from the list of interactables and remove it's
      * action capabilities and event listeners
      */
    def unset(): Unit = js.native
    
    def updatePerActionListeners(actionName: ActionName, prev: Listeners, cur: Listeners): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.interactjsTypes.interactjsTypesStrings.page
    - typingsJapgolly.interactjsTypes.interactjsTypesStrings.client
  */
  trait DeltaSource extends StObject
  object DeltaSource {
    
    inline def client: typingsJapgolly.interactjsTypes.interactjsTypesStrings.client = "client".asInstanceOf[typingsJapgolly.interactjsTypes.interactjsTypesStrings.client]
    
    inline def page: typingsJapgolly.interactjsTypes.interactjsTypesStrings.page = "page".asInstanceOf[typingsJapgolly.interactjsTypes.interactjsTypesStrings.page]
  }
  
  type IgnoreValue = String | Element | Boolean
}
