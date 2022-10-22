package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.EdgeSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertical extends StObject {
  
  var horizontal: js.UndefOr[EdgeSizeType] = js.undefined
  
  var vertical: js.UndefOr[EdgeSizeType] = js.undefined
}
object Vertical {
  
  inline def apply(): Vertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertical]
  }
  
  extension [Self <: Vertical](x: Self) {
    
    inline def setHorizontal(value: EdgeSizeType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: EdgeSizeType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
