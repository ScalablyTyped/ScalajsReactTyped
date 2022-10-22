package typingsJapgolly.toughCookieFilestore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tough-cookie-filestore", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FileCookieStore {
    def this(filePath: String) = this()
    
    /* CompleteClass */
    var filePath: String = js.native
    
    /* CompleteClass */
    override def findCookie(
      domain: String,
      path: String,
      key: String,
      cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def findCookies(
      domain: String,
      path: String,
      cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
    
    /* CompleteClass */
    override def inspect(): String = js.native
    
    /* CompleteClass */
    override def loadFromFile(filePath: String, cb: js.Function1[/* data */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def saveToFile(filePath: String, data: Any, cb: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    var synchronous: Boolean = js.native
    
    /* CompleteClass */
    override def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit = js.native
  }
  
  trait Cookie extends StObject {
    
    var domain: String
    
    var key: String
    
    var path: String
  }
  object Cookie {
    
    inline def apply(domain: String, key: String, path: String): Cookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileCookieStore extends StObject {
    
    var filePath: String
    
    def findCookie(
      domain: String,
      path: String,
      key: String,
      cb: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]
    ): Unit
    
    def findCookies(
      domain: String,
      path: String,
      cb: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]
    ): Unit
    
    var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]]
    
    def inspect(): String
    
    def loadFromFile(filePath: String, cb: js.Function1[/* data */ Any, Unit]): Unit
    
    def putCookie(cookie: Cookie, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
    
    def removeCookie(domain: String, path: String, key: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
    
    def removeCookies(domain: String, path: String, cb: js.Function1[/* whatever */ Null, Unit]): Unit
    
    def saveToFile(filePath: String, data: Any, cb: js.Function0[Unit]): Unit
    
    var synchronous: Boolean
    
    def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ Null, Unit]): Unit
  }
  object FileCookieStore {
    
    inline def apply(
      filePath: String,
      findCookie: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Callback,
      findCookies: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Callback,
      idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]],
      inspect: CallbackTo[String],
      loadFromFile: (String, js.Function1[/* data */ Any, Unit]) => Callback,
      putCookie: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
      removeCookie: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
      removeCookies: (String, String, js.Function1[/* whatever */ Null, Unit]) => Callback,
      saveToFile: (String, Any, js.Function0[Unit]) => Callback,
      synchronous: Boolean,
      updateCookie: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Callback
    ): FileCookieStore = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], findCookie = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => (findCookie(t0, t1, t2, t3)).runNow()), findCookies = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => (findCookies(t0, t1, t2)).runNow()), idx = idx.asInstanceOf[js.Any], inspect = inspect.toJsFn, loadFromFile = js.Any.fromFunction2((t0: String, t1: js.Function1[/* data */ Any, Unit]) => (loadFromFile(t0, t1)).runNow()), putCookie = js.Any.fromFunction4((t0: Cookie, t1: String, t2: String, t3: js.Function1[/* whatever */ Null, Unit]) => (putCookie(t0, t1, t2, t3)).runNow()), removeCookie = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function1[/* whatever */ Null, Unit]) => (removeCookie(t0, t1, t2, t3)).runNow()), removeCookies = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* whatever */ Null, Unit]) => (removeCookies(t0, t1, t2)).runNow()), saveToFile = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function0[Unit]) => (saveToFile(t0, t1, t2)).runNow()), synchronous = synchronous.asInstanceOf[js.Any], updateCookie = js.Any.fromFunction3((t0: Cookie, t1: Cookie, t2: js.Function1[/* whatever */ Null, Unit]) => (updateCookie(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FileCookieStore]
    }
    
    extension [Self <: FileCookieStore](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFindCookie(
        value: (String, String, String, js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => Callback
      ): Self = StObject.set(x, "findCookie", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function2[/* whatever */ Null, /* cookie */ js.UndefOr[Cookie | Null], Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setFindCookies(
        value: (String, String, js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => Callback
      ): Self = StObject.set(x, "findCookies", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* whatever */ Null, /* cookies */ js.Array[Cookie], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setIdx(value: StringDictionary[StringDictionary[StringDictionary[Cookie]]]): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setLoadFromFile(value: (String, js.Function1[/* data */ Any, Unit]) => Callback): Self = StObject.set(x, "loadFromFile", js.Any.fromFunction2((t0: String, t1: js.Function1[/* data */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPutCookie(value: (Cookie, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback): Self = StObject.set(x, "putCookie", js.Any.fromFunction4((t0: Cookie, t1: String, t2: String, t3: js.Function1[/* whatever */ Null, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRemoveCookie(value: (String, String, String, js.Function1[/* whatever */ Null, Unit]) => Callback): Self = StObject.set(x, "removeCookie", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function1[/* whatever */ Null, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRemoveCookies(value: (String, String, js.Function1[/* whatever */ Null, Unit]) => Callback): Self = StObject.set(x, "removeCookies", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* whatever */ Null, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSaveToFile(value: (String, Any, js.Function0[Unit]) => Callback): Self = StObject.set(x, "saveToFile", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      inline def setUpdateCookie(value: (Cookie, Cookie, js.Function1[/* whatever */ Null, Unit]) => Callback): Self = StObject.set(x, "updateCookie", js.Any.fromFunction3((t0: Cookie, t1: Cookie, t2: js.Function1[/* whatever */ Null, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
}
