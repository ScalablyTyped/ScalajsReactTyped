package typingsJapgolly.asana.anon

import typingsJapgolly.asana.mod.resources.AnonymousResource
import typingsJapgolly.asana.mod.resources.NextPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nextpage[T /* <: AnonymousResource */] extends StObject {
  
  var data: js.Array[T]
  
  var next_page: js.UndefOr[NextPage] = js.undefined
}
object Nextpage {
  
  inline def apply[T /* <: AnonymousResource */](data: js.Array[T]): Nextpage[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nextpage[T]]
  }
  
  extension [Self <: Nextpage[?], T /* <: AnonymousResource */](x: Self & Nextpage[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setNext_page(value: NextPage): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
    
    inline def setNext_pageUndefined: Self = StObject.set(x, "next_page", js.undefined)
  }
}
