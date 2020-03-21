package typingsJapgolly.officeUiFabricReact.indexMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.positioningPositioningMod.IElementPosition
import typingsJapgolly.officeUiFabricReact.positioningPositioningMod.IElementPositionInfo
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.ICalloutBeakPositionedInfo
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionDirectionalHintData
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", "__positioningTestPackage")
@js.native
object positioningTestPackage extends js.Object {
  var _calculateActualBeakWidthInPixels: js.Function1[/* beakWidth */ Double, Double] = js.native
  var _finalizeBeakPosition: js.Function3[
    /* elementPosition */ IElementPosition, 
    /* positionedBeak */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounds */ js.UndefOr[typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    ICalloutBeakPositionedInfo
  ] = js.native
  var _finalizePositionData: js.Function5[
    /* positionedElement */ IElementPosition, 
    /* hostElement */ HTMLElement, 
    /* bounds */ js.UndefOr[typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle], 
    /* coverTarget */ js.UndefOr[Boolean], 
    /* doNotFinalizeReturnEdge */ js.UndefOr[Boolean], 
    IPositionedData
  ] = js.native
  var _getMaxHeightFromTargetRectangle: js.Function5[
    /* targetRectangle */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* targetEdge */ DirectionalHint, 
    /* gapSpace */ Double, 
    /* bounds */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* coverTarget */ js.UndefOr[Boolean], 
    Double
  ] = js.native
  var _getPositionData: js.Function3[
    /* directionalHint */ js.UndefOr[DirectionalHint], 
    /* directionalHintForRTL */ js.UndefOr[DirectionalHint], 
    /* previousPositions */ js.UndefOr[IPositionDirectionalHintData], 
    IPositionDirectionalHintData
  ] = js.native
  var _positionBeak: js.Function2[
    /* beakWidth */ Double, 
    /* elementPosition */ IElementPositionInfo, 
    typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle
  ] = js.native
  var _positionElementWithinBounds: js.Function7[
    /* elementToPosition */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* target */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* bounding */ typingsJapgolly.officeUiFabricReact.positioningPositioningMod.Rectangle, 
    /* positionData */ IPositionDirectionalHintData, 
    /* gap */ Double, 
    /* directionalHintFixed */ js.UndefOr[Boolean], 
    /* coverTarget */ js.UndefOr[Boolean], 
    IElementPosition
  ] = js.native
}

