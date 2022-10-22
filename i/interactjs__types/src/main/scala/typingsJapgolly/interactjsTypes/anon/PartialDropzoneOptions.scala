package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.actionsDropPluginMod.DropFunctionChecker
import typingsJapgolly.interactjsTypes.autoScrollPluginMod.AutoScrollOptions
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.coreTypesMod.CursorChecker
import typingsJapgolly.interactjsTypes.coreTypesMod.ListenerMap
import typingsJapgolly.interactjsTypes.coreTypesMod.ListenersArg
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`16`
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`8`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.center
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.pointer
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/actions/drop/plugin.DropzoneOptions> */
trait PartialDropzoneOptions extends StObject {
  
  var accept: js.UndefOr[
    String | typingsJapgolly.interactjsTypes.coreTypesMod.Element | (js.Function1[/* hasDropzoneDraggableElement */ DraggableElement, Boolean])
  ] = js.undefined
  
  var allowFrom: js.UndefOr[String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var autoScroll: js.UndefOr[AutoScrollOptions] = js.undefined
  
  var checker: js.UndefOr[DropFunctionChecker] = js.undefined
  
  var cursorChecker: js.UndefOr[CursorChecker] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var hold: js.UndefOr[Double] = js.undefined
  
  var ignoreFrom: js.UndefOr[String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var inertia: js.UndefOr[AllowResume] = js.undefined
  
  var listeners: js.UndefOr[typingsJapgolly.interactjsTypes.coreTypesMod.Listeners] = js.undefined
  
  var manualStart: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var maxPerElement: js.UndefOr[Double] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
  
  var mouseButtons: js.UndefOr[
    typingsJapgolly.interactjsTypes.interactjsTypesInts.`0` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`1` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`2` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`
  ] = js.undefined
  
  var ondragenter: js.UndefOr[ListenersArg] = js.undefined
  
  var ondragleave: js.UndefOr[ListenersArg] = js.undefined
  
  var ondrop: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropactivate: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropdeactivate: js.UndefOr[ListenersArg] = js.undefined
  
  var ondropmove: js.UndefOr[ListenersArg] = js.undefined
  
  var origin: js.UndefOr[Point | String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var overlap: js.UndefOr[pointer | center | Double] = js.undefined
}
object PartialDropzoneOptions {
  
  inline def apply(): PartialDropzoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropzoneOptions]
  }
  
  extension [Self <: PartialDropzoneOptions](x: Self) {
    
    inline def setAccept(
      value: String | typingsJapgolly.interactjsTypes.coreTypesMod.Element | (js.Function1[/* hasDropzoneDraggableElement */ DraggableElement, Boolean])
    ): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptFunction1(value: /* hasDropzoneDraggableElement */ DraggableElement => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAllowFrom(value: String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
    
    inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setChecker(
      value: (/* dragEvent */ Any, /* event */ Any, /* dropped */ Boolean, /* dropzone */ InteractableActions, /* dropElement */ typingsJapgolly.interactjsTypes.coreTypesMod.Element, /* draggable */ InteractableActions, /* draggableElement */ typingsJapgolly.interactjsTypes.coreTypesMod.Element) => Boolean
    ): Self = StObject.set(x, "checker", js.Any.fromFunction7(value))
    
    inline def setCheckerUndefined: Self = StObject.set(x, "checker", js.undefined)
    
    inline def setCursorChecker(
      value: (/* action */ ActionProps[ActionName], /* interactable */ InteractableActions, /* element */ typingsJapgolly.interactjsTypes.coreTypesMod.Element, /* interacting */ Boolean) => String
    ): Self = StObject.set(x, "cursorChecker", js.Any.fromFunction4(value))
    
    inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setIgnoreFrom(value: String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
    
    inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setListeners(value: typingsJapgolly.interactjsTypes.coreTypesMod.Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
    
    inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxPerElement(value: Double): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
    
    inline def setMaxPerElementUndefined: Self = StObject.set(x, "maxPerElement", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setMouseButtons(
      value: typingsJapgolly.interactjsTypes.interactjsTypesInts.`0` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`1` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`2` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`
    ): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
    
    inline def setMouseButtonsUndefined: Self = StObject.set(x, "mouseButtons", js.undefined)
    
    inline def setOndragenter(value: ListenersArg): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
    
    inline def setOndragenterVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondragenter", js.Array(value*))
    
    inline def setOndragleave(value: ListenersArg): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
    
    inline def setOndragleaveVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondragleave", js.Array(value*))
    
    inline def setOndrop(value: ListenersArg): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
    
    inline def setOndropVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondrop", js.Array(value*))
    
    inline def setOndropactivate(value: ListenersArg): Self = StObject.set(x, "ondropactivate", value.asInstanceOf[js.Any])
    
    inline def setOndropactivateUndefined: Self = StObject.set(x, "ondropactivate", js.undefined)
    
    inline def setOndropactivateVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondropactivate", js.Array(value*))
    
    inline def setOndropdeactivate(value: ListenersArg): Self = StObject.set(x, "ondropdeactivate", value.asInstanceOf[js.Any])
    
    inline def setOndropdeactivateUndefined: Self = StObject.set(x, "ondropdeactivate", js.undefined)
    
    inline def setOndropdeactivateVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondropdeactivate", js.Array(value*))
    
    inline def setOndropmove(value: ListenersArg): Self = StObject.set(x, "ondropmove", value.asInstanceOf[js.Any])
    
    inline def setOndropmoveUndefined: Self = StObject.set(x, "ondropmove", js.undefined)
    
    inline def setOndropmoveVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "ondropmove", js.Array(value*))
    
    inline def setOrigin(value: Point | String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOverlap(value: pointer | center | Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
  }
}
