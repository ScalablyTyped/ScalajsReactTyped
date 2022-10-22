package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.FnCallColumnsButtons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonPickerMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonPicker(): UseIonPickerResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonPicker")().asInstanceOf[UseIonPickerResult]
  
  type UseIonPickerResult = js.Tuple2[
    FnCallColumnsButtons, 
    /**
    * Dismisses the picker
    */
  js.Function0[js.Promise[Unit]]
  ]
}
