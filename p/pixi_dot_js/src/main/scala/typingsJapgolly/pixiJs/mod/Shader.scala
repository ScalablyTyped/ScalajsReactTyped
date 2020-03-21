package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper class for shaders
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Shader")
@js.native
class Shader ()
  extends typingsJapgolly.pixiJs.PIXI.Shader {
  def this(program: typingsJapgolly.pixiJs.PIXI.Program) = this()
  def this(program: typingsJapgolly.pixiJs.PIXI.Program, uniforms: js.Any) = this()
}

/* static members */
@JSImport("pixi.js", "Shader")
@js.native
object Shader extends js.Object {
  /**
    * A short hand function to create a shader based of a vertex and fragment shader
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {object} [uniforms] - Custom uniforms to use to augment the built-in ones.
    *
    * @returns {PIXI.Shader} an shiny new Pixi shader!
    */
  def from(): typingsJapgolly.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String): typingsJapgolly.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String): typingsJapgolly.pixiJs.PIXI.Shader = js.native
  def from(vertexSrc: String, fragmentSrc: String, uniforms: js.Any): typingsJapgolly.pixiJs.PIXI.Shader = js.native
}

