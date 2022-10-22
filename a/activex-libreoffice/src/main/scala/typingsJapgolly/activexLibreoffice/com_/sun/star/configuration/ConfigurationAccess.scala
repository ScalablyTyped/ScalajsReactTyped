package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XHierarchicalPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to a fragment of the configuration hierarchy.
  *
  * Values that are direct or indirect descendants of a root element can be retrieved and, if themselves objects, navigated. Other interfaces provide
  * access to information about this element and its context. Changes to values in the hierarchy can be monitored by event listeners.
  *
  * Descendants of this service also implement this service.
  *
  * Ultimately the configuration holds values. These values are organized into a hierarchy using structural elements. The structure is defined in advance
  * in a schema. Necessary information from the schema is stored in the configuration repository itself and is accessible through an implementation of
  * this service.
  *
  * Two different kinds of structural elements are used in the configuration hierarchy:
  *
  * **Sets **: are dynamic containers of homogeneous elements. Which elements a **set** contains can vary. Their names are defined by the clients that
  * insert them. On the other hand, the **type** of the elements is the same for all elements. In the case of elements that are themselves hierarchy
  * objects, the **type** includes the structure of the hierarchy fragment they contain. Such types are defined in the configuration schema as
  * **templates** .;
  *
  * **Groups **: are static collections of heterogeneous elements. The names and types of the elements of a **group** are completely defined in the
  * configuration schema. Here each element may be of a different **type** , allowing **groups** that contain a mix of subobjects and simple values.
  *
  *
  *
  * Objects in the configuration hierarchy, for example, implementations of this service, can thus be classified in the following ways:
  *
  * **Container** role: An object that can hold child elements as a **set** or a **group** .**Element** role: An object may be an element of a **set** or
  * a **group** or else it may be the root element.
  *
  * Several types of simple **values** can be used in the configuration. In addition to the basic (scalar) types, sequences of the basic types are
  * supported. The basic types are:
  *
  * **string** can hold a human-readable text.
  *
  * Values are represented as `string` .
  *
  *
  *
  * Sequences are represented as `string[]` .
  *
  *
  *
  * "<em>human-readable</em>" here excludes non-printing characters except for CR, LF and TAB [Unicode code points 9,10,13]. For binary data, use type
  * **binary** instead.
  *
  * **boolean** can hold the values `TRUE` or `FALSE` .
  *
  * Values are represented as `boolean` .
  *
  * Sequences are represented as `boolean[]` .
  *
  * **short** can hold a 16-bit signed integer.
  *
  * Values are represented as `short` .
  *
  *
  *
  * Sequences are represented as `short[]` .
  *
  * **int** can hold a 32-bit signed integer.
  *
  * Values are represented as `long` .
  *
  *
  *
  * Sequences are represented as `long[]` .
  *
  * **long** can hold a 64-bit signed integer.
  *
  * Values are represented as `hyper` .
  *
  *
  *
  * Sequences are represented as `hyper[]` .
  *
  * **double** can hold a floating point number.
  *
  * Values are represented as `double` .
  *
  *
  *
  * Sequences are represented as `double[]` .
  *
  * **binary** can hold a sequence of octets.
  *
  * Values are represented as `byte[]` .
  *
  *
  *
  * Sequences are represented as `byte[][]` .
  *
  *
  *
  * Within templates an additional type **any** can occur. When such a template is used to create a new {@link SetElement} , the type of the element is
  * initially reported as `any` (having no value). When the value of such an element is first set, it will assume the type used.
  *
  * If the schema marks a value as **nullable** (which is indicated by attribute {@link com.sun.star.beans.PropertyAttribute.MAYBEVOID} ), its contents
  * may be `NULL` .
  *
  * The configuration should support explicit access to default values (implementing {@link com.sun.star.beans.XPropertyState} and {@link
  * com.sun.star.beans.XPropertyWithState} ).
  * @see ConfigurationProvider Root instances of this service can be requested from a ConfigurationProvider.
  * @see ConfigurationUpdateAccess an extended service that includes facilities for modifying configuration data.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyWithState because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XProperty because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalName because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.HierarchyElement because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.GroupElement because var conflicts: Name, Parent. Inlined 
- typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.SetElement because var conflicts: Name, Parent. Inlined  */ trait ConfigurationAccess
  extends StObject
     with SetAccess
     with GroupAccess
     with AccessRootElement
     with XTemplateInstance {
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  /* InferMemberOverrides */
  override def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
  
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
}
object ConfigurationAccess {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    HierarchicalName: String,
    HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    Properties: SafeArray[Property],
    PropertySetInfo: XPropertySetInfo,
    StateAsProperty: PropertyState,
    TemplateName: String,
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    addContainerListener: XContainerListener => Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    composeHierarchicalName: String => String,
    dispose: Callback,
    escapeString: String => String,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    getAsProperty: CallbackTo[Property],
    getByHierarchicalName: String => Any,
    getByName: String => Any,
    getDefaultAsProperty: CallbackTo[XInterface],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementTemplateName: CallbackTo[String],
    getElementType: CallbackTo[`type`],
    getExactName: String => String,
    getHierarchicalName: CallbackTo[String],
    getHierarchicalPropertySetInfo: CallbackTo[XHierarchicalPropertySetInfo],
    getHierarchicalPropertyValue: String => Any,
    getHierarchicalPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getLocale: CallbackTo[Locale],
    getName: CallbackTo[String],
    getParent: CallbackTo[XInterface],
    getProperties: CallbackTo[SafeArray[Property]],
    getPropertyByName: String => Property,
    getPropertyDefault: String => Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getStateAsProperty: CallbackTo[PropertyState],
    getTemplateName: CallbackTo[String],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: XChangesListener => Callback,
    removeContainerListener: XContainerListener => Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: XPropertiesChangeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setAllPropertiesToDefault: Callback,
    setHierarchicalPropertyValue: (String, Any) => Callback,
    setHierarchicalPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
    setLocale: Locale => Callback,
    setName: String => Callback,
    setParent: XInterface => Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback,
    setPropertyToDefault: String => Callback,
    setPropertyValue: (String, Any) => Callback,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Callback,
    setToDefaultAsProperty: Callback,
    unescapeString: String => String
  ): ConfigurationAccess = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], HierarchicalPropertySetInfo = HierarchicalPropertySetInfo.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = dispose.toJsFn, escapeString = js.Any.fromFunction1(escapeString), firePropertiesChangeEvent = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (firePropertiesChangeEvent(t0, t1)).runNow()), getAsProperty = getAsProperty.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getDefaultAsProperty = getDefaultAsProperty.toJsFn, getElementNames = getElementNames.toJsFn, getElementTemplateName = getElementTemplateName.toJsFn, getElementType = getElementType.toJsFn, getExactName = js.Any.fromFunction1(getExactName), getHierarchicalName = getHierarchicalName.toJsFn, getHierarchicalPropertySetInfo = getHierarchicalPropertySetInfo.toJsFn, getHierarchicalPropertyValue = js.Any.fromFunction1(getHierarchicalPropertyValue), getHierarchicalPropertyValues = js.Any.fromFunction1(getHierarchicalPropertyValues), getLocale = getLocale.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getProperties = getProperties.toJsFn, getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getStateAsProperty = getStateAsProperty.toJsFn, getTemplateName = getTemplateName.toJsFn, hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction1((t0: XPropertiesChangeListener) => removePropertiesChangeListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setHierarchicalPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setHierarchicalPropertyValue(t0, t1)).runNow()), setHierarchicalPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setHierarchicalPropertyValues(t0, t1)).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyToDefault = js.Any.fromFunction1((t0: String) => setPropertyToDefault(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setPropertyValues = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[Any]) => (setPropertyValues(t0, t1)).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn, unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[ConfigurationAccess]
  }
  
  extension [Self <: ConfigurationAccess](x: Self) {
    
    inline def setGetHierarchicalPropertySetInfo(value: CallbackTo[XHierarchicalPropertySetInfo]): Self = StObject.set(x, "getHierarchicalPropertySetInfo", value.toJsFn)
    
    inline def setGetPropertySetInfo(value: CallbackTo[XPropertySetInfo]): Self = StObject.set(x, "getPropertySetInfo", value.toJsFn)
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
  }
}
