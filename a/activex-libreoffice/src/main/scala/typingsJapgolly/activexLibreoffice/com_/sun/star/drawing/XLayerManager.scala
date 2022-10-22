package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface makes it possible to access and manage the Layers of a document.
  * @see LayerManager
  */
trait XLayerManager
  extends StObject
     with XIndexAccess {
  
  /**
    * attaches a {@link Shape} to the given {@link Layer} .
    * @param xShape this is the {@link Shape} that will be attached to a {@link Layer}
    * @param xLayer this is the {@link Layer} that will be attached to a {@link Shape}
    */
  def attachShapeToLayer(xShape: XShape, xLayer: XLayer): Unit
  
  /**
    * queries the {@link Layer} that a {@link Shape} is attached to
    * @param xShape specifies the {@link Shape} for which the layer is requested.
    * @returns the {@link Layer} to which the {@link Shape} is attached.
    */
  def getLayerForShape(xShape: XShape): XLayer
  
  /**
    * creates a new {@link Layer}
    * @param nIndex the index at which the new layer is inserted
    * @returns the new created {@link Layer}
    */
  def insertNewByIndex(nIndex: Double): XLayer
  
  /**
    * removes a {@link Layer} and all {@link Shapes} on this {@link Layer} .
    * @param xLayer this {@link Layer} will be removed and disposed
    */
  def remove(xLayer: XLayer): Unit
}
object XLayerManager {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    attachShapeToLayer: (XShape, XLayer) => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getLayerForShape: XShape => XLayer,
    hasElements: CallbackTo[Boolean],
    insertNewByIndex: Double => XLayer,
    queryInterface: `type` => Any,
    release: Callback,
    remove: XLayer => Callback
  ): XLayerManager = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, attachShapeToLayer = js.Any.fromFunction2((t0: XShape, t1: XLayer) => (attachShapeToLayer(t0, t1)).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getLayerForShape = js.Any.fromFunction1(getLayerForShape), hasElements = hasElements.toJsFn, insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XLayer) => remove(t0).runNow()))
    __obj.asInstanceOf[XLayerManager]
  }
  
  extension [Self <: XLayerManager](x: Self) {
    
    inline def setAttachShapeToLayer(value: (XShape, XLayer) => Callback): Self = StObject.set(x, "attachShapeToLayer", js.Any.fromFunction2((t0: XShape, t1: XLayer) => (value(t0, t1)).runNow()))
    
    inline def setGetLayerForShape(value: XShape => XLayer): Self = StObject.set(x, "getLayerForShape", js.Any.fromFunction1(value))
    
    inline def setInsertNewByIndex(value: Double => XLayer): Self = StObject.set(x, "insertNewByIndex", js.Any.fromFunction1(value))
    
    inline def setRemove(value: XLayer => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: XLayer) => value(t0).runNow()))
  }
}
