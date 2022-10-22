package typingsJapgolly.draftJs.mod

import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.draftJs.mod.Draft.Component.Selection.FakeClientRect
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typingsJapgolly.draftJs.mod.^
import typingsJapgolly.immutable.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DefaultDraftBlockRenderMap: Map[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftBlockRenderMap").asInstanceOf[Map[Any, Any]]

inline def DefaultDraftInlineStyle: Map[Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDraftInlineStyle").asInstanceOf[Map[Any, Any]]

/**
  * Retrieve a bound key command for the given event.
  */
inline def getDefaultKeyBinding(e: ReactKeyboardEventFrom[js.Object & Element]): DraftEditorCommand | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyBinding")(e.asInstanceOf[js.Any]).asInstanceOf[DraftEditorCommand | Null]

/**
  * Return the bounding ClientRect for the visible DOM selection, if any.
  * In cases where there are no selected ranges or the bounding rect is
  * temporarily invalid, return null.
  */
inline def getVisibleSelectionRect(global: Any): FakeClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleSelectionRect")(global.asInstanceOf[js.Any]).asInstanceOf[FakeClientRect]

type SyntheticClipboardEvent = ReactClipboardEventFrom[js.Object & Element]

type SyntheticEvent = ReactEventFrom[js.Object & Element]

type SyntheticKeyboardEvent = ReactKeyboardEventFrom[js.Object & Element]
