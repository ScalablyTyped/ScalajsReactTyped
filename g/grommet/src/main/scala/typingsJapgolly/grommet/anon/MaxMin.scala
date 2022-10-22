package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.TShirtSizeType
import typingsJapgolly.grommet.es6UtilsMod._WidthType
import typingsJapgolly.grommet.grommetStrings.`100Percentsign`
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxMin
  extends StObject
     with _WidthType {
  
  var max: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var min: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var width: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
}
object MaxMin {
  
  inline def apply(): MaxMin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxMin]
  }
  
  extension [Self <: MaxMin](x: Self) {
    
    inline def setMax(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setWidth(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
