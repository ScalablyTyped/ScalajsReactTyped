package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.FunctionComponent
import typingsJapgolly.react.reactMod.StatelessComponent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentActionsMod.CommentActionsProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentAuthorMod.CommentAuthorProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentAvatarMod.CommentAvatarProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentContentMod.CommentContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentMetadataMod.CommentMetadataProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentComponent extends FunctionComponent[CommentProps] {
  var Action: ComponentClassP[CommentActionProps with js.Object] = js.native
  var Actions: StatelessComponent[CommentActionsProps] = js.native
  var Author: StatelessComponent[CommentAuthorProps] = js.native
  var Avatar: StatelessComponent[CommentAvatarProps] = js.native
  var Content: StatelessComponent[CommentContentProps] = js.native
  var Group: StatelessComponent[CommentGroupProps] = js.native
  var Metadata: StatelessComponent[CommentMetadataProps] = js.native
  var Text: StatelessComponent[CommentTextProps] = js.native
}

