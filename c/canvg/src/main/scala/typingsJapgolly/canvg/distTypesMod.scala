package typingsJapgolly.canvg

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.offscreencanvas.OffscreenCanvasRenderingContext2D
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait Fetch extends StObject {
    
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  type MatrixValue = js.Tuple6[Double, Double, Double, Double, Double, Double]
  
  type RenderingContext2D = CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D
  
  type VectorValue = js.Tuple2[Double, Double]
}
