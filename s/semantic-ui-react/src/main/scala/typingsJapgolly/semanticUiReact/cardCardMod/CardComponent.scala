package typingsJapgolly.semanticUiReact.cardCardMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.cardContentMod.CardContentProps
import typingsJapgolly.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsJapgolly.semanticUiReact.cardGroupMod.CardGroupProps
import typingsJapgolly.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsJapgolly.semanticUiReact.cardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardComponent extends ComponentClass[CardProps, ComponentState] {
  var Content: StatelessComponent[CardContentProps] = js.native
  var Description: StatelessComponent[CardDescriptionProps] = js.native
  var Group: StatelessComponent[CardGroupProps] = js.native
  var Header: StatelessComponent[CardHeaderProps] = js.native
  var Meta: StatelessComponent[CardMetaProps] = js.native
}

