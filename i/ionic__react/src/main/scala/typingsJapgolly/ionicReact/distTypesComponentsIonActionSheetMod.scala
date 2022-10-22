package typingsJapgolly.ionicReact

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.ionicReact.anon.ForwardedRef
import typingsJapgolly.ionicReact.anon.Ios
import typingsJapgolly.ionicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonActionSheetMod {
  
  @JSImport("@ionic/react/dist/types/components/IonActionSheet", "IonActionSheet")
  @js.native
  val IonActionSheet: ForwardRefExoticComponent[
    ActionSheetOptions & ReactOverlayProps & ForwardedRef & RefAttributes[HTMLIonActionSheetElement]
  ] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetButtonCore * / any, 'icon'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetButtonCore * / any[P]} */ trait ActionSheetButton extends StObject {
    
    var icon: js.UndefOr[Ios | String] = js.undefined
  }
  object ActionSheetButton {
    
    inline def apply(): ActionSheetButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetButton]
    }
    
    extension [Self <: ActionSheetButton](x: Self) {
      
      inline def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetOptionsCore * / any, 'buttons'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionSheetOptionsCore * / any[P]} */ trait ActionSheetOptions extends StObject {
    
    var buttons: js.UndefOr[js.Array[ActionSheetButton | String]] = js.undefined
  }
  object ActionSheetOptions {
    
    inline def apply(): ActionSheetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetOptions]
    }
    
    extension [Self <: ActionSheetOptions](x: Self) {
      
      inline def setButtons(value: js.Array[ActionSheetButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (ActionSheetButton | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
    }
  }
}
