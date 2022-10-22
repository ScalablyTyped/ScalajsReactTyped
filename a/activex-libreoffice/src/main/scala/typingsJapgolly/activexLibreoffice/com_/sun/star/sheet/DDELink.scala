package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a DDE link.
  *
  * A DDE link controls the results of a DDE spreadsheet formula.
  */
trait DDELink
  extends StObject
     with XNamed
     with XDDELink
     with XRefreshable
     with XDDELinkResults
object DDELink {
  
  inline def apply(
    Application: String,
    Item: String,
    Name: String,
    Results: SafeArray[SafeArray[Any]],
    Topic: String,
    acquire: Callback,
    addRefreshListener: XRefreshListener => Callback,
    getApplication: CallbackTo[String],
    getItem: CallbackTo[String],
    getName: CallbackTo[String],
    getResults: CallbackTo[SafeArray[SafeArray[Any]]],
    getTopic: CallbackTo[String],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeRefreshListener: XRefreshListener => Callback,
    setName: String => Callback,
    setResults: SeqEquiv[SeqEquiv[Any]] => Callback
  ): DDELink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), getApplication = getApplication.toJsFn, getItem = getItem.toJsFn, getName = getName.toJsFn, getResults = getResults.toJsFn, getTopic = getTopic.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setResults = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => setResults(t0).runNow()))
    __obj.asInstanceOf[DDELink]
  }
}
