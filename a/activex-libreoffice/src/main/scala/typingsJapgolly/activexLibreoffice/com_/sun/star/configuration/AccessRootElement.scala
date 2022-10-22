package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XLocalizable
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesNotifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about the root element of a hierarchy and about the hierarchy as a whole.
  *
  * Provides information about the element and the whole hierarchy. Allows controlling the lifetime of the hierarchy. Allows observing changes in the
  * hierarchy as a whole.
  *
  * When access to a hierarchy is first obtained from a factory or provider, this is the initial object that is created by the factory. It represents the
  * **root** of the accessible part of the hierarchy.
  *
  * **NOTE: In this description "hierarchy" may actually designate a part or fragment of a larger hierarchy. It is that part that is rooted in the element
  * represented by an implementation of this service and that is accessible starting from this element.**
  *
  * Generally it is not possible to navigate the parent or siblings, if any, of this element, so {@link com.sun.star.container.XChild} is not supported.
  * @see com.sun.star.configuration.UpdateRootElement Implementations that support modifying data in the hierarchy implement service UpdateRootElement.
  * @see com.sun.star.configuration.SetElement A complementary service, for children of a dynamic homogeneous container.
  * @see com.sun.star.configuration.GroupElement A complementary service, for children of a static heterogeneous collection.
  * @see com.sun.star.configuration.ConfigurationProvider Objects provided by a ConfigurationProvider implement this service.
  */
trait AccessRootElement
  extends StObject
     with HierarchyElement
     with XComponent
     with XChangesNotifier
     with XLocalizable
object AccessRootElement {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    StateAsProperty: PropertyState,
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    addEventListener: XEventListener => Callback,
    composeHierarchicalName: String => String,
    dispose: Callback,
    getAsProperty: CallbackTo[Property],
    getDefaultAsProperty: CallbackTo[XInterface],
    getHierarchicalName: CallbackTo[String],
    getLocale: CallbackTo[Locale],
    getName: CallbackTo[String],
    getParent: CallbackTo[XInterface],
    getStateAsProperty: CallbackTo[PropertyState],
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: XChangesListener => Callback,
    removeEventListener: XEventListener => Callback,
    setLocale: Locale => Callback,
    setName: String => Callback,
    setParent: XInterface => Callback,
    setToDefaultAsProperty: Callback
  ): AccessRootElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = dispose.toJsFn, getAsProperty = getAsProperty.toJsFn, getDefaultAsProperty = getDefaultAsProperty.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getLocale = getLocale.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getStateAsProperty = getStateAsProperty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn)
    __obj.asInstanceOf[AccessRootElement]
  }
}
