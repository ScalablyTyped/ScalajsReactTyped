package typingsJapgolly.prosemirrorView.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Selection
import typingsJapgolly.prosemirrorModel.mod.DOMParser
import typingsJapgolly.prosemirrorModel.mod.DOMSerializer
import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.ResolvedPos
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorModel.mod.Slice
import typingsJapgolly.prosemirrorView.AnonRight
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectEditorProps[S /* <: Schema[_, _] */] extends EditorProps[S] {
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply). The callback will be bound to have
    * the view instance as its `this` binding.
    */
  var dispatchTransaction: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      Unit
    ]) | Null
  ] = js.undefined
  /**
    * The current state of the editor.
    */
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
}

object DirectEditorProps {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any,
    attributes: StringDictionary[String] | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
      js.UndefOr[StringDictionary[String] | Null | Unit]
    ]) = null,
    clipboardParser: DOMParser[S] = null,
    clipboardSerializer: DOMSerializer[S] = null,
    clipboardTextParser: (/* text */ String, /* $context */ ResolvedPos[S]) => CallbackTo[Slice[S]] = null,
    clipboardTextSerializer: /* p */ Slice[S] => CallbackTo[String] = null,
    createSelectionBetween: (/* view */ EditorView[S], /* anchor */ ResolvedPos[S], /* head */ ResolvedPos[S]) => CallbackTo[js.UndefOr[Selection | Null]] = null,
    decorations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => CallbackTo[js.UndefOr[DecorationSet[S] | Null]] = null,
    dispatchTransaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => Callback = null,
    domParser: DOMParser[S] = null,
    editable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => CallbackTo[Boolean] = null,
    handleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => CallbackTo[Boolean] = null,
    handleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => CallbackTo[Boolean] = null,
    handleDOMEvents: StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event_, Boolean]] = null,
    handleDoubleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => CallbackTo[Boolean] = null,
    handleDoubleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => CallbackTo[Boolean] = null,
    handleDrop: (/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S], /* moved */ Boolean) => CallbackTo[Boolean] = null,
    handleKeyDown: (/* view */ EditorView[S], /* event */ KeyboardEvent) => CallbackTo[Boolean] = null,
    handleKeyPress: (/* view */ EditorView[S], /* event */ KeyboardEvent) => CallbackTo[Boolean] = null,
    handlePaste: (/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S]) => CallbackTo[Boolean] = null,
    handleScrollToSelection: /* view */ EditorView[S] => CallbackTo[Boolean] = null,
    handleTextInput: (/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String) => CallbackTo[Boolean] = null,
    handleTripleClick: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => CallbackTo[Boolean] = null,
    handleTripleClickOn: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => CallbackTo[Boolean] = null,
    nodeViews: StringDictionary[
      js.Function4[
        /* node */ Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[Double] | Boolean, 
        /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
        NodeView[S]
      ]
    ] = null,
    scrollMargin: Double | AnonRight = null,
    scrollThreshold: Double | AnonRight = null,
    transformPasted: /* p */ Slice[S] => CallbackTo[Slice[S]] = null,
    transformPastedHTML: /* html */ String => CallbackTo[String] = null,
    transformPastedText: /* text */ String => CallbackTo[String] = null
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clipboardParser != null) __obj.updateDynamic("clipboardParser")(clipboardParser.asInstanceOf[js.Any])
    if (clipboardSerializer != null) __obj.updateDynamic("clipboardSerializer")(clipboardSerializer.asInstanceOf[js.Any])
    if (clipboardTextParser != null) __obj.updateDynamic("clipboardTextParser")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* $context */ typingsJapgolly.prosemirrorModel.mod.ResolvedPos[S]) => clipboardTextParser(t0, t1).runNow()))
    if (clipboardTextSerializer != null) __obj.updateDynamic("clipboardTextSerializer")(js.Any.fromFunction1((t0: /* p */ typingsJapgolly.prosemirrorModel.mod.Slice[S]) => clipboardTextSerializer(t0).runNow()))
    if (createSelectionBetween != null) __obj.updateDynamic("createSelectionBetween")(js.Any.fromFunction3((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* anchor */ typingsJapgolly.prosemirrorModel.mod.ResolvedPos[S], t2: /* head */ typingsJapgolly.prosemirrorModel.mod.ResolvedPos[S]) => createSelectionBetween(t0, t1, t2).runNow()))
    if (decorations != null) __obj.updateDynamic("decorations")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any) => decorations(t0).runNow()))
    if (dispatchTransaction != null) __obj.updateDynamic("dispatchTransaction")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any) => dispatchTransaction(t0).runNow()))
    if (domParser != null) __obj.updateDynamic("domParser")(domParser.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any) => editable(t0).runNow()))
    if (handleClick != null) __obj.updateDynamic("handleClick")(js.Any.fromFunction3((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* event */ org.scalajs.dom.raw.MouseEvent) => handleClick(t0, t1, t2).runNow()))
    if (handleClickOn != null) __obj.updateDynamic("handleClickOn")(js.Any.fromFunction6((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], t3: /* nodePos */ scala.Double, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* direct */ scala.Boolean) => handleClickOn(t0, t1, t2, t3, t4, t5).runNow()))
    if (handleDOMEvents != null) __obj.updateDynamic("handleDOMEvents")(handleDOMEvents.asInstanceOf[js.Any])
    if (handleDoubleClick != null) __obj.updateDynamic("handleDoubleClick")(js.Any.fromFunction3((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* event */ org.scalajs.dom.raw.MouseEvent) => handleDoubleClick(t0, t1, t2).runNow()))
    if (handleDoubleClickOn != null) __obj.updateDynamic("handleDoubleClickOn")(js.Any.fromFunction6((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], t3: /* nodePos */ scala.Double, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* direct */ scala.Boolean) => handleDoubleClickOn(t0, t1, t2, t3, t4, t5).runNow()))
    if (handleDrop != null) __obj.updateDynamic("handleDrop")(js.Any.fromFunction4((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* event */ typingsJapgolly.std.Event_, t2: /* slice */ typingsJapgolly.prosemirrorModel.mod.Slice[S], t3: /* moved */ scala.Boolean) => handleDrop(t0, t1, t2, t3).runNow()))
    if (handleKeyDown != null) __obj.updateDynamic("handleKeyDown")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* event */ org.scalajs.dom.raw.KeyboardEvent) => handleKeyDown(t0, t1).runNow()))
    if (handleKeyPress != null) __obj.updateDynamic("handleKeyPress")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* event */ org.scalajs.dom.raw.KeyboardEvent) => handleKeyPress(t0, t1).runNow()))
    if (handlePaste != null) __obj.updateDynamic("handlePaste")(js.Any.fromFunction3((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* event */ typingsJapgolly.std.Event_, t2: /* slice */ typingsJapgolly.prosemirrorModel.mod.Slice[S]) => handlePaste(t0, t1, t2).runNow()))
    if (handleScrollToSelection != null) __obj.updateDynamic("handleScrollToSelection")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S]) => handleScrollToSelection(t0).runNow()))
    if (handleTextInput != null) __obj.updateDynamic("handleTextInput")(js.Any.fromFunction4((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* from */ scala.Double, t2: /* to */ scala.Double, t3: /* text */ java.lang.String) => handleTextInput(t0, t1, t2, t3).runNow()))
    if (handleTripleClick != null) __obj.updateDynamic("handleTripleClick")(js.Any.fromFunction3((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* event */ org.scalajs.dom.raw.MouseEvent) => handleTripleClick(t0, t1, t2).runNow()))
    if (handleTripleClickOn != null) __obj.updateDynamic("handleTripleClickOn")(js.Any.fromFunction6((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* pos */ scala.Double, t2: /* node */ typingsJapgolly.prosemirrorModel.mod.Node[S], t3: /* nodePos */ scala.Double, t4: /* event */ org.scalajs.dom.raw.MouseEvent, t5: /* direct */ scala.Boolean) => handleTripleClickOn(t0, t1, t2, t3, t4, t5).runNow()))
    if (nodeViews != null) __obj.updateDynamic("nodeViews")(nodeViews.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (transformPasted != null) __obj.updateDynamic("transformPasted")(js.Any.fromFunction1((t0: /* p */ typingsJapgolly.prosemirrorModel.mod.Slice[S]) => transformPasted(t0).runNow()))
    if (transformPastedHTML != null) __obj.updateDynamic("transformPastedHTML")(js.Any.fromFunction1((t0: /* html */ java.lang.String) => transformPastedHTML(t0).runNow()))
    if (transformPastedText != null) __obj.updateDynamic("transformPastedText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => transformPastedText(t0).runNow()))
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
}

