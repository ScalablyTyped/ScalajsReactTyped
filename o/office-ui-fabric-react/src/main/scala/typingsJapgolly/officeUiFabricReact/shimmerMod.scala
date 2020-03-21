package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typingsJapgolly.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Shimmer", JSImport.Namespace)
@js.native
object shimmerMod extends js.Object {
  @js.native
  class ShimmerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.shimmerBaseMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  
  val Shimmer: FunctionComponent[IShimmerProps] = js.native
  val ShimmerCircle: FunctionComponent[IShimmerCircleProps] = js.native
  val ShimmerCircleBase: FunctionComponent[IShimmerCircleProps] = js.native
  val ShimmerElementsGroup: FunctionComponent[IShimmerElementsGroupProps] = js.native
  val ShimmerElementsGroupBase: FunctionComponent[IShimmerElementsGroupProps] = js.native
  val ShimmerGap: FunctionComponent[IShimmerGapProps] = js.native
  val ShimmerGapBase: FunctionComponent[IShimmerGapProps] = js.native
  val ShimmerLine: FunctionComponent[IShimmerLineProps] = js.native
  val ShimmerLineBase: FunctionComponent[IShimmerLineProps] = js.native
  /* static members */
  @js.native
  object ShimmerBase extends js.Object {
    var defaultProps: IShimmerProps = js.native
  }
  
  @js.native
  object ShimmerElementType extends js.Object {
    /* 2 */ val circle: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle with Double = js.native
    /* 3 */ val gap: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap with Double = js.native
    /* 1 */ val line: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementType with Double
      ] = js.native
  }
  
  @js.native
  object ShimmerElementsDefaultHeights extends js.Object {
    /* 24 */ val circle: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    /* 16 */ val gap: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    /* 16 */ val line: typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights with Double
      ] = js.native
  }
  
}

