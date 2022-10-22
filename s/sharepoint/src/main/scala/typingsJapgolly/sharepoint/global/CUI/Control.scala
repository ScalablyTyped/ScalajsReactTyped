package typingsJapgolly.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.Control")
@js.native
open class Control protected ()
  extends StObject
     with typingsJapgolly.sharepoint.CUI.Control {
  def this(
    root: typingsJapgolly.sharepoint.CUI.Root,
    id: String,
    properties: typingsJapgolly.sharepoint.CUI.ControlProperties
  ) = this()
  
  /* CompleteClass */
  override def createComponentForDisplayMode(displayMode: String): Any = js.native
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  
  /* CompleteClass */
  override def get_id(): String = js.native
  
  /* CompleteClass */
  override def get_root(): typingsJapgolly.sharepoint.CUI.Root = js.native
  
  /* CompleteClass */
  override def set_enabled(enabled: Boolean): Boolean = js.native
}
