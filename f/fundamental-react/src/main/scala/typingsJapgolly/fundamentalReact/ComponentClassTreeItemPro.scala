package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotItem
import typingsJapgolly.fundamentalReact.treeViewMod.TreeItemProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeItemProps, react.react.ComponentState> & {  displayName  :'TreeView.Item'} */
@js.native
trait ComponentClassTreeItemPro
  extends Instantiable1[/* props */ TreeItemProps, Component[TreeItemProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeItemProps, 
      /* context */ js.Any, 
      Component[TreeItemProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeItemProps] = js.native
  var displayName: js.UndefOr[String with TreeViewDotItem] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeItemProps, js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeItem] = js.native
}

