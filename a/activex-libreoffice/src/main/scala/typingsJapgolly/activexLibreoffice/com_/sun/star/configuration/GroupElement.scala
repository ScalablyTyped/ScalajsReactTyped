package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about a predefined element contained in a heterogeneous group of elements within a hierarchy.
  *
  * Provides information about the element. Provides access to its containing group object.
  *
  * A group element bears a predefined name. It may only exist within a containing group object.
  * @see com.sun.star.configuration.GroupAccess Parent objects of this service generally implement service GroupAccess.
  * @see com.sun.star.configuration.SetElement A complementary service, for elements of a dynamic homogeneous container.
  * @see com.sun.star.configuration.AccessRootElement A complementary service, for the root element of a hierarchy.
  */
trait GroupElement
  extends StObject
     with HierarchyElement
object GroupElement {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Name: String,
    Parent: XInterface,
    StateAsProperty: PropertyState,
    acquire: Callback,
    composeHierarchicalName: String => String,
    getAsProperty: CallbackTo[Property],
    getDefaultAsProperty: CallbackTo[XInterface],
    getHierarchicalName: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[XInterface],
    getStateAsProperty: CallbackTo[PropertyState],
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback,
    setParent: XInterface => Callback,
    setToDefaultAsProperty: Callback
  ): GroupElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = acquire.toJsFn, composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = getAsProperty.toJsFn, getDefaultAsProperty = getDefaultAsProperty.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getStateAsProperty = getStateAsProperty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn)
    __obj.asInstanceOf[GroupElement]
  }
}
