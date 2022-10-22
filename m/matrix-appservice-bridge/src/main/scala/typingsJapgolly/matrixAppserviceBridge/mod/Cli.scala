package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libComponentsCliMod.CliOpts
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Cli")
@js.native
open class Cli[ConfigType /* <: Record[String, Any] */] protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsCliMod.Cli[ConfigType] {
  /**
    * @constructor
    * @param opts CLI options
    */
  def this(opts: CliOpts[ConfigType]) = this()
}
/* static members */
object Cli {
  
  @JSImport("matrix-appservice-bridge", "Cli")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-appservice-bridge", "Cli.DEFAULT_FILENAME")
  @js.native
  def DEFAULT_FILENAME: String = js.native
  inline def DEFAULT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FILENAME")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-appservice-bridge", "Cli.DEFAULT_WATCH_INTERVAL")
  @js.native
  def DEFAULT_WATCH_INTERVAL: Double = js.native
  inline def DEFAULT_WATCH_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WATCH_INTERVAL")(x.asInstanceOf[js.Any])
}
