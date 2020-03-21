package typingsJapgolly.phaser

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.phaser.spine.Texture
import typingsJapgolly.phaser.spine.TextureFilter
import typingsJapgolly.phaser.spine.TextureWrap
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTexture extends Instantiable1[/* image */ HTMLImageElement, Texture] {
  def filterFromString(text: String): TextureFilter = js.native
  def wrapFromString(text: String): TextureWrap = js.native
}

