package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XChangesNotifier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to a fragment of the hierarchy data.
  *
  * A hierarchy data source provides access to a tree of hierarchy data nodes. Each hierarchy data node, except the root node, has a parent that is a
  * hierarchy data node too. A hierarchy data node has a name.
  *
  * Each hierarchy data node has three data members:
  *
  * "Title", which is of type `string` . It contains a title for the node. This value must not be empty."TargetURL", which is of type `string` It may
  * contain any URL, which will be treated as the target of a hierarchy link."Children", which is of type {@link HierarchyDataReadAccess} or of type
  * {@link HierarchyDataReadWriteAccess} , depending on the type of the node. This member provides access to the children of a node.
  */
trait HierarchyDataReadAccess
  extends StObject
     with XNameAccess
     with XHierarchicalNameAccess
     with XChangesNotifier
     with XComponent
object HierarchyDataReadAccess {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getByHierarchicalName: String => Any,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: XChangesListener => Callback,
    removeEventListener: XEventListener => Callback
  ): HierarchyDataReadAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[HierarchyDataReadAccess]
  }
}
