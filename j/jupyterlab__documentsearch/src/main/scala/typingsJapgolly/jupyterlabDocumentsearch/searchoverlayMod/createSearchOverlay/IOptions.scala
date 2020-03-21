package typingsJapgolly.jupyterlabDocumentsearch.searchoverlayMod.createSearchOverlay

import typingsJapgolly.jupyterlabDocumentsearch.interfacesMod.IDisplayState
import typingsJapgolly.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance
import typingsJapgolly.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var isReadOnly: Boolean
  var onCaseSensitiveToggled: js.Function
  var onEndSearch: js.Function
  var onHighlightPrevious: js.Function
  var onHightlightNext: js.Function
  var onRegexToggled: js.Function
  var onReplaceAll: js.Function
  var onReplaceCurrent: js.Function
  var onStartQuery: js.Function
  var overlayState: IDisplayState
  var widgetChanged: Signal[SearchInstance, IDisplayState]
}

object IOptions {
  @scala.inline
  def apply(
    isReadOnly: Boolean,
    onCaseSensitiveToggled: js.Function,
    onEndSearch: js.Function,
    onHighlightPrevious: js.Function,
    onHightlightNext: js.Function,
    onRegexToggled: js.Function,
    onReplaceAll: js.Function,
    onReplaceCurrent: js.Function,
    onStartQuery: js.Function,
    overlayState: IDisplayState,
    widgetChanged: Signal[SearchInstance, IDisplayState]
  ): IOptions = {
    val __obj = js.Dynamic.literal(isReadOnly = isReadOnly.asInstanceOf[js.Any], onCaseSensitiveToggled = onCaseSensitiveToggled.asInstanceOf[js.Any], onEndSearch = onEndSearch.asInstanceOf[js.Any], onHighlightPrevious = onHighlightPrevious.asInstanceOf[js.Any], onHightlightNext = onHightlightNext.asInstanceOf[js.Any], onRegexToggled = onRegexToggled.asInstanceOf[js.Any], onReplaceAll = onReplaceAll.asInstanceOf[js.Any], onReplaceCurrent = onReplaceCurrent.asInstanceOf[js.Any], onStartQuery = onStartQuery.asInstanceOf[js.Any], overlayState = overlayState.asInstanceOf[js.Any], widgetChanged = widgetChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

