package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import typingsJapgolly.ionicReact.ionicReactStrings.component
import typingsJapgolly.ionicReact.ionicReactStrings.componentProps
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonModalMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonModal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonModal(component: ReactComponentOrElement): UseIonModalResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonModal")(component.asInstanceOf[js.Any]).asInstanceOf[UseIonModalResult]
  inline def useIonModal(component: ReactComponentOrElement, componentProps: Any): UseIonModalResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonModal")(component.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[UseIonModalResult]
  
  type UseIonModalResult = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[
        (Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModalOptions */ Any, 
          component | componentProps
        ]) & HookOverlayOptions
      ], 
      Unit
    ], 
    /**
    * Dismisses the modal
    */
  js.Function2[/* data */ js.UndefOr[Any], /* role */ js.UndefOr[String], Unit]
  ]
}
