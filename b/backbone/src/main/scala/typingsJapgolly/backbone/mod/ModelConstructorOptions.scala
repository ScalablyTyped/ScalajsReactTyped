package typingsJapgolly.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelConstructorOptions[TModel /* <: Model[Any, ModelSetOptions, Any] */]
  extends StObject
     with ModelSetOptions
     with Parseable {
  
  var collection: js.UndefOr[Collection[TModel]] = js.undefined
}
object ModelConstructorOptions {
  
  inline def apply[TModel /* <: Model[Any, ModelSetOptions, Any] */](): ModelConstructorOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConstructorOptions[TModel]]
  }
  
  extension [Self <: ModelConstructorOptions[?], TModel /* <: Model[Any, ModelSetOptions, Any] */](x: Self & ModelConstructorOptions[TModel]) {
    
    inline def setCollection(value: Collection[TModel]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
  }
}
