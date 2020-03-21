package typingsJapgolly.pixiJs.mod

import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Sprite object is the base for all textured objects that are rendered to the screen
  *
  * A sprite can be created directly from an image like this:
  *
  * ```js
  * let sprite = PIXI.Sprite.from('assets/image.png');
  * ```
  *
  * The more efficient way to create sprites is using a {@link PIXI.Spritesheet},
  * as swapping base textures when rendering to the screen is inefficient.
  *
  * ```js
  * PIXI.Loader.shared.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["assets/spritesheet.json"].spritesheet;
  *   let sprite = new PIXI.Sprite(sheet.textures["image.png"]);
  *   ...
  * }
  * ```
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSImport("pixi.js", "Sprite")
@js.native
class Sprite ()
  extends typingsJapgolly.pixiJs.PIXI.Sprite {
  def this(texture: typingsJapgolly.pixiJs.PIXI.Texture) = this()
}

/* static members */
@JSImport("pixi.js", "Sprite")
@js.native
object Sprite extends js.Object {
  /**
    * Helper function that creates a new sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source Source to create texture from
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.Sprite} The newly created sprite
    */
  def from(source: String): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: String, options: js.Any): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: typingsJapgolly.pixiJs.PIXI.Texture): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: typingsJapgolly.pixiJs.PIXI.Texture, options: js.Any): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLCanvasElement): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLCanvasElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLVideoElement): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
  def from(source: HTMLVideoElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.Sprite = js.native
}

