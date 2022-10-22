package typingsJapgolly.webgme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webgme.GmeCommon.MetadataHash
import typingsJapgolly.webgme.GmeCommon.Path
import typingsJapgolly.webgme.GmePanel.Layout
import typingsJapgolly.webgme.GmePanel.LayoutManager
import typingsJapgolly.webgme.GmePanel.PanelManager
import typingsJapgolly.webgme.Visualize.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global_ {
  
  @js.native
  trait GmeLogger extends StObject {
    
    def debug(fmt: String): Unit = js.native
    def debug(fmt: String, msg: String): Unit = js.native
    
    def error(fmt: String): Unit = js.native
    def error(fmt: String, msg: String): Unit = js.native
    
    /**
      Creates a new logger with the same settings
      and a name that is an augmentation of this logger and the
      provided string.
      If the second argument is true
      - the provided name will be used as is.
      */
    def fork(fmt: String): GmeLogger = js.native
    def fork(fmt: String, reuse: Boolean): GmeLogger = js.native
    
    def info(fmt: String): Unit = js.native
    def info(fmt: String, msg: String): Unit = js.native
    
    def warn(fmt: String): Unit = js.native
    def warn(fmt: String, msg: String): Unit = js.native
  }
  
  trait History extends StObject {
    
    var configurable: Boolean
    
    var enumerable: Boolean
    
    var value: Boolean
    
    var writable: Boolean
  }
  object History {
    
    inline def apply(configurable: Boolean, enumerable: Boolean, value: Boolean, writable: Boolean): History = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyboardManager extends StObject {
    
    def setEnabled(action: Boolean): Unit = js.native
    
    def setListener(): Unit = js.native
    def setListener(listener: Any): Unit = js.native
  }
  
  @js.native
  trait State extends StObject {
    
    def clear(): Unit = js.native
    def clear(options: StateOptions): Unit = js.native
    
    def getActiveObject(): Any = js.native
    
    def off(message: String, handler: StateHandler): Unit = js.native
    
    def on(message: String, handler: StateHandler, target: Any): Unit = js.native
    
    def registerActiveBranchName(branchName: String): Unit = js.native
    
    def registerActiveCommit(activeCommitHash: MetadataHash): Unit = js.native
    
    def registerActiveObject(nodePath: Path): Unit = js.native
    
    def registerActiveSelection(selection: js.Array[String]): Unit = js.native
    
    def registerActiveVisualizer(vizualizer: Visualizer): Unit = js.native
    
    def registerLayout(layout: Layout): Unit = js.native
    
    def registerSuppressVisualizerFromNode(register: Boolean): Unit = js.native
    
    def set(update: State): Unit = js.native
    
    def toJSON(): Any = js.native
  }
  
  type StateHandler = js.Function2[/* model */ Any, /* change */ String, Unit]
  
  trait StateOptions extends StObject {
    
    var silent: Boolean
  }
  object StateOptions {
    
    inline def apply(silent: Boolean): StateOptions = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateOptions]
    }
    
    extension [Self <: StateOptions](x: Self) {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo extends StObject {
    
    var _id: String
  }
  object UserInfo {
    
    inline def apply(_id: String): UserInfo = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGmeGlobal extends StObject {
    
    var GitHubVersion: js.UndefOr[String] = js.undefined
    
    var KeyboardManager: js.UndefOr[typingsJapgolly.webgme.Global_.KeyboardManager] = js.undefined
    
    var LayoutManager: js.UndefOr[typingsJapgolly.webgme.GmePanel.LayoutManager] = js.undefined
    
    var NpmVersion: js.UndefOr[String] = js.undefined
    
    var PanelManager: js.UndefOr[typingsJapgolly.webgme.GmePanel.PanelManager] = js.undefined
    
    var State: js.UndefOr[typingsJapgolly.webgme.Global_.State] = js.undefined
    
    var Toolbar: js.UndefOr[typingsJapgolly.webgme.Toolbar.Toolbar] = js.undefined
    
    def getConfig(): typingsJapgolly.webgme.GmeConfig.GmeConfig
    
    var gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig
    
    var history: js.UndefOr[History] = js.undefined
    
    var userInfo: js.UndefOr[UserInfo] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object WebGmeGlobal {
    
    inline def apply(
      getConfig: CallbackTo[typingsJapgolly.webgme.GmeConfig.GmeConfig],
      gmeConfig: typingsJapgolly.webgme.GmeConfig.GmeConfig
    ): WebGmeGlobal = {
      val __obj = js.Dynamic.literal(getConfig = getConfig.toJsFn, gmeConfig = gmeConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGmeGlobal]
    }
    
    extension [Self <: WebGmeGlobal](x: Self) {
      
      inline def setGetConfig(value: CallbackTo[typingsJapgolly.webgme.GmeConfig.GmeConfig]): Self = StObject.set(x, "getConfig", value.toJsFn)
      
      inline def setGitHubVersion(value: String): Self = StObject.set(x, "GitHubVersion", value.asInstanceOf[js.Any])
      
      inline def setGitHubVersionUndefined: Self = StObject.set(x, "GitHubVersion", js.undefined)
      
      inline def setGmeConfig(value: typingsJapgolly.webgme.GmeConfig.GmeConfig): Self = StObject.set(x, "gmeConfig", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setKeyboardManager(value: KeyboardManager): Self = StObject.set(x, "KeyboardManager", value.asInstanceOf[js.Any])
      
      inline def setKeyboardManagerUndefined: Self = StObject.set(x, "KeyboardManager", js.undefined)
      
      inline def setLayoutManager(value: LayoutManager): Self = StObject.set(x, "LayoutManager", value.asInstanceOf[js.Any])
      
      inline def setLayoutManagerUndefined: Self = StObject.set(x, "LayoutManager", js.undefined)
      
      inline def setNpmVersion(value: String): Self = StObject.set(x, "NpmVersion", value.asInstanceOf[js.Any])
      
      inline def setNpmVersionUndefined: Self = StObject.set(x, "NpmVersion", js.undefined)
      
      inline def setPanelManager(value: PanelManager): Self = StObject.set(x, "PanelManager", value.asInstanceOf[js.Any])
      
      inline def setPanelManagerUndefined: Self = StObject.set(x, "PanelManager", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      inline def setToolbar(value: typingsJapgolly.webgme.Toolbar.Toolbar): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "Toolbar", js.undefined)
      
      inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
