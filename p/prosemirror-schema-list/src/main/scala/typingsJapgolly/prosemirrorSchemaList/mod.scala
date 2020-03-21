package typingsJapgolly.prosemirrorSchemaList

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.orderedmap.mod.^
import typingsJapgolly.prosemirrorModel.mod.NodeSpec
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-schema-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var bulletList: NodeSpec = js.native
  var listItem: NodeSpec = js.native
  var orderedList: NodeSpec = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String): ^[NodeSpec] = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String, listGroup: String): ^[NodeSpec] = js.native
  def liftListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def sinkListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def splitListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

