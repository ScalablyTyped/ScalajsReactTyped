package typingsJapgolly.webcola.d3adaptorMod

import typingsJapgolly.webcola.d3v4adaptorMod.D3Context
import typingsJapgolly.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/d3adaptor", "d3adaptor")
@js.native
object d3adaptor extends js.Object {
  def apply(): Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3v3Context): Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3Context): Layout with ID3StyleLayoutAdaptor = js.native
}

