package typingsJapgolly.riot.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.riot.AnonParentScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  def apply[Props, State](shell: RiotComponentShell[Props, State]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[AnonParentScope], 
    RiotComponent[Props, State]
  ] = js.native
}

