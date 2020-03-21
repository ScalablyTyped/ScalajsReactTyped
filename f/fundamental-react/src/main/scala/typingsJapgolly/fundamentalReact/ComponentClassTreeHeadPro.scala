package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotHead
import typingsJapgolly.fundamentalReact.treeViewMod.TreeHeadProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeHeadProps, react.react.ComponentState> & {  displayName  :'TreeView.Head'} */
@js.native
trait ComponentClassTreeHeadPro
  extends Instantiable1[/* props */ TreeHeadProps, Component[TreeHeadProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeHeadProps, 
      /* context */ js.Any, 
      Component[TreeHeadProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeHeadProps] = js.native
  var displayName: js.UndefOr[String with TreeViewDotHead] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeHead] = js.native
}

