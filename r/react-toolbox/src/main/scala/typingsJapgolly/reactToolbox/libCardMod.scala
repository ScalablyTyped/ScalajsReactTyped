package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.cardCardActionsMod.CardActionsProps
import typingsJapgolly.reactToolbox.cardCardMediaMod.CardMediaProps
import typingsJapgolly.reactToolbox.cardCardTextMod.CardTextProps
import typingsJapgolly.reactToolbox.cardCardTitleMod.CardTitleProps
import typingsJapgolly.reactToolbox.libCardCardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/card", JSImport.Namespace)
@js.native
object libCardMod extends js.Object {
  @js.native
  class Card ()
    extends Component[CardProps, js.Object, js.Any]
  
  @js.native
  class CardActions ()
    extends Component[CardActionsProps, js.Object, js.Any]
  
  @js.native
  class CardMedia ()
    extends Component[CardMediaProps, js.Object, js.Any]
  
  @js.native
  class CardText ()
    extends Component[CardTextProps, js.Object, js.Any]
  
  @js.native
  class CardTitle ()
    extends Component[CardTitleProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[CardProps, js.Object, js.Any]
  
}

