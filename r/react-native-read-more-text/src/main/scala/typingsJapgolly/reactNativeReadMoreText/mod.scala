package typingsJapgolly.reactNativeReadMoreText

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-read-more-text", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReadMoreProps, js.Object, Any]
  
  type ReadMore = japgolly.scalajs.react.facade.React.Component[ReadMoreProps & js.Object, js.Object]
  
  trait ReadMoreProps extends StObject {
    
    var children: Node
    
    var numberOfLines: Double
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def renderRevealedFooter(onPress: js.Function0[Unit]): Node
    
    def renderTruncatedFooter(onPress: js.Function0[Unit]): Node
  }
  object ReadMoreProps {
    
    inline def apply(
      numberOfLines: Double,
      renderRevealedFooter: js.Function0[Unit] => Node,
      renderTruncatedFooter: js.Function0[Unit] => Node
    ): ReadMoreProps = {
      val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter), children = null)
      __obj.asInstanceOf[ReadMoreProps]
    }
    
    extension [Self <: ReadMoreProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setRenderRevealedFooter(value: js.Function0[Unit] => Node): Self = StObject.set(x, "renderRevealedFooter", js.Any.fromFunction1(value))
      
      inline def setRenderTruncatedFooter(value: js.Function0[Unit] => Node): Self = StObject.set(x, "renderTruncatedFooter", js.Any.fromFunction1(value))
    }
  }
}
