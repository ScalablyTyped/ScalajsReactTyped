package typingsJapgolly.amapJsApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.amapJsApiStrings.gps
  - typingsJapgolly.amapJsApi.amapJsApiStrings.baidu
  - typingsJapgolly.amapJsApi.amapJsApiStrings.mapbar
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def baidu: typingsJapgolly.amapJsApi.amapJsApiStrings.baidu = this.cast("baidu")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typingsJapgolly.amapJsApi.amapJsApiStrings.gps = this.cast("gps")
  @scala.inline
  def mapbar: typingsJapgolly.amapJsApi.amapJsApiStrings.mapbar = this.cast("mapbar")
}

