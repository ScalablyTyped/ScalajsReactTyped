package typingsJapgolly.reactDashDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactDashDom.testDashUtilsMod.EventSimulator
import typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSimulate extends js.Object {
  val abort: EventSimulator
  val animationEnd: EventSimulator
  val animationIteration: EventSimulator
  val animationStart: EventSimulator
  val blur: EventSimulator
  val canPlay: EventSimulator
  val canPlayThrough: EventSimulator
  val change: EventSimulator
  val click: EventSimulator
  val compositionEnd: EventSimulator
  val compositionStart: EventSimulator
  val compositionUpdate: EventSimulator
  val contextMenu: EventSimulator
  val copy: EventSimulator
  val cut: EventSimulator
  val doubleClick: EventSimulator
  val drag: EventSimulator
  val dragEnd: EventSimulator
  val dragEnter: EventSimulator
  val dragExit: EventSimulator
  val dragLeave: EventSimulator
  val dragOver: EventSimulator
  val dragStart: EventSimulator
  val drop: EventSimulator
  val durationChange: EventSimulator
  val emptied: EventSimulator
  val encrypted: EventSimulator
  val ended: EventSimulator
  val error: EventSimulator
  val focus: EventSimulator
  val input: EventSimulator
  val invalid: EventSimulator
  val keyDown: EventSimulator
  val keyPress: EventSimulator
  val keyUp: EventSimulator
  val load: EventSimulator
  val loadStart: EventSimulator
  val loadedData: EventSimulator
  val loadedMetadata: EventSimulator
  val mouseDown: EventSimulator
  val mouseEnter: EventSimulator
  val mouseLeave: EventSimulator
  val mouseMove: EventSimulator
  val mouseOut: EventSimulator
  val mouseOver: EventSimulator
  val mouseUp: EventSimulator
  val paste: EventSimulator
  val pause: EventSimulator
  val play: EventSimulator
  val playing: EventSimulator
  val progress: EventSimulator
  val rateChange: EventSimulator
  val scroll: EventSimulator
  val seeked: EventSimulator
  val seeking: EventSimulator
  val select: EventSimulator
  val stalled: EventSimulator
  val submit: EventSimulator
  val suspend: EventSimulator
  val timeUpdate: EventSimulator
  val touchCancel: EventSimulator
  val touchEnd: EventSimulator
  val touchMove: EventSimulator
  val touchStart: EventSimulator
  val transitionEnd: EventSimulator
  val volumeChange: EventSimulator
  val waiting: EventSimulator
  val wheel: EventSimulator
}

