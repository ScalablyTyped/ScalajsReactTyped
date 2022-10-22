package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls input data for a neural network used by an MLComponent. For more information, see the MLComponent Scripting guide. */
trait InputPlaceholder
  extends StObject
     with BasePlaceholder {
  
  /** Data used as input. */
  var data: js.typedarray.Float32Array
  
  /** Texture used as input. */
  var texture: Texture
}
object InputPlaceholder {
  
  inline def apply(
    data: js.typedarray.Float32Array,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean,
    name: String,
    shape: vec3,
    texture: Texture,
    transformer: Transformer
  ): InputPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType), name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPlaceholder]
  }
  
  extension [Self <: InputPlaceholder](x: Self) {
    
    inline def setData(value: js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
