package typingsJapgolly.semanticUiReact.breadcrumbBreadcrumbMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
import typingsJapgolly.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbComponent extends ComponentClass[BreadcrumbProps, ComponentState] {
  var Divider: StatelessComponent[BreadcrumbDividerProps] = js.native
  var Section: ComponentClassP[BreadcrumbSectionProps with js.Object] = js.native
}

