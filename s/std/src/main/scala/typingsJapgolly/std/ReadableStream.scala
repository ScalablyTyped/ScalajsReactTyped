package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object. */
@js.native
trait ReadableStream[R] extends StObject {
  
  /* standard dom */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  /* standard dom */
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  
  /* standard dom */
  val locked: scala.Boolean = js.native
  
  /* standard dom */
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): org.scalajs.dom.ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptions): org.scalajs.dom.ReadableStream[T] = js.native
  
  /* standard dom */
  def pipeTo(destination: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptions): js.Promise[Unit] = js.native
  
  /* standard dom */
  def tee(): js.Tuple2[org.scalajs.dom.ReadableStream[R], org.scalajs.dom.ReadableStream[R]] = js.native
}
