package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(subscription: KiiPushSubscription, topic: KiiTopic, isSubscribed: Boolean): Any
}
object `23` {
  
  inline def apply(failure: js.Error => Any, success: (KiiPushSubscription, KiiTopic, Boolean) => Any): `23` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiPushSubscription, KiiTopic, Boolean) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
