package typingsJapgolly.appletvjs.AppleTVJS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuBarDocument extends js.Object {
  /**
  		 * Retrieves the document associated with the specified menu item.
  		 * */
  def getDocument(menuItem: Element): Document_
  /**
  		 * Associates a document with a menu item.
  		 * */
  def setDocument(document: Document_, menuItem: Element): Unit
  /**
  		 * Sets the focus in a menu bar to the specified menu item.
  		 * */
  def setSelectedItem(menuItem: Element): Unit
}

object MenuBarDocument {
  @scala.inline
  def apply(
    getDocument: Element => CallbackTo[Document_],
    setDocument: (Document_, Element) => Callback,
    setSelectedItem: Element => Callback
  ): MenuBarDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocument")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => getDocument(t0).runNow()))
    __obj.updateDynamic("setDocument")(js.Any.fromFunction2((t0: typingsJapgolly.std.Document_, t1: org.scalajs.dom.raw.Element) => setDocument(t0, t1).runNow()))
    __obj.updateDynamic("setSelectedItem")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => setSelectedItem(t0).runNow()))
    __obj.asInstanceOf[MenuBarDocument]
  }
}

