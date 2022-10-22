package typingsJapgolly.ionicReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFrameworkDelegateMod {
  
  @JSImport("@ionic/react/dist/types/framework-delegate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReactDelegate(
    addView: js.Function1[/* view */ Element, Unit],
    removeView: js.Function1[/* view */ Element, Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ReactDelegate")(addView.asInstanceOf[js.Any], removeView.asInstanceOf[js.Any])).asInstanceOf[Any]
}
