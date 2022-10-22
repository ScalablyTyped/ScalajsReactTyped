package typingsJapgolly.prosemirrorSchemaList

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prosemirrorModel.mod.NodeSpec
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-schema-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addListNodes[N /* <: String */](
    nodes: /* import warning: importer.ImportType#apply Failed type conversion: {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any,
    itemContent: String
  ): (/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any)]
  inline def addListNodes[N /* <: String */](
    nodes: /* import warning: importer.ImportType#apply Failed type conversion: {[ name in N ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any,
    itemContent: String,
    listGroup: String
  ): (/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any], listGroup.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any)]
  inline def addListNodes[N /* <: String */](
    nodes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any,
    itemContent: String
  ): (/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any)]
  inline def addListNodes[N /* <: String */](
    nodes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any,
    itemContent: String,
    listGroup: String
  ): (/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any], listGroup.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ name in N | 'ordered_list' | 'bullet_list' | 'list_item' ]: prosemirror-model.prosemirror-model.NodeSpec} */ js.Any) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedMap<NodeSpec> */ Any)]
  
  @JSImport("prosemirror-schema-list", "bulletList")
  @js.native
  def bulletList: NodeSpec = js.native
  inline def bulletList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bulletList")(x.asInstanceOf[js.Any])
  
  inline def liftListItem[S /* <: Schema[Any, Any] */](itemType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  @JSImport("prosemirror-schema-list", "listItem")
  @js.native
  def listItem: NodeSpec = js.native
  inline def listItem_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-schema-list", "orderedList")
  @js.native
  def orderedList: NodeSpec = js.native
  inline def orderedList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orderedList")(x.asInstanceOf[js.Any])
  
  inline def sinkListItem[S /* <: Schema[Any, Any] */](itemType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sinkListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def splitListItem[S /* <: Schema[Any, Any] */](itemType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def wrapInList[S /* <: Schema[Any, Any] */](listType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def wrapInList[S /* <: Schema[Any, Any] */](listType: NodeType, attrs: StringDictionary[Any]): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
}
