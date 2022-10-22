package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import typingsJapgolly.powerbiVisualsTools.mod.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVisualConstructor extends StObject {
  
  var __transform__ : js.UndefOr[IVisualDataViewTransform] = js.undefined
}
object IVisualConstructor {
  
  inline def apply(): IVisualConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVisualConstructor]
  }
  
  extension [Self <: IVisualConstructor](x: Self) {
    
    inline def set__transform__(value: /* dataview */ js.Array[DataView] => Any): Self = StObject.set(x, "__transform__", js.Any.fromFunction1(value))
    
    inline def set__transform__Undefined: Self = StObject.set(x, "__transform__", js.undefined)
  }
}
