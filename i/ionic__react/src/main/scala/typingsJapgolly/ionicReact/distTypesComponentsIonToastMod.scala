package typingsJapgolly.ionicReact

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonToastElement
import typingsJapgolly.ionicReact.anon.Ios
import typingsJapgolly.ionicReact.anon.`3`
import typingsJapgolly.ionicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonToastMod {
  
  @JSImport("@ionic/react/dist/types/components/IonToast", "IonToast")
  @js.native
  val IonToast: ForwardRefExoticComponent[ToastOptions & ReactControllerProps & `3` & RefAttributes[HTMLIonToastElement]] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToastButtonCore * / any, 'icon'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToastButtonCore * / any[P]} */ trait ToastButton extends StObject {
    
    var icon: js.UndefOr[Ios | String] = js.undefined
  }
  object ToastButton {
    
    inline def apply(): ToastButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastButton]
    }
    
    extension [Self <: ToastButton](x: Self) {
      
      inline def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToastOptionsCore * / any, 'buttons'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ToastOptionsCore * / any[P]} */ trait ToastOptions extends StObject {
    
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setButtons(value: js.Array[ToastButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (ToastButton | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
    }
  }
}
