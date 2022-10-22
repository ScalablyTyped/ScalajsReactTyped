package typingsJapgolly.chartJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutMod {
  
  @js.native
  trait LayoutItem extends StObject {
    
    /**
      * Called before the layout process starts
      */
    var beforeLayout: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Bottom edge of the item. Set by layout system and cannot be used in update
      */
    var bottom: Double = js.native
    
    /**
      * Draws the element
      */
    def draw(chartArea: ChartArea): Unit = js.native
    
    /**
      * if true, and the item is horizontal, then push vertical boxes down
      */
    var fullSize: Boolean = js.native
    
    /**
      * Returns an object with padding on the edges
      */
    var getPadding: js.UndefOr[js.Function0[ChartArea]] = js.native
    
    /**
      * Height of item. Must be valid after update()
      */
    var height: Double = js.native
    
    /**
      * returns true if the layout item is horizontal (ie. top or bottom)
      */
    def isHorizontal(): Boolean = js.native
    
    /**
      * Left edge of the item. Set by layout system and cannot be used in update
      */
    var left: Double = js.native
    
    /**
      * The position of the item in the chart layout. Possible values are
      */
    var position: LayoutPosition = js.native
    
    /**
      * Right edge of the item. Set by layout system and cannot be used in update
      */
    var right: Double = js.native
    
    /**
      * Top edge of the item. Set by layout system and cannot be used in update
      */
    var top: Double = js.native
    
    /**
      * Takes two parameters: width and height.
      * @param width
      * @param height
      */
    def update(width: Double, height: Double): Unit = js.native
    def update(width: Double, height: Double, margins: ChartArea): Unit = js.native
    
    /**
      * The weight used to sort the item. Higher weights are further away from the chart area
      */
    var weight: Double = js.native
    
    /**
      * Width of item. Must be valid after update()
      */
    var width: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chartJs.chartJsStrings.left
    - typingsJapgolly.chartJs.chartJsStrings.top
    - typingsJapgolly.chartJs.chartJsStrings.right
    - typingsJapgolly.chartJs.chartJsStrings.bottom
    - typingsJapgolly.chartJs.chartJsStrings.center
    - typingsJapgolly.chartJs.chartJsStrings.chartArea
    - org.scalablytyped.runtime.StringDictionary[scala.Double]
  */
  type LayoutPosition = _LayoutPosition | StringDictionary[Double]
  
  trait _LayoutPosition extends StObject
}
