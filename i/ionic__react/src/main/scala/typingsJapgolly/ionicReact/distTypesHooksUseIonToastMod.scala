package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.FnCallMessageDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonToastMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonToast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonToast(): UseIonToastResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonToast")().asInstanceOf[UseIonToastResult]
  
  type UseIonToastResult = js.Tuple2[
    FnCallMessageDuration, 
    /**
    * Dismisses the toast
    */
  js.Function0[js.Promise[Unit]]
  ]
}
