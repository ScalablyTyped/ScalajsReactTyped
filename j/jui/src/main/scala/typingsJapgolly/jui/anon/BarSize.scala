package typingsJapgolly.jui.anon

import typingsJapgolly.jui.juiStrings.horizontal
import typingsJapgolly.jui.juiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarSize extends StObject {
  
  /**
    * @cfg {Number} [barSize=4]
    * set splitter's bar size
    */
  var barSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {Object} [barStyle={}]
    * set custom splitter bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.undefined
  
  /**
    * @cfg {"vertical"/"horizontal"} [direction='vertical']
    * set bar's direction
    */
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
  
  var event: js.UndefOr[Any] = js.undefined
  
  /**
    * @cfg {Boolean} [fixed=false]
    *
    * if fixed is true, panels can not resize.
    *
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @cfg {String} [hideClass='hide']
    * set splitter's hide class for design
    */
  var hideClass: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {String/Number} [initSize='50%']
    * set first panel's default width or height
    */
  var initSize: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @cfg {String} [items=[]]
    *
    * set items  to placed in vertical or horizontal
    *
    * support max two times
    *
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * @cfg {Number/Array} [minSize=30]
    * set panel's minimum width or height
    *
    * if minSize is number , minSize is conver to array
    *
    * minSize[0] is first panel's minimum size
    * minSize[1] is second panel's minimum size
    *
    */
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * @cfg {String} [splitterClass='ui-splitter']
    * set splitter's class for design
    */
  var splitterClass: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[Any] = js.undefined
}
object BarSize {
  
  inline def apply(): BarSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarSize]
  }
  
  extension [Self <: BarSize](x: Self) {
    
    inline def setBarSize(value: Double): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
    
    inline def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
    
    inline def setBarStyle(value: js.Object): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
    
    inline def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
    
    inline def setInitSize(value: String | Double): Self = StObject.set(x, "initSize", value.asInstanceOf[js.Any])
    
    inline def setInitSizeUndefined: Self = StObject.set(x, "initSize", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMinSize(value: Double | js.Array[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setMinSizeVarargs(value: Double*): Self = StObject.set(x, "minSize", js.Array(value*))
    
    inline def setSplitterClass(value: String): Self = StObject.set(x, "splitterClass", value.asInstanceOf[js.Any])
    
    inline def setSplitterClassUndefined: Self = StObject.set(x, "splitterClass", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
