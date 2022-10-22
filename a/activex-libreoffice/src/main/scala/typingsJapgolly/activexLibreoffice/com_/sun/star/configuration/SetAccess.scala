package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a dynamic, homogeneous set of values or nested trees within a hierarchy.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers within the hierarchy.
  *
  * The number and names of contained elements are not fixed in advance, but all elements have to be of one predetermined type.
  * @see com.sun.star.configuration.SetElement Child objects of this service generally implement SetElement. The template name returned by the child from
  * @see com.sun.star.configuration.GroupAccess A complementary service that provides for static heterogeneous groups of elements within the hierarchy.
  */
trait SetAccess
  extends StObject
     with HierarchyAccess
     with SimpleSetAccess {
  
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
}
object SetAccess {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    Properties: SafeArray[Property],
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    escapeString: String => String,
    getByHierarchicalName: String => Any,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementTemplateName: CallbackTo[String],
    getElementType: CallbackTo[`type`],
    getExactName: String => String,
    getProperties: CallbackTo[SafeArray[Property]],
    getPropertyByName: String => Property,
    getPropertyDefault: String => Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeContainerListener: XContainerListener => Callback,
    setAllPropertiesToDefault: Callback,
    setPropertiesToDefault: SeqEquiv[String] => Callback,
    setPropertyToDefault: String => Callback,
    unescapeString: String => String
  ): SetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), escapeString = js.Any.fromFunction1(escapeString), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementTemplateName = getElementTemplateName.toJsFn, getElementType = getElementType.toJsFn, getExactName = js.Any.fromFunction1(getExactName), getProperties = getProperties.toJsFn, getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), setAllPropertiesToDefault = setAllPropertiesToDefault.toJsFn, setPropertiesToDefault = js.Any.fromFunction1((t0: SeqEquiv[String]) => setPropertiesToDefault(t0).runNow()), setPropertyToDefault = js.Any.fromFunction1((t0: String) => setPropertyToDefault(t0).runNow()), unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[SetAccess]
  }
  
  extension [Self <: SetAccess](x: Self) {
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
  }
}
