package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZone
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FocusZone/FocusZone", JSImport.Namespace)
@js.native
object focusZoneFocusZoneMod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends Component[IFocusZoneProps, js.Object, js.Any]
       with IFocusZone {
    def this(props: IFocusZoneProps) = this()
    /** The most recently focused child element. */
    var _activeElement: js.Any = js.native
    /** The child element with tabindex=0. */
    var _defaultFocusElement: js.Any = js.native
    var _disposables: js.Any = js.native
    var _evaluateFocusBeforeRender: js.Any = js.native
    var _focusAlignment: js.Any = js.native
    var _getDocument: js.Any = js.native
    /**
      * Traverse to find first child zone.
      */
    var _getFirstInnerZone: js.Any = js.native
    var _getHorizontalDistanceFromCenter: js.Any = js.native
    var _getOwnerZone: js.Any = js.native
    var _id: js.Any = js.native
    var _isElementInput: js.Any = js.native
    var _isImmediateDescendantOfZone: js.Any = js.native
    var _isInnerZone: js.Any = js.native
    /**
      * Flag to define when we've intentionally parked focus on the root element to temporarily
      * hold focus until items appear within the zone.
      */
    var _isParked: js.Any = js.native
    /**
      * The index path to the last focused child element.
      */
    var _lastIndexPath: js.Any = js.native
    var _moveFocus: js.Any = js.native
    var _moveFocusDown: js.Any = js.native
    var _moveFocusLeft: js.Any = js.native
    var _moveFocusPaging: js.Any = js.native
    var _moveFocusRight: js.Any = js.native
    var _moveFocusUp: js.Any = js.native
    var _onBlur: js.Any = js.native
    var _onFocus: js.Any = js.native
    /**
      * Handle the keystrokes.
      */
    var _onKeyDown: js.Any = js.native
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      */
    var _onKeyDownCapture: js.Any = js.native
    var _onMouseDown: js.Any = js.native
    var _parkedTabIndex: js.Any = js.native
    /**
      * Returns true if the element is a descendant of the FocusZone through a React portal.
      */
    var _portalContainsElement: js.Any = js.native
    /** Used to allow us to move to next focusable element even when we're focusing on a input element when pressing tab */
    var _processingTabKey: js.Any = js.native
    var _root: js.Any = js.native
    var _setActiveElement: js.Any = js.native
    var _setFocusAlignment: js.Any = js.native
    /**
      * When focus is in the zone at render time but then all focusable elements are removed,
      * we "park" focus temporarily on the root. Once we update with focusable children, we restore
      * focus to the closest path from previous. If the user tabs away from the parked container,
      * we restore focusability to the pre-parked state.
      */
    var _setParkedFocus: js.Any = js.native
    var _shouldInputLoseFocus: js.Any = js.native
    var _shouldWrapFocus: js.Any = js.native
    /**
      * Walk up the dom try to find a focusable element.
      */
    var _tryInvokeClickForFocusable: js.Any = js.native
    var _updateTabIndexes: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFocusZone(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFocusZone(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFocusZone(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    var defaultProps: IFocusZoneProps = js.native
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
}

