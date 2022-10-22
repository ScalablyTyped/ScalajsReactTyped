package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service is provided by documents to support Layers.
  * @see DrawingDocument
  */
trait LayerManager
  extends StObject
     with XLayerManager
     with XNameAccess
object LayerManager {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    attachShapeToLayer: (XShape, XLayer) => Callback,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getLayerForShape: XShape => XLayer,
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertNewByIndex: Double => XLayer,
    queryInterface: `type` => Any,
    release: Callback,
    remove: XLayer => Callback
  ): LayerManager = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, attachShapeToLayer = js.Any.fromFunction2((t0: XShape, t1: XLayer) => (attachShapeToLayer(t0, t1)).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XLayer) => remove(t0).runNow()))
    __obj.asInstanceOf[LayerManager]
  }
}
