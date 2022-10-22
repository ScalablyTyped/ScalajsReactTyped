package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.Call
import typingsJapgolly.interactjsTypes.anon.Dictkey
import typingsJapgolly.interactjsTypes.anon.Enabled
import typingsJapgolly.interactjsTypes.anon.IEventInteraction
import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierModule
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersBaseMod {
  
  @JSImport("@interactjs/modifiers/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/modifiers/base", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def addEventModifiers(hasIEventInteraction: IEventInteraction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEventModifiers")(hasIEventInteraction.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def makeModifier[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result](module: ModifierModule[Defaults, State, Result]): Call[Defaults, State, Name, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeModifier")(module.asInstanceOf[js.Any]).asInstanceOf[Call[Defaults, State, Name, Result]]
  inline def makeModifier[Defaults /* <: Enabled */, State /* <: ModifierState[Any, Any, Any] */, Name /* <: String */, Result](module: ModifierModule[Defaults, State, Result], name: Name): Call[Defaults, State, Name, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeModifier")(module.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Call[Defaults, State, Name, Result]]
  
  /* augmented module */
  object interactjsCoreInteractEventAugmentingMod {
    
    trait InteractEvent extends StObject {
      
      var modifiers: js.UndefOr[js.Array[Dictkey]] = js.undefined
    }
    object InteractEvent {
      
      inline def apply(): InteractEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InteractEvent]
      }
      
      extension [Self <: InteractEvent](x: Self) {
        
        inline def setModifiers(value: js.Array[Dictkey]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setModifiersVarargs(value: Dictkey*): Self = StObject.set(x, "modifiers", js.Array(value*))
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var modification: js.UndefOr[typingsJapgolly.interactjsTypes.modifiersModificationMod.default] = js.undefined
    }
    object Interaction {
      
      inline def apply(): Interaction = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def setModification(value: typingsJapgolly.interactjsTypes.modifiersModificationMod.default): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
        
        inline def setModificationUndefined: Self = StObject.set(x, "modification", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait PerActionDefaults extends StObject {
      
      var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      extension [Self <: PerActionDefaults](x: Self) {
        
        inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      }
    }
  }
}
