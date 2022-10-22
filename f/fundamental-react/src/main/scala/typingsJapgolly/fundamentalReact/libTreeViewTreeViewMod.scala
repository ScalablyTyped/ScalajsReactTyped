package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLIElement
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
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.GetDerivedStateFromError
import typingsJapgolly.react.mod.GetDerivedStateFromProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeViewTreeViewMod {
  
  @JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Default)
  @js.native
  open class default () extends TreeView
  object default {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch")
    @js.native
    open class Branch protected ()
      extends Component[js.Object, js.Object, Any] {
      def this(props: js.Object) = this()
      def this(props: js.Object, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Branch'} */
    object Branch {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[js.Object] = js.native
      inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotBranch] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotBranch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Branch.propTypes")
      @js.native
      def propTypes: js.UndefOr[js.Object] = js.native
      inline def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col")
    @js.native
    open class Col protected ()
      extends Component[TreeColProps, js.Object, Any] {
      def this(props: TreeColProps) = this()
      def this(props: TreeColProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeColProps, react.react.ComponentState> & {  displayName :'TreeView.Col'} */
    object Col {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeColProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialTreeColProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotCol] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotCol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeColProps, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeColProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeColProps, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeColProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Col.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeColP] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeColP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head")
    @js.native
    open class Head protected ()
      extends Component[TreeHeadProps, js.Object, Any] {
      def this(props: TreeHeadProps) = this()
      def this(props: TreeHeadProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeHeadProps, react.react.ComponentState> & {  displayName :'TreeView.Head'} */
    object Head {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeHeadProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialTreeHeadProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotHead] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeHeadProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeHeadProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Head.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeHead] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeHead]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item")
    @js.native
    open class Item protected ()
      extends Component[TreeItemProps, js.Object, Any] {
      def this(props: TreeItemProps) = this()
      def this(props: TreeItemProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeItemProps, react.react.ComponentState> & {  displayName :'TreeView.Item'} */
    object Item {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeItemProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialTreeItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotItem] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeItemProps, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeItemProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeItemProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Item.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeItem] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row")
    @js.native
    open class Row protected ()
      extends Component[TreeRowProps, js.Object, Any] {
      def this(props: TreeRowProps) = this()
      def this(props: TreeRowProps, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<fundamental-react.fundamental-react/lib/TreeView/TreeView.TreeRowProps, react.react.ComponentState> & {  displayName :'TreeView.Row'} */
    object Row {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialTreeRowProps] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialTreeRowProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotRow] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotRow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TreeRowProps, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[TreeRowProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[TreeRowProps, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Row.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapTreeRowP] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeRowP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree")
    @js.native
    open class Tree protected ()
      extends Component[js.Object, js.Object, Any] {
      def this(props: js.Object) = this()
      def this(props: js.Object, context: Any) = this()
    }
    /* static member */
    /* Inlined react.react.ComponentClass<{}, react.react.ComponentState> & {  displayName :'TreeView.Tree'} */
    object Tree {
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.childContextTypes")
      @js.native
      def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[js.Object] = js.native
      inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.displayName")
      @js.native
      def displayName: js.UndefOr[String | TreeViewDotTree] = js.native
      inline def displayName_=(x: js.UndefOr[String | TreeViewDotTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/TreeView/TreeView", "default.Tree.propTypes")
      @js.native
      def propTypes: js.UndefOr[js.Object] = js.native
      inline def propTypes_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
  }
  
  trait TreeColProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
  object TreeColProps {
    
    inline def apply(): TreeColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeColProps]
    }
  }
  
  trait TreeHeadProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var buttonProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onExpandAll: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object TreeHeadProps {
    
    inline def apply(): TreeHeadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeHeadProps]
    }
    
    extension [Self <: TreeHeadProps](x: Self) {
      
      inline def setButtonProps(value: StringDictionary[Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setOnExpandAll(value: /* repeated */ Any => Any): Self = StObject.set(x, "onExpandAll", js.Any.fromFunction1(value))
      
      inline def setOnExpandAllUndefined: Self = StObject.set(x, "onExpandAll", js.undefined)
    }
  }
  
  trait TreeItemProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var rowId: js.UndefOr[String] = js.undefined
  }
  object TreeItemProps {
    
    inline def apply(): TreeItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemProps]
    }
    
    extension [Self <: TreeItemProps](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    }
  }
  
  trait TreeRowProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var isParent: js.UndefOr[Boolean] = js.undefined
    
    var onExpandClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var rowId: js.UndefOr[String] = js.undefined
  }
  object TreeRowProps {
    
    inline def apply(): TreeRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeRowProps]
    }
    
    extension [Self <: TreeRowProps](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
      
      inline def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
      
      inline def setOnExpandClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onExpandClick", js.Any.fromFunction1(value))
      
      inline def setOnExpandClickUndefined: Self = StObject.set(x, "onExpandClick", js.undefined)
      
      inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    }
  }
  
  @js.native
  trait TreeView
    extends Component[TreeViewProps, js.Object, Any] {
    
    var displayName: typingsJapgolly.fundamentalReact.fundamentalReactStrings.TreeView = js.native
  }
  
  trait TreeViewProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var expandData: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var isExpandAll: js.UndefOr[Boolean] = js.undefined
    
    var onExpandChange: js.UndefOr[js.Function1[/* expandData */ StringDictionary[Boolean], Unit]] = js.undefined
  }
  object TreeViewProps {
    
    inline def apply(): TreeViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeViewProps]
    }
    
    extension [Self <: TreeViewProps](x: Self) {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setExpandData(value: StringDictionary[Boolean]): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
      
      inline def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
      
      inline def setIsExpandAll(value: Boolean): Self = StObject.set(x, "isExpandAll", value.asInstanceOf[js.Any])
      
      inline def setIsExpandAllUndefined: Self = StObject.set(x, "isExpandAll", js.undefined)
      
      inline def setOnExpandChange(value: /* expandData */ StringDictionary[Boolean] => Callback): Self = StObject.set(x, "onExpandChange", js.Any.fromFunction1((t0: /* expandData */ StringDictionary[Boolean]) => value(t0).runNow()))
      
      inline def setOnExpandChangeUndefined: Self = StObject.set(x, "onExpandChange", js.undefined)
    }
  }
}
