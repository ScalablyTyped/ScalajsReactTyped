package typingsJapgolly.reactHighlightWords.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactHighlightWords.mod.Chunk
import typingsJapgolly.reactHighlightWords.mod.FindChunks
import typingsJapgolly.reactHighlightWords.mod.HighlighterProps
import typingsJapgolly.reactHighlightWords.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHighlightWords {
  def apply(
    searchWords: js.Array[String],
    textToHighlight: String,
    StringDictionary: /** Allows to pass through any parameter to wrapped component */
  /* index */ StringDictionary[js.Any] = null,
    activeClassName: String = null,
    activeIndex: Int | Double = null,
    activeStyle: CSSProperties = null,
    autoEscape: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    findChunks: /* options */ FindChunks => CallbackTo[js.Array[Chunk]] = null,
    highlightClassName: String = null,
    highlightStyle: CSSProperties = null,
    highlightTag: String | ComponentType[_] = null,
    sanitize: /* text */ String => CallbackTo[String] = null,
    unhighlightClassName: String = null,
    unhighlightStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HighlighterProps, default, Unit, HighlighterProps] = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (findChunks != null) __obj.updateDynamic("findChunks")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reactHighlightWords.mod.FindChunks) => findChunks(t0).runNow()))
    if (highlightClassName != null) __obj.updateDynamic("highlightClassName")(highlightClassName.asInstanceOf[js.Any])
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (highlightTag != null) __obj.updateDynamic("highlightTag")(highlightTag.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => sanitize(t0).runNow()))
    if (unhighlightClassName != null) __obj.updateDynamic("unhighlightClassName")(unhighlightClassName.asInstanceOf[js.Any])
    if (unhighlightStyle != null) __obj.updateDynamic("unhighlightStyle")(unhighlightStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHighlightWords.mod.HighlighterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHighlightWords.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHighlightWords.mod.HighlighterProps])(children: _*)
  }
  @JSImport("react-highlight-words", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

