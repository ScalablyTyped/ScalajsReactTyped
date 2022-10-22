package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.`0`
import typingsJapgolly.cesium.mod.Viewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsViewerViewerPerformanceWatchdogMixinMod {
  
  @JSImport("cesium/Source/Widgets/Viewer/viewerPerformanceWatchdogMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(viewer: Viewer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(viewer: Viewer, options: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
