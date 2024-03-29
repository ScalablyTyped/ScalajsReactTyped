package typingsJapgolly.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlockEditor.mod.EditorBlockListSettings
import typingsJapgolly.wordpressBlockEditor.mod.EditorBlockMode
import typingsJapgolly.wordpressBlockEditor.mod.EditorInserterItem
import typingsJapgolly.wordpressBlockEditor.mod.EditorSelection
import typingsJapgolly.wordpressBlockEditor.mod.EditorSettings
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorInts.`-1`
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorInts.`1`
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends StObject {
  
  def canInsertBlockType(blockName: String): Boolean = js.native
  def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
  
  def getAdjacentBlockClientId(): String | Null = js.native
  def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
  def getAdjacentBlockClientId(startClientId: String, modifier: `1` | `-1`): String | Null = js.native
  def getAdjacentBlockClientId(startClientId: Unit, modifier: `1` | `-1`): String | Null = js.native
  
  def getBlock(clientId: String): BlockInstance[StringDictionary[Any]] | Null = js.native
  
  def getBlockAttributes(clientId: String): (Record[String, Any]) | Null = js.native
  
  def getBlockCount(): Double = js.native
  def getBlockCount(rootClientId: String): Double = js.native
  
  def getBlockHierarchyRootClientId(clientId: String): String = js.native
  
  def getBlockIndex(clientId: String): Double = js.native
  def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
  
  def getBlockInsertionPoint(): Index = js.native
  
  def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
  def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
  
  def getBlockMode(clientId: String): EditorBlockMode = js.native
  
  def getBlockName(clientId: String): String | Null = js.native
  
  def getBlockOrder(): js.Array[String] = js.native
  def getBlockOrder(rootClientId: String): js.Array[String] = js.native
  
  def getBlockRootClientId(clientId: String): String | Null = js.native
  
  def getBlockSelectionEnd(): js.UndefOr[String] = js.native
  
  def getBlockSelectionStart(): js.UndefOr[String] = js.native
  
  def getBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
  def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
  
  def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[Any]] | Null] = js.native
  def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[Any]] | Null] = js.native
  
  def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
  
  def getClientIdsWithDescendants(): js.Array[String] = js.native
  
  def getFirstMultiSelectedBlockClientId(): String | Null = js.native
  
  def getGlobalBlockCount(): Double = js.native
  def getGlobalBlockCount(blockName: String): Double = js.native
  
  def getInserterItems(): js.Array[EditorInserterItem] = js.native
  def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
  
  def getLastMultiSelectedBlockClientId(): String | Null = js.native
  
  def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
  
  def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[Any]]] = js.native
  
  def getMultiSelectedBlocksEndClientId(): String | Null = js.native
  
  def getMultiSelectedBlocksStartClientId(): String | Null = js.native
  
  def getNextBlockClientId(): String | Null = js.native
  def getNextBlockClientId(startClientId: String): String | Null = js.native
  
  def getPreviousBlockClientId(): String | Null = js.native
  def getPreviousBlockClientId(startClientId: String): String | Null = js.native
  
  def getSelectedBlock(): BlockInstance[StringDictionary[Any]] | Null = js.native
  
  def getSelectedBlockClientId(): String | Null = js.native
  
  def getSelectedBlockClientIds(): js.Array[String] = js.native
  
  def getSelectedBlockCount(): Double = js.native
  
  def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
  
  def getSelectionEnd(): EditorSelection = js.native
  
  def getSelectionStart(): EditorSelection = js.native
  
  def getSettings(): EditorSettings = js.native
  
  def getTemplate(): Any = js.native
  
  def getTemplateLock(): js.UndefOr[String] = js.native
  def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
  
  def hasInserterItems(): Boolean = js.native
  def hasInserterItems(rootClientId: String): Boolean = js.native
  
  def hasMultiSelection(): Boolean = js.native
  
  def hasSelectedBlock(): Boolean = js.native
  
  def hasSelectedInnerBlock(clientId: String): Boolean = js.native
  def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
  
  def isAncestorMultiSelected(clientId: String): Boolean = js.native
  
  def isBlockInsertionPointVisible(): Boolean = js.native
  
  def isBlockMultiSelected(clientId: String): Boolean = js.native
  
  def isBlockSelected(clientId: String): Boolean = js.native
  
  def isBlockValid(clientId: String): Boolean = js.native
  
  def isBlockWithinSelection(clientId: String): Boolean = js.native
  
  def isCaretWithinFormattedText(): Boolean = js.native
  
  def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
  
  def isLastBlockChangePersistent(): Boolean = js.native
  
  def isMultiSelecting(): Boolean = js.native
  
  def isSelectionEnabled(): Boolean = js.native
  
  def isTyping(): Boolean = js.native
  
  def isValidTemplate(): Boolean = js.native
}
