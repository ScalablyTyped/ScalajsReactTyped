package typingsJapgolly.semanticUiReact.headerHeaderMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.headerContentMod.HeaderContentProps
import typingsJapgolly.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderComponent extends FunctionComponent[HeaderProps] {
  var Content: StatelessComponent[HeaderContentProps] = js.native
  var Subheader: StatelessComponent[HeaderSubheaderProps] = js.native
}

