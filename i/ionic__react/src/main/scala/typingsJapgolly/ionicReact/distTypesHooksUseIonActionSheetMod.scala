package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseIonActionSheetMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useIonActionSheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIonActionSheet(): UseIonActionSheetResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonActionSheet")().asInstanceOf[UseIonActionSheetResult]
  
  type UseIonActionSheetResult = js.Tuple2[FnCall, /**
    * Dismisses the action sheet
    */
  js.Function0[js.Promise[Unit]]]
}
