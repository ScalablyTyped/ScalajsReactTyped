package typingsJapgolly.seen.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.seen.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasCirclePainter")
@js.native
open class CanvasCirclePainter protected () extends CanvasStyler {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def circle(center: X, radius: Double): CanvasCirclePainter = js.native
}
