package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialAutocompleteOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typingsJapgolly.materializeCss.M.Autocomplete

/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Autocomplete] = js.native
  def init(els: MElements, options: PartialAutocompleteOption): js.Array[typingsJapgolly.materializeCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Autocomplete = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialAutocompleteOption): typingsJapgolly.materializeCss.M.Autocomplete = js.native
}

