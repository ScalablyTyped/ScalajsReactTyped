package typingsJapgolly.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to url and query string parts.*/
@JSGlobal("JSRequest")
@js.native
open class JSRequest ()
  extends StObject
     with typingsJapgolly.sharepoint.JSRequest
object JSRequest {
  
  @JSGlobal("JSRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /** initializes class.*/
  /* static member */
  inline def EnsureSetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EnsureSetup")().asInstanceOf[Unit]
  
  /** Current file name (after last '/' in url).*/
  /* static member */
  @JSGlobal("JSRequest.FileName")
  @js.native
  def FileName: String = js.native
  inline def FileName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileName")(x.asInstanceOf[js.Any])
  
  /** Current file path (before last '/' in url).*/
  /* static member */
  @JSGlobal("JSRequest.PathName")
  @js.native
  def PathName: String = js.native
  inline def PathName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathName")(x.asInstanceOf[js.Any])
}
