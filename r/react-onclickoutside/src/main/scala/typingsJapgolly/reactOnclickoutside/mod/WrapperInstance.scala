package typingsJapgolly.reactOnclickoutside.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperInstance[P, C]
  extends Component[OnClickOutProps[LibraryManagedAttributes[C, P]], js.Object, js.Any] {
  def getInstance(): InstanceType[C] = js.native
}

