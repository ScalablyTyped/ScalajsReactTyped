package typingsJapgolly.contentstackUtils

import typingsJapgolly.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import typingsJapgolly.contentstackUtils.distTypesModelsEmbeddedObjectMod.EntryEmbedable
import typingsJapgolly.contentstackUtils.distTypesModelsJsonRteModelMod.EntryNode
import typingsJapgolly.contentstackUtils.distTypesModelsMetadataModelMod.Metadata
import typingsJapgolly.contentstackUtils.distTypesNodesDocumentMod.default
import typingsJapgolly.contentstackUtils.distTypesOptionsMod.RenderOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelperEnumerateEntriesMod {
  
  @JSImport("@contentstack/utils/dist/types/helper/enumerate-entries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumerate(
    entries: js.Array[EmbeddedItem | EntryEmbedable],
    process: js.Function1[EmbeddedItem | EntryEmbedable, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(entries.asInstanceOf[js.Any], process.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enumerateContents(content: js.Array[default]): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(
    content: js.Array[default],
    renderOption: Unit,
    renderEmbed: js.Function1[/* metadata */ Metadata, EmbeddedItem | EntryNode]
  ): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any], renderEmbed.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(content: js.Array[default], renderOption: RenderOption): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(
    content: js.Array[default],
    renderOption: RenderOption,
    renderEmbed: js.Function1[/* metadata */ Metadata, EmbeddedItem | EntryNode]
  ): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any], renderEmbed.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(content: default): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(
    content: default,
    renderOption: Unit,
    renderEmbed: js.Function1[/* metadata */ Metadata, EmbeddedItem | EntryNode]
  ): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any], renderEmbed.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(content: default, renderOption: RenderOption): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def enumerateContents(
    content: default,
    renderOption: RenderOption,
    renderEmbed: js.Function1[/* metadata */ Metadata, EmbeddedItem | EntryNode]
  ): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateContents")(content.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any], renderEmbed.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  
  inline def referenceToHTML(node: typingsJapgolly.contentstackUtils.distTypesNodesNodeMod.default, renderOption: RenderOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceToHTML")(node.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def referenceToHTML(
    node: typingsJapgolly.contentstackUtils.distTypesNodesNodeMod.default,
    renderOption: RenderOption,
    renderEmbed: js.Function1[/* metadata */ Metadata, EmbeddedItem | EntryNode]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceToHTML")(node.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any], renderEmbed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def textNodeToHTML(
    node: typingsJapgolly.contentstackUtils.distTypesNodesTextNodeMod.default,
    renderOption: RenderOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textNodeToHTML")(node.asInstanceOf[js.Any], renderOption.asInstanceOf[js.Any])).asInstanceOf[String]
}
