package typingsJapgolly.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.LightGroup
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.Room
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.Luminaire
  - typingsJapgolly.nodeHueApi.nodeHueApiStrings.LightSource
*/
trait LightGroupType extends js.Object

object LightGroupType {
  @scala.inline
  def LightGroup: typingsJapgolly.nodeHueApi.nodeHueApiStrings.LightGroup = this.cast("LightGroup")
  @scala.inline
  def LightSource: typingsJapgolly.nodeHueApi.nodeHueApiStrings.LightSource = this.cast("LightSource")
  @scala.inline
  def Luminaire: typingsJapgolly.nodeHueApi.nodeHueApiStrings.Luminaire = this.cast("Luminaire")
  @scala.inline
  def Room: typingsJapgolly.nodeHueApi.nodeHueApiStrings.Room = this.cast("Room")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

