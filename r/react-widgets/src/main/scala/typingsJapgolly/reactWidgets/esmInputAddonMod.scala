package typingsJapgolly.reactWidgets

import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInputAddonMod {
  
  @JSImport("react-widgets/esm/InputAddon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with typingsJapgolly.reactWidgets.esmButtonMod.Props
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
  }
}
