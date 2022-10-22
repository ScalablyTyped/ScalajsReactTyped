package typingsJapgolly.winrtUwp.global.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the asynchronous start options. This enumeration is a bitwise OR and is used by the StartAsync method. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStartAsyncOptions")
@js.native
object NDStartAsyncOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions & Double
  ] = js.native
  
  /* 0 */ val mutualAuthentication: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions.mutualAuthentication & Double = js.native
  
  /* 1 */ val waitForLicenseDescriptor: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.NDStartAsyncOptions.waitForLicenseDescriptor & Double = js.native
}
