package typingsJapgolly.sigmajs

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsJapgolly.sigmajs.SigmaJs.Sigma
import typingsJapgolly.sigmajs.SigmaJs.SigmaConfigs
import typingsJapgolly.sigmajs.SigmaJs.SigmaFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sigma")
@js.native
class sigma () extends Sigma {
  def this(configuration: SigmaConfigs) = this()
  def this(container: String) = this()
  def this(container: Element) = this()
}

@JSGlobal("sigma")
@js.native
object sigma extends TopLevel[SigmaFactory]

