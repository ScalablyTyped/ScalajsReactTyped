package typingsJapgolly.fluentuiUtilities

import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetPropsWithDefaultsMod {
  
  @JSImport("@fluentui/utilities/lib/getPropsWithDefaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropsWithDefaults[TProps /* <: js.Object */](defaultProps: Partial[TProps], propsWithoutDefaults: TProps): TProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropsWithDefaults")(defaultProps.asInstanceOf[js.Any], propsWithoutDefaults.asInstanceOf[js.Any])).asInstanceOf[TProps]
}
