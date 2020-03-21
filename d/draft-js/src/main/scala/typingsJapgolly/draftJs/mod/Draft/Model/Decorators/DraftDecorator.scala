package typingsJapgolly.draftJs.mod.Draft.Model.Decorators

import japgolly.scalajs.react.Callback
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DraftDecorator is a strategy-component pair intended for use when
  * rendering content.
  *
  *   - A "strategy": A function that accepts a ContentBlock object and
  *     continuously executes a callback with start/end values corresponding to
  *     relevant matches in the document text. For example, getHashtagMatches
  *     uses a hashtag regex to find hashtag strings in the block, and
  *     for each hashtag match, executes the callback with start/end pairs.
  *
  *   - A "component": A React component that will be used to render the
  *     "decorated" section of text.
  *
  *   - "props": Props to be passed into the React component that will be used.
  */
trait DraftDecorator extends js.Object {
  var component: js.Function
  var props: js.UndefOr[js.Object] = js.undefined
  def strategy(
    block: ContentBlock,
    callback: js.Function2[/* start */ Double, /* end */ Double, Unit],
    contentState: ContentState
  ): Unit
}

object DraftDecorator {
  @scala.inline
  def apply(
    component: js.Function,
    strategy: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Callback,
    props: js.Object = null
  ): DraftDecorator = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("strategy")(js.Any.fromFunction3((t0: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock, t1: js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit], t2: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState) => strategy(t0, t1, t2).runNow()))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftDecorator]
  }
}

