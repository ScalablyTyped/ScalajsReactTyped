package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type of the drive. Can be:
  * - REMOVABLE
  * - FIXED
  * - NETWORK
  * - CD_ROM
  * - RAM
  * - UNKNOWN_TYPE
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.REMOVABLE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIXED
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NETWORK
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CD_ROM
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RAM
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE
*/
trait DriveType extends js.Object

object DriveType {
  @scala.inline
  def CD_ROM: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CD_ROM = this.cast("CD_ROM")
  @scala.inline
  def FIXED: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIXED = this.cast("FIXED")
  @scala.inline
  def NETWORK: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NETWORK = this.cast("NETWORK")
  @scala.inline
  def RAM: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RAM = this.cast("RAM")
  @scala.inline
  def REMOVABLE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.REMOVABLE = this.cast("REMOVABLE")
  @scala.inline
  def UNKNOWN_TYPE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.UNKNOWN_TYPE = this.cast("UNKNOWN_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

