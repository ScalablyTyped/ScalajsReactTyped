package typingsJapgolly.webgme.global

import typingsJapgolly.webgme.Global_.GmeLogger
import typingsJapgolly.webgme.Gme.Client
import typingsJapgolly.webgme.GmeConfig.LogOptions
import typingsJapgolly.webgme.GmePanel.Container
import typingsJapgolly.webgme.GmePanel.LayoutCallback
import typingsJapgolly.webgme.GmePanel.Options
import typingsJapgolly.webgme.GmePanel.OptionsWithHeader
import typingsJapgolly.webgme.GmePanel.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  @JSGlobal("GmePanel.IActivePanel")
  @js.native
  open class IActivePanel ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.IActivePanel {
    
    /* CompleteClass */
    override def getNodeID(): String = js.native
    
    /* CompleteClass */
    override def onActivate(): Unit = js.native
    
    /* CompleteClass */
    override def onDeactivate(): Unit = js.native
    
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
  }
  
  @JSGlobal("GmePanel.Layout")
  @js.native
  open class Layout ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.Layout
  
  @JSGlobal("GmePanel.LayoutManager")
  @js.native
  open class LayoutManager ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.LayoutManager {
    
    /* CompleteClass */
    var _currentLayout: typingsJapgolly.webgme.GmePanel.Layout = js.native
    
    /* CompleteClass */
    var _currentLayoutName: String = js.native
    
    /* CompleteClass */
    var _logger: GmeLogger = js.native
    
    /* CompleteClass */
    var _panels: js.Array[typingsJapgolly.webgme.GmePanel.PanelBase] = js.native
    
    /* CompleteClass */
    override def addPanel(name: String, panel: typingsJapgolly.webgme.GmePanel.PanelBase, container: Container): Unit = js.native
    
    /* CompleteClass */
    override def loadLayout(layout: typingsJapgolly.webgme.GmePanel.Layout, callback: LayoutCallback): Unit = js.native
    
    /* CompleteClass */
    override def loadPanel(params: Params, callback: LayoutCallback): Unit = js.native
    
    /* CompleteClass */
    override def removePanel(name: String): Unit = js.native
    
    /* CompleteClass */
    override def setPanelReadOnly(readOnly: Boolean): Unit = js.native
  }
  
  @JSGlobal("GmePanel.Logger")
  @js.native
  open class Logger ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.Logger {
    
    /* CompleteClass */
    override def createLogger(name: String, options: LogOptions): typingsJapgolly.webgme.GmePanel.Logger = js.native
    
    /* CompleteClass */
    override def createWithGmeConfig(name: String, gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig): typingsJapgolly.webgme.GmePanel.Logger = js.native
  }
  
  @JSGlobal("GmePanel.PanelBase")
  @js.native
  open class PanelBase protected ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var OPTIONS: Options = js.native
    
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var control: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    
    /* CompleteClass */
    var logger: GmeLogger = js.native
    
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typingsJapgolly.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typingsJapgolly.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
  }
  
  @JSGlobal("GmePanel.PanelBaseWithHeader")
  @js.native
  open class PanelBaseWithHeader protected ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typingsJapgolly.webgme.GmePanel.LayoutManager) = this()
    
    /* CompleteClass */
    var OPTIONS: Options = js.native
    /* CompleteClass */
    @JSName("OPTIONS")
    var OPTIONS_PanelBaseWithHeader: OptionsWithHeader = js.native
    
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var control: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getNodeID(): String = js.native
    
    /* CompleteClass */
    override def initUI(options: OptionsWithHeader): Unit = js.native
    
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    
    /* CompleteClass */
    var logger: GmeLogger = js.native
    
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setActive(isActive: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setContainerUpdateFn(
      currentLayout: typingsJapgolly.webgme.GmePanel.Layout,
      sizeUpdateFn: js.Function1[/* layout */ typingsJapgolly.webgme.GmePanel.Layout, Double]
    ): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setTitle(text: String): Unit = js.native
  }
  
  @JSGlobal("GmePanel.PanelManager")
  @js.native
  open class PanelManager protected ()
    extends StObject
       with typingsJapgolly.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
    
    /* CompleteClass */
    override def getActivePanel(): typingsJapgolly.webgme.GmePanel.PanelBase = js.native
    
    /* CompleteClass */
    override def setActivePanel(panel: typingsJapgolly.webgme.GmePanel.PanelBase): Unit = js.native
  }
}
