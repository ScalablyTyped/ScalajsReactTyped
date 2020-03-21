package typingsJapgolly.draftConvert.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.draftJs.mod.ContentBlock
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typingsJapgolly.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertToHTMLConfig extends js.Object {
  // Block styles:
  var blockToHTML: js.UndefOr[js.Function1[/* block */ ContentBlock, Tag]] = js.undefined
  // Entity styling:
  var entityToHTML: js.UndefOr[
    js.Function2[/* entity */ RawDraftEntity[StringDictionary[_]], /* originalText */ String, Tag]
  ] = js.undefined
  // Inline styles:
  var styleToHTML: js.UndefOr[js.Function1[/* style */ DraftInlineStyleType, Tag | Unit]] = js.undefined
}

object IConvertToHTMLConfig {
  @scala.inline
  def apply(
    blockToHTML: /* block */ ContentBlock => CallbackTo[Tag] = null,
    entityToHTML: (/* entity */ RawDraftEntity[StringDictionary[js.Any]], /* originalText */ String) => CallbackTo[Tag] = null,
    styleToHTML: /* style */ DraftInlineStyleType => CallbackTo[Tag | Unit] = null
  ): IConvertToHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (blockToHTML != null) __obj.updateDynamic("blockToHTML")(js.Any.fromFunction1((t0: /* block */ typingsJapgolly.draftJs.mod.ContentBlock) => blockToHTML(t0).runNow()))
    if (entityToHTML != null) __obj.updateDynamic("entityToHTML")(js.Any.fromFunction2((t0: /* entity */ typingsJapgolly.draftJs.mod.Draft.Model.Encoding.RawDraftEntity[org.scalablytyped.runtime.StringDictionary[js.Any]], t1: /* originalText */ java.lang.String) => entityToHTML(t0, t1).runNow()))
    if (styleToHTML != null) __obj.updateDynamic("styleToHTML")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType) => styleToHTML(t0).runNow()))
    __obj.asInstanceOf[IConvertToHTMLConfig]
  }
}

