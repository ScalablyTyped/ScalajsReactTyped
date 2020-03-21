package typingsJapgolly.amapJsApi.AMap.MarkerShape

import typingsJapgolly.amapJsApi.amapJsApiStrings.circle
import typingsJapgolly.amapJsApi.amapJsApiStrings.poly
import typingsJapgolly.amapJsApi.amapJsApiStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.AMap.MarkerShape.CircleOptions
  - typingsJapgolly.amapJsApi.AMap.MarkerShape.PolyOptions
  - typingsJapgolly.amapJsApi.AMap.MarkerShape.RectOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def CircleOptions(coords: js.Tuple3[Double, Double, Double], `type`: circle): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def PolyOptions(coords: js.Array[Double], `type`: poly): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def RectOptions(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

