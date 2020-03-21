package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.cardActionsMod.CardActionsProps
import typingsJapgolly.reactToolbox.cardCardMod.CardProps
import typingsJapgolly.reactToolbox.cardMediaMod.CardMediaProps
import typingsJapgolly.reactToolbox.cardTextMod.CardTextProps
import typingsJapgolly.reactToolbox.cardTitleMod.CardTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/components/card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
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

