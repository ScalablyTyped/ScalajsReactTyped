package typingsJapgolly.extjs.global.Ext

import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentQuery")
@js.native
open class ComponentQuery ()
  extends StObject
     with typingsJapgolly.extjs.Ext.ComponentQuery
/* static members */
object ComponentQuery {
  
  @JSGlobal("Ext.ComponentQuery")
  @js.native
  val ^ : js.Any = js.native
  
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
  
  /** [Method] Tests whether the passed Component matches the selector string
    * @param component Ext.Component The Component to test
    * @param selector String The selector string to test against.
    * @returns Boolean True if the Component matches the selector.
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(component: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(component: IComponent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is(component: IComponent, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Returns an array of matched Components from within the passed root object
    * @param selector String The selector string to filter returned Components
    * @param root Ext.container.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
    * @returns Ext.Component[] The matched Components.
    */
  inline def query(): typingsJapgolly.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def query(selector: java.lang.String): typingsJapgolly.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def query(selector: java.lang.String, root: IContainer): typingsJapgolly.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  inline def query(selector: Unit, root: IContainer): typingsJapgolly.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.extjs.Ext.Array]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.ComponentQuery.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
}
