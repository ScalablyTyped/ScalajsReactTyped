package typingsJapgolly.mapboxMapboxSdk.stylesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.AnonConfig
import typingsJapgolly.mapboxMapboxSdk.AnonEnd
import typingsJapgolly.mapboxMapboxSdk.AnonFile
import typingsJapgolly.mapboxMapboxSdk.AnonFormat
import typingsJapgolly.mapboxMapboxSdk.AnonIconId
import typingsJapgolly.mapboxMapboxSdk.AnonLastKnownModification
import typingsJapgolly.mapboxMapboxSdk.AnonOwnerId
import typingsJapgolly.mapboxMapboxSdk.AnonStart
import typingsJapgolly.mapboxMapboxSdk.AnonStyle
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesService extends js.Object {
  /**
    * Create a style.
    * @param style
    * @param ownerId
    */
  def createStyle(config: AnonStyle): MapiRequest
  /**
    * Delete a style.
    * @param style
    * @param ownerId
    */
  def deleteStyle(config: AnonStyle): MapiRequest
  /**
    * Remove an icon from a style.
    * @param styleId
    * @param iconId
    * @param ownerId
    */
  // implicit any
  def deleteStyleIcon(config: AnonIconId): Unit
  /**
    * Get embeddable HTML displaying a map.
    * @param config
    * @param styleId
    * @param scrollZoom
    * @param title
    * @param ownerId
    */
  def getEmbeddableHtml(config: AnonConfig): MapiRequest
  /**
    * Get a font glyph range.
    * @param fonts
    * @param start
    * @param end
    * @param ownerId
    */
  def getFontGlyphRange(config: AnonEnd): MapiRequest
  /**
    * Get a style.
    * @param styleId
    * @param ownerId
    */
  def getStyle(config: AnonOwnerId): MapiRequest
  /**
    * Get a style sprite's image or JSON document.
    * @param styleId
    * @param format
    * @param highRes
    * @param ownerId
    */
  def getStyleSprite(config: AnonFormat): MapiRequest
  /**
    * List styles in your account.
    * @param start
    * @param ownerId
    */
  def listStyles(config: AnonStart): MapiRequest
  /**
    * Add an icon to a style, or update an existing one.
    * @param styleId
    * @param iconId
    * @param file
    * @param ownerId
    */
  def putStyleIcon(config: AnonFile): MapiRequest
  /**
    * Update a style.
    * @param styleId
    * @param style
    * @param lastKnownModification
    * @param ownerId
    */
  // implicit any
  def updateStyle(config: AnonLastKnownModification): Unit
}

object StylesService {
  @scala.inline
  def apply(
    createStyle: AnonStyle => CallbackTo[MapiRequest],
    deleteStyle: AnonStyle => CallbackTo[MapiRequest],
    deleteStyleIcon: AnonIconId => Callback,
    getEmbeddableHtml: AnonConfig => CallbackTo[MapiRequest],
    getFontGlyphRange: AnonEnd => CallbackTo[MapiRequest],
    getStyle: AnonOwnerId => CallbackTo[MapiRequest],
    getStyleSprite: AnonFormat => CallbackTo[MapiRequest],
    listStyles: AnonStart => CallbackTo[MapiRequest],
    putStyleIcon: AnonFile => CallbackTo[MapiRequest],
    updateStyle: AnonLastKnownModification => Callback
  ): StylesService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createStyle")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonStyle) => createStyle(t0).runNow()))
    __obj.updateDynamic("deleteStyle")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonStyle) => deleteStyle(t0).runNow()))
    __obj.updateDynamic("deleteStyleIcon")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonIconId) => deleteStyleIcon(t0).runNow()))
    __obj.updateDynamic("getEmbeddableHtml")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonConfig) => getEmbeddableHtml(t0).runNow()))
    __obj.updateDynamic("getFontGlyphRange")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonEnd) => getFontGlyphRange(t0).runNow()))
    __obj.updateDynamic("getStyle")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonOwnerId) => getStyle(t0).runNow()))
    __obj.updateDynamic("getStyleSprite")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonFormat) => getStyleSprite(t0).runNow()))
    __obj.updateDynamic("listStyles")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonStart) => listStyles(t0).runNow()))
    __obj.updateDynamic("putStyleIcon")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonFile) => putStyleIcon(t0).runNow()))
    __obj.updateDynamic("updateStyle")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonLastKnownModification) => updateStyle(t0).runNow()))
    __obj.asInstanceOf[StylesService]
  }
}

