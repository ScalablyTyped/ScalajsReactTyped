package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives a description of a configuration schema as a sequence of events.
  * @since OOo 1.1.2
  */
trait XSchemaHandler
  extends StObject
     with XInterface {
  
  /**
    * receives notification that the current group has a child node that is an instance of a specified template.
    * @param aName specifies the name of the new node.
    * @param aTemplate specifies a template that describes the new node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addInstance(aName: String, aTemplate: TemplateIdentifier): Unit
  
  /**
    * receives notification that the current set can contain items that are instances of a specified template.
    * @param aItemType specifies a template that is accepted as valid item type for the current set node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif the template is not foundif the
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addItemType(aItemType: TemplateIdentifier): Unit
  
  /**
    * receives notification that a property is added to the current node.
    *
    * The property will have a default value of `NULL` (unless it is {@link SchemaAttribute.REQUIRED} ).
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link SchemaAttribute} flags.
    * @param aType specifies the type of the new property.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif a property with
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addProperty(aName: String, aAttributes: Double, aType: `type`): Unit
  
  /**
    * receives notification that a property having a default value is added to the current node.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link SchemaAttribute} flags.
    * @param aDefaultValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif a property with
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addPropertyWithDefault(aName: String, aAttributes: Double, aDefaultValue: Any): Unit
  
  /**
    * receives notification that a component description is complete.
    *
    * Must match a previous call to {@link startComponent()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the componentif there is a unfinished subnode in pr
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endComponent(): Unit
  
  /**
    * receives notification that a node description is complete.
    *
    * Must match the last open call to {@link startGroup()} or {@link startSet()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if the name is not a the name of the node in progressif invalid data is detected i
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): Unit
  
  /**
    * receives notification that the current schema description is complete.
    *
    * Must match a previous call to {@link startSchema()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the schemaif there is a unfinished component or tem
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endSchema(): Unit
  
  /**
    * receives notification that a template description is complete.
    *
    * Must match a previous call to {@link startGroupTemplate()} or {@link startSetTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the templateif there is a unfinished subnode in pro
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endTemplate(): Unit
  
  /**
    * receives notification that the schema depends on templates from a different component.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def importComponent(aName: String): Unit
  
  /**
    * receives notification that a component description is started.
    *
    * Subsequent calls describe the schema of the component until a matching call to {@link endComponent()} is encountered.
    * @param aName specifies the name of the component.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startComponent(aName: String): Unit
  
  /**
    * receives notification that a group description is started.
    *
    * Subsequent calls describe the members and properties of the group until a matching call to {@link endNode()} is encountered.
    * @param aName specifies the name of the group.
    * @param aAttributes specifies the attributes of the node.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTENSIBL
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startGroup(aName: String, aAttributes: Double): Unit
  
  /**
    * receives notification that a template description is started for a group.
    *
    * Subsequent calls describe the members and properties of the template until a matching call to {@link endTemplate()} is encountered.
    * @param aTemplate specifies the identity of the template.
    * @param aAttributes specifies the attributes of the template.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTEN
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startGroupTemplate(aTemplate: TemplateIdentifier, aAttributes: Double): Unit
  
  /**
    * receives notification that a schema description is started.
    *
    * The schema description may comprise components templates or both.
    * @throws com::sun::star::configuration::backend::MalformedDataException if a schema is already started (and has not been ended).
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSchema(): Unit
  
  /**
    * receives notification that a set description is started.
    *
    * Subsequent calls describe the item-types and properties of the set until a matching call to {@link endNode()} is encountered.
    * @param aName specifies the name of the set.
    * @param aAttributes specifies the attributes of the node.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTENSIBL
    * @param aItemType specifies the (default) template for set items.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group node in progress currentlyif there already is a node with t
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSet(aName: String, aAttributes: Double, aItemType: TemplateIdentifier): Unit
  
  /**
    * receives notification that a template description is started for a set.
    *
    * Subsequent calls describe the members and properties of the template until a matching call to {@link endTemplate()} is encountered.
    * @param aTemplate specifies the identity of the template.
    * @param aAttributes specifies the attributes of the template.  The value is a combination of {@link SchemaAttribute} flags.  {@link SchemaAttribute.EXTEN
    * @param aItemType specifies the (default) template for set items.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is a unfinished component or template in progressif no schema is started
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startSetTemplate(aTemplate: TemplateIdentifier, aAttributes: Double, aItemType: TemplateIdentifier): Unit
}
object XSchemaHandler {
  
  inline def apply(
    acquire: Callback,
    addInstance: (String, TemplateIdentifier) => Callback,
    addItemType: TemplateIdentifier => Callback,
    addProperty: (String, Double, `type`) => Callback,
    addPropertyWithDefault: (String, Double, Any) => Callback,
    endComponent: Callback,
    endNode: Callback,
    endSchema: Callback,
    endTemplate: Callback,
    importComponent: String => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    startComponent: String => Callback,
    startGroup: (String, Double) => Callback,
    startGroupTemplate: (TemplateIdentifier, Double) => Callback,
    startSchema: Callback,
    startSet: (String, Double, TemplateIdentifier) => Callback,
    startSetTemplate: (TemplateIdentifier, Double, TemplateIdentifier) => Callback
  ): XSchemaHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addInstance = js.Any.fromFunction2((t0: String, t1: TemplateIdentifier) => (addInstance(t0, t1)).runNow()), addItemType = js.Any.fromFunction1((t0: TemplateIdentifier) => addItemType(t0).runNow()), addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (addProperty(t0, t1, t2)).runNow()), addPropertyWithDefault = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addPropertyWithDefault(t0, t1, t2)).runNow()), endComponent = endComponent.toJsFn, endNode = endNode.toJsFn, endSchema = endSchema.toJsFn, endTemplate = endTemplate.toJsFn, importComponent = js.Any.fromFunction1((t0: String) => importComponent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startComponent = js.Any.fromFunction1((t0: String) => startComponent(t0).runNow()), startGroup = js.Any.fromFunction2((t0: String, t1: Double) => (startGroup(t0, t1)).runNow()), startGroupTemplate = js.Any.fromFunction2((t0: TemplateIdentifier, t1: Double) => (startGroupTemplate(t0, t1)).runNow()), startSchema = startSchema.toJsFn, startSet = js.Any.fromFunction3((t0: String, t1: Double, t2: TemplateIdentifier) => (startSet(t0, t1, t2)).runNow()), startSetTemplate = js.Any.fromFunction3((t0: TemplateIdentifier, t1: Double, t2: TemplateIdentifier) => (startSetTemplate(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XSchemaHandler]
  }
  
  extension [Self <: XSchemaHandler](x: Self) {
    
    inline def setAddInstance(value: (String, TemplateIdentifier) => Callback): Self = StObject.set(x, "addInstance", js.Any.fromFunction2((t0: String, t1: TemplateIdentifier) => (value(t0, t1)).runNow()))
    
    inline def setAddItemType(value: TemplateIdentifier => Callback): Self = StObject.set(x, "addItemType", js.Any.fromFunction1((t0: TemplateIdentifier) => value(t0).runNow()))
    
    inline def setAddProperty(value: (String, Double, `type`) => Callback): Self = StObject.set(x, "addProperty", js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddPropertyWithDefault(value: (String, Double, Any) => Callback): Self = StObject.set(x, "addPropertyWithDefault", js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setEndComponent(value: Callback): Self = StObject.set(x, "endComponent", value.toJsFn)
    
    inline def setEndNode(value: Callback): Self = StObject.set(x, "endNode", value.toJsFn)
    
    inline def setEndSchema(value: Callback): Self = StObject.set(x, "endSchema", value.toJsFn)
    
    inline def setEndTemplate(value: Callback): Self = StObject.set(x, "endTemplate", value.toJsFn)
    
    inline def setImportComponent(value: String => Callback): Self = StObject.set(x, "importComponent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartComponent(value: String => Callback): Self = StObject.set(x, "startComponent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStartGroup(value: (String, Double) => Callback): Self = StObject.set(x, "startGroup", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStartGroupTemplate(value: (TemplateIdentifier, Double) => Callback): Self = StObject.set(x, "startGroupTemplate", js.Any.fromFunction2((t0: TemplateIdentifier, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStartSchema(value: Callback): Self = StObject.set(x, "startSchema", value.toJsFn)
    
    inline def setStartSet(value: (String, Double, TemplateIdentifier) => Callback): Self = StObject.set(x, "startSet", js.Any.fromFunction3((t0: String, t1: Double, t2: TemplateIdentifier) => (value(t0, t1, t2)).runNow()))
    
    inline def setStartSetTemplate(value: (TemplateIdentifier, Double, TemplateIdentifier) => Callback): Self = StObject.set(x, "startSetTemplate", js.Any.fromFunction3((t0: TemplateIdentifier, t1: Double, t2: TemplateIdentifier) => (value(t0, t1, t2)).runNow()))
  }
}
