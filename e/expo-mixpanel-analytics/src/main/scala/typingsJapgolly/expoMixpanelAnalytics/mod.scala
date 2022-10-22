package typingsJapgolly.expoMixpanelAnalytics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-mixpanel-analytics", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExpoMixpanelAnalytics {
    def this(token: String) = this()
    
    /* CompleteClass */
    override def identify(userId: String): Unit = js.native
    
    /* CompleteClass */
    override def people_append(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_delete_user(): Unit = js.native
    
    /* CompleteClass */
    override def people_increment(props: Props[Double]): Unit = js.native
    
    /* CompleteClass */
    override def people_set(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_set_once(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_union(props: Props[js.Array[String]]): Unit = js.native
    
    /* CompleteClass */
    override def people_unset(keys: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var token: String = js.native
    
    /* CompleteClass */
    override def track(name: String, props: Props[Any]): Unit = js.native
  }
  
  trait ExpoMixpanelAnalytics extends StObject {
    
    def identify(userId: String): Unit
    
    def people_append(props: Props[Any]): Unit
    
    def people_delete_user(): Unit
    
    def people_increment(props: Props[Double]): Unit
    
    def people_set(props: Props[Any]): Unit
    
    def people_set_once(props: Props[Any]): Unit
    
    def people_union(props: Props[js.Array[String]]): Unit
    
    def people_unset(keys: js.Array[String]): Unit
    
    def reset(): Unit
    
    var token: String
    
    def track(name: String, props: Props[Any]): Unit
  }
  object ExpoMixpanelAnalytics {
    
    inline def apply(
      identify: String => Callback,
      people_append: Props[Any] => Callback,
      people_delete_user: Callback,
      people_increment: Props[Double] => Callback,
      people_set: Props[Any] => Callback,
      people_set_once: Props[Any] => Callback,
      people_union: Props[js.Array[String]] => Callback,
      people_unset: js.Array[String] => Callback,
      reset: Callback,
      token: String,
      track: (String, Props[Any]) => Callback
    ): ExpoMixpanelAnalytics = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1((t0: String) => identify(t0).runNow()), people_append = js.Any.fromFunction1((t0: Props[Any]) => people_append(t0).runNow()), people_delete_user = people_delete_user.toJsFn, people_increment = js.Any.fromFunction1((t0: Props[Double]) => people_increment(t0).runNow()), people_set = js.Any.fromFunction1((t0: Props[Any]) => people_set(t0).runNow()), people_set_once = js.Any.fromFunction1((t0: Props[Any]) => people_set_once(t0).runNow()), people_union = js.Any.fromFunction1((t0: Props[js.Array[String]]) => people_union(t0).runNow()), people_unset = js.Any.fromFunction1((t0: js.Array[String]) => people_unset(t0).runNow()), reset = reset.toJsFn, token = token.asInstanceOf[js.Any], track = js.Any.fromFunction2((t0: String, t1: Props[Any]) => (track(t0, t1)).runNow()))
      __obj.asInstanceOf[ExpoMixpanelAnalytics]
    }
    
    extension [Self <: ExpoMixpanelAnalytics](x: Self) {
      
      inline def setIdentify(value: String => Callback): Self = StObject.set(x, "identify", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPeople_append(value: Props[Any] => Callback): Self = StObject.set(x, "people_append", js.Any.fromFunction1((t0: Props[Any]) => value(t0).runNow()))
      
      inline def setPeople_delete_user(value: Callback): Self = StObject.set(x, "people_delete_user", value.toJsFn)
      
      inline def setPeople_increment(value: Props[Double] => Callback): Self = StObject.set(x, "people_increment", js.Any.fromFunction1((t0: Props[Double]) => value(t0).runNow()))
      
      inline def setPeople_set(value: Props[Any] => Callback): Self = StObject.set(x, "people_set", js.Any.fromFunction1((t0: Props[Any]) => value(t0).runNow()))
      
      inline def setPeople_set_once(value: Props[Any] => Callback): Self = StObject.set(x, "people_set_once", js.Any.fromFunction1((t0: Props[Any]) => value(t0).runNow()))
      
      inline def setPeople_union(value: Props[js.Array[String]] => Callback): Self = StObject.set(x, "people_union", js.Any.fromFunction1((t0: Props[js.Array[String]]) => value(t0).runNow()))
      
      inline def setPeople_unset(value: js.Array[String] => Callback): Self = StObject.set(x, "people_unset", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: (String, Props[Any]) => Callback): Self = StObject.set(x, "track", js.Any.fromFunction2((t0: String, t1: Props[Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  type Props[T] = StringDictionary[T]
}
