package typingsJapgolly.fundamentalReact.mod

import typingsJapgolly.fundamentalReact.anon.PartialTreeColProps
import typingsJapgolly.fundamentalReact.anon.PartialTreeHeadProps
import typingsJapgolly.fundamentalReact.anon.PartialTreeItemProps
import typingsJapgolly.fundamentalReact.anon.PartialTreeRowProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTreeColP
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTreeHead
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTreeItem
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTreeRowP
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotBranch
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotCol
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotHead
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotItem
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotRow
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeViewDotTree
import typingsJapgolly.fundamentalReact.libTreeViewTreeViewMod.TreeColProps
import typingsJapgolly.fundamentalReact.libTreeViewTreeViewMod.TreeHeadProps
import typingsJapgolly.fundamentalReact.libTreeViewTreeViewMod.TreeItemProps
import typingsJapgolly.fundamentalReact.libTreeViewTreeViewMod.TreeRowProps
import typingsJapgolly.fundamentalReact.libTreeViewTreeViewMod.default
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "TreeView")
@js.native
open class TreeView () extends default
object TreeView {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Branch")
  @js.native
  open class Branch protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    def this(props: js.Object, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Branch'} */
  object Branch {
    
    @JSImport("fundamental-react", "TreeView.Branch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Branch.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[js.Object] = js.native
    inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotBranch] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotBranch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Branch.propTypes")
    @js.native
    def propTypes: js.UndefOr[js.Object] = js.native
    inline def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Col")
  @js.native
  open class Col protected ()
    extends Component[TreeColProps, js.Object, Any] {
    def this(props: TreeColProps) = this()
    def this(props: TreeColProps, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeColProps, react.react.ComponentState> & {  displayName :'TreeView.Col'} */
  object Col {
    
    @JSImport("fundamental-react", "TreeView.Col")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Col.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTreeColProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTreeColProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotCol] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeColProps, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeColProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeColProps, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeColProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Col.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTreeColP] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeColP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Head")
  @js.native
  open class Head protected ()
    extends Component[TreeHeadProps, js.Object, Any] {
    def this(props: TreeHeadProps) = this()
    def this(props: TreeHeadProps, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeHeadProps, react.react.ComponentState> & {  displayName :'TreeView.Head'} */
  object Head {
    
    @JSImport("fundamental-react", "TreeView.Head")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Head.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTreeHeadProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTreeHeadProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotHead] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Head.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTreeHead] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Item")
  @js.native
  open class Item protected ()
    extends Component[TreeItemProps, js.Object, Any] {
    def this(props: TreeItemProps) = this()
    def this(props: TreeItemProps, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeItemProps, react.react.ComponentState> & {  displayName :'TreeView.Item'} */
  object Item {
    
    @JSImport("fundamental-react", "TreeView.Item")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Item.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTreeItemProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTreeItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotItem] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeItemProps, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeItemProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Item.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTreeItem] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Row")
  @js.native
  open class Row protected ()
    extends Component[TreeRowProps, js.Object, Any] {
    def this(props: TreeRowProps) = this()
    def this(props: TreeRowProps, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeRowProps, react.react.ComponentState> & {  displayName :'TreeView.Row'} */
  object Row {
    
    @JSImport("fundamental-react", "TreeView.Row")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Row.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTreeRowProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTreeRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotRow] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotRow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeRowProps, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeRowProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Row.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTreeRowP] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeRowP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fundamental-react", "TreeView.Tree")
  @js.native
  open class Tree protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    def this(props: js.Object, context: Any) = this()
  }
  /* static member */
  /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Tree'} */
  object Tree {
    
    @JSImport("fundamental-react", "TreeView.Tree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react", "TreeView.Tree.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[js.Object] = js.native
    inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.displayName")
    @js.native
    def displayName: js.UndefOr[String | TreeViewDotTree] = js.native
    inline def displayName_=(x: js.UndefOr[String | TreeViewDotTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react", "TreeView.Tree.propTypes")
    @js.native
    def propTypes: js.UndefOr[js.Object] = js.native
    inline def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
