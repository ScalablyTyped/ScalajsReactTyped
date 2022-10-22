package typingsJapgolly.hasura.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasuraQueryResponse[K /* <: String */, T /* <: Record[String, Any] */] extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
}
object HasuraQueryResponse {
  
  inline def apply[K /* <: String */, T /* <: Record[String, Any] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
  ): HasuraQueryResponse[K, T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasuraQueryResponse[K, T]]
  }
  
  extension [Self <: HasuraQueryResponse[?, ?], K /* <: String */, T /* <: Record[String, Any] */](x: Self & (HasuraQueryResponse[K, T])) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: std.Array<hasura.hasura.HasuraDataItem<T>>} */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
