package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document service creates and opens Documents that can be edited.
  *
  *     // Open a document by ID.
  *     var doc = DocumentApp.openById('DOCUMENT_ID_GOES_HERE');
  *
  *     // Create and open a document.
  *     doc = DocumentApp.create('Document Name');
  */
trait DocumentApp extends js.Object {
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any
  /** @deprecated DO NOT USE */ var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
  def create(name: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document
  def getActiveDocument(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document
  def getUi(): Ui
  def openById(id: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document
  def openByUrl(url: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document
}

object DocumentApp {
  @scala.inline
  def apply(
    Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any,
    ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any,
    FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any,
    GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any,
    ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any,
    PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any,
    TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any,
    create: String => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document],
    getActiveDocument: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document],
    getUi: CallbackTo[Ui],
    openById: String => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document],
    openByUrl: String => CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Document.Document]
  ): DocumentApp = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FontFamily = FontFamily.asInstanceOf[js.Any], GlyphType = GlyphType.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], ParagraphHeading = ParagraphHeading.asInstanceOf[js.Any], PositionedLayout = PositionedLayout.asInstanceOf[js.Any], TextAlignment = TextAlignment.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.updateDynamic("getActiveDocument")(getActiveDocument.toJsFn)
    __obj.updateDynamic("getUi")(getUi.toJsFn)
    __obj.updateDynamic("openById")(js.Any.fromFunction1((t0: java.lang.String) => openById(t0).runNow()))
    __obj.updateDynamic("openByUrl")(js.Any.fromFunction1((t0: java.lang.String) => openByUrl(t0).runNow()))
    __obj.asInstanceOf[DocumentApp]
  }
}

