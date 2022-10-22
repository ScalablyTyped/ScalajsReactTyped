package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.enzyme.mod.CommonWrapper
import typingsJapgolly.materialUiCore.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsUntilMod {
  
  @JSImport("@material-ui/core/test-utils/until", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P, S](selector: String, options: Context): CommonWrapper[P, S, Component[P & js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CommonWrapper[P, S, Component[P & js.Object, js.Object]]]
}
