package typingsJapgolly.semanticUiReact.feedFeedMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.feedContentMod.FeedContentProps
import typingsJapgolly.semanticUiReact.feedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.feedEventMod.FeedEventProps
import typingsJapgolly.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsJapgolly.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsJapgolly.semanticUiReact.feedLikeMod.FeedLikeProps
import typingsJapgolly.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsJapgolly.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsJapgolly.semanticUiReact.feedUserMod.FeedUserProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedComponent extends FunctionComponent[FeedProps] {
  var Content: StatelessComponent[FeedContentProps] = js.native
  var Date: StatelessComponent[FeedDateProps] = js.native
  var Event: StatelessComponent[FeedEventProps] = js.native
  var Extra: StatelessComponent[FeedExtraProps] = js.native
  var Label: StatelessComponent[FeedLabelProps] = js.native
  var Like: StatelessComponent[FeedLikeProps] = js.native
  var Meta: StatelessComponent[FeedMetaProps] = js.native
  var Summary: StatelessComponent[FeedSummaryProps] = js.native
  var User: StatelessComponent[FeedUserProps] = js.native
}

