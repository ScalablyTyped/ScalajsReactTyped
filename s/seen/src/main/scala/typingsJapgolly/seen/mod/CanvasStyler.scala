package typingsJapgolly.seen.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.seen.anon.Fill
import typingsJapgolly.seen.anon.Stroke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasStyler")
@js.native
open class CanvasStyler protected () extends StObject {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def draw(): this.type = js.native
  def draw(style: Stroke): this.type = js.native
  
  def fill(): this.type = js.native
  def fill(style: Fill): this.type = js.native
}
