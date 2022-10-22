package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements a component which allows the creation of relation.
  *
  * This service implements a user interface for relations through a graphical design interface.
  *
  * The design view of the {@link RelationDesign} is identical to the first part of
  * @see QueryDesign. It contains all tables which are already connected through a relation.
  * @see com.sun.star.sdb.ContentLoader
  * @see com.sun.star.frame.XDispatch
  * @see com.sun.star.frame.XDispatchProviderInterceptor
  * @since OOo 1.1.2
  */
trait RelationDesign
  extends StObject
     with XController
     with XInitialization
object RelationDesign {
  
  inline def apply(
    Frame: XFrame,
    Model: XModel,
    ViewData: Any,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    dispose: Callback,
    getFrame: CallbackTo[XFrame],
    getModel: CallbackTo[XModel],
    getViewData: CallbackTo[Any],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    restoreViewData: Any => Callback,
    suspend: Boolean => Boolean
  ): RelationDesign = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getViewData = getViewData.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[RelationDesign]
  }
}
