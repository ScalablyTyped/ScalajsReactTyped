package typingsJapgolly.calq

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.calq.Calq.Action
import typingsJapgolly.calq.Calq.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calq extends StObject {
  
  var action: Action = js.native
  
  def init(writeKey: String): Unit = js.native
  def init(writeKey: String, options: StringDictionary[Any]): Unit = js.native
  
  var user: User = js.native
}
object Calq {
  
  @js.native
  trait Action extends StObject {
    
    def setGlobalProperty(name: String, value: Any): Unit = js.native
    def setGlobalProperty(params: StringDictionary[Any]): Unit = js.native
    
    def track(action: String): Unit = js.native
    def track(action: String, params: StringDictionary[Any]): Unit = js.native
    
    def trackHTMLLink(action: String): Unit = js.native
    def trackHTMLLink(action: String, params: StringDictionary[Any]): Unit = js.native
    
    def trackPageView(): Unit = js.native
    def trackPageView(action: String): Unit = js.native
    
    def trackSale(action: String, params: StringDictionary[Any], currency: String, amount: Double): Unit = js.native
  }
  
  trait User extends StObject {
    
    def clear(): Unit
    
    def identify(userId: String): Unit
    
    def profile(params: StringDictionary[Any]): Unit
  }
  object User {
    
    inline def apply(clear: Callback, identify: String => Callback, profile: StringDictionary[Any] => Callback): User = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, identify = js.Any.fromFunction1((t0: String) => identify(t0).runNow()), profile = js.Any.fromFunction1((t0: StringDictionary[Any]) => profile(t0).runNow()))
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setIdentify(value: String => Callback): Self = StObject.set(x, "identify", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setProfile(value: StringDictionary[Any] => Callback): Self = StObject.set(x, "profile", js.Any.fromFunction1((t0: StringDictionary[Any]) => value(t0).runNow()))
    }
  }
}
