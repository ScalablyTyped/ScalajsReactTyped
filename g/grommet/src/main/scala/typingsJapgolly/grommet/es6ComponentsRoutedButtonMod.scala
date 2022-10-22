package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonProps
import typingsJapgolly.grommet.grommetStrings.push
import typingsJapgolly.grommet.grommetStrings.replace
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsRoutedButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components/RoutedButton", "RoutedButton")
  @js.native
  open class RoutedButton protected ()
    extends Component[RoutedButtonProps & ButtonProps, js.Object, Any] {
    def this(props: RoutedButtonProps & ButtonProps) = this()
    def this(props: RoutedButtonProps & ButtonProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components/RoutedButton", "RoutedButton")
  @js.native
  val RoutedButton: ComponentClassP[RoutedButtonProps & ButtonProps & js.Object] = js.native
  
  trait RoutedButtonProps extends StObject {
    
    var method: js.UndefOr[push | replace] = js.undefined
    
    var path: String
  }
  object RoutedButtonProps {
    
    inline def apply(path: String): RoutedButtonProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutedButtonProps]
    }
    
    extension [Self <: RoutedButtonProps](x: Self) {
      
      inline def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
