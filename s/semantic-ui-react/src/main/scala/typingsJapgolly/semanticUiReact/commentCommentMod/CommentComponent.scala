package typingsJapgolly.semanticUiReact.commentCommentMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.commentActionMod.CommentActionProps
import typingsJapgolly.semanticUiReact.commentActionsMod.CommentActionsProps
import typingsJapgolly.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typingsJapgolly.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typingsJapgolly.semanticUiReact.commentContentMod.CommentContentProps
import typingsJapgolly.semanticUiReact.commentGroupMod.CommentGroupProps
import typingsJapgolly.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typingsJapgolly.semanticUiReact.commentTextMod.CommentTextProps
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

