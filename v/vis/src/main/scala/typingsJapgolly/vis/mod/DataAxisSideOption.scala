package typingsJapgolly.vis.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAxisSideOption extends StObject {
  
  var format: js.UndefOr[js.Function0[String]] = js.undefined
  
  var range: js.UndefOr[RangeType] = js.undefined
  
  var title: js.UndefOr[TitleOption] = js.undefined
}
object DataAxisSideOption {
  
  inline def apply(): DataAxisSideOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAxisSideOption]
  }
  
  extension [Self <: DataAxisSideOption](x: Self) {
    
    inline def setFormat(value: CallbackTo[String]): Self = StObject.set(x, "format", value.toJsFn)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRange(value: RangeType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTitle(value: TitleOption): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
