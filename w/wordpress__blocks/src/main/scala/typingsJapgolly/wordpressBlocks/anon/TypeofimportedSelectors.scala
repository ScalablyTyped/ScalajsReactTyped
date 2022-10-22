package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.apiCategoriesMod.Category
import typingsJapgolly.wordpressBlocks.mod.Block
import typingsJapgolly.wordpressBlocks.mod.BlockStyle
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.align
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.alignWide
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.anchor
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.className
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.color
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.customClassName
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.html
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.inserter
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.lock
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.multiple
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.reusable
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.spacing
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends StObject {
  
  def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = js.native
  
  def getBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = js.native
  def getBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = js.native
  def getBlockSupport[T](
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = js.native
  def getBlockSupport[T](
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = js.native
  
  def getBlockType[T /* <: Record[String, Any] */](): js.UndefOr[Block[T]] = js.native
  def getBlockType[T /* <: Record[String, Any] */](name: String): js.UndefOr[Block[T]] = js.native
  
  def getBlockTypes(): js.Array[Block[Any]] = js.native
  
  def getCategories(): js.Array[Category] = js.native
  
  def getChildBlockNames(blockName: String): js.Array[String] = js.native
  
  def getDefaultBlockName(): js.UndefOr[String] = js.native
  
  def getFreeformFallbackBlockName(): js.UndefOr[String] = js.native
  
  def getGroupingBlockName(): js.UndefOr[String] = js.native
  
  def getUnregisteredFallbackBlockName(): js.UndefOr[String] = js.native
  
  def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = js.native
  
  def hasChildBlocks(blockName: String): Boolean = js.native
  
  def hasChildBlocksWithInserterSupport(blockName: String): Boolean = js.native
  
  def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = js.native
  def isMatchingSearchTerm(nameOrType: Block[Any], searchTerm: String): Boolean = js.native
}
