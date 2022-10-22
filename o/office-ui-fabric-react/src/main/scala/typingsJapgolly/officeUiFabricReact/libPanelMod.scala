package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialIPanelState
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIPanelProps
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIPanelState
import typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.IPanelProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("office-ui-fabric-react/lib/Panel", "Panel")
  @js.native
  val Panel: FunctionComponent[IPanelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase")
  @js.native
  open class PanelBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPanelMod.PanelBase {
    def this(props: IPanelProps) = this()
  }
  /* static members */
  object PanelBase {
    
    @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase.defaultProps")
    @js.native
    def defaultProps: IPanelProps = js.native
    inline def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIPanelState | Null]
  }
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelType")
  @js.native
  object PanelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType & Double
      ] = js.native
    
    /* 7 */ val custom: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.custom & Double = js.native
    
    /* 8 */ val customNear: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.customNear & Double = js.native
    
    /* 6 */ val extraLarge: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.extraLarge & Double = js.native
    
    /* 4 */ val large: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.large & Double = js.native
    
    /* 5 */ val largeFixed: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.largeFixed & Double = js.native
    
    /* 3 */ val medium: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.medium & Double = js.native
    
    /* 1 */ val smallFixedFar: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFixedFar & Double = js.native
    
    /* 2 */ val smallFixedNear: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFixedNear & Double = js.native
    
    /* 0 */ val smallFluid: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDottypesMod.PanelType.smallFluid & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelVisibilityState")
  @js.native
  object PanelVisibilityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelVisibilityState & Double
      ] = js.native
    
    /* 3 */ val animatingClosed: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelVisibilityState.animatingClosed & Double = js.native
    
    /* 1 */ val animatingOpen: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelVisibilityState.animatingOpen & Double = js.native
    
    /* 0 */ val closed: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelVisibilityState.closed & Double = js.native
    
    /* 2 */ val open: typingsJapgolly.officeUiFabricReact.libComponentsPanelPanelDotbaseMod.PanelVisibilityState.open & Double = js.native
  }
}
