package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type TreeCheckboxSelectionKeys = StringDictionary[TreeCheckboxSelectionKeyType]

type TreeExpandedKeysType = StringDictionary[Boolean]

type TreeFilterTemplateType = Node | (js.Function1[/* options */ TreeFilterOptions, Node])

type TreeFooterTemplateType = Node | (js.Function1[/* props */ TreeProps, Node])

type TreeHeaderTemplateType = Node | (js.Function1[/* options */ TreeHeaderTemplateOptions, Node])

type TreeMultipleSelectionKeys = StringDictionary[Boolean]

type TreeNodeDoubleClickParams = TreeNodeClickParams

type TreeNodeTemplateType = Node | (js.Function2[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
/* options */ TreeNodeTemplateOptions, 
Node])

type TreeSelectionKeyType = Boolean | TreeCheckboxSelectionKeyType

type TreeSelectionKeys = String | TreeMultipleSelectionKeys | TreeCheckboxSelectionKeys | Null

type TreeTogglerTemplateType = Node | (js.Function2[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeNode */ /* node */ Any, 
/* options */ TreeTogglerTemplateOptions, 
Node])
