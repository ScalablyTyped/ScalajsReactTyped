package typingsJapgolly.kiiCloudSdk.anon

import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  def failure(error: js.Error): Any
  
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): Any
}
object `26` {
  
  inline def apply(failure: js.Error => Any, success: (KiiThing, KiiGroup, Boolean) => Any): `26` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setFailure(value: js.Error => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: (KiiThing, KiiGroup, Boolean) => Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
