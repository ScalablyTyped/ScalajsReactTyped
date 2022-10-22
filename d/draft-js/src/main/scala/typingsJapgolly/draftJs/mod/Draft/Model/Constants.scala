package typingsJapgolly.draftJs.mod.Draft.Model

import typingsJapgolly.draftJs.draftJsStrings.bold_
import typingsJapgolly.draftJs.draftJsStrings.code_
import typingsJapgolly.draftJs.draftJsStrings.italic_
import typingsJapgolly.draftJs.draftJsStrings.strikethrough_
import typingsJapgolly.draftJs.draftJsStrings.underline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Constants {
  
  /**
    * Default entity types.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.LINK
    - typingsJapgolly.draftJs.draftJsStrings.TOKEN
    - typingsJapgolly.draftJs.draftJsStrings.PHOTO
    - typingsJapgolly.draftJs.draftJsStrings.IMAGE
  */
  trait ComposedEntityType extends StObject
  object ComposedEntityType {
    
    inline def IMAGE: typingsJapgolly.draftJs.draftJsStrings.IMAGE = "IMAGE".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.IMAGE]
    
    inline def LINK: typingsJapgolly.draftJs.draftJsStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.LINK]
    
    inline def PHOTO: typingsJapgolly.draftJs.draftJsStrings.PHOTO = "PHOTO".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.PHOTO]
    
    inline def TOKEN: typingsJapgolly.draftJs.draftJsStrings.TOKEN = "TOKEN".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.TOKEN]
  }
  
  /**
    * The list of default valid block types.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.unstyled
    - typingsJapgolly.draftJs.draftJsStrings.paragraph
    - typingsJapgolly.draftJs.draftJsStrings.`header-one`
    - typingsJapgolly.draftJs.draftJsStrings.`header-two`
    - typingsJapgolly.draftJs.draftJsStrings.`header-three`
    - typingsJapgolly.draftJs.draftJsStrings.`header-four`
    - typingsJapgolly.draftJs.draftJsStrings.`header-five`
    - typingsJapgolly.draftJs.draftJsStrings.`header-six`
    - typingsJapgolly.draftJs.draftJsStrings.`unordered-list-item`
    - typingsJapgolly.draftJs.draftJsStrings.`ordered-list-item`
    - typingsJapgolly.draftJs.draftJsStrings.blockquote
    - typingsJapgolly.draftJs.draftJsStrings.`code-block`
    - typingsJapgolly.draftJs.draftJsStrings.atomic
  */
  trait CoreDraftBlockType extends StObject
  object CoreDraftBlockType {
    
    inline def atomic: typingsJapgolly.draftJs.draftJsStrings.atomic = "atomic".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.atomic]
    
    inline def blockquote: typingsJapgolly.draftJs.draftJsStrings.blockquote = "blockquote".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.blockquote]
    
    inline def `code-block`: typingsJapgolly.draftJs.draftJsStrings.`code-block` = "code-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`code-block`]
    
    inline def `header-five`: typingsJapgolly.draftJs.draftJsStrings.`header-five` = "header-five".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-five`]
    
    inline def `header-four`: typingsJapgolly.draftJs.draftJsStrings.`header-four` = "header-four".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-four`]
    
    inline def `header-one`: typingsJapgolly.draftJs.draftJsStrings.`header-one` = "header-one".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-one`]
    
    inline def `header-six`: typingsJapgolly.draftJs.draftJsStrings.`header-six` = "header-six".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-six`]
    
    inline def `header-three`: typingsJapgolly.draftJs.draftJsStrings.`header-three` = "header-three".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-three`]
    
    inline def `header-two`: typingsJapgolly.draftJs.draftJsStrings.`header-two` = "header-two".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`header-two`]
    
    inline def `ordered-list-item`: typingsJapgolly.draftJs.draftJsStrings.`ordered-list-item` = "ordered-list-item".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`ordered-list-item`]
    
    inline def paragraph: typingsJapgolly.draftJs.draftJsStrings.paragraph = "paragraph".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.paragraph]
    
    inline def `unordered-list-item`: typingsJapgolly.draftJs.draftJsStrings.`unordered-list-item` = "unordered-list-item".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`unordered-list-item`]
    
    inline def unstyled: typingsJapgolly.draftJs.draftJsStrings.unstyled = "unstyled".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.unstyled]
  }
  
  type CustomBlockType = String
  
  type DraftBlockType = CoreDraftBlockType | CustomBlockType
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a drag type is internal or external.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.internal
    - typingsJapgolly.draftJs.draftJsStrings.external
  */
  trait DraftDragType extends StObject
  object DraftDragType {
    
    inline def external: typingsJapgolly.draftJs.draftJsStrings.external = "external".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.external]
    
    inline def internal: typingsJapgolly.draftJs.draftJsStrings.internal = "internal".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.internal]
  }
  
  /**
    * A set of editor commands that may be invoked by keyboard commands or UI
    * controls. These commands should map to operations that modify content or
    * selection state and update the editor state accordingly.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.undo
    - typingsJapgolly.draftJs.draftJsStrings.redo
    - typingsJapgolly.draftJs.draftJsStrings.delete
    - typingsJapgolly.draftJs.draftJsStrings.`delete-word`
    - typingsJapgolly.draftJs.draftJsStrings.backspace
    - typingsJapgolly.draftJs.draftJsStrings.`backspace-word`
    - typingsJapgolly.draftJs.draftJsStrings.`backspace-to-start-of-line`
    - typingsJapgolly.draftJs.draftJsStrings.bold_
    - typingsJapgolly.draftJs.draftJsStrings.code_
    - typingsJapgolly.draftJs.draftJsStrings.italic_
    - typingsJapgolly.draftJs.draftJsStrings.strikethrough_
    - typingsJapgolly.draftJs.draftJsStrings.underline_
    - typingsJapgolly.draftJs.draftJsStrings.`split-block`
    - typingsJapgolly.draftJs.draftJsStrings.`transpose-characters`
    - typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-start-of-block`
    - typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-end-of-block`
    - typingsJapgolly.draftJs.draftJsStrings.`secondary-cut`
    - typingsJapgolly.draftJs.draftJsStrings.`secondary-paste`
  */
  trait DraftEditorCommand extends StObject
  object DraftEditorCommand {
    
    inline def backspace: typingsJapgolly.draftJs.draftJsStrings.backspace = "backspace".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.backspace]
    
    inline def `backspace-to-start-of-line`: typingsJapgolly.draftJs.draftJsStrings.`backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`backspace-to-start-of-line`]
    
    inline def `backspace-word`: typingsJapgolly.draftJs.draftJsStrings.`backspace-word` = "backspace-word".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`backspace-word`]
    
    inline def bold: bold_ = "bold".asInstanceOf[bold_]
    
    inline def code: code_ = "code".asInstanceOf[code_]
    
    inline def delete: typingsJapgolly.draftJs.draftJsStrings.delete = "delete".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.delete]
    
    inline def `delete-word`: typingsJapgolly.draftJs.draftJsStrings.`delete-word` = "delete-word".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`delete-word`]
    
    inline def italic: italic_ = "italic".asInstanceOf[italic_]
    
    inline def `move-selection-to-end-of-block`: typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-end-of-block`]
    
    inline def `move-selection-to-start-of-block`: typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`move-selection-to-start-of-block`]
    
    inline def redo: typingsJapgolly.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.redo]
    
    inline def `secondary-cut`: typingsJapgolly.draftJs.draftJsStrings.`secondary-cut` = "secondary-cut".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`secondary-cut`]
    
    inline def `secondary-paste`: typingsJapgolly.draftJs.draftJsStrings.`secondary-paste` = "secondary-paste".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`secondary-paste`]
    
    inline def `split-block`: typingsJapgolly.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`split-block`]
    
    inline def strikethrough: strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
    
    inline def `transpose-characters`: typingsJapgolly.draftJs.draftJsStrings.`transpose-characters` = "transpose-characters".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`transpose-characters`]
    
    inline def underline: underline_ = "underline".asInstanceOf[underline_]
    
    inline def undo: typingsJapgolly.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.undo]
  }
  
  /**
    * Possible "mutability" options for an entity. This refers to the behavior
    * that should occur when inserting or removing characters in a text range
    * with an entity applied to it.
    *
    * `MUTABLE`:
    *   The text range can be modified freely. Generally used in cases where
    *   the text content and the entity do not necessarily have a direct
    *   relationship. For instance, the text and URI for a link may be completely
    *   different. The user is allowed to edit the text as needed, and the entity
    *   is preserved and applied to any characters added within the range.
    *
    * `IMMUTABLE`:
    *   Not to be confused with immutable data structures used to represent the
    *   state of the editor. Immutable entity ranges cannot be modified in any
    *   way. Adding characters within the range will remove the entity from the
    *   entire range. Deleting characters will delete the entire range. Example:
    *   Facebook Page mentions.
    *
    * `SEGMENTED`:
    *   Segmented entities allow the removal of partial ranges of text, as
    *   separated by a delimiter. Adding characters wihin the range will remove
    *   the entity from the entire range. Deleting characters within a segmented
    *   entity will delete only the segments affected by the deletion. Example:
    *   Facebook User mentions.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.MUTABLE
    - typingsJapgolly.draftJs.draftJsStrings.IMMUTABLE
    - typingsJapgolly.draftJs.draftJsStrings.SEGMENTED
  */
  trait DraftEntityMutability extends StObject
  object DraftEntityMutability {
    
    inline def IMMUTABLE: typingsJapgolly.draftJs.draftJsStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.IMMUTABLE]
    
    inline def MUTABLE: typingsJapgolly.draftJs.draftJsStrings.MUTABLE = "MUTABLE".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.MUTABLE]
    
    inline def SEGMENTED: typingsJapgolly.draftJs.draftJsStrings.SEGMENTED = "SEGMENTED".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.SEGMENTED]
  }
  
  /**
    * Possible entity types.
    */
  type DraftEntityType = String | ComposedEntityType
  
  /**
    * A type that allows us to avoid returning boolean values
    * to indicate whether an event was handled or not.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.handled
    - typingsJapgolly.draftJs.draftJsStrings.`not-handled`
  */
  trait DraftHandleValue extends StObject
  object DraftHandleValue {
    
    inline def handled: typingsJapgolly.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.handled]
    
    inline def `not-handled`: typingsJapgolly.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.`not-handled`]
  }
  
  /**
    * Valid inline styles.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.BOLD
    - typingsJapgolly.draftJs.draftJsStrings.CODE
    - typingsJapgolly.draftJs.draftJsStrings.ITALIC
    - typingsJapgolly.draftJs.draftJsStrings.STRIKETHROUGH
    - typingsJapgolly.draftJs.draftJsStrings.UNDERLINE
  */
  trait DraftInlineStyleType extends StObject
  object DraftInlineStyleType {
    
    inline def BOLD: typingsJapgolly.draftJs.draftJsStrings.BOLD = "BOLD".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.BOLD]
    
    inline def CODE: typingsJapgolly.draftJs.draftJsStrings.CODE = "CODE".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.CODE]
    
    inline def ITALIC: typingsJapgolly.draftJs.draftJsStrings.ITALIC = "ITALIC".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.ITALIC]
    
    inline def STRIKETHROUGH: typingsJapgolly.draftJs.draftJsStrings.STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.STRIKETHROUGH]
    
    inline def UNDERLINE: typingsJapgolly.draftJs.draftJsStrings.UNDERLINE = "UNDERLINE".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.UNDERLINE]
  }
  
  /**
    * A type that defines if an fragment shall be inserted before or after
    * another fragment or if the selected fragment shall be replaced
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.replace
    - typingsJapgolly.draftJs.draftJsStrings.before
    - typingsJapgolly.draftJs.draftJsStrings.after
  */
  trait DraftInsertionType extends StObject
  object DraftInsertionType {
    
    inline def after: typingsJapgolly.draftJs.draftJsStrings.after = "after".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.after]
    
    inline def before: typingsJapgolly.draftJs.draftJsStrings.before = "before".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.before]
    
    inline def replace: typingsJapgolly.draftJs.draftJsStrings.replace = "replace".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.replace]
  }
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a deletion is forward or backward.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draftJs.draftJsStrings.backward
    - typingsJapgolly.draftJs.draftJsStrings.forward
  */
  trait DraftRemovalDirection extends StObject
  object DraftRemovalDirection {
    
    inline def backward: typingsJapgolly.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.backward]
    
    inline def forward: typingsJapgolly.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typingsJapgolly.draftJs.draftJsStrings.forward]
  }
}
