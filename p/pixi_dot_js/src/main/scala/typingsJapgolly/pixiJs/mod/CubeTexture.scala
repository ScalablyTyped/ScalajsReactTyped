package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiJs.PIXI.resources.Resource
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLImageElement
import typingsJapgolly.std.HTMLVideoElement
import typingsJapgolly.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture that depends on six other resources.
  *
  * @class
  * @extends PIXI.BaseTexture
  * @memberof PIXI
  */
@JSImport("pixi.js", "CubeTexture")
@js.native
class CubeTexture ()
  extends typingsJapgolly.pixiJs.PIXI.CubeTexture

/* static members */
@JSImport("pixi.js", "CubeTexture")
@js.native
object CubeTexture extends js.Object {
  def from(resources: String): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: String, options: js.Any): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  /**
    * Generate a new CubeTexture.
    * @static
    * @param {string[]|PIXI.resources.Resource[]} resources - Collection of 6 URLs or resources
    * @param {object} [options] - Optional options passed to the resources being loaded.
    *        See {@PIXI.resources.autoDetectResource autoDetectResource} for more info
    *        on the options available to each resource.
    * @returns {PIXI.CubeTexture} new cube texture
    */
  def from(resources: js.Array[Resource | String]): typingsJapgolly.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: js.Array[Resource | String], options: js.Any): typingsJapgolly.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: HTMLCanvasElement): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLCanvasElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.BaseTexture = js.native
}

