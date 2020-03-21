package typingsJapgolly.kendoUi.kendo.effects

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def expand(direction: String): Expand
  def expandHorizontal(): Expand
  def expandVertical(): Expand
  def fade(direction: String): Fade
  def fadeIn(): Fade
  def fadeOut(): Fade
  def flip(axis: String, face: JQuery, back: JQuery): Flip
  def flipHorizontal(face: JQuery, back: JQuery): Flip
  def flipVertical(face: JQuery, back: JQuery): Flip
  def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn
  def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn
  def pageturnVertical(face: JQuery, back: JQuery): PageTurn
  def slideIn(direction: String): SlideIn
  def slideInDown(): SlideIn
  def slideInLeft(): SlideIn
  def slideInRight(): SlideIn
  def slideInUp(): SlideIn
  def tile(direction: String, previous: JQuery): Tile
  def tileDown(previous: JQuery): Tile
  def tileLeft(previous: JQuery): Tile
  def tileRight(previous: JQuery): Tile
  def tileUp(previous: JQuery): Tile
  def transfer(target: JQuery): Transfer
  def zoom(direction: String): Zoom
  def zoomIn(): Zoom
  def zoomOut(): Zoom
}

object Element {
  @scala.inline
  def apply(
    expand: String => CallbackTo[Expand],
    expandHorizontal: CallbackTo[Expand],
    expandVertical: CallbackTo[Expand],
    fade: String => CallbackTo[Fade],
    fadeIn: CallbackTo[Fade],
    fadeOut: CallbackTo[Fade],
    flip: (String, JQuery, JQuery) => CallbackTo[Flip],
    flipHorizontal: (JQuery, JQuery) => CallbackTo[Flip],
    flipVertical: (JQuery, JQuery) => CallbackTo[Flip],
    pageturn: (String, JQuery, JQuery) => CallbackTo[PageTurn],
    pageturnHorizontal: (JQuery, JQuery) => CallbackTo[PageTurn],
    pageturnVertical: (JQuery, JQuery) => CallbackTo[PageTurn],
    slideIn: String => CallbackTo[SlideIn],
    slideInDown: CallbackTo[SlideIn],
    slideInLeft: CallbackTo[SlideIn],
    slideInRight: CallbackTo[SlideIn],
    slideInUp: CallbackTo[SlideIn],
    tile: (String, JQuery) => CallbackTo[Tile],
    tileDown: JQuery => CallbackTo[Tile],
    tileLeft: JQuery => CallbackTo[Tile],
    tileRight: JQuery => CallbackTo[Tile],
    tileUp: JQuery => CallbackTo[Tile],
    transfer: JQuery => CallbackTo[Transfer],
    zoom: String => CallbackTo[Zoom],
    zoomIn: CallbackTo[Zoom],
    zoomOut: CallbackTo[Zoom]
  ): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: java.lang.String) => expand(t0).runNow()))
    __obj.updateDynamic("expandHorizontal")(expandHorizontal.toJsFn)
    __obj.updateDynamic("expandVertical")(expandVertical.toJsFn)
    __obj.updateDynamic("fade")(js.Any.fromFunction1((t0: java.lang.String) => fade(t0).runNow()))
    __obj.updateDynamic("fadeIn")(fadeIn.toJsFn)
    __obj.updateDynamic("fadeOut")(fadeOut.toJsFn)
    __obj.updateDynamic("flip")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.kendoUi.JQuery, t2: typingsJapgolly.kendoUi.JQuery) => flip(t0, t1, t2).runNow()))
    __obj.updateDynamic("flipHorizontal")(js.Any.fromFunction2((t0: typingsJapgolly.kendoUi.JQuery, t1: typingsJapgolly.kendoUi.JQuery) => flipHorizontal(t0, t1).runNow()))
    __obj.updateDynamic("flipVertical")(js.Any.fromFunction2((t0: typingsJapgolly.kendoUi.JQuery, t1: typingsJapgolly.kendoUi.JQuery) => flipVertical(t0, t1).runNow()))
    __obj.updateDynamic("pageturn")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.kendoUi.JQuery, t2: typingsJapgolly.kendoUi.JQuery) => pageturn(t0, t1, t2).runNow()))
    __obj.updateDynamic("pageturnHorizontal")(js.Any.fromFunction2((t0: typingsJapgolly.kendoUi.JQuery, t1: typingsJapgolly.kendoUi.JQuery) => pageturnHorizontal(t0, t1).runNow()))
    __obj.updateDynamic("pageturnVertical")(js.Any.fromFunction2((t0: typingsJapgolly.kendoUi.JQuery, t1: typingsJapgolly.kendoUi.JQuery) => pageturnVertical(t0, t1).runNow()))
    __obj.updateDynamic("slideIn")(js.Any.fromFunction1((t0: java.lang.String) => slideIn(t0).runNow()))
    __obj.updateDynamic("slideInDown")(slideInDown.toJsFn)
    __obj.updateDynamic("slideInLeft")(slideInLeft.toJsFn)
    __obj.updateDynamic("slideInRight")(slideInRight.toJsFn)
    __obj.updateDynamic("slideInUp")(slideInUp.toJsFn)
    __obj.updateDynamic("tile")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.kendoUi.JQuery) => tile(t0, t1).runNow()))
    __obj.updateDynamic("tileDown")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.JQuery) => tileDown(t0).runNow()))
    __obj.updateDynamic("tileLeft")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.JQuery) => tileLeft(t0).runNow()))
    __obj.updateDynamic("tileRight")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.JQuery) => tileRight(t0).runNow()))
    __obj.updateDynamic("tileUp")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.JQuery) => tileUp(t0).runNow()))
    __obj.updateDynamic("transfer")(js.Any.fromFunction1((t0: typingsJapgolly.kendoUi.JQuery) => transfer(t0).runNow()))
    __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: java.lang.String) => zoom(t0).runNow()))
    __obj.updateDynamic("zoomIn")(zoomIn.toJsFn)
    __obj.updateDynamic("zoomOut")(zoomOut.toJsFn)
    __obj.asInstanceOf[Element]
  }
}

