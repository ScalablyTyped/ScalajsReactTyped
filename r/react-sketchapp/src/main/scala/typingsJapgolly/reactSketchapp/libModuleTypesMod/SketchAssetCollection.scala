package typingsJapgolly.reactSketchapp.libModuleTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchAssetCollection extends StObject {
  
  def colors(): js.Array[MSColor]
  
  def gradients(): js.Array[MSGradient]
}
object SketchAssetCollection {
  
  inline def apply(colors: CallbackTo[js.Array[MSColor]], gradients: CallbackTo[js.Array[MSGradient]]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal(colors = colors.toJsFn, gradients = gradients.toJsFn)
    __obj.asInstanceOf[SketchAssetCollection]
  }
  
  extension [Self <: SketchAssetCollection](x: Self) {
    
    inline def setColors(value: CallbackTo[js.Array[MSColor]]): Self = StObject.set(x, "colors", value.toJsFn)
    
    inline def setGradients(value: CallbackTo[js.Array[MSGradient]]): Self = StObject.set(x, "gradients", value.toJsFn)
  }
}
