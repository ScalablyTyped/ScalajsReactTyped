package typingsJapgolly.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.PointerEvent
import typingsJapgolly.interactjsTypes.anon.Duration
import typingsJapgolly.interactjsTypes.anon.EventTarget
import typingsJapgolly.interactjsTypes.anon.Eventable
import typingsJapgolly.interactjsTypes.anon.Node
import typingsJapgolly.interactjsTypes.coreOptionsMod.Options
import typingsJapgolly.interactjsTypes.coreOptionsMod.PerActionDefaults
import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsBaseMod extends Shortcut {
  
  @JSImport("@interactjs/pointer-events/base", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type EventTargetList = js.Array[Eventable]
  
  trait PointerEventOptions
    extends StObject
       with PerActionDefaults {
    
    @JSName("allowFrom")
    var allowFrom_PointerEventOptions: js.UndefOr[Any] = js.undefined
    
    @JSName("enabled")
    var enabled_PointerEventOptions: Unit
    
    var holdDuration: js.UndefOr[Double] = js.undefined
    
    var holdRepeatInterval: js.UndefOr[Double] = js.undefined
    
    @JSName("ignoreFrom")
    var ignoreFrom_PointerEventOptions: js.UndefOr[Any] = js.undefined
  }
  object PointerEventOptions {
    
    inline def apply(enabled: Unit): PointerEventOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerEventOptions]
    }
    
    extension [Self <: PointerEventOptions](x: Self) {
      
      inline def setAllowFrom(value: Any): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
      
      inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
      
      inline def setEnabled(value: Unit): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setHoldDuration(value: Double): Self = StObject.set(x, "holdDuration", value.asInstanceOf[js.Any])
      
      inline def setHoldDurationUndefined: Self = StObject.set(x, "holdDuration", js.undefined)
      
      inline def setHoldRepeatInterval(value: Double): Self = StObject.set(x, "holdRepeatInterval", value.asInstanceOf[js.Any])
      
      inline def setHoldRepeatIntervalUndefined: Self = StObject.set(x, "holdRepeatInterval", js.undefined)
      
      inline def setIgnoreFrom(value: Any): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pointerEventsBaseMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var prevTap: js.UndefOr[PointerEvent] = js.undefined
      
      var tapTime: js.UndefOr[Double] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def setPrevTap(value: PointerEvent): Self = StObject.set(x, "prevTap", value.asInstanceOf[js.Any])
        
        inline def setPrevTapUndefined: Self = StObject.set(x, "prevTap", js.undefined)
        
        inline def setTapTime(value: Double): Self = StObject.set(x, "tapTime", value.asInstanceOf[js.Any])
        
        inline def setTapTimeUndefined: Self = StObject.set(x, "tapTime", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait ActionDefaults extends StObject {
      
      var pointerEvents: Options
    }
    object ActionDefaults {
      
      inline def apply(pointerEvents: Options): ActionDefaults = {
        val __obj = js.Dynamic.literal(pointerEvents = pointerEvents.asInstanceOf[js.Any])
        __obj.asInstanceOf[ActionDefaults]
      }
      
      extension [Self <: ActionDefaults](x: Self) {
        
        inline def setPointerEvents(value: Options): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCorePointerInfoAugmentingMod {
    
    trait PointerInfo extends StObject {
      
      var hold: js.UndefOr[Duration] = js.undefined
    }
    object PointerInfo {
      
      inline def apply(): PointerInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PointerInfo]
      }
      
      extension [Self <: PointerInfo](x: Self) {
        
        inline def setHold(value: Duration): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
        
        inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var pointerEvents: Plugin
    }
    object Scope {
      
      inline def apply(pointerEvents: Plugin): Scope = {
        val __obj = js.Dynamic.literal(pointerEvents = pointerEvents.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scope]
      }
      
      extension [Self <: Scope](x: Self) {
        
        inline def setPointerEvents(value: Plugin): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      }
    }
    
    trait SignalArgs extends StObject {
      
      @JSName("pointerEvents:collect-targets")
      var `pointerEventsColoncollect-targets`: Node
      
      @JSName("pointerEvents:fired")
      var pointerEventsColonfired: EventTarget
      
      @JSName("pointerEvents:new")
      var pointerEventsColonnew: typingsJapgolly.interactjsTypes.anon.PointerEvent
    }
    object SignalArgs {
      
      inline def apply(
        `pointerEventsColoncollect-targets`: Node,
        pointerEventsColonfired: EventTarget,
        pointerEventsColonnew: typingsJapgolly.interactjsTypes.anon.PointerEvent
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("pointerEvents:collect-targets")(`pointerEventsColoncollect-targets`.asInstanceOf[js.Any])
        __obj.updateDynamic("pointerEvents:fired")(pointerEventsColonfired.asInstanceOf[js.Any])
        __obj.updateDynamic("pointerEvents:new")(pointerEventsColonnew.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setPointerEventsColoncollect-targets`(value: Node): Self = StObject.set(x, "pointerEvents:collect-targets", value.asInstanceOf[js.Any])
        
        inline def setPointerEventsColonfired(value: EventTarget): Self = StObject.set(x, "pointerEvents:fired", value.asInstanceOf[js.Any])
        
        inline def setPointerEventsColonnew(value: typingsJapgolly.interactjsTypes.anon.PointerEvent): Self = StObject.set(x, "pointerEvents:new", value.asInstanceOf[js.Any])
      }
    }
  }
}
