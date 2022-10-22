package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.CONTENT_EMPTY
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.CONTENT_TEXT
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.CONTENT_VIEW_ZONE
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.CONTENT_WIDGET
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_NUMBERS
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.GUTTER_VIEW_ZONE
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.OVERLAY_WIDGET
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.OVERVIEW_RULER
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.SCROLLBAR
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.TEXTAREA
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetUnknown
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetTextarea
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetMargin
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetViewZone
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentText
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentEmpty
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentWidget
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverlayWidget
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetScrollbar
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverviewRuler
  - typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOutsideEditor
*/
trait IMouseTarget extends StObject
object IMouseTarget {
  
  inline def IMouseTargetContentEmpty(
    detail: IMouseTargetContentEmptyData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_EMPTY
  ): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentEmpty = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentEmpty]
  }
  
  inline def IMouseTargetContentText(
    detail: IMouseTargetContentTextData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: CONTENT_TEXT
  ): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentText = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentText]
  }
  
  inline def IMouseTargetContentWidget(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: CONTENT_WIDGET): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetContentWidget]
  }
  
  inline def IMouseTargetMargin(
    detail: IMouseTargetMarginData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_GLYPH_MARGIN | GUTTER_LINE_NUMBERS | GUTTER_LINE_DECORATIONS
  ): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetMargin = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetMargin]
  }
  
  inline def IMouseTargetOutsideEditor(mouseColumn: Double, `type`: OUTSIDE_EDITOR): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOutsideEditor = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOutsideEditor]
  }
  
  inline def IMouseTargetOverlayWidget(detail: String, mouseColumn: Double, position: Null, range: Null, `type`: OVERLAY_WIDGET): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverlayWidget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverlayWidget]
  }
  
  inline def IMouseTargetOverviewRuler(mouseColumn: Double, `type`: OVERVIEW_RULER): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverviewRuler = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetOverviewRuler]
  }
  
  inline def IMouseTargetScrollbar(mouseColumn: Double, position: Position, range: Range, `type`: SCROLLBAR): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetScrollbar = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetScrollbar]
  }
  
  inline def IMouseTargetTextarea(mouseColumn: Double, position: Null, range: Null, `type`: TEXTAREA): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetTextarea = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetTextarea]
  }
  
  inline def IMouseTargetUnknown(mouseColumn: Double, `type`: UNKNOWN): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetUnknown = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetUnknown]
  }
  
  inline def IMouseTargetViewZone(
    detail: IMouseTargetViewZoneData,
    mouseColumn: Double,
    position: Position,
    range: Range,
    `type`: GUTTER_VIEW_ZONE | CONTENT_VIEW_ZONE
  ): typingsJapgolly.monacoEditor.mod.editor.IMouseTargetViewZone = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.monacoEditor.mod.editor.IMouseTargetViewZone]
  }
}
