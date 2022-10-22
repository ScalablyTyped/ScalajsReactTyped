package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.anon.BeginIdle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache_ extends StObject {
  
  def beginIdle(): Unit = js.native
  
  def endIdle(callback: CallbackCache[Unit]): Unit = js.native
  
  def get[T](identifier: String, etag: Null, callback: CallbackCache[T]): Unit = js.native
  def get[T](identifier: String, etag: Etag, callback: CallbackCache[T]): Unit = js.native
  
  var hooks: BeginIdle = js.native
  
  def shutdown(callback: CallbackCache[Unit]): Unit = js.native
  
  def store[T](identifier: String, etag: Null, data: T, callback: CallbackCache[Unit]): Unit = js.native
  def store[T](identifier: String, etag: Etag, data: T, callback: CallbackCache[Unit]): Unit = js.native
  
  /**
  	 * After this method has succeeded the cache can only be restored when build dependencies are
  	 */
  def storeBuildDependencies(dependencies: js.Iterable[String], callback: CallbackCache[Unit]): Unit = js.native
}
