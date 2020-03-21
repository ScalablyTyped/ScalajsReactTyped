package typingsJapgolly.ol.iconImageCacheMod

import typingsJapgolly.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImageCache", JSImport.Default)
@js.native
class default () extends IconImageCache {
  /* CompleteClass */
  override def canExpireCache(): Boolean = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def expire(): Unit = js.native
  /* CompleteClass */
  override def get(src: String, crossOrigin: String, color: Color): typingsJapgolly.ol.iconImageMod.default = js.native
  /* CompleteClass */
  override def set(src: String, crossOrigin: String, color: Color, iconImage: typingsJapgolly.ol.iconImageMod.default): Unit = js.native
  /* CompleteClass */
  override def setSize(maxCacheSize: Double): Unit = js.native
}

