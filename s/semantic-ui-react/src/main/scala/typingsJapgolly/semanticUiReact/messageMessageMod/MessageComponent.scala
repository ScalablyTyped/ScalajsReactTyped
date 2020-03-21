package typingsJapgolly.semanticUiReact.messageMessageMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.messageContentMod.MessageContentProps
import typingsJapgolly.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typingsJapgolly.semanticUiReact.messageItemMod.MessageItemProps
import typingsJapgolly.semanticUiReact.messageListMod.MessageListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageComponent extends ComponentClass[MessageProps, ComponentState] {
  var Content: StatelessComponent[MessageContentProps] = js.native
  var Header: StatelessComponent[MessageHeaderProps] = js.native
  var Item: StatelessComponent[MessageItemProps] = js.native
  var List: StatelessComponent[MessageListProps] = js.native
}

