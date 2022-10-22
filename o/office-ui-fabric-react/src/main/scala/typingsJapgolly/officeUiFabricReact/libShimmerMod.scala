package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerCircleShimmerCircleDottypesMod.IShimmerCircleProps
import typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.IShimmerProps
import typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerElementsGroupShimmerElementsGroupDottypesMod.IShimmerElementsGroupProps
import typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerGapShimmerGapDottypesMod.IShimmerGapProps
import typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerLineShimmerLineDottypesMod.IShimmerLineProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShimmerMod {
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "Shimmer")
  @js.native
  val Shimmer: FunctionComponent[IShimmerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerBase")
  @js.native
  open class ShimmerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsShimmerMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  /* static members */
  object ShimmerBase {
    
    @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerBase.defaultProps")
    @js.native
    def defaultProps: IShimmerProps = js.native
    inline def defaultProps_=(x: IShimmerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerCircle")
  @js.native
  val ShimmerCircle: FunctionComponent[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerCircleBase")
  @js.native
  val ShimmerCircleBase: FunctionComponent[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerElementType")
  @js.native
  object ShimmerElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType & Double
      ] = js.native
    
    /* 2 */ val circle: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.circle & Double = js.native
    
    /* 3 */ val gap: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.gap & Double = js.native
    
    /* 1 */ val line: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementType.line & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerElementsDefaultHeights")
  @js.native
  object ShimmerElementsDefaultHeights extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights & Double
      ] = js.native
    
    /* 24 */ val circle: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.circle & Double = js.native
    
    /* 16 */ val gap: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.gap & Double = js.native
    
    /* 16 */ val line: typingsJapgolly.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.ShimmerElementsDefaultHeights.line & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerElementsGroup")
  @js.native
  val ShimmerElementsGroup: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerElementsGroupBase")
  @js.native
  val ShimmerElementsGroupBase: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerGap")
  @js.native
  val ShimmerGap: FunctionComponent[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerGapBase")
  @js.native
  val ShimmerGapBase: FunctionComponent[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerLine")
  @js.native
  val ShimmerLine: FunctionComponent[IShimmerLineProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Shimmer", "ShimmerLineBase")
  @js.native
  val ShimmerLineBase: FunctionComponent[IShimmerLineProps] = js.native
}
