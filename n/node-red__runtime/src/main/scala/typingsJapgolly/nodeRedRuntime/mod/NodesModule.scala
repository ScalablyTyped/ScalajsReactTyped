package typingsJapgolly.nodeRedRuntime.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeRedRuntime.anon.EnabledId
import typingsJapgolly.nodeRedRuntime.anon.EnabledModule
import typingsJapgolly.nodeRedRuntime.anon.IconModule
import typingsJapgolly.nodeRedRuntime.anon.IdReq
import typingsJapgolly.nodeRedRuntime.anon.Lang
import typingsJapgolly.nodeRedRuntime.anon.LangModule
import typingsJapgolly.nodeRedRuntime.anon.LangReq
import typingsJapgolly.nodeRedRuntime.anon.ModuleReq
import typingsJapgolly.nodeRedRuntime.anon.Req
import typingsJapgolly.nodeRedRuntime.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesModule extends StObject {
  
  /**
    * Install a new module into the runtime
    * @param opts
    * @param opts.module - the id of the module to install
    * @param opts.version - (optional) the version of the module to install
    * @param opts.url - (optional) url to install
    * @param opts.req - the request to log (optional)
    * @returns the node module info
    */
  def addModule(opts: Version): js.Promise[js.Object]
  
  /**
    * Gets a node icon
    * @param opts
    * @param opts.module - the id of the module requesting the icon
    * @param opts.icon - the name of the icon
    * @param opts.req - the request to log (optional)
    * @returns the icon file as a Buffer or null if no icon available
    */
  def getIcon(opts: IconModule): js.Promise[Buffer]
  
  /**
    * Gets the list of all icons available in the modules installed within the runtime
    * @param opts
    * @param opts.req - the request to log (optional)
    * @returns the list of all icons
    */
  def getIconList(opts: Req): js.Promise[js.Object]
  
  /**
    * Gets a modules message catalog
    * @param opts
    * @param opts.module - the module
    * @param opts.lang - the i18n language to return. If not set, uses runtime default (en-US)
    * @param opts.req - the request to log (optional)
    * @returns the message catalog
    */
  def getModuleCatalog(opts: LangModule): js.Promise[js.Object]
  
  /**
    * Gets all registered module message catalogs
    * @param opts
    * @param opts.lang - the i18n language to return. If not set, uses runtime default (en-US)
    * @param opts.req - the request to log (optional)
    * @returns the message catalogs
    */
  def getModuleCatalogs(opts: LangReq): js.Promise[js.Object]
  
  /**
    * Gets the info of a node module
    * @param opts
    * @param opts.module - the id of the module to return
    * @param opts.req - the request to log (optional)
    * @returns the node module info
    */
  def getModuleInfo(opts: ModuleReq): js.Promise[js.Object]
  
  /**
    * Gets an individual node's html content
    * @param opts
    * @param opts.id - the id of the node set to return
    * @param opts.lang - the locale language to return
    * @param opts.req - the request to log (optional)
    * @returns - the node html content
    */
  def getNodeConfig(opts: Lang): js.Promise[String]
  
  /**
    * Gets all node html content
    * @param opts
    * @param opts.lang - the locale language to return
    * @param opts.req - the request to log (optional)
    * @returns the node html content
    */
  def getNodeConfigs(opts: LangReq): js.Promise[String]
  
  /**
    * Gets the info of an individual node set
    * @param opts
    * @param opts.id - the id of the node set to return
    * @param opts.req - the request to log (optional)
    * @returns the node information
    */
  def getNodeInfo(opts: IdReq): js.Promise[js.Object]
  
  /**
    * Gets the list of node modules installed in the runtime
    * @param opts
    * @param opts.req - the request to log (optional)
    * @returns the list of node modules
    */
  def getNodeList(opts: Req): js.Promise[js.Array[js.Object]]
  
  /**
    * Removes a module from the runtime
    * @param opts
    * @param opts.module - the id of the module to remove
    * @param opts.req - the request to log (optional)
    * @returns resolves when complete
    */
  def removeModule(opts: ModuleReq): js.Promise[Unit]
  
  /**
    * Enables or disables a module in the runtime
    * @param opts
    * @param opts.module - the id of the module to enable or disable
    * @param opts.enabled - whether the module should be enabled or disabled
    * @param opts.req - the request to log (optional)
    * @returns the module info object
    */
  def setModuleState(opts: EnabledModule): js.Promise[js.Object]
  
  /**
    * Enables or disables a n individual node-set in the runtime
    * @param opts
    * @param opts.id - the id of the node-set to enable or disable
    * @param opts.enabled - whether the module should be enabled or disabled
    * @param opts.req - the request to log (optional)
    * @returns the module info object
    */
  def setNodeSetState(opts: EnabledId): js.Promise[js.Object]
}
object NodesModule {
  
