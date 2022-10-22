package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about a dynamic element that can be inserted into a homogeneous set of elements within a hierarchy.
  *
  * Provides information about the element. Provides access to its containing set object. Allows controlling the lifetime of the element.
  *
  * Set elements may be added to and removed from the hierarchy at runtime. They bear user-defined names. They may exist independently, outside any
  * container.
  *
  * New set element instances generally are created through members of {@link com.sun.star.lang.XSingleServiceFactory} or, if supported, {@link
  * com.sun.star.lang.XMultiServiceFactory} on an implementation of {@link SetUpdate} . Initially, they are not contained in a set object and have no
  * meaningful name.
  *
  * While an instance is not contained in a set object, it is owned by the client and can be disposed by calling {@link
  * com.sun.star.lang.XComponent.dispose()} . The name of the object can freely be changed in that situation though without persistent effect.
  *
  * When the instance is inserted into a set (this includes replacing an existing element), ownership is transferred to the container. While it is
  * contained in the container, clients must not dispose the object. When inserted, the name of the object is fixed and is used to identify it within the
  * container. An implementation may support {@link com.sun.star.container.XNamed.setName()} even in this case. If it does, changing the name has the same
  * effect of removing the object (under the old name) and then reinserting it into the same container (using the new name).
  *
  * When an instance is removed from a set (this includes being replaced by a new element), ownership is transferred to the client again. It can then be
  * disposed or reinserted into a container. An instance can only be inserted into a container, if it was obtained from the same hierarchy.
  *
  * When a set element is removed from its set from outside the hierarchy, the container disposes of the object. This occurrence can be detected by
  * registering a {@link com.sun.star.lang.XEventListener} with the object.
  *
  * If an implementation is part of a **read-only** view of the hierarchy, changing the name or parent is not supported (the object can't be removed from
  * its container anyway).
  * @see com.sun.star.configuration.SetAccess Parent objects of this service generally implement service SetAccess.
  * @see com.sun.star.configuration.GroupElement A complementary service for elements of a static heterogeneous collection.
  * @see com.sun.star.configuration.AccessRootElement A complementary service for the root element of a hierarchy.
  */
trait SetElement
  extends StObject
     with HierarchyElement
     with XComponent
     with XTemplateInstance
object SetElement {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Name: String,
    Parent: XInterface,
    StateAsProperty: PropertyState,
    TemplateName: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    composeHierarchicalName: String => String,
    dispose: Callback,
    getAsProperty: CallbackTo[Property],
    getDefaultAsProperty: CallbackTo[XInterface],
    getHierarchicalName: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[XInterface],
    getStateAsProperty: CallbackTo[PropertyState],
    getTemplateName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setName: String => Callback,
    setParent: XInterface => Callback,
    setToDefaultAsProperty: Callback
  ): SetElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = dispose.toJsFn, getAsProperty = getAsProperty.toJsFn, getDefaultAsProperty = getDefaultAsProperty.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getStateAsProperty = getStateAsProperty.toJsFn, getTemplateName = getTemplateName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn)
    __obj.asInstanceOf[SetElement]
  }
}
