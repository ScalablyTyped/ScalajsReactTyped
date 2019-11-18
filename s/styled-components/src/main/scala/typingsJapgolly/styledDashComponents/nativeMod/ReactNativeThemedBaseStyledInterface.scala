package typingsJapgolly.styledDashComponents.nativeMod

import typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction
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

