package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the model of an {@link ObjectInspector}
  * @see ObjectInspector
  * @since OOo 2.0.3
  */
trait XObjectInspectorModel extends StObject {
  
  /**
    * describes a set of factories for creating XPropertyHandlers
    *
    * Every element of the sequence must contain information to create a {@link XPropertyHandler} instance. Two ways are currently supported: A service
    * name: ;  If a sequence element contains a string, this string is interpreted as service name, and an {@link com.sun.star.lang.XMultiComponentFactory}
    * is asked to create an instance of this service.A factory: ;  If a sequence element contains an instance implementing the {@link
    * com.sun.star.lang.XSingleComponentFactory} interface, this factory is used to create a property handler.
    *
    * This attribute is usually only evaluated by the {@link ObjectInspector} instance which the model is currently bound to.
    *
    * The order of factories is important: If two property handlers declare themselves responsible for the same property, the one whose factory is listed
    * **last** wins. Also, if a handler `B` wants to supersede a property of another handler `A` , `A` 's factory must precede the factory of `B` .
    * @see XPropertyHandler.getSupportedProperties
    * @see XPropertyHandler.getSupersededProperties
    */
  var HandlerFactories: SafeArray[Any]
  
  /**
    * indicates that the object inspector should have a help section.
    *
    * The object inspector displays lines of property/values, optionally grouped into categories, as described by the property handlers. ;  Additionally,
    * the inspector can optionally display a section dedicated to help texts. Clients could use this section to display context-sensitive help, for instance
    * short texts explaining the currently selected property.
    * @since OOo 2.2
    */
  var HasHelpSection: Boolean
  
  /**
    * determines whether the object inspector's UI should be read-only.
    *
    * In this case, the user is able to browse through all properties, but cannot change any of them.
    *
    * In a read-only object inspector, the property controls are readonly or disabled themselves, and the primary and secondary buttons of a property line
    * are both disabled.
    * @see XPropertyControl
    * @see LineDescriptor
    */
  var IsReadOnly: Boolean
  
  /**
    * denotes the maximum number of lines of text to be reserved for the help section.
    *
    * This property is ignored by the {@link ObjectInspector} if {@link HasHelpSection} is `FALSE` .
    *
    * The layout of the {@link ObjectInspector} is undefined if {@link MaxHelpTextLines} is smaller than {@link MinHelpTextLines} .
    * @since OOo 2.2
    */
  var MaxHelpTextLines: Double
  
  /**
    * denotes the minimum number of lines of text to be reserved for the help section.
    *
    * This property is ignored by the {@link ObjectInspector} if {@link HasHelpSection} is `FALSE` .
    *
    * The layout of the {@link ObjectInspector} is undefined if {@link MinHelpTextLines} is larger than {@link MaxHelpTextLines} .
    * @since OOo 2.2
    */
  var MinHelpTextLines: Double
  
  /**
    * describes the property categories used by the property handlers.
    *
    * Properties can be sorted into different categories, described by the {@link LineDescriptor.Category} attribute, which is filled in {@link
    * XPropertyHandler.describePropertyLine()} method of your property handler. ;  Those names provided by the handlers are programmatic names. All other
    * information about categories is part of the {@link PropertyCategoryDescriptor} , and {@link describeCategories()} assembles information about all
    * categories which all property handlers provided by the model use.
    * @returns a sequence of category descriptors. Their relative ordering also describes the relative ordering of the categories in the {@link ObjectInspector}
    * @see PropertyCategoryDescriptor
    * @see LineDescriptor.Category
    */
  def describeCategories(): SafeArray[PropertyCategoryDescriptor]
  
  /**
    * retrieves an index in a global property ordering, for a given property name
    *
    * In the user interface of an {@link ObjectInspector} , single properties are represented by single lines, and those lines are displayed successively.
    * To determine an order of the property lines, the inspector model can associate an "order index" with each property. The {@link ObjectInspector} will
    * then sort the property lines in a way that they have the same relative ordering as the "order indexes" of their properties.
    *
    * Note that the concrete value the model returns for a given property does not matter. All what matters is that if you want a certain property `Foo` to
    * be displayed after another property `Bar` , then the order index of `Foo` should be greater than the order index of `Bar` .
    *
    * If for two different properties the same order index is returned, the {@link ObjectInspector} will assume the order in which those properties were
    * provided by the respective property handler ( {@link XPropertyHandler.getSupportedProperties()} ). ;  If two such properties originate from different
    * handlers, they will be ordered according to the order of the handlers, as provided in the {@link HandlerFactories} attribute.
    * @param PropertyName the property whose global order index should be retrieved
    * @returns the global order index of PropertyName.
    */
  def getPropertyOrderIndex(PropertyName: String): Double
}
object XObjectInspectorModel {
  
  inline def apply(
    HandlerFactories: SafeArray[Any],
    HasHelpSection: Boolean,
    IsReadOnly: Boolean,
    MaxHelpTextLines: Double,
    MinHelpTextLines: Double,
    describeCategories: CallbackTo[SafeArray[PropertyCategoryDescriptor]],
    getPropertyOrderIndex: String => Double
  ): XObjectInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], describeCategories = describeCategories.toJsFn, getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
    __obj.asInstanceOf[XObjectInspectorModel]
  }
  
  extension [Self <: XObjectInspectorModel](x: Self) {
    
    inline def setDescribeCategories(value: CallbackTo[SafeArray[PropertyCategoryDescriptor]]): Self = StObject.set(x, "describeCategories", value.toJsFn)
    
    inline def setGetPropertyOrderIndex(value: String => Double): Self = StObject.set(x, "getPropertyOrderIndex", js.Any.fromFunction1(value))
    
    inline def setHandlerFactories(value: SafeArray[Any]): Self = StObject.set(x, "HandlerFactories", value.asInstanceOf[js.Any])
    
    inline def setHasHelpSection(value: Boolean): Self = StObject.set(x, "HasHelpSection", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setMaxHelpTextLines(value: Double): Self = StObject.set(x, "MaxHelpTextLines", value.asInstanceOf[js.Any])
    
    inline def setMinHelpTextLines(value: Double): Self = StObject.set(x, "MinHelpTextLines", value.asInstanceOf[js.Any])
  }
}
