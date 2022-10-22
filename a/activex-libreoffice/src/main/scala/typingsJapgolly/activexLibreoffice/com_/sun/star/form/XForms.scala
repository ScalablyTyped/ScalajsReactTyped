package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.script.ScriptEventDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.script.XEventAttacherManager
import typingsJapgolly.activexLibreoffice.com_.sun.star.script.XScriptListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XForms
  extends StObject
     with XContainer
     with XNameContainer
     with XIndexContainer
     with XEnumerationAccess
     with XEventAttacherManager
     with XChild
     with XCloneable
     with XComponent
object XForms {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Parent: XInterface,
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    addEventListener: XEventListener => Callback,
    addScriptListener: XScriptListener => Callback,
    attach: (Double, XInterface, Any) => Callback,
    createClone: CallbackTo[XCloneable],
    createEnumeration: CallbackTo[XEnumeration],
    detach: (Double, XInterface) => Callback,
    dispose: Callback,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getParent: CallbackTo[XInterface],
    getScriptEvents: Double => SafeArray[ScriptEventDescriptor],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Any) => Callback,
    insertByName: (String, Any) => Callback,
    insertEntry: Double => Callback,
    queryInterface: `type` => Any,
    registerScriptEvent: (Double, ScriptEventDescriptor) => Callback,
    registerScriptEvents: (Double, SeqEquiv[ScriptEventDescriptor]) => Callback,
    release: Callback,
    removeByIndex: Double => Callback,
    removeByName: String => Callback,
    removeContainerListener: XContainerListener => Callback,
    removeEntry: Double => Callback,
    removeEventListener: XEventListener => Callback,
    removeScriptListener: XScriptListener => Callback,
    replaceByIndex: (Double, Any) => Callback,
    replaceByName: (String, Any) => Callback,
    revokeScriptEvent: (Double, String, String, String) => Callback,
    revokeScriptEvents: Double => Callback,
    setParent: XInterface => Callback
  ): XForms = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addScriptListener = js.Any.fromFunction1((t0: XScriptListener) => addScriptListener(t0).runNow()), attach = js.Any.fromFunction3((t0: Double, t1: XInterface, t2: Any) => (attach(t0, t1, t2)).runNow()), createClone = createClone.toJsFn, createEnumeration = createEnumeration.toJsFn, detach = js.Any.fromFunction2((t0: Double, t1: XInterface) => (detach(t0, t1)).runNow()), dispose = dispose.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getParent = getParent.toJsFn, getScriptEvents = js.Any.fromFunction1(getScriptEvents), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), insertEntry = js.Any.fromFunction1((t0: Double) => insertEntry(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), registerScriptEvent = js.Any.fromFunction2((t0: Double, t1: ScriptEventDescriptor) => (registerScriptEvent(t0, t1)).runNow()), registerScriptEvents = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[ScriptEventDescriptor]) => (registerScriptEvents(t0, t1)).runNow()), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEntry = js.Any.fromFunction1((t0: Double) => removeEntry(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeScriptListener = js.Any.fromFunction1((t0: XScriptListener) => removeScriptListener(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()), revokeScriptEvent = js.Any.fromFunction4((t0: Double, t1: String, t2: String, t3: String) => (revokeScriptEvent(t0, t1, t2, t3)).runNow()), revokeScriptEvents = js.Any.fromFunction1((t0: Double) => revokeScriptEvents(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XForms]
  }
}
