package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcTitleMod.TitleParams
import typingsJapgolly.vegaLite.buildSrcTransformMod.Transform
import typingsJapgolly.vegaLite.vegaLiteStrings.container
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var data: js.UndefOr[typingsJapgolly.vegaLite.buildSrcDataMod.Data] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | container | typingsJapgolly.vegaLite.buildSrcSpecBaseMod.Step] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[Text | (TitleParams[ExprRef | SignalRef])] = js.undefined
  
  var transform: js.UndefOr[js.Array[Transform]] = js.undefined
  
  var width: js.UndefOr[Double | container | typingsJapgolly.vegaLite.buildSrcSpecBaseMod.Step] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setData(value: typingsJapgolly.vegaLite.buildSrcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeight(value: Double | container | typingsJapgolly.vegaLite.buildSrcSpecBaseMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: Text | (TitleParams[ExprRef | SignalRef])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setWidth(value: Double | container | typingsJapgolly.vegaLite.buildSrcSpecBaseMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
