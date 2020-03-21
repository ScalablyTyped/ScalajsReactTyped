package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialSidenavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typingsJapgolly.materializeCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Sidenav] = js.native
  def init(els: MElements, options: PartialSidenavOptions): js.Array[typingsJapgolly.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Sidenav = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialSidenavOptions): typingsJapgolly.materializeCss.M.Sidenav = js.native
}