  inline def apply(
    addModule: Version => js.Promise[js.Object],
    getIcon: IconModule => js.Promise[Buffer],
    getIconList: Req => js.Promise[js.Object],
    getModuleCatalog: LangModule => js.Promise[js.Object],
    getModuleCatalogs: LangReq => js.Promise[js.Object],
    getModuleInfo: ModuleReq => js.Promise[js.Object],
    getNodeConfig: Lang => js.Promise[String],
    getNodeConfigs: LangReq => js.Promise[String],
    getNodeInfo: IdReq => js.Promise[js.Object],
    getNodeList: Req => js.Promise[js.Array[js.Object]],
    removeModule: ModuleReq => js.Promise[Unit],
    setModuleState: EnabledModule => js.Promise[js.Object],
    setNodeSetState: EnabledId => js.Promise[js.Object]
  ): NodesModule = {
    val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), getIcon = js.Any.fromFunction1(getIcon), getIconList = js.Any.fromFunction1(getIconList), getModuleCatalog = js.Any.fromFunction1(getModuleCatalog), getModuleCatalogs = js.Any.fromFunction1(getModuleCatalogs), getModuleInfo = js.Any.fromFunction1(getModuleInfo), getNodeConfig = js.Any.fromFunction1(getNodeConfig), getNodeConfigs = js.Any.fromFunction1(getNodeConfigs), getNodeInfo = js.Any.fromFunction1(getNodeInfo), getNodeList = js.Any.fromFunction1(getNodeList), removeModule = js.Any.fromFunction1(removeModule), setModuleState = js.Any.fromFunction1(setModuleState), setNodeSetState = js.Any.fromFunction1(setNodeSetState))
    __obj.asInstanceOf[NodesModule]
  }
  
  extension [Self <: NodesModule](x: Self) {
    
    inline def setAddModule(value: Version => js.Promise[js.Object]): Self = StObject.set(x, "addModule", js.Any.fromFunction1(value))
    
    inline def setGetIcon(value: IconModule => js.Promise[Buffer]): Self = StObject.set(x, "getIcon", js.Any.fromFunction1(value))
    
    inline def setGetIconList(value: Req => js.Promise[js.Object]): Self = StObject.set(x, "getIconList", js.Any.fromFunction1(value))
    
    inline def setGetModuleCatalog(value: LangModule => js.Promise[js.Object]): Self = StObject.set(x, "getModuleCatalog", js.Any.fromFunction1(value))
    
    inline def setGetModuleCatalogs(value: LangReq => js.Promise[js.Object]): Self = StObject.set(x, "getModuleCatalogs", js.Any.fromFunction1(value))
    
    inline def setGetModuleInfo(value: ModuleReq => js.Promise[js.Object]): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
    
    inline def setGetNodeConfig(value: Lang => js.Promise[String]): Self = StObject.set(x, "getNodeConfig", js.Any.fromFunction1(value))
    
    inline def setGetNodeConfigs(value: LangReq => js.Promise[String]): Self = StObject.set(x, "getNodeConfigs", js.Any.fromFunction1(value))
    
    inline def setGetNodeInfo(value: IdReq => js.Promise[js.Object]): Self = StObject.set(x, "getNodeInfo", js.Any.fromFunction1(value))
    
    inline def setGetNodeList(value: Req => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "getNodeList", js.Any.fromFunction1(value))
    
    inline def setRemoveModule(value: ModuleReq => js.Promise[Unit]): Self = StObject.set(x, "removeModule", js.Any.fromFunction1(value))
    
    inline def setSetModuleState(value: EnabledModule => js.Promise[js.Object]): Self = StObject.set(x, "setModuleState", js.Any.fromFunction1(value))
    
    inline def setSetNodeSetState(value: EnabledId => js.Promise[js.Object]): Self = StObject.set(x, "setNodeSetState", js.Any.fromFunction1(value))
  }
}
