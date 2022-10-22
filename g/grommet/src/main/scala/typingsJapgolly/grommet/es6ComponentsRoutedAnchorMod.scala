package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.grommet.anon.RoutedAnchorPropsOmitAnch
import typingsJapgolly.grommet.grommetStrings.push
import typingsJapgolly.grommet.grommetStrings.replace
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsRoutedAnchorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components/RoutedAnchor", "RoutedAnchor")
  @js.native
  open class RoutedAnchor protected ()
    extends Component[RoutedAnchorPropsOmitAnch, js.Object, Any] {
    def this(props: RoutedAnchorPropsOmitAnch) = this()
    def this(props: RoutedAnchorPropsOmitAnch, context: Any) = this()
  }
  @JSImport("grommet/es6/components/RoutedAnchor", "RoutedAnchor")
  @js.native
  val RoutedAnchor: ComponentClassP[RoutedAnchorPropsOmitAnch & js.Object] = js.native
  
  trait RoutedAnchorProps extends StObject {
    
    var method: js.UndefOr[push | replace] = js.undefined
    
    var path: String
  }
  object RoutedAnchorProps {
    
    inline def apply(path: String): RoutedAnchorProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutedAnchorProps]
    }
    
    extension [Self <: RoutedAnchorProps](x: Self) {
      
      inline def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
