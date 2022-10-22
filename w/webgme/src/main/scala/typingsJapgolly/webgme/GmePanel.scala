package typingsJapgolly.webgme

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webgme.Global_.GmeLogger
import typingsJapgolly.webgme.GmeConfig.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  trait Container extends StObject
  
  trait IActivePanel extends StObject {
    
    def getNodeID(): String
    
    def onActivate(): Unit
    
    def onDeactivate(): Unit
    
    def setActive(isActive: Boolean): Unit
  }
  object IActivePanel {
    
    inline def apply(
      getNodeID: CallbackTo[String],
      onActivate: Callback,
      onDeactivate: Callback,
      setActive: Boolean => Callback
    ): IActivePanel = {
      val __obj = js.Dynamic.literal(getNodeID = getNodeID.toJsFn, onActivate = onActivate.toJsFn, onDeactivate = onDeactivate.toJsFn, setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()))
      __obj.asInstanceOf[IActivePanel]
    }
    
    extension [Self <: IActivePanel](x: Self) {
      
      inline def setGetNodeID(value: CallbackTo[String]): Self = StObject.set(x, "getNodeID", value.toJsFn)
      
      inline def setOnActivate(value: Callback): Self = StObject.set(x, "onActivate", value.toJsFn)
      
      inline def setOnDeactivate(value: Callback): Self = StObject.set(x, "onDeactivate", value.toJsFn)
      
      inline def setSetActive(value: Boolean => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait Layout extends StObject
  
  type LayoutCallback = js.Function1[/* self */ LayoutManager, Unit]
  
  trait LayoutManager extends StObject {
    
    var _currentLayout: Layout
    
    var _currentLayoutName: String
    
    var _logger: GmeLogger
    
    var _panels: js.Array[PanelBase]
    
    def addPanel(name: String, panel: PanelBase, container: Container): Unit
    
    def loadLayout(layout: Layout, callback: LayoutCallback): Unit
    
    def loadPanel(params: Params, callback: LayoutCallback): Unit
    
    def removePanel(name: String): Unit
    
    def setPanelReadOnly(readOnly: Boolean): Unit
  }
  object LayoutManager {
    
    inline def apply(
      _currentLayout: Layout,
      _currentLayoutName: String,
      _logger: GmeLogger,
      _panels: js.Array[PanelBase],
      addPanel: (String, PanelBase, Container) => Callback,
      loadLayout: (Layout, LayoutCallback) => Callback,
      loadPanel: (Params, LayoutCallback) => Callback,
      removePanel: String => Callback,
      setPanelReadOnly: Boolean => Callback
    ): LayoutManager = {
      val __obj = js.Dynamic.literal(_currentLayout = _currentLayout.asInstanceOf[js.Any], _currentLayoutName = _currentLayoutName.asInstanceOf[js.Any], _logger = _logger.asInstanceOf[js.Any], _panels = _panels.asInstanceOf[js.Any], addPanel = js.Any.fromFunction3((t0: String, t1: PanelBase, t2: Container) => (addPanel(t0, t1, t2)).runNow()), loadLayout = js.Any.fromFunction2((t0: Layout, t1: LayoutCallback) => (loadLayout(t0, t1)).runNow()), loadPanel = js.Any.fromFunction2((t0: Params, t1: LayoutCallback) => (loadPanel(t0, t1)).runNow()), removePanel = js.Any.fromFunction1((t0: String) => removePanel(t0).runNow()), setPanelReadOnly = js.Any.fromFunction1((t0: Boolean) => setPanelReadOnly(t0).runNow()))
      __obj.asInstanceOf[LayoutManager]
    }
    
    extension [Self <: LayoutManager](x: Self) {
      
      inline def setAddPanel(value: (String, PanelBase, Container) => Callback): Self = StObject.set(x, "addPanel", js.Any.fromFunction3((t0: String, t1: PanelBase, t2: Container) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoadLayout(value: (Layout, LayoutCallback) => Callback): Self = StObject.set(x, "loadLayout", js.Any.fromFunction2((t0: Layout, t1: LayoutCallback) => (value(t0, t1)).runNow()))
      
      inline def setLoadPanel(value: (Params, LayoutCallback) => Callback): Self = StObject.set(x, "loadPanel", js.Any.fromFunction2((t0: Params, t1: LayoutCallback) => (value(t0, t1)).runNow()))
      
      inline def setRemovePanel(value: String => Callback): Self = StObject.set(x, "removePanel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetPanelReadOnly(value: Boolean => Callback): Self = StObject.set(x, "setPanelReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def set_currentLayout(value: Layout): Self = StObject.set(x, "_currentLayout", value.asInstanceOf[js.Any])
      
      inline def set_currentLayoutName(value: String): Self = StObject.set(x, "_currentLayoutName", value.asInstanceOf[js.Any])
      
      inline def set_logger(value: GmeLogger): Self = StObject.set(x, "_logger", value.asInstanceOf[js.Any])
      
      inline def set_panels(value: js.Array[PanelBase]): Self = StObject.set(x, "_panels", value.asInstanceOf[js.Any])
      
      inline def set_panelsVarargs(value: PanelBase*): Self = StObject.set(x, "_panels", js.Array(value*))
    }
  }
  
  trait Logger extends StObject {
    
    def createLogger(name: String, options: LogOptions): Logger
    
    def createWithGmeConfig(name: String, gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig): Logger
  }
  object Logger {
    
    inline def apply(
      createLogger: (String, LogOptions) => Logger,
      createWithGmeConfig: (String, typingsJapgolly.webgme.GmeConfig.GmeConfig) => Logger
    ): Logger = {
      val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setCreateLogger(value: (String, LogOptions) => Logger): Self = StObject.set(x, "createLogger", js.Any.fromFunction2(value))
      
      inline def setCreateWithGmeConfig(value: (String, typingsJapgolly.webgme.GmeConfig.GmeConfig) => Logger): Self = StObject.set(x, "createWithGmeConfig", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var LOGGER_INSTANCE_NAME: String
  }
  object Options {
    
    inline def apply(LOGGER_INSTANCE_NAME: String): Options = {
      val __obj = js.Dynamic.literal(LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLOGGER_INSTANCE_NAME(value: String): Self = StObject.set(x, "LOGGER_INSTANCE_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsWithHeader
    extends StObject
       with Options {
    
    var FLOATING_TITLE: String
    
    var HEADER_TITLE: String
    
    var NO_SCROLLING: String
  }
  object OptionsWithHeader {
    
    inline def apply(FLOATING_TITLE: String, HEADER_TITLE: String, LOGGER_INSTANCE_NAME: String, NO_SCROLLING: String): OptionsWithHeader = {
      val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE.asInstanceOf[js.Any], HEADER_TITLE = HEADER_TITLE.asInstanceOf[js.Any], LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any], NO_SCROLLING = NO_SCROLLING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithHeader]
    }
    
    extension [Self <: OptionsWithHeader](x: Self) {
      
      inline def setFLOATING_TITLE(value: String): Self = StObject.set(x, "FLOATING_TITLE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TITLE(value: String): Self = StObject.set(x, "HEADER_TITLE", value.asInstanceOf[js.Any])
      
      inline def setNO_SCROLLING(value: String): Self = StObject.set(x, "NO_SCROLLING", value.asInstanceOf[js.Any])
    }
  }
  
  trait PanelBase extends StObject {
    
    var OPTIONS: Options
    
    def afterAppend(): Unit
    
    def clear(): Unit
    
    var control: Any
    
    def destroy(): Unit
    
    def isReadOnly(): Boolean
    
    var logger: GmeLogger
    
    def onReadOnlyChanged(isReadOnly: Boolean): Unit
    
    def onResize(width: Double, height: Double): Unit
    
    def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit
    
    def setReadOnly(isReadOnly: Boolean): Unit
    
    def setSize(width: Double, height: Double): Unit
  }
  object PanelBase {
    
    inline def apply(
      OPTIONS: Options,
      afterAppend: Callback,
      clear: Callback,
      control: Any,
      destroy: Callback,
      isReadOnly: CallbackTo[Boolean],
      logger: GmeLogger,
      onReadOnlyChanged: Boolean => Callback,
      onResize: (Double, Double) => Callback,
      setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Callback,
      setReadOnly: Boolean => Callback,
      setSize: (Double, Double) => Callback
    ): PanelBase = {
      val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = afterAppend.toJsFn, clear = clear.toJsFn, control = control.asInstanceOf[js.Any], destroy = destroy.toJsFn, isReadOnly = isReadOnly.toJsFn, logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1((t0: Boolean) => onReadOnlyChanged(t0).runNow()), onResize = js.Any.fromFunction2((t0: Double, t1: Double) => (onResize(t0, t1)).runNow()), setContainerUpdateFn = js.Any.fromFunction2((t0: Layout, t1: js.Function1[/* layout */ Layout, Double]) => (setContainerUpdateFn(t0, t1)).runNow()), setReadOnly = js.Any.fromFunction1((t0: Boolean) => setReadOnly(t0).runNow()), setSize = js.Any.fromFunction2((t0: Double, t1: Double) => (setSize(t0, t1)).runNow()))
      __obj.asInstanceOf[PanelBase]
    }
    
    extension [Self <: PanelBase](x: Self) {
      
      inline def setAfterAppend(value: Callback): Self = StObject.set(x, "afterAppend", value.toJsFn)
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setControl(value: Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
      
      inline def setLogger(value: GmeLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: Options): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setOnReadOnlyChanged(value: Boolean => Callback): Self = StObject.set(x, "onReadOnlyChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setOnResize(value: (Double, Double) => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetContainerUpdateFn(value: (Layout, js.Function1[/* layout */ Layout, Double]) => Callback): Self = StObject.set(x, "setContainerUpdateFn", js.Any.fromFunction2((t0: Layout, t1: js.Function1[/* layout */ Layout, Double]) => (value(t0, t1)).runNow()))
      
      inline def setSetReadOnly(value: Boolean => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetSize(value: (Double, Double) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  trait PanelBaseWithHeader
    extends StObject
       with PanelBase {
    
    @JSName("OPTIONS")
    var OPTIONS_PanelBaseWithHeader: OptionsWithHeader
    
    def getNodeID(): String
    
    def initUI(options: OptionsWithHeader): Unit
    
    def setActive(isActive: Boolean): Unit
    
    def setTitle(text: String): Unit
  }
  object PanelBaseWithHeader {
    
    inline def apply(
      OPTIONS: OptionsWithHeader,
      afterAppend: Callback,
      clear: Callback,
      control: Any,
      destroy: Callback,
      getNodeID: CallbackTo[String],
      initUI: OptionsWithHeader => Callback,
      isReadOnly: CallbackTo[Boolean],
      logger: GmeLogger,
      onReadOnlyChanged: Boolean => Callback,
      onResize: (Double, Double) => Callback,
      setActive: Boolean => Callback,
      setContainerUpdateFn: (Layout, js.Function1[/* layout */ Layout, Double]) => Callback,
      setReadOnly: Boolean => Callback,
      setSize: (Double, Double) => Callback,
      setTitle: String => Callback
    ): PanelBaseWithHeader = {
      val __obj = js.Dynamic.literal(OPTIONS = OPTIONS.asInstanceOf[js.Any], afterAppend = afterAppend.toJsFn, clear = clear.toJsFn, control = control.asInstanceOf[js.Any], destroy = destroy.toJsFn, getNodeID = getNodeID.toJsFn, initUI = js.Any.fromFunction1((t0: OptionsWithHeader) => initUI(t0).runNow()), isReadOnly = isReadOnly.toJsFn, logger = logger.asInstanceOf[js.Any], onReadOnlyChanged = js.Any.fromFunction1((t0: Boolean) => onReadOnlyChanged(t0).runNow()), onResize = js.Any.fromFunction2((t0: Double, t1: Double) => (onResize(t0, t1)).runNow()), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setContainerUpdateFn = js.Any.fromFunction2((t0: Layout, t1: js.Function1[/* layout */ Layout, Double]) => (setContainerUpdateFn(t0, t1)).runNow()), setReadOnly = js.Any.fromFunction1((t0: Boolean) => setReadOnly(t0).runNow()), setSize = js.Any.fromFunction2((t0: Double, t1: Double) => (setSize(t0, t1)).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
      __obj.asInstanceOf[PanelBaseWithHeader]
    }
    
    extension [Self <: PanelBaseWithHeader](x: Self) {
      
      inline def setGetNodeID(value: CallbackTo[String]): Self = StObject.set(x, "getNodeID", value.toJsFn)
      
      inline def setInitUI(value: OptionsWithHeader => Callback): Self = StObject.set(x, "initUI", js.Any.fromFunction1((t0: OptionsWithHeader) => value(t0).runNow()))
      
      inline def setOPTIONS(value: OptionsWithHeader): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setSetActive(value: Boolean => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait PanelManager extends StObject {
    
    def getActivePanel(): PanelBase
    
    def setActivePanel(panel: PanelBase): Unit
  }
  object PanelManager {
    
    inline def apply(getActivePanel: CallbackTo[PanelBase], setActivePanel: PanelBase => Callback): PanelManager = {
      val __obj = js.Dynamic.literal(getActivePanel = getActivePanel.toJsFn, setActivePanel = js.Any.fromFunction1((t0: PanelBase) => setActivePanel(t0).runNow()))
      __obj.asInstanceOf[PanelManager]
    }
    
    extension [Self <: PanelManager](x: Self) {
      
      inline def setGetActivePanel(value: CallbackTo[PanelBase]): Self = StObject.set(x, "getActivePanel", value.toJsFn)
      
      inline def setSetActivePanel(value: PanelBase => Callback): Self = StObject.set(x, "setActivePanel", js.Any.fromFunction1((t0: PanelBase) => value(t0).runNow()))
    }
  }
  
  trait Params extends StObject {
    
    var client: Any
  }
  object Params {
    
    inline def apply(client: Any): Params = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
