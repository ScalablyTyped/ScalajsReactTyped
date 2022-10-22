package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsLayoutMod {
  
  @JSImport("wix-style-react/dist/types/AnalyticsLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AnalyticsLayoutProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/AnalyticsLayout", "default.Cell")
    @js.native
    def Cell: Instantiable0[typingsJapgolly.wixStyleReact.distTypesAnalyticsLayoutMod.Cell] = js.native
    inline def Cell_=(x: Instantiable0[Cell]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/AnalyticsLayout", "Cell")
  @js.native
  open class Cell protected ()
    extends PureComponent[CellProps, js.Object, Any] {
    def this(props: CellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellProps, context: Any) = this()
  }
  
  type AnalyticsLayout = PureComponent[AnalyticsLayoutProps, js.Object, Any]
  
  type AnalyticsLayoutChildren = js.Function3[/* item */ Any, /* index */ Double, /* rowItemsCount */ Double, Node]
  
  trait AnalyticsLayoutProps extends StObject {
    
    var children: AnalyticsLayoutChildren
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.Array[Any]
  }
  object AnalyticsLayoutProps {
    
    inline def apply(
      children: (/* item */ Any, /* index */ Double, /* rowItemsCount */ Double) => Node,
      items: js.Array[Any]
    ): AnalyticsLayoutProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsLayoutProps]
    }
    
    extension [Self <: AnalyticsLayoutProps](x: Self) {
      
      inline def setChildren(value: (/* item */ Any, /* index */ Double, /* rowItemsCount */ Double) => Node): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait CellProps extends StObject {
    
    var children: Any
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disableHighlight: js.UndefOr[Boolean] = js.undefined
  }
  object CellProps {
    
    inline def apply(children: Any): CellProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisableHighlight(value: Boolean): Self = StObject.set(x, "disableHighlight", value.asInstanceOf[js.Any])
      
      inline def setDisableHighlightUndefined: Self = StObject.set(x, "disableHighlight", js.undefined)
    }
  }
}
