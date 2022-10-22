package typingsJapgolly.reactResponsiveMasonry

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-responsive-masonry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MasonryProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveMasonry(props: ResponsiveMasonryProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveMasonry")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MasonryProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Injected by ResponsiveMasonry
      *
      * Default Value = 3
      */
    var columnsCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin surrounding each item e.g. "10px" or "1.5rem" (css gap property)
      *
      * Default Value = "0"
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object MasonryProps {
    
    inline def apply(): MasonryProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MasonryProps]
    }
    
    extension [Self <: MasonryProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnsCount(value: Double): Self = StObject.set(x, "columnsCount", value.asInstanceOf[js.Any])
      
      inline def setColumnsCountUndefined: Self = StObject.set(x, "columnsCount", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ResponsiveMasonryProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * A Object containing Keys as breakpoints in px and values as the columns count
      *
      * Default Value = { 350: 1, 750: 2, 900: 3 }
      */
    var columnsCountBreakPoints: js.UndefOr[NumberDictionary[Double]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ResponsiveMasonryProps {
    
    inline def apply(): ResponsiveMasonryProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ResponsiveMasonryProps]
    }
    
    extension [Self <: ResponsiveMasonryProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnsCountBreakPoints(value: NumberDictionary[Double]): Self = StObject.set(x, "columnsCountBreakPoints", value.asInstanceOf[js.Any])
      
      inline def setColumnsCountBreakPointsUndefined: Self = StObject.set(x, "columnsCountBreakPoints", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
