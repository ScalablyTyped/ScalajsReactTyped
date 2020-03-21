package typingsJapgolly.reactBootstrap.mediaBodyMod

import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBodyProps extends ClassAttributes[MediaBody] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object MediaBodyProps {
  @scala.inline
  def apply(componentClass: ReactType[_] = null, key: Key = null, ref: LegacyRef[MediaBody] = null): MediaBodyProps = {
    val __obj = js.Dynamic.literal()
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBodyProps]
  }
}

