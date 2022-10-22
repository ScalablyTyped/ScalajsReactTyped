package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24`[T] extends StObject {
  
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): Any
  
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): Any
}
object `24` {
  
  inline def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => Any
  ): `24`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`24`[T]]
  }
  
  extension [Self <: `24`[?], T](x: Self & `24`[T]) {
    
    inline def setFailure(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    inline def setSuccess(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
