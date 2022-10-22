package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.Left
import typingsJapgolly.interactjsTypes.anon.MethodArgPartialModifierA
import typingsJapgolly.interactjsTypes.anon.Methods
import typingsJapgolly.interactjsTypes.anon.OmitDoAnyPhaseArgiEventst
import typingsJapgolly.interactjsTypes.anon.PartialDoAnyPhaseArgphase
import typingsJapgolly.interactjsTypes.anon.PartialModifierArgModifie
import typingsJapgolly.interactjsTypes.anon.Phase
import typingsJapgolly.interactjsTypes.anon.ReadonlyInteractionAction
import typingsJapgolly.interactjsTypes.anon.Rect
import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.EdgeOptions
import typingsJapgolly.interactjsTypes.coreTypesMod.FullRect
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.interactjsTypesBooleans.`false`
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersModificationMod {
  
  @JSImport("@interactjs/modifiers/Modification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/modifiers/Modification", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Modification {
    def this(interaction: Interaction[ActionName]) = this()
  }
  
  inline def getRectOffset(rect: Any, coords: Any): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getRectOffset")(rect.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[Left]
  
  trait MethodArg extends StObject {
    
    var coords: Point
    
    var pageCoords: Point
    
    var phase: EventPhase
    
    var preEnd: js.UndefOr[Boolean] = js.undefined
    
    var rect: FullRect
    
    var skipModifiers: js.UndefOr[Double] = js.undefined
  }
  object MethodArg {
    
    inline def apply(coords: Point, pageCoords: Point, phase: EventPhase, rect: FullRect): MethodArg = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], pageCoords = pageCoords.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodArg]
    }
    
    extension [Self <: MethodArg](x: Self) {
      
      inline def setCoords(value: Point): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setPageCoords(value: Point): Self = StObject.set(x, "pageCoords", value.asInstanceOf[js.Any])
      
      inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
      
      inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
      
      inline def setRect(value: FullRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setSkipModifiers(value: Double): Self = StObject.set(x, "skipModifiers", value.asInstanceOf[js.Any])
      
      inline def setSkipModifiersUndefined: Self = StObject.set(x, "skipModifiers", js.undefined)
    }
  }
  
  @js.native
  trait Modification extends StObject {
    
    def applyToInteraction(arg: Rect): Unit = js.native
    
    def beforeEnd(arg: OmitDoAnyPhaseArgiEventst): Unit | `false` = js.native
    
    def copyFrom(other: Modification): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var edges: EdgeOptions = js.native
    
    var endResult: Point = js.native
    
    def fillArg(arg: PartialModifierArgModifie): ModifierArg[Methods] = js.native
    
    val interaction: ReadonlyInteractionAction = js.native
    
    def prepareStates(modifierList: js.Array[Modifier[Any, Any, Any, Any]]): js.Array[Methods] = js.native
    
    def restoreInteractionCoords(hasHasCoordsRectModification: typingsJapgolly.interactjsTypes.anon.Interaction): Unit = js.native
    
    var result: ModificationResult = js.native
    
    def setAll(arg: MethodArgPartialModifierA): ModificationResult = js.native
    
    def setAndApply(arg: PartialDoAnyPhaseArgphase): Unit | `false` = js.native
    
    def shouldDo(options: Any): Boolean = js.native
    def shouldDo(options: Any, preEnd: Boolean): Boolean = js.native
    def shouldDo(options: Any, preEnd: Boolean, phase: String): Boolean = js.native
    def shouldDo(options: Any, preEnd: Boolean, phase: String, requireEndOnly: Boolean): Boolean = js.native
    def shouldDo(options: Any, preEnd: Boolean, phase: Unit, requireEndOnly: Boolean): Boolean = js.native
    def shouldDo(options: Any, preEnd: Unit, phase: String): Boolean = js.native
    def shouldDo(options: Any, preEnd: Unit, phase: String, requireEndOnly: Boolean): Boolean = js.native
    def shouldDo(options: Any, preEnd: Unit, phase: Unit, requireEndOnly: Boolean): Boolean = js.native
    
    def start(hasPhase: Phase, pageCoords: Point): ModificationResult = js.native
    
    def startAll(arg: MethodArgPartialModifierA): Unit = js.native
    
    var startDelta: Point = js.native
    
    var startOffset: typingsJapgolly.interactjsTypes.coreTypesMod.Rect = js.native
    
    var states: js.Array[ModifierState[Any, Any, Any]] = js.native
    
    def stop(arg: typingsJapgolly.interactjsTypes.anon.Interaction): Unit = js.native
  }
  
  trait ModificationResult extends StObject {
    
    var changed: Boolean
    
    var coords: Point
    
    var delta: Point
    
    var eventProps: js.Array[Any]
    
    var rect: FullRect
    
    var rectDelta: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
  }
  object ModificationResult {
    
    inline def apply(
      changed: Boolean,
      coords: Point,
      delta: Point,
      eventProps: js.Array[Any],
      rect: FullRect,
      rectDelta: typingsJapgolly.interactjsTypes.coreTypesMod.Rect
    ): ModificationResult = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], eventProps = eventProps.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rectDelta = rectDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModificationResult]
    }
    
    extension [Self <: ModificationResult](x: Self) {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setCoords(value: Point): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Point): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setEventProps(value: js.Array[Any]): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
      
      inline def setEventPropsVarargs(value: Any*): Self = StObject.set(x, "eventProps", js.Array(value*))
      
      inline def setRect(value: FullRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectDelta(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "rectDelta", value.asInstanceOf[js.Any])
    }
  }
}
