package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "PatternBrush")
@js.native
class PatternBrush () extends PencilBrush {
  /**
  	 * Creates "pattern" instance property
  	 */
  def getPattern(): js.Any = js.native
  def getPatternSrc(): HTMLCanvasElement = js.native
  def getPatternSrcFunction(): String = js.native
}

