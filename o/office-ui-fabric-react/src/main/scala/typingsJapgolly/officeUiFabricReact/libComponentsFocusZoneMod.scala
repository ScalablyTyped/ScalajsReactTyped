package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFocusZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZone")
  @js.native
  open class FocusZone protected ()
    extends typingsJapgolly.fluentuiReactFocus.mod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  /* static members */
  object FocusZone {
    
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
      * for ref counting to work correctly!
      */
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZone._onKeyDownCapture")
    @js.native
    def _onKeyDownCapture: Any = js.native
    inline def _onKeyDownCapture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZone.defaultProps")
    @js.native
    def defaultProps: IFocusZoneProps = js.native
    inline def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /** Used for testing purposes only. */
    inline def getOuterZones(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterZones")().asInstanceOf[Double]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZoneDirection")
  @js.native
  object FocusZoneDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection & Double
      ] = js.native
    
    /* 2 */ val bidirectional: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.bidirectional & Double = js.native
    
    /* 3 */ val domOrder: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.domOrder & Double = js.native
    
    /* 1 */ val horizontal: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.horizontal & Double = js.native
    
    /* 0 */ val vertical: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.vertical & Double = js.native
  }
  
  object FocusZoneTabbableElements {
    
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZoneTabbableElements")
    @js.native
    val ^ : js.Any = js.native
    
    /** All tabbing action is allowed */
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZoneTabbableElements.all")
    @js.native
    def all: `1` = js.native
    inline def all_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** Tabbing is allowed only on input elements */
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZoneTabbableElements.inputOnly")
    @js.native
    def inputOnly: `2` = js.native
    inline def inputOnly_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputOnly")(x.asInstanceOf[js.Any])
    
    /** Tabbing is not allowed */
    @JSImport("office-ui-fabric-react/lib/components/FocusZone", "FocusZoneTabbableElements.none")
    @js.native
    def none: `0` = js.native
    inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
}
