package typingsJapgolly.playcanvas.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.GraphicsDevice
  * @augments pc.EventHandler
  * @classdesc The graphics device manages the underlying graphics context. It is responsible
  * for submitting render state changes and graphics primitives to the hardware. A graphics
  * device is tied to a specific canvas HTML element. It is valid to have more than one
  * canvas element per page and create a new graphics device against each.
  * @description Creates a new graphics device.
  * @param {HTMLCanvasElement} canvas - The canvas to which the graphics device will render.
  * @param {object} [options] - Options passed when creating the WebGL context. More info {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext here}.
  * @property {HTMLCanvasElement} canvas The canvas DOM element that provides the underlying WebGL context used by the graphics device.
  * @property {boolean} textureFloatRenderable Determines if 32-bit floating-point textures can be used as frame buffer. [read only].
  * @property {boolean} textureHalfFloatRenderable Determines if 16-bit floating-point textures can be used as frame buffer. [read only].
  * @property {pc.ScopeSpace} scope The scope namespace for shader attributes and variables. [read only].
  */
@JSImport("playcanvas", "GraphicsDevice")
@js.native
class GraphicsDevice protected ()
  extends typingsJapgolly.playcanvas.pc.GraphicsDevice {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: js.Any) = this()
}

