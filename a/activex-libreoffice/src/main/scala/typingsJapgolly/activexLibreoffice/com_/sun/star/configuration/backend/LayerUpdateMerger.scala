package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * applies updates to a configuration layer.
  *
  * The configuration layer data is read from a {@link XLayer} and the changed layer is provided as {@link XLayer} again or described to a {@link
  * XLayerHandler} .
  * @see com.sun.star.configuration.backend.UpdatableLayer Service describes a layer and accepts a changed layer..
  * @since OOo 1.1.2
  */
trait LayerUpdateMerger
  extends StObject
     with XUpdateHandler
     with XInitialization
object LayerUpdateMerger {
  
  inline def apply(
    acquire: Callback,
    addOrReplaceNode: (String, Double) => Callback,
    addOrReplaceNodeFromTemplate: (String, Double, TemplateIdentifier) => Callback,
    addOrReplaceProperty: (String, Double, `type`) => Callback,
    addOrReplacePropertyWithValue: (String, Double, Any) => Callback,
    endNode: Callback,
    endProperty: Callback,
    endUpdate: Callback,
    initialize: SeqEquiv[Any] => Callback,
    modifyNode: (String, Double, Double, Boolean) => Callback,
    modifyProperty: (String, Double, Double, `type`) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeNode: String => Callback,
    removeProperty: String => Callback,
    resetProperty: String => Callback,
    resetPropertyValue: Callback,
    resetPropertyValueForLocale: String => Callback,
    setPropertyValue: Any => Callback,
    setPropertyValueForLocale: (Any, String) => Callback,
    startUpdate: Callback
  ): LayerUpdateMerger = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addOrReplaceNode = js.Any.fromFunction2((t0: String, t1: Double) => (addOrReplaceNode(t0, t1)).runNow()), addOrReplaceNodeFromTemplate = js.Any.fromFunction3((t0: String, t1: Double, t2: TemplateIdentifier) => (addOrReplaceNodeFromTemplate(t0, t1, t2)).runNow()), addOrReplaceProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (addOrReplaceProperty(t0, t1, t2)).runNow()), addOrReplacePropertyWithValue = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addOrReplacePropertyWithValue(t0, t1, t2)).runNow()), endNode = endNode.toJsFn, endProperty = endProperty.toJsFn, endUpdate = endUpdate.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), modifyNode = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Boolean) => (modifyNode(t0, t1, t2, t3)).runNow()), modifyProperty = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: `type`) => (modifyProperty(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeNode = js.Any.fromFunction1((t0: String) => removeNode(t0).runNow()), removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()), resetProperty = js.Any.fromFunction1((t0: String) => resetProperty(t0).runNow()), resetPropertyValue = resetPropertyValue.toJsFn, resetPropertyValueForLocale = js.Any.fromFunction1((t0: String) => resetPropertyValueForLocale(t0).runNow()), setPropertyValue = js.Any.fromFunction1((t0: Any) => setPropertyValue(t0).runNow()), setPropertyValueForLocale = js.Any.fromFunction2((t0: Any, t1: String) => (setPropertyValueForLocale(t0, t1)).runNow()), startUpdate = startUpdate.toJsFn)
    __obj.asInstanceOf[LayerUpdateMerger]
  }
}
