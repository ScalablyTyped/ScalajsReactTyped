package typingsJapgolly.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stopper_ extends StObject {
  
  /**
    * This function will signal a running server to stop. The equivalent of karma stop.
    */
  def stop(): Unit = js.native
  def stop(options: Unit, callback: ServerCallback): Unit = js.native
  def stop(options: ConfigOptions): Unit = js.native
  def stop(options: ConfigOptions, callback: ServerCallback): Unit = js.native
  def stop(options: Config_): Unit = js.native
  def stop(options: Config_, callback: ServerCallback): Unit = js.native
}
