package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GESchemaObjectContainer[T /* <: KmlObject */] extends StObject {
  
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  def appendChild(`object`: T): Unit
  
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  def getChildNodes(): KmlObjectList[T]
  
  /**
    * First child in the list of objects.
    */
  def getFirstChild(): T
  
  /**
    * Last child in the list of objects.
    */
  def getLastChild(): T
  
  /**
    * Returns true if the container is not empty.
    */
  def hasChildNodes(): Boolean
  
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  def insertBefore(newChild: T, refChild: T): Unit
  
  /**
    * Removes a node from the list of children of a specified object.
    */
  def removeChild(oldChild: T): Unit
  
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  def replaceChild(newChild: T, oldChild: T): Unit
}
object GESchemaObjectContainer {
  
  inline def apply[T /* <: KmlObject */](
    appendChild: T => Callback,
    getChildNodes: CallbackTo[KmlObjectList[T]],
    getFirstChild: CallbackTo[T],
    getLastChild: CallbackTo[T],
    hasChildNodes: CallbackTo[Boolean],
    insertBefore: (T, T) => Callback,
    removeChild: T => Callback,
    replaceChild: (T, T) => Callback
  ): GESchemaObjectContainer[T] = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1((t0: T) => appendChild(t0).runNow()), getChildNodes = getChildNodes.toJsFn, getFirstChild = getFirstChild.toJsFn, getLastChild = getLastChild.toJsFn, hasChildNodes = hasChildNodes.toJsFn, insertBefore = js.Any.fromFunction2((t0: T, t1: T) => (insertBefore(t0, t1)).runNow()), removeChild = js.Any.fromFunction1((t0: T) => removeChild(t0).runNow()), replaceChild = js.Any.fromFunction2((t0: T, t1: T) => (replaceChild(t0, t1)).runNow()))
    __obj.asInstanceOf[GESchemaObjectContainer[T]]
  }
  
  extension [Self <: GESchemaObjectContainer[?], T /* <: KmlObject */](x: Self & GESchemaObjectContainer[T]) {
    
    inline def setAppendChild(value: T => Callback): Self = StObject.set(x, "appendChild", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setGetChildNodes(value: CallbackTo[KmlObjectList[T]]): Self = StObject.set(x, "getChildNodes", value.toJsFn)
    
    inline def setGetFirstChild(value: CallbackTo[T]): Self = StObject.set(x, "getFirstChild", value.toJsFn)
    
    inline def setGetLastChild(value: CallbackTo[T]): Self = StObject.set(x, "getLastChild", value.toJsFn)
    
    inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
    
    inline def setInsertBefore(value: (T, T) => Callback): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2((t0: T, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setRemoveChild(value: T => Callback): Self = StObject.set(x, "removeChild", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setReplaceChild(value: (T, T) => Callback): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2((t0: T, t1: T) => (value(t0, t1)).runNow()))
  }
}
