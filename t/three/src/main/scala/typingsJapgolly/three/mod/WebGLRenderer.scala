package typingsJapgolly.three.mod

import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLRenderer")
@js.native
/**
  * parameters is an optional object with properties defining the renderer's behaviour.
  * The constructor also accepts no parameters at all.
  * In all cases, it will assume sane defaults when parameters are missing.
  */
open class WebGLRenderer ()
  extends typingsJapgolly.three.srcThreeMod.WebGLRenderer {
  def this(parameters: WebGLRendererParameters) = this()
}
