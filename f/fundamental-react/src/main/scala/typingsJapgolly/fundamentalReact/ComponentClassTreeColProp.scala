package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotCol
import typingsJapgolly.fundamentalReact.treeViewMod.TreeColProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeColProps, react.react.ComponentState> & {  displayName  :'TreeView.Col'} */
@js.native
trait ComponentClassTreeColProp
  extends Instantiable1[/* props */ TreeColProps, Component[TreeColProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ TreeColProps, 
      /* context */ js.Any, 
      Component[TreeColProps, ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTreeColProps] = js.native
  var displayName: js.UndefOr[String with TreeViewDotCol] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeColProps, js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeColProps, js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTreeColP] = js.native
}

