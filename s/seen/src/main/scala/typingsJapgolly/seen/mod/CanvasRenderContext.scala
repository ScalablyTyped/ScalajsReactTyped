package typingsJapgolly.seen.mod

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasRenderContext")
@js.native
open class CanvasRenderContext protected () extends RenderContext {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  
  var ctx: CanvasRenderingContext2D = js.native
  
  var el: HTMLCanvasElement = js.native
}
