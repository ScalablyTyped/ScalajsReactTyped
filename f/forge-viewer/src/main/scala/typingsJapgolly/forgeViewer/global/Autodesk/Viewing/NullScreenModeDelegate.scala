package typingsJapgolly.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.NullScreenModeDelegate")
@js.native
open class NullScreenModeDelegate protected ()
  extends StObject
     with typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenModeDelegate {
  def this(viewer: typingsJapgolly.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
  
  /* CompleteClass */
  override def doScreenModeChange(
    oldMode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode,
    newMode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode
  ): Unit = js.native
  
  /* CompleteClass */
  override def fullscreenEventListener(): Unit = js.native
  
  /* CompleteClass */
  override def getEscapeMode(): js.UndefOr[typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode] = js.native
  
  /* CompleteClass */
  override def getMode(): typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode = js.native
  
  /* CompleteClass */
  override def getNextMode(): js.UndefOr[typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode] = js.native
  
  /* CompleteClass */
  override def isModeSupported(mode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode): Boolean = js.native
  
  /* CompleteClass */
  override def onScreenModeChanged(
    oldMode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode,
    newMode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode
  ): Unit = js.native
  
  /* CompleteClass */
  override def setMode(mode: typingsJapgolly.forgeViewer.Autodesk.Viewing.ScreenMode): Boolean = js.native
  
  /* CompleteClass */
  override def uninitialize(): Unit = js.native
}
