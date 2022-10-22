package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableFilterShellMod {
  
  @JSImport("baseui/data-table/filter-shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.value
    - typingsJapgolly.baseui.baseuiStrings.range
  */
  trait ExcludeKind extends StObject
  object ExcludeKind {
    
    inline def range: typingsJapgolly.baseui.baseuiStrings.range = "range".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.range]
    
    inline def value: typingsJapgolly.baseui.baseuiStrings.value = "value".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.value]
  }
  
  trait Props extends StObject {
    
    var children: Node
    
    var exclude: Boolean
    
    var excludeKind: js.UndefOr[ExcludeKind] = js.undefined
    
    def onApply(): Unit
    
    def onExcludeChange(): Unit
  }
  object Props {
    
    inline def apply(exclude: Boolean, onApply: Callback, onExcludeChange: Callback): Props = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], onApply = onApply.toJsFn, onExcludeChange = onExcludeChange.toJsFn, children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeKind(value: ExcludeKind): Self = StObject.set(x, "excludeKind", value.asInstanceOf[js.Any])
      
      inline def setExcludeKindUndefined: Self = StObject.set(x, "excludeKind", js.undefined)
      
      inline def setOnApply(value: Callback): Self = StObject.set(x, "onApply", value.toJsFn)
      
      inline def setOnExcludeChange(value: Callback): Self = StObject.set(x, "onExcludeChange", value.toJsFn)
    }
  }
}
