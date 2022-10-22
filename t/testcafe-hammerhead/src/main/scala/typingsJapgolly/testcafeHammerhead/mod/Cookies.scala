package typingsJapgolly.testcafeHammerhead.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.testcafeHammerhead.anon.Hostname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  def copySyncCookies(syncCookie: String, toUrl: String): Unit
  
  def deleteCookies(externalCookies: js.Array[ExternalCookies], urls: js.Array[String]): js.Promise[Unit]
  
  def getCookies(externalCookies: js.Array[ExternalCookies], urls: js.Array[String]): js.Promise[js.Array[ExternalCookies]]
  
  def getHeader(hasUrlHostname: Hostname): String | Null
  
  def setCookies(externalCookies: js.Array[ExternalCookies], url: String): js.Promise[Unit]
}
object Cookies {
  
  inline def apply(
    copySyncCookies: (String, String) => Callback,
    deleteCookies: (js.Array[ExternalCookies], js.Array[String]) => js.Promise[Unit],
    getCookies: (js.Array[ExternalCookies], js.Array[String]) => js.Promise[js.Array[ExternalCookies]],
    getHeader: Hostname => String | Null,
    setCookies: (js.Array[ExternalCookies], String) => js.Promise[Unit]
  ): Cookies = {
    val __obj = js.Dynamic.literal(copySyncCookies = js.Any.fromFunction2((t0: String, t1: String) => (copySyncCookies(t0, t1)).runNow()), deleteCookies = js.Any.fromFunction2(deleteCookies), getCookies = js.Any.fromFunction2(getCookies), getHeader = js.Any.fromFunction1(getHeader), setCookies = js.Any.fromFunction2(setCookies))
    __obj.asInstanceOf[Cookies]
  }
  
  extension [Self <: Cookies](x: Self) {
    
    inline def setCopySyncCookies(value: (String, String) => Callback): Self = StObject.set(x, "copySyncCookies", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setDeleteCookies(value: (js.Array[ExternalCookies], js.Array[String]) => js.Promise[Unit]): Self = StObject.set(x, "deleteCookies", js.Any.fromFunction2(value))
    
    inline def setGetCookies(value: (js.Array[ExternalCookies], js.Array[String]) => js.Promise[js.Array[ExternalCookies]]): Self = StObject.set(x, "getCookies", js.Any.fromFunction2(value))
    
    inline def setGetHeader(value: Hostname => String | Null): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setSetCookies(value: (js.Array[ExternalCookies], String) => js.Promise[Unit]): Self = StObject.set(x, "setCookies", js.Any.fromFunction2(value))
  }
}
