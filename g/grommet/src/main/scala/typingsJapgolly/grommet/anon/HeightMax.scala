package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.TShirtSizeType
import typingsJapgolly.grommet.es6UtilsMod._HeightType
import typingsJapgolly.grommet.grommetStrings.`100Percentsign`
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMax
  extends StObject
     with _HeightType {
  
  var height: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var max: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
  
  var min: js.UndefOr[xxsmall | xxlarge | TShirtSizeType | `100Percentsign`] = js.undefined
}
object HeightMax {
  
  inline def apply(): HeightMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightMax]
  }
  
  extension [Self <: HeightMax](x: Self) {
    
    inline def setHeight(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMax(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: xxsmall | xxlarge | TShirtSizeType | `100Percentsign`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
