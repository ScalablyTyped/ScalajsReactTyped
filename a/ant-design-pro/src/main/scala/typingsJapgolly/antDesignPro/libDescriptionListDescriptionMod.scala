package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionListDescriptionMod {
  
  @JSImport("ant-design-pro/lib/DescriptionList/Description", JSImport.Default)
  @js.native
  open class default () extends Component[DescriptionProps, Any, Any]
  
  type Description = japgolly.scalajs.react.facade.React.Component[DescriptionProps & js.Object, js.Object]
  
  trait DescriptionProps
    extends StObject
       with ColProps {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var term: js.UndefOr[Node] = js.undefined
  }
  object DescriptionProps {
    
    inline def apply(): DescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionProps]
    }
    
    extension [Self <: DescriptionProps](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTerm(value: VdomNode): Self = StObject.set(x, "term", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTermNull: Self = StObject.set(x, "term", null)
      
      inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
      
      inline def setTermVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "term", js.Array(value*))
      
      inline def setTermVdomElement(value: VdomElement): Self = StObject.set(x, "term", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
