package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives a description of a configuration update or layer as a sequence of events.
  * @since OOo 1.1.2
  */
trait XUpdateHandler
  extends StObject
     with XInterface {
  
  /**
    * receives notification that a node is started as a new item.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * The new item will be created from the default template of the set.
    *
    * Subsequent calls describe the difference from the template of properties, items or members of the node until a matching call to {@link
    * XUpdateHandler.endNode()} is encountered.
    * @param aName specifies the name of the new item.
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to an
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNode(aName: String, aAttributes: Double): Unit
  
  /**
    * receives notification that a node is started as a new item based on a particular template.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * Subsequent calls describe the difference from the template of properties or members of the node until a matching call to {@link
    * XUpdateHandler.endNode()} is encountered.
    * @param aName specifies the name of the item.
    * @param aTemplate specifies the template to use for the new node
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to an
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNodeFromTemplate(aName: String, aAttributes: Double, aTemplate: TemplateIdentifier): Unit
  
  /**
    * receives notification that a property having a value of `VOID` is added to the current node.
    *
    * The current node must be extensible and a preexisting property (if any) must be removable in this layer.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aType specifies the type of the new property.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceProperty(aName: String, aAttributes: Double, aType: `type`): Unit
  
  /**
    * receives notification that a property having a non- `NULL` value is added to the current node.
    *
    * The current node must be extensible and a preexisting property (if any) must be removable in this layer.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplacePropertyWithValue(aName: String, aAttributes: Double, aValue: Any): Unit
  
  /**
    * receives notification that a node modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyNode()} , {@link XUpdateHandler.addOrReplaceNode()} or {@link
    * XUpdateHandler.addOrReplaceNodeFromTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the nodeif no node is started at all**Not every imp
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): Unit
  
  /**
    * receives notification that a property modification is complete.
    *
    * Must match the last open call to {@link XUpdateHandler.modifyProperty()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the propertyif no property is started at all**Not e
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endProperty(): Unit
  
  /**
    * receives notification that the current update description is complete.
    *
    * Must match a previous call to {@link XUpdateHandler.startUpdate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if no update is started at allif invalid data is detected in the updateif there is
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endUpdate(): Unit
  
  /**
    * receives notification that a modification of a node is started.
    *
    * Subsequent calls describe changes to properties and items or members of the node until a matching call to {@link XUpdateHandler.endNode()} is
    * encountered.
    * @param aName specifies the name of the node.
    * @param aAttributes specifies attribute values to be applied to the node in the current layer.  The value is a combination of {@link NodeAttribute} flags
    * @param aAttributeMask specifies which attributes should be changed for the node.  The value is a combination of {@link NodeAttribute} flags.
    * @param bReset if `TRUE` , specifies that the node should be reset to its default state as given by lower layers and the schema or template prior to appl
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't an update in progress at allif a node is not valid in this placeif
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def modifyNode(aName: String, aAttributes: Double, aAttributeMask: Double, bReset: Boolean): Unit
  
  /**
    * receives notification that modification of an existing property is started.
    *
    * Subsequent calls describe changes to the value(s) of the property until a matching call to {@link XUpdateHandler.endProperty()} is encountered.
    * @param aName specifies the name of the property.
    * @param aAttributes specifies new attributes of the property.  The value is a combination of {@link NodeAttribute} flags.  Only attributes which are sele
    * @param aAttributeMask specifies which attributes should be changed for the property.  The value is a combination of {@link NodeAttribute} flags.
    * @param aType specifies the type of the property.  A `VOID` type can be used to signify that the type is unknown and should not be recorded.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def modifyProperty(aName: String, aAttributes: Double, aAttributeMask: Double, aType: `type`): Unit
  
  /**
    * receives notification that an item is to be dropped from a set.
    *
    * The current node must be a set and the item must be removable.
    * @param aName specifies the name of the node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeNode(aName: String): Unit
  
  /**
    * receives notification that a property is dropped from the current node.
    *
    * The current node must be extensible and the property removable.
    * @param aName specifies the name of the property.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there is no prop
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def removeProperty(aName: String): Unit
  
  /**
    * receives notification that a property is reset to its default state.
    * @param aName specifies the name of the property.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetProperty(aName: String): Unit
  
  /**
    * receives notification that the value of the current property should be reset to its default.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValue(): Unit
  
  /**
    * receives notification that the value of the current property for a specific locale should be reset to its default.
    * @param aLocale specifies the locale the change applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def resetPropertyValueForLocale(aLocale: String): Unit
  
  /**
    * receives notification about a change to the value of the current property.
    * @param aValue specifies the new value of the property.  The value must match the type of the existing property. If the property does not have the {@link
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif there already was a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValue(aValue: Any): Unit
  
  /**
    * receives notification about a change to the value of the current property for a specific locale.
    * @param aValue specifies the new value of the property for the given locale.  The value must match the type of the existing property. If the property doe
    * @param aLocale specifies the locale that the new value applies to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property modification in progress currentlyif the property is not
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValueForLocale(aValue: Any, aLocale: String): Unit
  
  /**
    * receives notification that a update or description is started.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the update already was started
    * @throws com::sun::star::lang::IllegalAccessException if the target layer is read-only**Some implementations can only detect this when executing XUpdateHa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startUpdate(): Unit
}
object XUpdateHandler {
  
  inline def apply(
    acquire: Callback,
    addOrReplaceNode: (String, Double) => Callback,
    addOrReplaceNodeFromTemplate: (String, Double, TemplateIdentifier) => Callback,
    addOrReplaceProperty: (String, Double, `type`) => Callback,
    addOrReplacePropertyWithValue: (String, Double, Any) => Callback,
    endNode: Callback,
    endProperty: Callback,
    endUpdate: Callback,
    modifyNode: (String, Double, Double, Boolean) => Callback,
    modifyProperty: (String, Double, Double, `type`) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeNode: String => Callback,
    removeProperty: String => Callback,
    resetProperty: String => Callback,
    resetPropertyValue: Callback,
    resetPropertyValueForLocale: String => Callback,
    setPropertyValue: Any => Callback,
    setPropertyValueForLocale: (Any, String) => Callback,
    startUpdate: Callback
  ): XUpdateHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addOrReplaceNode = js.Any.fromFunction2((t0: String, t1: Double) => (addOrReplaceNode(t0, t1)).runNow()), addOrReplaceNodeFromTemplate = js.Any.fromFunction3((t0: String, t1: Double, t2: TemplateIdentifier) => (addOrReplaceNodeFromTemplate(t0, t1, t2)).runNow()), addOrReplaceProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (addOrReplaceProperty(t0, t1, t2)).runNow()), addOrReplacePropertyWithValue = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addOrReplacePropertyWithValue(t0, t1, t2)).runNow()), endNode = endNode.toJsFn, endProperty = endProperty.toJsFn, endUpdate = endUpdate.toJsFn, modifyNode = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Boolean) => (modifyNode(t0, t1, t2, t3)).runNow()), modifyProperty = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: `type`) => (modifyProperty(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeNode = js.Any.fromFunction1((t0: String) => removeNode(t0).runNow()), removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()), resetProperty = js.Any.fromFunction1((t0: String) => resetProperty(t0).runNow()), resetPropertyValue = resetPropertyValue.toJsFn, resetPropertyValueForLocale = js.Any.fromFunction1((t0: String) => resetPropertyValueForLocale(t0).runNow()), setPropertyValue = js.Any.fromFunction1((t0: Any) => setPropertyValue(t0).runNow()), setPropertyValueForLocale = js.Any.fromFunction2((t0: Any, t1: String) => (setPropertyValueForLocale(t0, t1)).runNow()), startUpdate = startUpdate.toJsFn)
    __obj.asInstanceOf[XUpdateHandler]
  }
  
  extension [Self <: XUpdateHandler](x: Self) {
    
    inline def setAddOrReplaceNode(value: (String, Double) => Callback): Self = StObject.set(x, "addOrReplaceNode", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setAddOrReplaceNodeFromTemplate(value: (String, Double, TemplateIdentifier) => Callback): Self = StObject.set(x, "addOrReplaceNodeFromTemplate", js.Any.fromFunction3((t0: String, t1: Double, t2: TemplateIdentifier) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddOrReplaceProperty(value: (String, Double, `type`) => Callback): Self = StObject.set(x, "addOrReplaceProperty", js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddOrReplacePropertyWithValue(value: (String, Double, Any) => Callback): Self = StObject.set(x, "addOrReplacePropertyWithValue", js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setEndNode(value: Callback): Self = StObject.set(x, "endNode", value.toJsFn)
    
    inline def setEndProperty(value: Callback): Self = StObject.set(x, "endProperty", value.toJsFn)
    
    inline def setEndUpdate(value: Callback): Self = StObject.set(x, "endUpdate", value.toJsFn)
    
    inline def setModifyNode(value: (String, Double, Double, Boolean) => Callback): Self = StObject.set(x, "modifyNode", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setModifyProperty(value: (String, Double, Double, `type`) => Callback): Self = StObject.set(x, "modifyProperty", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: `type`) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRemoveNode(value: String => Callback): Self = StObject.set(x, "removeNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveProperty(value: String => Callback): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setResetProperty(value: String => Callback): Self = StObject.set(x, "resetProperty", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setResetPropertyValue(value: Callback): Self = StObject.set(x, "resetPropertyValue", value.toJsFn)
    
    inline def setResetPropertyValueForLocale(value: String => Callback): Self = StObject.set(x, "resetPropertyValueForLocale", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPropertyValue(value: Any => Callback): Self = StObject.set(x, "setPropertyValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetPropertyValueForLocale(value: (Any, String) => Callback): Self = StObject.set(x, "setPropertyValueForLocale", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStartUpdate(value: Callback): Self = StObject.set(x, "startUpdate", value.toJsFn)
  }
}
