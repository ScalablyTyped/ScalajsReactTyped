package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aliApp.aliAppStrings.UNKNOWN
  - typingsJapgolly.aliApp.aliAppStrings.NOTREACHABLE
  - typingsJapgolly.aliApp.aliAppStrings.WIFI
  - typingsJapgolly.aliApp.aliAppStrings.`3G`
  - typingsJapgolly.aliApp.aliAppStrings.`2G`
  - typingsJapgolly.aliApp.aliAppStrings.`4G`
  - typingsJapgolly.aliApp.aliAppStrings.WWAN
*/
trait NetworkType extends js.Object

object NetworkType {
  @scala.inline
  def `2G`: typingsJapgolly.aliApp.aliAppStrings.`2G` = this.cast("2G")
  @scala.inline
  def `3G`: typingsJapgolly.aliApp.aliAppStrings.`3G` = this.cast("3G")
  @scala.inline
  def `4G`: typingsJapgolly.aliApp.aliAppStrings.`4G` = this.cast("4G")
  @scala.inline
  def NOTREACHABLE: typingsJapgolly.aliApp.aliAppStrings.NOTREACHABLE = this.cast("NOTREACHABLE")
  @scala.inline
  def UNKNOWN: typingsJapgolly.aliApp.aliAppStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def WIFI: typingsJapgolly.aliApp.aliAppStrings.WIFI = this.cast("WIFI")
  @scala.inline
  def WWAN: typingsJapgolly.aliApp.aliAppStrings.WWAN = this.cast("WWAN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

