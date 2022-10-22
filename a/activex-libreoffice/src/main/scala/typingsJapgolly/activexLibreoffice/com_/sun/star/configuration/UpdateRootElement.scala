package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Property
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.ChangesSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesBatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides update control for a hierarchy of configuration items and information about the hierarchy as a whole as well as its root.
  *
  * Extends {@link AccessRootElement} by adding support for collecting changes and applying them to a backend store as a single batch.
  *
  * An implementation represents the root of a partial hierarchy. [See the documentation for {@link AccessRootElement} ]. The hierarchy in turn is a
  * **view** onto a fragment of persistent data tree that can be accessed through several such views, or even several processes, simultaneously.
  *
  * Elements of the hierarchy, such as descendants of this root element, may support modification by providing appropriate interfaces. Changes done this
  * way initially only affect these objects themselves and other objects within the same hierarchy, such as other descendants of this root element.
  *
  * The accumulated changes within this hierarchy can be managed using {@link com.sun.star.util.XChangesBatch} . Pending changes will become persistent
  * and visible from other overlapping hierarchies only when {@link com.sun.star.util.XChangesBatch.commitChanges()} is called. If the hierarchy is
  * disposed or discarded without committing changes, the changes will be lost.
  * @see com.sun.star.configuration.GroupUpdate
  * @see com.sun.star.configuration.SetUpdate
  */
trait UpdateRootElement
  extends StObject
     with AccessRootElement
     with XChangesBatch
object UpdateRootElement {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    PendingChanges: ChangesSet,
    StateAsProperty: PropertyState,
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    addEventListener: XEventListener => Callback,
    commitChanges: Callback,
    composeHierarchicalName: String => String,
    dispose: Callback,
    getAsProperty: CallbackTo[Property],
    getDefaultAsProperty: CallbackTo[XInterface],
    getHierarchicalName: CallbackTo[String],
    getLocale: CallbackTo[Locale],
    getName: CallbackTo[String],
    getParent: CallbackTo[XInterface],
    getPendingChanges: CallbackTo[ChangesSet],
    getStateAsProperty: CallbackTo[PropertyState],
    hasPendingChanges: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: XChangesListener => Callback,
    removeEventListener: XEventListener => Callback,
    setLocale: Locale => Callback,
    setName: String => Callback,
    setParent: XInterface => Callback,
    setToDefaultAsProperty: Callback
  ): UpdateRootElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingChanges = PendingChanges.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), commitChanges = commitChanges.toJsFn, composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = dispose.toJsFn, getAsProperty = getAsProperty.toJsFn, getDefaultAsProperty = getDefaultAsProperty.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getLocale = getLocale.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getPendingChanges = getPendingChanges.toJsFn, getStateAsProperty = getStateAsProperty.toJsFn, hasPendingChanges = hasPendingChanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setToDefaultAsProperty = setToDefaultAsProperty.toJsFn)
    __obj.asInstanceOf[UpdateRootElement]
  }
}
