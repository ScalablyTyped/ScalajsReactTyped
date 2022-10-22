package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends StObject {
  
  /* standard dom */
  def disconnect(): Unit
  
  /* standard dom */
  def observe(target: org.scalajs.dom.Element): Unit
  
  /* standard dom */
  val root: org.scalajs.dom.Element | org.scalajs.dom.Document | Null
  
  /* standard dom */
  val rootMargin: java.lang.String
  
  /* standard dom */
  def takeRecords(): js.Array[IntersectionObserverEntry]
  
  /* standard dom */
  val thresholds: js.Array[Double]
  
  /* standard dom */
  def unobserve(target: org.scalajs.dom.Element): Unit
}
object IntersectionObserver {
  
  inline def apply(
    disconnect: Callback,
    observe: org.scalajs.dom.Element => Callback,
    rootMargin: java.lang.String,
    takeRecords: CallbackTo[js.Array[IntersectionObserverEntry]],
    thresholds: js.Array[Double],
    unobserve: org.scalajs.dom.Element => Callback
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, observe = js.Any.fromFunction1((t0: org.scalajs.dom.Element) => observe(t0).runNow()), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = takeRecords.toJsFn, thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1((t0: org.scalajs.dom.Element) => unobserve(t0).runNow()), root = null)
    __obj.asInstanceOf[IntersectionObserver]
  }
  
  extension [Self <: IntersectionObserver](x: Self) {
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
    
    inline def setObserve(value: org.scalajs.dom.Element => Callback): Self = StObject.set(x, "observe", js.Any.fromFunction1((t0: org.scalajs.dom.Element) => value(t0).runNow()))
    
    inline def setRoot(value: org.scalajs.dom.Element | org.scalajs.dom.Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setTakeRecords(value: CallbackTo[js.Array[IntersectionObserverEntry]]): Self = StObject.set(x, "takeRecords", value.toJsFn)
    
    inline def setThresholds(value: js.Array[Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsVarargs(value: Double*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setUnobserve(value: org.scalajs.dom.Element => Callback): Self = StObject.set(x, "unobserve", js.Any.fromFunction1((t0: org.scalajs.dom.Element) => value(t0).runNow()))
  }
}
