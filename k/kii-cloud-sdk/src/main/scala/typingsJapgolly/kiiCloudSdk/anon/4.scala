package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def failure(anErrorString: String): Any
  
  def success(topicList: js.Array[KiiTopic], nextPaginationKey: String): Any
}
object `4` {
  
  inline def apply(failure: String => Any, success: (js.Array[KiiTopic], String) => Any): `4` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setFailure(value: String => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (js.Array[KiiTopic], String) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
