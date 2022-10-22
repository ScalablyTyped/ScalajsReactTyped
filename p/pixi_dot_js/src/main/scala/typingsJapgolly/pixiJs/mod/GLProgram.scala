package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "GLProgram")
@js.native
open class GLProgram protected ()
  extends typingsJapgolly.pixiCore.mod.GLProgram {
  /**
    * Makes a new Pixi program.
    * @param program - webgl program
    * @param uniformData - uniforms
    */
  def this(program: WebGLProgram, uniformData: StringDictionary[typingsJapgolly.pixiCore.mod.IGLUniformData]) = this()
}
