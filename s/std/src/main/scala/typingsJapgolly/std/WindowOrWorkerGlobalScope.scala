package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  /* standard dom */
  def atob(data: java.lang.String): java.lang.String = js.native
  
  /* standard dom */
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val caches: org.scalajs.dom.CacheStorage = js.native
  
  /* standard dom */
  def clearInterval(): Unit = js.native
  def clearInterval(id: Double): Unit = js.native
  
  /* standard dom */
  def clearTimeout(): Unit = js.native
  def clearTimeout(id: Double): Unit = js.native
  
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = js.native
  
  /* standard dom */
  val crossOriginIsolated: scala.Boolean = js.native
  
  /* standard dom */
  val crypto: org.scalajs.dom.Crypto = js.native
  
  def fetch(input: org.scalajs.dom.URL): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.URL, init: org.scalajs.dom.RequestInit): js.Promise[org.scalajs.dom.Response] = js.native
  /* standard dom */
  def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: RequestInfo, init: org.scalajs.dom.RequestInit): js.Promise[org.scalajs.dom.Response] = js.native
  
  /* standard dom */
  val indexedDB: org.scalajs.dom.IDBFactory = js.native
  
  /* standard dom */
  val isSecureContext: scala.Boolean = js.native
  
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /* standard dom */
  val performance: org.scalajs.dom.Performance = js.native
  
  /* standard dom */
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  /* standard dom */
  def reportError(e: Any): Unit = js.native
  
  /* standard dom */
  def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /* standard dom */
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /* standard dom */
  def structuredClone(value: Any): Any = js.native
  def structuredClone(value: Any, options: StructuredSerializeOptions): Any = js.native
}
