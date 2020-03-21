package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialTabsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tabs")
@js.native
class Tabs ()
  extends typingsJapgolly.materializeCss.M.Tabs

/* static members */
@JSImport("materialize-css", "Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Tabs] = js.native
  def init(els: MElements, options: PartialTabsOptions): js.Array[typingsJapgolly.materializeCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Tabs = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialTabsOptions): typingsJapgolly.materializeCss.M.Tabs = js.native
}

