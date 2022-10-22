package typingsJapgolly.reactScroll

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollerMod {
  
  @JSImport("react-scroll/modules/mixins/scroller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getActiveLink(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveLink")().asInstanceOf[String]
  
  inline def register(name: String, element: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollTo(to: String, props: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(to.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setActiveLink(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveLink")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")().asInstanceOf[Unit]
  
  inline def unregister(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Scroller extends StObject {
    
    var get: js.Function1[/* name */ String, Any]
    
    var getActiveLink: js.Function0[String]
    
    var register: js.Function2[/* name */ String, /* element */ Any, Unit]
    
    var scrollTo: js.Function2[/* to */ String, /* props */ Any, Unit]
    
    var setActiveLink: js.Function1[/* link */ String, Unit]
    
    var unmount: js.Function0[Unit]
    
    var unregister: js.Function1[/* name */ String, Unit]
  }
  object Scroller {
    
    inline def apply(
      get: /* name */ String => Any,
      getActiveLink: CallbackTo[String],
      register: (/* name */ String, /* element */ Any) => Callback,
      scrollTo: (/* to */ String, /* props */ Any) => Callback,
      setActiveLink: /* link */ String => Callback,
      unmount: Callback,
      unregister: /* name */ String => Callback
    ): Scroller = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getActiveLink = getActiveLink.toJsFn, register = js.Any.fromFunction2((t0: /* name */ String, t1: /* element */ Any) => (register(t0, t1)).runNow()), scrollTo = js.Any.fromFunction2((t0: /* to */ String, t1: /* props */ Any) => (scrollTo(t0, t1)).runNow()), setActiveLink = js.Any.fromFunction1((t0: /* link */ String) => setActiveLink(t0).runNow()), unmount = unmount.toJsFn, unregister = js.Any.fromFunction1((t0: /* name */ String) => unregister(t0).runNow()))
      __obj.asInstanceOf[Scroller]
    }
    
    extension [Self <: Scroller](x: Self) {
      
      inline def setGet(value: /* name */ String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetActiveLink(value: CallbackTo[String]): Self = StObject.set(x, "getActiveLink", value.toJsFn)
      
      inline def setRegister(value: (/* name */ String, /* element */ Any) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: /* name */ String, t1: /* element */ Any) => (value(t0, t1)).runNow()))
      
      inline def setScrollTo(value: (/* to */ String, /* props */ Any) => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2((t0: /* to */ String, t1: /* props */ Any) => (value(t0, t1)).runNow()))
      
      inline def setSetActiveLink(value: /* link */ String => Callback): Self = StObject.set(x, "setActiveLink", js.Any.fromFunction1((t0: /* link */ String) => value(t0).runNow()))
      
      inline def setUnmount(value: Callback): Self = StObject.set(x, "unmount", value.toJsFn)
      
      inline def setUnregister(value: /* name */ String => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: /* name */ String) => value(t0).runNow()))
    }
  }
}
