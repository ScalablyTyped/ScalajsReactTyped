package typingsJapgolly.reactSketchapp.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocumentData extends js.Object {
  def addBlankPage(): SketchPage
  def assets(): SketchAssetCollection
  def currentPage(): SketchPage
  def layerStyles(): Unit
  def layerSymbols(): Unit
  def layerTextStyles(): SketchSharedStyleContainer
  def pages(): MSArray[SketchPage]
  def removePageAtIndex(index: Double): Unit
  def setCurrentPage(page: SketchPage): Unit
  def symbolsPageOrCreateIfNecessary(): SketchPage
}

object SketchDocumentData {
  @scala.inline
  def apply(
    addBlankPage: CallbackTo[SketchPage],
    assets: CallbackTo[SketchAssetCollection],
    currentPage: CallbackTo[SketchPage],
    layerStyles: Callback,
    layerSymbols: Callback,
    layerTextStyles: CallbackTo[SketchSharedStyleContainer],
    pages: CallbackTo[MSArray[SketchPage]],
    removePageAtIndex: Double => Callback,
    setCurrentPage: SketchPage => Callback,
    symbolsPageOrCreateIfNecessary: CallbackTo[SketchPage]
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBlankPage")(addBlankPage.toJsFn)
    __obj.updateDynamic("assets")(assets.toJsFn)
    __obj.updateDynamic("currentPage")(currentPage.toJsFn)
    __obj.updateDynamic("layerStyles")(layerStyles.toJsFn)
    __obj.updateDynamic("layerSymbols")(layerSymbols.toJsFn)
    __obj.updateDynamic("layerTextStyles")(layerTextStyles.toJsFn)
    __obj.updateDynamic("pages")(pages.toJsFn)
    __obj.updateDynamic("removePageAtIndex")(js.Any.fromFunction1((t0: scala.Double) => removePageAtIndex(t0).runNow()))
    __obj.updateDynamic("setCurrentPage")(js.Any.fromFunction1((t0: typingsJapgolly.reactSketchapp.typesMod.SketchPage) => setCurrentPage(t0).runNow()))
    __obj.updateDynamic("symbolsPageOrCreateIfNecessary")(symbolsPageOrCreateIfNecessary.toJsFn)
    __obj.asInstanceOf[SketchDocumentData]
  }
}

