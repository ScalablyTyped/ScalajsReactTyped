package typingsJapgolly.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.xy
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.ct
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.hs
*/
trait ColorMode extends js.Object

object ColorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ct: typingsJapgolly.nodeHueApi.nodeHueApiStrings.ct = this.cast("ct")
  @scala.inline
  def hs: typingsJapgolly.nodeHueApi.nodeHueApiStrings.hs = this.cast("hs")
  @scala.inline
  def xy: typingsJapgolly.nodeHueApi.nodeHueApiStrings.xy = this.cast("xy")
}

