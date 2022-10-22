package typingsJapgolly.dropboxjs.global.Dropbox

import typingsJapgolly.dropboxjs.Dropbox.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.Client")
@js.native
open class Client protected ()
  extends StObject
     with typingsJapgolly.dropboxjs.Dropbox.Client {
  def this(options: Credentials) = this()
}
object Client {
  
  @JSGlobal("Dropbox.Client")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Dropbox.Client.AUTHORIZED")
  @js.native
  def AUTHORIZED: Double = js.native
  inline def AUTHORIZED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHORIZED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.DONE")
  @js.native
  def DONE: Double = js.native
  inline def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.ERROR")
  @js.native
  def ERROR: Double = js.native
  inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.PARAM_LOADED")
  @js.native
  def PARAM_LOADED: Double = js.native
  inline def PARAM_LOADED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARAM_LOADED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.PARAM_SET")
  @js.native
  def PARAM_SET: Double = js.native
  inline def PARAM_SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARAM_SET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.RESET")
  @js.native
  def RESET: Double = js.native
  inline def RESET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Dropbox.Client.SIGNED_OUT")
  @js.native
  def SIGNED_OUT: Double = js.native
  inline def SIGNED_OUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGNED_OUT")(x.asInstanceOf[js.Any])
}
