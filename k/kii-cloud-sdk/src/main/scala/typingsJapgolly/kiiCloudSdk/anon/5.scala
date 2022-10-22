package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[T] extends StObject {
  
  def failure(bucket: KiiBucket, anErrorString: String): Any
  
  def success(queryPerformed: KiiQuery, resultSet: js.Array[T], nextQuery: KiiQuery): Any
}
object `5` {
  
  inline def apply[T](failure: (KiiBucket, String) => Any, success: (KiiQuery, js.Array[T], KiiQuery) => Any): `5`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`5`[T]]
  }
  
  extension [Self <: `5`[?], T](x: Self & `5`[T]) {
    
    inline def setFailure(value: (KiiBucket, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiQuery, js.Array[T], KiiQuery) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
