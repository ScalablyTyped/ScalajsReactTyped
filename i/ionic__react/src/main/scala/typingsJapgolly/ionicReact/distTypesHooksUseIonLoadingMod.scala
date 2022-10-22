package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.FnCallMessageDurationSpinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonLoadingMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonLoading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonLoading(): UseIonLoadingResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonLoading")().asInstanceOf[UseIonLoadingResult]
  
  type UseIonLoadingResult = js.Tuple2[
    FnCallMessageDurationSpinner, 
    /**
    * Dismisses the loading indicator
    */
  js.Function0[js.Promise[Unit]]
  ]
}
