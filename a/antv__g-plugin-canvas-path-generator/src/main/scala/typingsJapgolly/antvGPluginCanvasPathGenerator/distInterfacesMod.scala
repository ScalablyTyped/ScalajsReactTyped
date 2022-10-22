package typingsJapgolly.antvGPluginCanvasPathGenerator

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/interfaces", "PathGenerator")
  @js.native
  val PathGenerator: DefinedToken = js.native
  type PathGenerator[T /* <: ParsedBaseStyleProps */] = js.Function2[/* context */ CanvasRenderingContext2D, /* attributes */ T, Unit]
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/interfaces", "PathGeneratorFactory")
  @js.native
  val PathGeneratorFactory: DefinedToken = js.native
}
