package typingsJapgolly.winrt.global.Windows.Networking

import typingsJapgolly.winrt.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Networking.HostName")
@js.native
open class HostName protected ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Networking.HostName {
  def this(hostName: String) = this()
  
  /* CompleteClass */
  var canonicalName: String = js.native
  
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var iPInformation: IPInformation = js.native
  
  /* CompleteClass */
  override def isEqual(hostName: typingsJapgolly.winrt.Windows.Networking.HostName): Boolean = js.native
  
  /* CompleteClass */
  var rawName: String = js.native
  
  /* CompleteClass */
  var `type`: typingsJapgolly.winrt.Windows.Networking.HostNameType = js.native
}
/* static members */
object HostName {
  
  @JSGlobal("Windows.Networking.HostName")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(value1: String, value2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
