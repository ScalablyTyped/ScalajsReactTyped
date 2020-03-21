package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotRow
import typingsJapgolly.fundamentalReact.treeViewMod.TreeRowProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeRowProps, react.react.ComponentState> & {  displayName  :'TreeView.Row'} */
@js.native
trait ComponentClassTreeRowProp
  extends Instantiable1[/* props */ TreeRowProps, Component[TreeRowProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeRowProps, 
      /* context */ js.Any, 
      Component[TreeRowProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeRowProps] = js.native
  var displayName: js.UndefOr[String with TreeViewDotRow] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeRowProps, js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeRowP] = js.native
}

