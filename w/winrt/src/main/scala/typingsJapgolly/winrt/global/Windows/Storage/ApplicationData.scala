package typingsJapgolly.winrt.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.ApplicationData")
@js.native
open class ApplicationData ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.ApplicationData
/* static members */
object ApplicationData {
  
  @JSGlobal("Windows.Storage.ApplicationData")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Windows.Storage.ApplicationData.current")
  @js.native
  def current: typingsJapgolly.winrt.Windows.Storage.ApplicationData = js.native
  inline def current_=(x: typingsJapgolly.winrt.Windows.Storage.ApplicationData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
}
