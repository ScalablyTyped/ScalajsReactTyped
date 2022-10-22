package typingsJapgolly.seen.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.seen.anon.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasTextPainter")
@js.native
open class CanvasTextPainter protected () extends StObject {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def fillText(m: Matrix, text: String): this.type = js.native
  def fillText(m: Matrix, text: String, style: Font): this.type = js.native
}
