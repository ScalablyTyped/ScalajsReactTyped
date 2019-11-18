package typingsJapgolly.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ImageUtils")
@js.native
object ImageUtils extends js.Object {
  var crossOrigin: String = js.native
  def loadTexture(url: String): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(url: String, mapping: typingsJapgolly.three.srcConstantsMod.Mapping): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String]): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[String], mapping: typingsJapgolly.three.srcConstantsMod.Mapping): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = js.native
}

