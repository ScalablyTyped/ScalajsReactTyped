package typingsJapgolly.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTexture(url: String, mapping: typingsJapgolly.three.constantsMod.Mapping): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.textureMod.Texture, Unit]
  ): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String]): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typingsJapgolly.three.constantsMod.Mapping): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.textureMod.Texture, Unit]
  ): typingsJapgolly.three.textureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.constantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.textureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.textureMod.Texture = js.native
}

