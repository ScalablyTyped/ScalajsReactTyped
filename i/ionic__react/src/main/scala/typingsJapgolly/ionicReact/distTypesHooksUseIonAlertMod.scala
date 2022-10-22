package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.FnCallMessageButtons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonAlertMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonAlert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonAlert(): UseIonAlertResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonAlert")().asInstanceOf[UseIonAlertResult]
  
  type UseIonAlertResult = js.Tuple2[
    FnCallMessageButtons, 
    /**
    * Dismisses the alert
    */
  js.Function0[js.Promise[Unit]]
  ]
}
