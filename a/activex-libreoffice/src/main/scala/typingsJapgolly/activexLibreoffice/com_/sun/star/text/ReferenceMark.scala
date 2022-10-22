package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for cross references in text documents. */
trait ReferenceMark
  extends StObject
     with XTextContent
     with XNamed
object ReferenceMark {
  
  inline def apply(
    Anchor: XTextRange,
    Name: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setName: String => Callback
  ): ReferenceMark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getName = getName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[ReferenceMark]
  }
}
