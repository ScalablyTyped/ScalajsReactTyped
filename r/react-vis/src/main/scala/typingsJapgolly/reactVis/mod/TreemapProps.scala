package typingsJapgolly.reactVis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactVis.reactVisStrings.`partition-pivot`
import typingsJapgolly.reactVis.reactVisStrings.binary
import typingsJapgolly.reactVis.reactVisStrings.circlePack
import typingsJapgolly.reactVis.reactVisStrings.color
import typingsJapgolly.reactVis.reactVisStrings.dice
import typingsJapgolly.reactVis.reactVisStrings.partition
import typingsJapgolly.reactVis.reactVisStrings.resquarify
import typingsJapgolly.reactVis.reactVisStrings.size
import typingsJapgolly.reactVis.reactVisStrings.slice
import typingsJapgolly.reactVis.reactVisStrings.slicedice
import typingsJapgolly.reactVis.reactVisStrings.squarify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  // default: ''
  var data: js.UndefOr[TreemapPoint] = js.undefined
  
  var getColor: js.UndefOr[RVGet[TreemapPoint, color]] = js.undefined
  
  var getSize: js.UndefOr[RVGet[TreemapPoint, size]] = js.undefined
  
  // default: {'children':[]}
  var height: Double
  
  var hideRootNode: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var margin: js.UndefOr[Margin | Double] = js.undefined
  
  // default: {'left':40,'right':10,'top':10,'bottom':40}
  var mode: js.UndefOr[
    squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
  ] = js.undefined
  
  // default: 'squarify'
  var onLeafClick: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  
  var onLeafMouseOut: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  
  var onLeafMouseOver: js.UndefOr[RVValueEventHandler[TreemapPoint]] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  // default: 1
  var sortFunction: js.UndefOr[
    js.Function3[/* a */ Any, /* b */ Any, /* getSize */ RVGet[TreemapPoint, size], Double]
  ] = js.undefined
  
  var useCirclePacking: js.UndefOr[Boolean] = js.undefined
  
  var width: Double
}
object TreemapProps {
  
  inline def apply(height: Double, width: Double): TreemapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapProps]
  }
  
  extension [Self <: TreemapProps](x: Self) {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setData(value: TreemapPoint): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetColor(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    inline def setGetSize(
      value: TreemapPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHideRootNode(value: Boolean): Self = StObject.set(x, "hideRootNode", value.asInstanceOf[js.Any])
    
    inline def setHideRootNodeUndefined: Self = StObject.set(x, "hideRootNode", js.undefined)
    
    inline def setMargin(value: Margin | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMode(
      value: squarify | resquarify | slice | dice | slicedice | binary | circlePack | partition | `partition-pivot`
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnLeafClick(value: (TreemapPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onLeafClick", js.Any.fromFunction2((t0: TreemapPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnLeafClickUndefined: Self = StObject.set(x, "onLeafClick", js.undefined)
    
    inline def setOnLeafMouseOut(value: (TreemapPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onLeafMouseOut", js.Any.fromFunction2((t0: TreemapPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnLeafMouseOutUndefined: Self = StObject.set(x, "onLeafMouseOut", js.undefined)
    
    inline def setOnLeafMouseOver(value: (TreemapPoint, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onLeafMouseOver", js.Any.fromFunction2((t0: TreemapPoint, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnLeafMouseOverUndefined: Self = StObject.set(x, "onLeafMouseOver", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSortFunction(value: (/* a */ Any, /* b */ Any, /* getSize */ RVGet[TreemapPoint, size]) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction3(value))
    
    inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    
    inline def setUseCirclePacking(value: Boolean): Self = StObject.set(x, "useCirclePacking", value.asInstanceOf[js.Any])
    
    inline def setUseCirclePackingUndefined: Self = StObject.set(x, "useCirclePacking", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
