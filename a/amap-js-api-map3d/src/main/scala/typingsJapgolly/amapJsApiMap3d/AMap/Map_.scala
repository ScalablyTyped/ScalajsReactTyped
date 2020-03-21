package typingsJapgolly.amapJsApiMap3d.AMap

import typingsJapgolly.amapJsApi.AMap.Layer
import typingsJapgolly.amapJsApi.AMap.Pixel
import typingsJapgolly.amapJsApiMap3d.AMap.Map.Object3DResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map_ extends js.Object {
  var AmbientLight: js.UndefOr[typingsJapgolly.amapJsApiMap3d.AMap.Lights.AmbientLight] = js.native
  var DirectionLight: js.UndefOr[typingsJapgolly.amapJsApiMap3d.AMap.Lights.DirectionLight] = js.native
  def getObject3DByContainerPos(pixel: Pixel): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer]): Object3DResult | Null = js.native
  def getObject3DByContainerPos(pixel: Pixel, layers: js.Array[Layer], all: Boolean): Object3DResult | Null = js.native
}

