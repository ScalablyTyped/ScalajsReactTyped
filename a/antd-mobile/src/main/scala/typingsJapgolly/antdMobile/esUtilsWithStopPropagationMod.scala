package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.antdMobileStrings.click
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWithStopPropagationMod {
  
  @JSImport("antd-mobile/es/utils/with-stop-propagation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withStopPropagation(events: js.Array[PropagationEvent], element: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("withStopPropagation")(events.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type PropagationEvent = click
}
