package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import typingsJapgolly.ionicReact.ionicReactStrings.component
import typingsJapgolly.ionicReact.ionicReactStrings.componentProps
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonPopoverMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonPopover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonPopover(component: ReactComponentOrElement): UseIonPopoverResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonPopover")(component.asInstanceOf[js.Any]).asInstanceOf[UseIonPopoverResult]
  inline def useIonPopover(component: ReactComponentOrElement, componentProps: Any): UseIonPopoverResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonPopover")(component.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[UseIonPopoverResult]
  
  type UseIonPopoverResult = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[
        (Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopoverOptions */ Any, 
          component | componentProps
        ]) & HookOverlayOptions
      ], 
      Unit
    ], 
    /**
    * Dismisses the popover
    */
  js.Function2[/* data */ js.UndefOr[Any], /* role */ js.UndefOr[String], Unit]
  ]
}
