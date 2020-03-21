package typingsJapgolly.draftJs.mod.Draft.Model.Decorators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typingsJapgolly.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CompositeDraftDecorator traverses through a list of DraftDecorator
  * instances to identify sections of a ContentBlock that should be rendered
  * in a "decorated" manner. For example, hashtags, mentions, and links may
  * be intended to stand out visually, be rendered as anchors, etc.
  *
  * The list of decorators supplied to the constructor will be used in the
  * order they are provided. This allows the caller to specify a priority for
  * string matching, in case of match collisions among decorators.
  *
  * For instance, I may have a link with a `#` in its text. Though this section
  * of text may match our hashtag decorator, it should not be treated as a
  * hashtag. I should therefore list my link DraftDecorator
  * before my hashtag DraftDecorator when constructing this composite
  * decorator instance.
  *
  * Thus, when a collision like this is encountered, the earlier match is
  * preserved and the new match is discarded.
  */
trait CompositeDraftDecorator extends js.Object {
  def getComponentForKey(key: String): js.Function
  def getDecorations(block: ContentBlock, contentState: ContentState): List[String]
  def getPropsForKey(key: String): js.Object
}

object CompositeDraftDecorator {
  @scala.inline
  def apply(
    getComponentForKey: String => CallbackTo[js.Function],
    getDecorations: (ContentBlock, ContentState) => CallbackTo[List[String]],
    getPropsForKey: String => CallbackTo[js.Object]
  ): CompositeDraftDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getComponentForKey")(js.Any.fromFunction1((t0: java.lang.String) => getComponentForKey(t0).runNow()))
    __obj.updateDynamic("getDecorations")(js.Any.fromFunction2((t0: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock, t1: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState) => getDecorations(t0, t1).runNow()))
    __obj.updateDynamic("getPropsForKey")(js.Any.fromFunction1((t0: java.lang.String) => getPropsForKey(t0).runNow()))
    __obj.asInstanceOf[CompositeDraftDecorator]
  }
}

