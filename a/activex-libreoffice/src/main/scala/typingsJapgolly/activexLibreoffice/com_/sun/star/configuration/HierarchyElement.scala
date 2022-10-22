package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XProperty
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyWithState
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalName
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about an element within a hierarchy.
  *
  * The local name and the full hierarchical name can be retrieved. Attributes detailing the role of the element can be queried. The state of the element
  * (regarding defaults) can be accessed.
  *
  * Implementations of this service usually also implement service {@link HierarchyAccess} , which concerns the complementary role of providing access to
  * subelements of the hierarchy.
  */
trait HierarchyElement
  extends StObject
     with XHierarchicalName
     with XNamed
     with XProperty
     with XPropertyWithState
     with XChild
object HierarchyElement {
  
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
  ): HierarchyElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = acquire.toJsFn, composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = getAsProperty.toJsFn, getDefaultAsProperty = getDefaultAsProperty.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getStateAsProperty = getStateAsProperty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn)
    __obj.asInstanceOf[HierarchyElement]
  }
}
