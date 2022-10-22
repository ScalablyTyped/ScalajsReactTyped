package typingsJapgolly.winrt.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.DesignMode")
@js.native
open class DesignMode ()
  extends StObject
     with typingsJapgolly.winrt.Windows.ApplicationModel.DesignMode
/* static members */
object DesignMode {
  
  @JSGlobal("Windows.ApplicationModel.DesignMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Windows.ApplicationModel.DesignMode.designModeEnabled")
  @js.native
  def designModeEnabled: Boolean = js.native
  inline def designModeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("designModeEnabled")(x.asInstanceOf[js.Any])
}
