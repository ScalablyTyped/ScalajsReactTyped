package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnicodeHandling extends StObject {
  
  /**
    * Getter/setter for active Unicode version.
    */
  var activeVersion: String
  
  /**
    * Register a custom Unicode version provider.
    */
  def register(provider: IUnicodeVersionProvider): Unit
  
  /**
    * Registered Unicode versions.
    */
  val versions: js.Array[String]
}
object IUnicodeHandling {
  
  inline def apply(activeVersion: String, register: IUnicodeVersionProvider => Callback, versions: js.Array[String]): IUnicodeHandling = {
    val __obj = js.Dynamic.literal(activeVersion = activeVersion.asInstanceOf[js.Any], register = js.Any.fromFunction1((t0: IUnicodeVersionProvider) => register(t0).runNow()), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnicodeHandling]
  }
  
  extension [Self <: IUnicodeHandling](x: Self) {
    
    inline def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: IUnicodeVersionProvider => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: IUnicodeVersionProvider) => value(t0).runNow()))
    
    inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
