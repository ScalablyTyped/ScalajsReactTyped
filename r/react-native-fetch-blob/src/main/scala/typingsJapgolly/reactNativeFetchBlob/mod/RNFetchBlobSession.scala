package typingsJapgolly.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fetch-blob", "RNFetchBlobSession")
@js.native
open class RNFetchBlobSession protected () extends StObject {
  def this(name: String, list: js.Array[String]) = this()
  
  def add(path: String): RNFetchBlobSession = js.native
  
  def dispose(): js.Promise[Unit] = js.native
  
  def list(): js.Array[String] = js.native
  
  var name: String = js.native
  
  def remove(path: String): RNFetchBlobSession = js.native
}
/* static members */
object RNFetchBlobSession {
  
  @JSImport("react-native-fetch-blob", "RNFetchBlobSession")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSession(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeSession(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSession")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setSession(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSession")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
