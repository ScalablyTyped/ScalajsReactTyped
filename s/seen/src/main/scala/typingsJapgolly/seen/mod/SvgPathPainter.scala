package typingsJapgolly.seen.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgPathPainter")
@js.native
open class SvgPathPainter protected () extends SvgStyler {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  
  def path(points: js.Array[Point]): this.type = js.native
}