object TypeofSimulate {
  @scala.inline
  def apply(
    abort: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    animationEnd: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    animationIteration: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    animationStart: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    blur: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    canPlay: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    canPlayThrough: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    change: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    click: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    compositionEnd: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    compositionStart: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    compositionUpdate: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    contextMenu: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    copy: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    cut: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    doubleClick: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    drag: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragEnd: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragEnter: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragExit: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragLeave: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragOver: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    dragStart: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    drop: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    durationChange: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    emptied: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    encrypted: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    ended: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    error: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    focus: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    input: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    invalid: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    keyDown: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    keyPress: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    keyUp: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    load: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    loadStart: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    loadedData: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    loadedMetadata: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseDown: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseEnter: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseLeave: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseMove: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseOut: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseOver: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    mouseUp: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    paste: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    pause: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    play: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    playing: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    progress: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    rateChange: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    scroll: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    seeked: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    seeking: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    select: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    stalled: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    submit: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    suspend: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    timeUpdate: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    touchCancel: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    touchEnd: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    touchMove: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    touchStart: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    transitionEnd: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    volumeChange: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    waiting: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback,
    wheel: (/* element */ Element | (Component[js.Any with js.Object, js.Object]), /* eventData */ js.UndefOr[SyntheticEventData]) => Callback
  ): TypeofSimulate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => abort(t0, t1).runNow()))
    __obj.updateDynamic("animationEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => animationEnd(t0, t1).runNow()))
    __obj.updateDynamic("animationIteration")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => animationIteration(t0, t1).runNow()))
    __obj.updateDynamic("animationStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => animationStart(t0, t1).runNow()))
    __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => blur(t0, t1).runNow()))
    __obj.updateDynamic("canPlay")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => canPlay(t0, t1).runNow()))
    __obj.updateDynamic("canPlayThrough")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => canPlayThrough(t0, t1).runNow()))
    __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => change(t0, t1).runNow()))
    __obj.updateDynamic("click")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => click(t0, t1).runNow()))
    __obj.updateDynamic("compositionEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => compositionEnd(t0, t1).runNow()))
    __obj.updateDynamic("compositionStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => compositionStart(t0, t1).runNow()))
    __obj.updateDynamic("compositionUpdate")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => compositionUpdate(t0, t1).runNow()))
    __obj.updateDynamic("contextMenu")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => contextMenu(t0, t1).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => copy(t0, t1).runNow()))
    __obj.updateDynamic("cut")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => cut(t0, t1).runNow()))
    __obj.updateDynamic("doubleClick")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => doubleClick(t0, t1).runNow()))
    __obj.updateDynamic("drag")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => drag(t0, t1).runNow()))
    __obj.updateDynamic("dragEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragEnd(t0, t1).runNow()))
    __obj.updateDynamic("dragEnter")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragEnter(t0, t1).runNow()))
    __obj.updateDynamic("dragExit")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragExit(t0, t1).runNow()))
    __obj.updateDynamic("dragLeave")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragLeave(t0, t1).runNow()))
    __obj.updateDynamic("dragOver")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragOver(t0, t1).runNow()))
    __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => dragStart(t0, t1).runNow()))
    __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => drop(t0, t1).runNow()))
    __obj.updateDynamic("durationChange")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => durationChange(t0, t1).runNow()))
    __obj.updateDynamic("emptied")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => emptied(t0, t1).runNow()))
    __obj.updateDynamic("encrypted")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => encrypted(t0, t1).runNow()))
    __obj.updateDynamic("ended")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => ended(t0, t1).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => error(t0, t1).runNow()))
    __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => focus(t0, t1).runNow()))
    __obj.updateDynamic("input")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => input(t0, t1).runNow()))
    __obj.updateDynamic("invalid")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => invalid(t0, t1).runNow()))
    __obj.updateDynamic("keyDown")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => keyDown(t0, t1).runNow()))
    __obj.updateDynamic("keyPress")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => keyPress(t0, t1).runNow()))
    __obj.updateDynamic("keyUp")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => keyUp(t0, t1).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => load(t0, t1).runNow()))
    __obj.updateDynamic("loadStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => loadStart(t0, t1).runNow()))
    __obj.updateDynamic("loadedData")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => loadedData(t0, t1).runNow()))
    __obj.updateDynamic("loadedMetadata")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => loadedMetadata(t0, t1).runNow()))
    __obj.updateDynamic("mouseDown")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseDown(t0, t1).runNow()))
    __obj.updateDynamic("mouseEnter")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseEnter(t0, t1).runNow()))
    __obj.updateDynamic("mouseLeave")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseLeave(t0, t1).runNow()))
    __obj.updateDynamic("mouseMove")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseMove(t0, t1).runNow()))
    __obj.updateDynamic("mouseOut")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseOut(t0, t1).runNow()))
    __obj.updateDynamic("mouseOver")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseOver(t0, t1).runNow()))
    __obj.updateDynamic("mouseUp")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => mouseUp(t0, t1).runNow()))
    __obj.updateDynamic("paste")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => paste(t0, t1).runNow()))
    __obj.updateDynamic("pause")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => pause(t0, t1).runNow()))
    __obj.updateDynamic("play")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => play(t0, t1).runNow()))
    __obj.updateDynamic("playing")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => playing(t0, t1).runNow()))
    __obj.updateDynamic("progress")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => progress(t0, t1).runNow()))
    __obj.updateDynamic("rateChange")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => rateChange(t0, t1).runNow()))
    __obj.updateDynamic("scroll")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => scroll(t0, t1).runNow()))
    __obj.updateDynamic("seeked")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => seeked(t0, t1).runNow()))
    __obj.updateDynamic("seeking")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => seeking(t0, t1).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => select(t0, t1).runNow()))
    __obj.updateDynamic("stalled")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => stalled(t0, t1).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => submit(t0, t1).runNow()))
    __obj.updateDynamic("suspend")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => suspend(t0, t1).runNow()))
    __obj.updateDynamic("timeUpdate")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => timeUpdate(t0, t1).runNow()))
    __obj.updateDynamic("touchCancel")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => touchCancel(t0, t1).runNow()))
    __obj.updateDynamic("touchEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => touchEnd(t0, t1).runNow()))
    __obj.updateDynamic("touchMove")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => touchMove(t0, t1).runNow()))
    __obj.updateDynamic("touchStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => touchStart(t0, t1).runNow()))
    __obj.updateDynamic("transitionEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => transitionEnd(t0, t1).runNow()))
    __obj.updateDynamic("volumeChange")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => volumeChange(t0, t1).runNow()))
    __obj.updateDynamic("waiting")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => waiting(t0, t1).runNow()))
    __obj.updateDynamic("wheel")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element | (japgolly.scalajs.react.raw.React.Component[js.Any with js.Object, js.Object]), t1: /* eventData */ js.UndefOr[typingsJapgolly.reactDashDom.testDashUtilsMod.SyntheticEventData]) => wheel(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofSimulate]
  }
}

