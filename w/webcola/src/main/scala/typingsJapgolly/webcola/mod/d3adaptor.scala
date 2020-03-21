package typingsJapgolly.webcola.mod

import typingsJapgolly.webcola.d3adaptorMod.D3v3Context
import typingsJapgolly.webcola.d3adaptorMod.ID3StyleLayoutAdaptor
import typingsJapgolly.webcola.d3v4adaptorMod.D3Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "d3adaptor")
@js.native
object d3adaptor extends js.Object {
  def apply(): typingsJapgolly.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3v3Context): typingsJapgolly.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
  def apply(d3Context: D3Context): typingsJapgolly.webcola.layoutMod.Layout with ID3StyleLayoutAdaptor = js.native
}

