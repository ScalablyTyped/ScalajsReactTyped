package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.IHoverCardProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`10`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`11`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`13`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`4`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`5`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`8`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`9`
import typingsJapgolly.officeUiFabricReact.plainCardTypesMod.IPlainCardProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/HoverCard", JSImport.Namespace)
@js.native
object hoverCardMod extends js.Object {
  @js.native
  class ExpandingCardBase protected ()
    extends typingsJapgolly.officeUiFabricReact.expandingCardBaseMod.ExpandingCardBase {
    def this(props: IExpandingCardProps) = this()
  }
  
  @js.native
  class HoverCardBase protected ()
    extends typingsJapgolly.officeUiFabricReact.hoverCardBaseMod.HoverCardBase {
    def this(props: IHoverCardProps) = this()
  }
  
  @js.native
  class PlainCardBase ()
    extends typingsJapgolly.officeUiFabricReact.plainCardBaseMod.PlainCardBase
  
  val ExpandingCard: FunctionComponent[IExpandingCardProps] = js.native
  val HoverCard: FunctionComponent[IHoverCardProps] = js.native
  val PlainCard: FunctionComponent[IPlainCardProps] = js.native
  @js.native
  object DirectionalHint extends js.Object {
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var bottomAutoEdge: `7` = js.native
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    var bottomCenter: `5` = js.native
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    var bottomLeftEdge: `4` = js.native
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    var bottomRightEdge: `6` = js.native
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    var leftBottomEdge: `10` = js.native
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    var leftCenter: `9` = js.native
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    var leftTopEdge: `8` = js.native
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    var rightBottomEdge: `13` = js.native
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    var rightCenter: `12` = js.native
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    var rightTopEdge: `11` = js.native
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward the center of the screen.
      */
    var topAutoEdge: `3` = js.native
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    var topCenter: `1` = js.native
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    var topLeftEdge: `0` = js.native
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    var topRightEdge: `2` = js.native
  }
  
  /* static members */
  @js.native
  object ExpandingCardBase extends js.Object {
    var defaultProps: AnonCompactCardHeight = js.native
  }
  
  @js.native
  object ExpandingCardMode extends js.Object {
    /* 0 */ val compact: typingsJapgolly.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.compact with Double = js.native
    /* 1 */ val expanded: typingsJapgolly.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode.expanded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object HoverCardBase extends js.Object {
    var defaultProps: AnonCardDismissDelay = js.native
  }
  
  @js.native
  object HoverCardType extends js.Object {
    /* "ExpandingCard" */ val expanding: typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.HoverCardType.expanding with String = js.native
    /* "PlainCard" */ val plain: typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.HoverCardType.plain with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.HoverCardType with String] = js.native
  }
  
  @js.native
  object OpenCardMode extends js.Object {
    /* 1 */ val hotKey: typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hotKey with Double = js.native
    /* 0 */ val hover: typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.OpenCardMode.hover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.hoverCardTypesMod.OpenCardMode with Double] = js.native
  }
  
}

