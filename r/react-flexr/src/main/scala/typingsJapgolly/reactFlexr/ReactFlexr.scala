package typingsJapgolly.reactFlexr

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.left
import typingsJapgolly.reactFlexr.reactFlexrStrings.right
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlexr {
  
  type Cell = Component[CellProps & js.Object, js.Object]
  
  trait CellProps extends StObject {
    
    /**
      * Vertical Align This Cell: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Like size, but only for desk devices.
      * Accepts 'hidden' as well.
      */
    var desk: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Cell will be full height.
      */
    var flex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * Like size, but only for lap devices.
      * Accepts 'hidden' as well.
      */
    var lap: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Like size, but only for palm devices.
      * Accepts 'hidden' as well.
      */
    var palm: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Like size, but only for ( palm + lap ) devices.
      * Accepts 'hidden' as well.
      */
    var portable: js.UndefOr[String | Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Component[CellProps & js.Object, js.Object]]] = js.undefined
    
    /**
      * Takes a fraction. e.g. 1/6
      */
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDesk(value: String | Double): Self = StObject.set(x, "desk", value.asInstanceOf[js.Any])
      
      inline def setDeskUndefined: Self = StObject.set(x, "desk", js.undefined)
      
      inline def setFlex(value: Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLap(value: String | Double): Self = StObject.set(x, "lap", value.asInstanceOf[js.Any])
      
      inline def setLapUndefined: Self = StObject.set(x, "lap", js.undefined)
      
      inline def setPalm(value: String | Double): Self = StObject.set(x, "palm", value.asInstanceOf[js.Any])
      
      inline def setPalmUndefined: Self = StObject.set(x, "palm", js.undefined)
      
      inline def setPortable(value: String | Double): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      inline def setRef(value: LegacyRef[Component[CellProps & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: (Component[CellProps & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (Component[CellProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFlexr.reactFlexrStrings.palm
    - typingsJapgolly.reactFlexr.reactFlexrStrings.lap
    - typingsJapgolly.reactFlexr.reactFlexrStrings.portable
    - typingsJapgolly.reactFlexr.reactFlexrStrings.desk
  */
  trait ErgonomicType extends StObject
  object ErgonomicType {
    
    inline def desk: typingsJapgolly.reactFlexr.reactFlexrStrings.desk = "desk".asInstanceOf[typingsJapgolly.reactFlexr.reactFlexrStrings.desk]
    
    inline def lap: typingsJapgolly.reactFlexr.reactFlexrStrings.lap = "lap".asInstanceOf[typingsJapgolly.reactFlexr.reactFlexrStrings.lap]
    
    inline def palm: typingsJapgolly.reactFlexr.reactFlexrStrings.palm = "palm".asInstanceOf[typingsJapgolly.reactFlexr.reactFlexrStrings.palm]
    
    inline def portable: typingsJapgolly.reactFlexr.reactFlexrStrings.portable = "portable".asInstanceOf[typingsJapgolly.reactFlexr.reactFlexrStrings.portable]
  }
  
  type Grid = Component[GridProps & js.Object, js.Object]
  
  trait GridProps extends StObject {
    
    /**
      * Vertical Align Sub Cells: top, center, bottom
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * All sub cells will be full height.
      */
    var flexCells: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override default gutter: '1em', '5%', '10px', etc.
      * Propagates downwards. Cells inside this Grid component
      * will use the same gutter.
      */
    var gutter: js.UndefOr[String] = js.undefined
    
    /**
      * Horizontal Align Sub Cells: left, center, right
      */
    var hAlign: js.UndefOr[left | center | right] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Component[GridProps & js.Object, js.Object]]] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFlexCells(value: Boolean): Self = StObject.set(x, "flexCells", value.asInstanceOf[js.Any])
      
      inline def setFlexCellsUndefined: Self = StObject.set(x, "flexCells", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHAlign(value: left | center | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setRef(value: LegacyRef[Component[GridProps & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: (Component[GridProps & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (Component[GridProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /**
    * Simple resize event throttler. Usefull for force updating when the
    * app have been resized. For best performance, use it in your main
    * app component in the componentDidMount life cycle.
    */
  trait OptimizedResize extends StObject {
    
    def init(callback: js.Function0[Unit]): Unit
  }
  object OptimizedResize {
    
    inline def apply(init: js.Function0[Unit] => Callback): OptimizedResize = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: js.Function0[Unit]) => init(t0).runNow()))
      __obj.asInstanceOf[OptimizedResize]
    }
    
    extension [Self <: OptimizedResize](x: Self) {
      
      inline def setInit(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    }
  }
}
