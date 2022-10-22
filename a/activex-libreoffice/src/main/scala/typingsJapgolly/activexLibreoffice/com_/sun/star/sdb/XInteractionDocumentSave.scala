package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back a document name.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.DocumentSaveRequest} .
  * @since OOo 2.0
  */
trait XInteractionDocumentSave
  extends StObject
     with XInteractionContinuation {
  
  /**
    * set the document name chosen by the interaction handler
    * @param Name the name of the document
    * @param Content the content where the document should store itself
    */
  def setName(Name: String, Content: XContent): Unit
}
object XInteractionDocumentSave {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setName: (String, XContent) => Callback
  ): XInteractionDocumentSave = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setName = js.Any.fromFunction2((t0: String, t1: XContent) => (setName(t0, t1)).runNow()))
    __obj.asInstanceOf[XInteractionDocumentSave]
  }
  
  extension [Self <: XInteractionDocumentSave](x: Self) {
    
    inline def setSetName(value: (String, XContent) => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction2((t0: String, t1: XContent) => (value(t0, t1)).runNow()))
  }
}
