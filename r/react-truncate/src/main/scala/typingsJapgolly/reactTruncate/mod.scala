package typingsJapgolly.reactTruncate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactTruncate.reactTruncateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-truncate", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TruncateProps, js.Object, Any]
  
  type Truncate = japgolly.scalajs.react.facade.React.Component[TruncateProps & js.Object, js.Object]
  
  trait TruncateProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[TruncateProps & js.Object, js.Object]
        ] {
    
    var ellipsis: js.UndefOr[Node] = js.undefined
    
    var lines: js.UndefOr[Double | `false`] = js.undefined
    
    var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.undefined
    
    var trimWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  object TruncateProps {
    
    inline def apply(): TruncateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateProps]
    }
    
    extension [Self <: TruncateProps](x: Self) {
      
      inline def setEllipsis(value: VdomNode): Self = StObject.set(x, "ellipsis", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEllipsisNull: Self = StObject.set(x, "ellipsis", null)
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEllipsisVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "ellipsis", js.Array(value*))
      
      inline def setEllipsisVdomElement(value: VdomElement): Self = StObject.set(x, "ellipsis", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLines(value: Double | `false`): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOnTruncate(value: /* isTruncated */ Boolean => Callback): Self = StObject.set(x, "onTruncate", js.Any.fromFunction1((t0: /* isTruncated */ Boolean) => value(t0).runNow()))
      
      inline def setOnTruncateUndefined: Self = StObject.set(x, "onTruncate", js.undefined)
      
      inline def setTrimWhitespace(value: Boolean): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    }
  }
}
