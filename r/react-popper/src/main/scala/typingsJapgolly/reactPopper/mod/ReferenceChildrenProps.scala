package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceChildrenProps extends js.Object {
  // React refs are supposed to be contravariant (allows a more general type to be passed rather than a more specific one)
  // However, Typescript currently can't infer that fact for refs
  // See https://github.com/microsoft/TypeScript/issues/30748 for more information
  var ref: Ref
}

object ReferenceChildrenProps {
  @scala.inline
  def apply(ref: Ref = null): ReferenceChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceChildrenProps]
  }
}

