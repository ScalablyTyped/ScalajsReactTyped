package typingsJapgolly.hlsJs.mod

import typingsJapgolly.hlsJs.AnonAUDIOTRACKLOADED
import typingsJapgolly.hlsJs.AnonAUDIOTRACKLOADERROR
import typingsJapgolly.hlsJs.AnonKEYSYSTEMERROR
import typingsJapgolly.hlsJs.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js", JSImport.Namespace)
@js.native
/**
  * Constructor. Can be provided an HlsConfig object as default properties and or overrides
  */
class ^ () extends Hls {
  def this(config: PartialConfig) = this()
}

@JSImport("hls.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * override Hls default configuration
    * this configuration will be applied by default to all instances
    */
  var DefaultConfig: Config = js.native
  /**
    * Hls error details
    */
  var ErrorDetails: AnonAUDIOTRACKLOADERROR = js.native
  /**
    * Hls error types
    */
  var ErrorTypes: AnonKEYSYSTEMERROR = js.native
  /**
    * Hls events
    */
  var Events: AnonAUDIOTRACKLOADED = js.native
  /**
    * returns hls.js dist version number
    */
  var version: String = js.native
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  def isSupported(): Boolean = js.native
}

