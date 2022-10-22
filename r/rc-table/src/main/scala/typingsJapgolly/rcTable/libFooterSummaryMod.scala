package typingsJapgolly.rcTable

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcTable.libFooterCellMod.SummaryCellProps
import typingsJapgolly.rcTable.libFooterRowMod.FooterRowProps
import typingsJapgolly.rcTable.rcTableStrings.bottom
import typingsJapgolly.rcTable.rcTableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterSummaryMod {
  
  object default {
    
    /**
      * Syntactic sugar. Do not support HOC.
      */
    inline def apply(hasChildren: SummaryProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Footer/Summary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Cell.default` */
    inline def Cell(hasClassNameIndexChildrenColSpanRowSpanAlign: SummaryCellProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasClassNameIndexChildrenColSpanRowSpanAlign.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
    
    /* was `typeof imported_Row.default` */
    inline def Row(hasChildrenProps: FooterRowProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  }
  
  trait SummaryProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var fixed: js.UndefOr[Boolean | top | bottom] = js.undefined
  }
  object SummaryProps {
    
    inline def apply(): SummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryProps]
    }
    
    extension [Self <: SummaryProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFixed(value: Boolean | top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    }
  }
}
