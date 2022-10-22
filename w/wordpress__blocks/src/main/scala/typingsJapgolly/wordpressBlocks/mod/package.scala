package typingsJapgolly.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.anon.Attributetypeboolean
import typingsJapgolly.wordpressBlocks.anon.BlockName
import typingsJapgolly.wordpressBlocks.anon.Icon
import typingsJapgolly.wordpressBlocks.anon.Mode
import typingsJapgolly.wordpressBlocks.anon.PartialCategory
import typingsJapgolly.wordpressBlocks.anon.`0`
import typingsJapgolly.wordpressBlocks.apiCategoriesMod.Category
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Attribute
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Children
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.HTML
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Node
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Query
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Tag
import typingsJapgolly.wordpressBlocks.apiParserMod.Schema.Text
import typingsJapgolly.wordpressBlocks.apiParserMod.Source
import typingsJapgolly.wordpressBlocks.apiRawHandlingMod.PhrasingContentSchema
import typingsJapgolly.wordpressBlocks.apiRawHandlingMod.pasteHandler.Options
import typingsJapgolly.wordpressBlocks.apiTemplatesMod.TemplateArray
import typingsJapgolly.wordpressBlocks.mod.^
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.align
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.alignWide
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.anchor
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.className
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.color
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.customClassName
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.from
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.html
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.inserter
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.lock
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.multiple
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.reusable
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.spacing
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.to
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cloneBlock[T /* <: Record[String, Any] */](block: BlockInstance[T]): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
inline def cloneBlock[T /* <: Record[String, Any] */](
  block: BlockInstance[T],
  mergeAttributes: Unit,
  newInnerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
inline def cloneBlock[T /* <: Record[String, Any] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
inline def cloneBlock[T /* <: Record[String, Any] */](
  block: BlockInstance[T],
  mergeAttributes: Partial[T],
  newInnerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]

inline def createBlock[T /* <: Record[String, Any] */](name: String): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Unit, innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]

inline def doBlocksMatchTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[Boolean]
inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def doBlocksMatchTemplate(blocks: Unit, template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def findTransform[T /* <: Transform[Record[String, Any]] */, U /* <: Record[String, Any] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Transform[U] | Null]

inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any]
inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, Any]): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.@wordpress/blocks.Block<infer U> ? U : never */ js.Any]

inline def getBlockContent(block: BlockInstance[StringDictionary[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBlockDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBlockMenuDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBlockSupport(
  nameOrType: String,
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
inline def getBlockSupport(
  nameOrType: Block[Any],
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
inline def getBlockSupport[T](
  nameOrType: String,
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
  defaultSupports: T
): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any]
inline def getBlockSupport[T](
  nameOrType: Block[Any],
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
  defaultSupports: T
): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any]

inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]

inline def getBlockType[T /* <: Record[String, Any] */](): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[Block[T]]]
inline def getBlockType[T /* <: Record[String, Any] */](name: String): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[T]]]

inline def getBlockTypes(): js.Array[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[Block[Any]]]

inline def getBlockVariations(blockName: String): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]
inline def getBlockVariations(blockName: String, scope: BlockVariationScope): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]

inline def getCategories(): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[Category]]

inline def getChildBlockNames(blockName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def getDefaultBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[String]]

inline def getFreeformContentHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[String]]

inline def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]

inline def getPhrasingContentSchema(): PhrasingContentSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[PhrasingContentSchema]

inline def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): js.Array[Block[Record[String, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block[Record[String, Any]]]]

inline def getSaveContent[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getSaveContent[T /* <: Record[String, Any] */](
  blockTypeOrName: String,
  attributes: T,
  innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getSaveContent[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
inline def getSaveContent[T /* <: Record[String, Any] */](
  blockTypeOrName: Block[T],
  attributes: T,
  innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getSaveElement[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
inline def getSaveElement[T /* <: Record[String, Any] */](
  blockTypeOrName: String,
  attributes: T,
  innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
inline def getSaveElement[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
inline def getSaveElement[T /* <: Record[String, Any] */](
  blockTypeOrName: Block[T],
  attributes: T,
  innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]

inline def getUnregisteredTypeHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredTypeHandlerName")().asInstanceOf[js.UndefOr[String]]

inline def hasBlockSupport(
  nameOrType: String,
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasBlockSupport(
  nameOrType: String,
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
  defaultSupports: Boolean
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasBlockSupport(
  nameOrType: Block[Any],
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasBlockSupport(
  nameOrType: Block[Any],
  feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
  defaultSupports: Boolean
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasChildBlocks(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def hasChildBlocksWithInserterSupport(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocksWithInserterSupport")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isReusableBlock(blockOrType: Block[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isReusableBlock(blockOrType: BlockInstance[StringDictionary[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isValidIcon(icon: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def normalizeIconObject(): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[BlockIconNormalized]
inline def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[BlockIconNormalized]

inline def parse(content: String): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]

inline def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
inline def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactChild]]
inline def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def parseWithAttributeSchema(innerHTML: String, schema: Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
inline def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.a, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.abbr, typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.address */ Any]]
inline def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
inline def parseWithAttributeSchema[T /* <: Record[String, Source[Any]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any]

inline def pasteHandler(options: Options & Mode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[String]
inline def pasteHandler(options: Options & `0`): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
inline def pasteHandler(options: Options): js.Array[BlockInstance[StringDictionary[Any]]] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | String]

inline def rawHandler(options: typingsJapgolly.wordpressBlocks.anon.HTML): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]

inline def registerBlockCollection(namespace: String, settings: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerBlockStyle(blockName: String, styleVariation: BlockStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[TAttributes]]]
inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes], settings: Partial[BlockConfiguration[TAttributes]]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]
inline def registerBlockType[TAttributes /* <: Record[String, Any] */](name: String, settings: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]

inline def registerBlockVariation(blockName: String, variation: js.Array[BlockVariation[BlockAttributes]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerBlockVariation(blockName: String, variation: BlockVariation[BlockAttributes]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def serialize(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[String]

inline def setCategories(categories: js.Array[Category]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setDefaultBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setFreeformContentHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setGroupingBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setUnregisteredTypeHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[Any]]], name: String): js.Array[BlockInstance[StringDictionary[Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | Null]
inline def switchToBlockType(blocks: BlockInstance[StringDictionary[Any]], name: String): js.Array[BlockInstance[StringDictionary[Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | Null]

inline def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
inline def synchronizeBlocksWithTemplate(blocks: Unit, template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]

inline def unregisterBlockStyle(blockName: String, styleVariationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unregisterBlockType(name: String): js.UndefOr[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[Any]]]

inline def unregisterBlockVariation(blockName: String, variationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def unregisterBlockVariation(blockName: String, variationName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def updateCategory(slug: String, category: PartialCategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def withBlockContentContext[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'BlockContent'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'BlockContent'>> : never */ js.Any]

type BlockAttributes = Record[String, Any]

type InnerBlockTemplate = js.Tuple3[String, js.UndefOr[BlockAttributes], js.UndefOr[js.Array[Any]]]
