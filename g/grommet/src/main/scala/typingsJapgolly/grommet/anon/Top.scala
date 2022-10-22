package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
import typingsJapgolly.grommet.es6UtilsMod._EdgeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top
  extends StObject
     with _EdgeType {
  
  var bottom: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var end: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var horizontal: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var left: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var right: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var start: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var top: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var vertical: js.UndefOr[EdgeSizeType | String] = js.undefined
}
object Top {
  
  inline def apply(): Top = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Top]
  }
  
  extension [Self <: Top](x: Self) {
    
    inline def setBottom(value: EdgeSizeType | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setEnd(value: EdgeSizeType | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setHorizontal(value: EdgeSizeType | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setLeft(value: EdgeSizeType | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: EdgeSizeType | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStart(value: EdgeSizeType | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTop(value: EdgeSizeType | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVertical(value: EdgeSizeType | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
