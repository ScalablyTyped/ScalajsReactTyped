package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusZone", JSImport.Namespace)
@js.native
object focusZoneMod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends typingsJapgolly.officeUiFabricReact.focusZoneFocusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    var defaultProps: IFocusZoneProps = js.native
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
  @js.native
  object FocusZoneDirection extends js.Object {
    /* 2 */ val bidirectional: typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    /* 3 */ val domOrder: typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.domOrder with Double = js.native
    /* 1 */ val horizontal: typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.horizontal with Double = js.native
    /* 0 */ val vertical: typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection with Double
      ] = js.native
  }
  
  @js.native
  object FocusZoneTabbableElements extends js.Object {
    /** All tabbing action is allowed */
    var all: `1` = js.native
    /** Tabbing is allowed only on input elements */
    var inputOnly: `2` = js.native
    /** Tabbing is not allowed */
    var none: `0` = js.native
  }
  
}

