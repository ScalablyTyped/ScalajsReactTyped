package typingsJapgolly.testingLibraryReact.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.Queries
import typingsJapgolly.testingLibraryReact.OmitRenderOptionsreadonly
import typingsJapgolly.testingLibraryReact.RenderResultreadonlygetAl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "render")
@js.native
object render extends js.Object {
  def apply(ui: Element): RenderResultreadonlygetAl = js.native
  def apply(ui: Element, options: OmitRenderOptionsreadonly): RenderResultreadonlygetAl = js.native
  def apply[Q /* <: Queries */](ui: Element, options: RenderOptions[Q]): RenderResult[Q] = js.native
}

