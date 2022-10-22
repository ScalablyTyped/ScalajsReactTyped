package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] extends StObject {
  
  /**
    * Get a job handler.
    * @param name The name of the job to get a handler from.
    */
  def get[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName): Observable_[(JobHandler[A, I, O]) | Null]
}
object Registry {
  
  inline def apply[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](get: JobName => Observable_[(JobHandler[Any, Any, Any]) | Null]): Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]
  }
  
  extension [Self <: Registry[?, ?, ?], MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](x: Self & (Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT])) {
    
    inline def setGet(value: JobName => Observable_[(JobHandler[Any, Any, Any]) | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
