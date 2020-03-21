package typingsJapgolly.chaiEnzyme

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.chai.Chai_.ChaiPlugin
import typingsJapgolly.cheerio.Cheerio_
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, Component[js.Object, js.Object]]) | Cheerio_ | (ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object]])
}

