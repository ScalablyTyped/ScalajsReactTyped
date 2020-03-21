package typingsJapgolly.styledComponents.nativeMod

import typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typingsJapgolly.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
@js.native
trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    T, 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
}

