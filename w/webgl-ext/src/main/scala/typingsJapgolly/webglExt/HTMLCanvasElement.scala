package typingsJapgolly.webglExt

import org.scalajs.dom.WebGLContextAttributes
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.webglExt.webglExtStrings.`experimental-webgl`
import typingsJapgolly.webglExt.webglExtStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCanvasElement extends StObject {
  
  def getContext(contextId: webgl | `experimental-webgl`): (WebGLRenderingContext & WebGL1Extensions) | Null = js.native
  def getContext(contextId: webgl | `experimental-webgl`, contextAttributes: WebGLContextAttributes): (WebGLRenderingContext & WebGL1Extensions) | Null = js.native
}
