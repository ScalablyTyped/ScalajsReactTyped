package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.autoScrollPluginMod.AutoScrollOptions
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.coreTypesMod.CursorChecker
import typingsJapgolly.interactjsTypes.coreTypesMod.EdgeOptions
import typingsJapgolly.interactjsTypes.coreTypesMod.ListenerMap
import typingsJapgolly.interactjsTypes.coreTypesMod.ListenersArg
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`16`
import typingsJapgolly.interactjsTypes.interactjsTypesInts.`8`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.negate
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.none
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.reposition
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.x
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.xy
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.y
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/actions/resize/plugin.ResizableOptions> */
trait PartialResizableOptions extends StObject {
  
  var allowFrom: js.UndefOr[String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var autoScroll: js.UndefOr[AutoScrollOptions] = js.undefined
  
  var axis: js.UndefOr[x | y | xy] = js.undefined
  
  var cursorChecker: js.UndefOr[CursorChecker] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var edges: js.UndefOr[EdgeOptions | Null] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var hold: js.UndefOr[Double] = js.undefined
  
  var ignoreFrom: js.UndefOr[String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var inertia: js.UndefOr[AllowResume] = js.undefined
  
  var invert: js.UndefOr[none | negate | reposition] = js.undefined
  
  var listeners: js.UndefOr[typingsJapgolly.interactjsTypes.coreTypesMod.Listeners] = js.undefined
  
  var manualStart: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var maxPerElement: js.UndefOr[Double] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
  
  var mouseButtons: js.UndefOr[
    typingsJapgolly.interactjsTypes.interactjsTypesInts.`0` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`1` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`2` | typingsJapgolly.interactjsTypes.interactjsTypesInts.`4` | `8` | `16`
  ] = js.undefined
  
  var onend: js.UndefOr[ListenersArg] = js.undefined
  
  var oninertiastart: js.UndefOr[ListenersArg] = js.undefined
  
  var onmove: js.UndefOr[ListenersArg] = js.undefined
  
  var onstart: js.UndefOr[ListenersArg] = js.undefined
  
  var origin: js.UndefOr[Point | String | typingsJapgolly.interactjsTypes.coreTypesMod.Element] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var square: js.UndefOr[Boolean] = js.undefined
  
  var squareResize: js.UndefOr[Boolean] = js.undefined
}
object PartialResizableOptions {
  
  inline def apply(): PartialResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResizableOptions]
  }
  
  extension [Self <: PartialResizableOptions](x: Self) {
    
    inline def setAllowFrom(value: String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
    
    inline def setAutoScroll(value: AutoScrollOptions): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setAxis(value: typingsJapgolly.interactjsTypes.interactjsTypesStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCursorChecker(
      value: (/* action */ ActionProps[ActionName], /* interactable */ InteractableActions, /* element */ typingsJapgolly.interactjsTypes.coreTypesMod.Element, /* interacting */ Boolean) => String
    ): Self = StObject.set(x, "cursorChecker", js.Any.fromFunction4(value))
    
    inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesNull: Self = StObject.set(x, "edges", null)
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setIgnoreFrom(value: String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
    
    inline def setInertia(value: AllowResume): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setInvert(value: none | negate | reposition): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setListeners(value: typingsJapgolly.interactjsTypes.coreTypesMod.Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: ListenerMap*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
    
    inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
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
    
    inline def setOnend(value: ListenersArg): Self = StObject.set(x, "onend", value.asInstanceOf[js.Any])
    
    inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
    
    inline def setOnendVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "onend", js.Array(value*))
    
    inline def setOninertiastart(value: ListenersArg): Self = StObject.set(x, "oninertiastart", value.asInstanceOf[js.Any])
    
    inline def setOninertiastartUndefined: Self = StObject.set(x, "oninertiastart", js.undefined)
    
    inline def setOninertiastartVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "oninertiastart", js.Array(value*))
    
    inline def setOnmove(value: ListenersArg): Self = StObject.set(x, "onmove", value.asInstanceOf[js.Any])
    
    inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
    
    inline def setOnmoveVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "onmove", js.Array(value*))
    
    inline def setOnstart(value: ListenersArg): Self = StObject.set(x, "onstart", value.asInstanceOf[js.Any])
    
    inline def setOnstartUndefined: Self = StObject.set(x, "onstart", js.undefined)
    
    inline def setOnstartVarargs(value: (typingsJapgolly.interactjsTypes.coreTypesMod.Listener | ListenerMap)*): Self = StObject.set(x, "onstart", js.Array(value*))
    
    inline def setOrigin(value: Point | String | typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareResize(value: Boolean): Self = StObject.set(x, "squareResize", value.asInstanceOf[js.Any])
    
    inline def setSquareResizeUndefined: Self = StObject.set(x, "squareResize", js.undefined)
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
  }
}
