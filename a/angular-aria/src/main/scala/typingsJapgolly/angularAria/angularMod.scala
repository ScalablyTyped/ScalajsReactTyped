package typingsJapgolly.angularAria

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object aria {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.angularAria.angularAriaStrings.ariaHidden
      - typingsJapgolly.angularAria.angularAriaStrings.ariaChecked
      - typingsJapgolly.angularAria.angularAriaStrings.ariaReadonly
      - typingsJapgolly.angularAria.angularAriaStrings.ariaDisabled
      - typingsJapgolly.angularAria.angularAriaStrings.ariaRequired
      - typingsJapgolly.angularAria.angularAriaStrings.ariaInvalid
      - typingsJapgolly.angularAria.angularAriaStrings.ariaValue
      - typingsJapgolly.angularAria.angularAriaStrings.tabindex
      - typingsJapgolly.angularAria.angularAriaStrings.bindKeydown
      - typingsJapgolly.angularAria.angularAriaStrings.bindRoleForClick
    */
    trait IAriaAttribute extends StObject
    object IAriaAttribute {
      
      inline def ariaChecked: typingsJapgolly.angularAria.angularAriaStrings.ariaChecked = "ariaChecked".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaChecked]
      
      inline def ariaDisabled: typingsJapgolly.angularAria.angularAriaStrings.ariaDisabled = "ariaDisabled".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaDisabled]
      
      inline def ariaHidden: typingsJapgolly.angularAria.angularAriaStrings.ariaHidden = "ariaHidden".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaHidden]
      
      inline def ariaInvalid: typingsJapgolly.angularAria.angularAriaStrings.ariaInvalid = "ariaInvalid".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaInvalid]
      
      inline def ariaReadonly: typingsJapgolly.angularAria.angularAriaStrings.ariaReadonly = "ariaReadonly".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaReadonly]
      
      inline def ariaRequired: typingsJapgolly.angularAria.angularAriaStrings.ariaRequired = "ariaRequired".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaRequired]
      
      inline def ariaValue: typingsJapgolly.angularAria.angularAriaStrings.ariaValue = "ariaValue".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.ariaValue]
      
      inline def bindKeydown: typingsJapgolly.angularAria.angularAriaStrings.bindKeydown = "bindKeydown".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.bindKeydown]
      
      inline def bindRoleForClick: typingsJapgolly.angularAria.angularAriaStrings.bindRoleForClick = "bindRoleForClick".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.bindRoleForClick]
      
      inline def tabindex: typingsJapgolly.angularAria.angularAriaStrings.tabindex = "tabindex".asInstanceOf[typingsJapgolly.angularAria.angularAriaStrings.tabindex]
    }
    
    /**
      * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
      */
    trait IAriaProvider extends StObject {
      
      def config(config: IAriaProviderOptions): Unit
    }
    object IAriaProvider {
      
      inline def apply(config: IAriaProviderOptions => Callback): IAriaProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1((t0: IAriaProviderOptions) => config(t0).runNow()))
        __obj.asInstanceOf[IAriaProvider]
      }
      
      extension [Self <: IAriaProvider](x: Self) {
        
        inline def setConfig(value: IAriaProviderOptions => Callback): Self = StObject.set(x, "config", js.Any.fromFunction1((t0: IAriaProviderOptions) => value(t0).runNow()))
      }
    }
    
    /* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
    trait IAriaProviderOptions extends StObject {
      
      var ariaChecked: js.UndefOr[Boolean] = js.undefined
      
      var ariaDisabled: js.UndefOr[Boolean] = js.undefined
      
      var ariaHidden: js.UndefOr[Boolean] = js.undefined
      
      var ariaInvalid: js.UndefOr[Boolean] = js.undefined
      
      var ariaReadonly: js.UndefOr[Boolean] = js.undefined
      
      var ariaRequired: js.UndefOr[Boolean] = js.undefined
      
      var ariaValue: js.UndefOr[Boolean] = js.undefined
      
      var bindKeydown: js.UndefOr[Boolean] = js.undefined
      
      var bindRoleForClick: js.UndefOr[Boolean] = js.undefined
      
      var tabindex: js.UndefOr[Boolean] = js.undefined
    }
    object IAriaProviderOptions {
      
      inline def apply(): IAriaProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAriaProviderOptions]
      }
      
      extension [Self <: IAriaProviderOptions](x: Self) {
        
        inline def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
        
        inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
        
        inline def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
        
        inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
        
        inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        inline def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
        
        inline def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
        
        inline def setAriaReadonly(value: Boolean): Self = StObject.set(x, "ariaReadonly", value.asInstanceOf[js.Any])
        
        inline def setAriaReadonlyUndefined: Self = StObject.set(x, "ariaReadonly", js.undefined)
        
        inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
        
        inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
        
        inline def setAriaValue(value: Boolean): Self = StObject.set(x, "ariaValue", value.asInstanceOf[js.Any])
        
        inline def setAriaValueUndefined: Self = StObject.set(x, "ariaValue", js.undefined)
        
        inline def setBindKeydown(value: Boolean): Self = StObject.set(x, "bindKeydown", value.asInstanceOf[js.Any])
        
        inline def setBindKeydownUndefined: Self = StObject.set(x, "bindKeydown", js.undefined)
        
        inline def setBindRoleForClick(value: Boolean): Self = StObject.set(x, "bindRoleForClick", value.asInstanceOf[js.Any])
        
        inline def setBindRoleForClickUndefined: Self = StObject.set(x, "bindRoleForClick", js.undefined)
        
        inline def setTabindex(value: Boolean): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
        
        inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      }
    }
    
    /**
      * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
      */
    trait IAriaService extends StObject {
      
      def config(attribute: IAriaAttribute): Boolean
    }
    object IAriaService {
      
      inline def apply(config: IAriaAttribute => Boolean): IAriaService = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaService]
      }
      
      extension [Self <: IAriaService](x: Self) {
        
        inline def setConfig(value: IAriaAttribute => Boolean): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
  }
}
