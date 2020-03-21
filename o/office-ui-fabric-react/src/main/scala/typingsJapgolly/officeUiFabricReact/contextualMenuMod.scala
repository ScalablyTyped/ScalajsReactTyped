package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
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
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu", JSImport.Namespace)
@js.native
object contextualMenuMod extends js.Object {
  @js.native
  class ContextualMenuBase protected ()
    extends typingsJapgolly.officeUiFabricReact.contextualMenuBaseMod.ContextualMenuBase {
    def this(props: IContextualMenuProps) = this()
  }
  
  @js.native
  class ContextualMenuItemBase ()
    extends typingsJapgolly.officeUiFabricReact.contextualMenuItemBaseMod.ContextualMenuItemBase
  
  val ContextualMenu: FunctionComponent[IContextualMenuProps] = js.native
  val ContextualMenuItem: FunctionComponent[IContextualMenuItemProps] = js.native
  def canAnyMenuItemsCheck(items: js.Array[IContextualMenuItem]): Boolean = js.native
  def getSubmenuItems(item: IContextualMenuItem): js.UndefOr[js.Array[IContextualMenuItem]] = js.native
  /* static members */
  @js.native
  object ContextualMenuBase extends js.Object {
    var defaultProps: IContextualMenuProps = js.native
  }
  
  @js.native
  object ContextualMenuItemType extends js.Object {
    /* 1 */ val Divider: typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Normal with Double = js.native
    /* 3 */ val Section: typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Section with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType with Double
      ] = js.native
  }
  
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
  
}

