package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.materialUiCore.anon.PartialwithThemeboolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsGetClassesMod {
  
  @JSImport("@material-ui/core/test-utils/getClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](element: Element): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](element: Element, options: PartialwithThemeboolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
