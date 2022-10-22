package typingsJapgolly.extjs.global.Ext

import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.util.IHashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.PluginManager")
@js.native
open class PluginManager ()
  extends StObject
     with typingsJapgolly.extjs.Ext.PluginManager
/* static members */
object PluginManager {
  
  @JSGlobal("Ext.PluginManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (Ext.util.HashMap) */
  @JSGlobal("Ext.PluginManager.all")
  @js.native
  def all: IHashMap = js.native
  inline def all_=(x: IHashMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Creates a new Plugin from the specified config object using the config object s ptype to determine the class to insta
    * @param config Object A configuration object for the Plugin you wish to create.
    * @param defaultType Function The constructor to provide the default Plugin type if the config object does not contain a ptype. (Optional if the config contains a ptype).
    * @returns Ext.Component The newly instantiated Plugin.
    */
  inline def create(): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IComponent]
  inline def create(config: Any): IComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[IComponent]
  inline def create(config: Any, defaultType: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  inline def create(config: Unit, defaultType: Any): IComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], defaultType.asInstanceOf[js.Any])).asInstanceOf[IComponent]
  
  /** [Method] Executes the specified function once for each item in the collection
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in. Defaults to this.
    */
  inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  inline def each(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def each(fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Returns all plugins registered with the given type
    * @param type String The type to search for
    * @param defaultsOnly Boolean True to only return plugins of this type where the plugin's isDefault property is truthy
    * @returns Ext.AbstractPlugin[] All matching plugins
    */
  inline def findByType(): typingsJapgolly.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("findByType")().asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def findByType(`type`: java.lang.String): typingsJapgolly.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("findByType")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def findByType(`type`: java.lang.String, defaultsOnly: Boolean): typingsJapgolly.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("findByType")(`type`.asInstanceOf[js.Any], defaultsOnly.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def findByType(`type`: Unit, defaultsOnly: Boolean): typingsJapgolly.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("findByType")(`type`.asInstanceOf[js.Any], defaultsOnly.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  
  /** [Method] Returns an item by id
    * @param id String The id of the item
    * @returns Object The item, undefined if not found.
    */
  inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
  inline def get(id: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Gets the number of items in the collection
    * @returns Number The number of items in the collection.
    */
  inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
  
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
    * @param name String Name of the config option to return.
    * @returns Object/Mixed The full config object or a single config value when name parameter specified.
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Initialize configuration for this class
    * @param config Object
    * @returns Ext.Base this
    */
  inline def initConfig(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[IBase]
  inline def initConfig(config: Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Checks if an item type is registered
    * @param type String The mnemonic string by which the class may be looked up
    * @returns Boolean Whether the type is registered.
    */
  inline def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
  inline def isRegistered(`type`: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
    * @param id String The item id
    * @param fn Function The callback function. Called with a single parameter, the item.
    * @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
    */
  inline def onAvailable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")().asInstanceOf[Unit]
  inline def onAvailable(id: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onAvailable(id: java.lang.String, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAvailable(id: java.lang.String, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAvailable(id: java.lang.String, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAvailable(id: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAvailable(id: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onAvailable(id: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAvailable")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Registers an item to be managed
    * @param item Object The item to register
    */
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  inline def register(item: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Registers a new item constructor keyed by a type key
    * @param type String The mnemonic string by which the class may be looked up.
    * @param cls Function The new instance class.
    */
  inline def registerType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")().asInstanceOf[Unit]
  inline def registerType(`type`: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerType(`type`: java.lang.String, cls: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], cls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerType(`type`: Unit, cls: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(`type`.asInstanceOf[js.Any], cls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.PluginManager.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters an item by removing it from this manager
    * @param item Object The item to unregister
    */
  inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  inline def unregister(item: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
