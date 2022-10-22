package typingsJapgolly.safariExtension

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionSecureSettings
  extends StObject
     with SafariEventTarget
     with /* index */ StringDictionary[Any] {
  
  def clear(): Unit = js.native
  
  def getItem(key: String): Any = js.native
  
  def removeItem(key: String): Unit = js.native
  
  def setItem(key: String, value: Any): Unit = js.native
}
