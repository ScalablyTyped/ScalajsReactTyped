package typingsJapgolly.reactWithStyles

import typingsJapgolly.reactWithStyles.anon.Css
import typingsJapgolly.reactWithStyles.anon.StylesFn
import typingsJapgolly.reactWithStyles.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseStylesMod {
  
  @JSImport("react-with-styles/lib/hooks/useStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TStyles /* <: Styles */](hasStylesFn: StylesFn[TStyles]): Css[TStyles] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStylesFn.asInstanceOf[js.Any]).asInstanceOf[Css[TStyles]]
}
