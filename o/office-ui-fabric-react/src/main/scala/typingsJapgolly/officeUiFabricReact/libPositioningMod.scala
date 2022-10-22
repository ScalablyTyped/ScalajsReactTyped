package typingsJapgolly.officeUiFabricReact

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.officeUiFabricReact.libCommonDirectionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.libUtilitiesMod.Rectangle
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.ICalloutPositionedInfo
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IPositionProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IPositionedData
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IWindowWithSegments
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge
import typingsJapgolly.uifabricUtilities.libIrectangleMod.IRectangle
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPositioningMod {
  
  @JSImport("office-ui-fabric-react/lib/Positioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Positioning", "Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position & Double
      ] = js.native
    
    /* 1 */ val bottom: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position.bottom & Double = js.native
    
    /* 3 */ val end: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position.end & Double = js.native
    
    /* 2 */ val start: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position.start & Double = js.native
    
    /* 0 */ val top: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.Position.top & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Positioning", "RectangleEdge")
  @js.native
  object RectangleEdge extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge & Double
      ] = js.native
    
    /* -1 */ val bottom: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge.bottom & Double = js.native
    
    /* 2 */ val left: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge.left & Double = js.native
    
    /* -2 */ val right: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge.right & Double = js.native
    
    /* 1 */ val top: typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge.top & Double = js.native
  }
  
  inline def getBoundsFromTargetWindow(target: Element, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Null, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Rectangle, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  inline def getBoundsFromTargetWindow(target: Point, targetWindow: IWindowWithSegments): IRectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsFromTargetWindow")(target.asInstanceOf[js.Any], targetWindow.asInstanceOf[js.Any])).asInstanceOf[IRectangle]
  
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Element, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: Unit,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Rectangle, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Rectangle,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Unit, bounds: Unit, coverTarget: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(target: Point, targetEdge: DirectionalHint, gapSpace: Unit, bounds: IRectangle): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getMaxHeight(
    target: Point,
    targetEdge: DirectionalHint,
    gapSpace: Unit,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxHeight")(target.asInstanceOf[js.Any], targetEdge.asInstanceOf[js.Any], gapSpace.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], coverTarget.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOppositeEdge(edge: RectangleEdge): RectangleEdge = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeEdge")(edge.asInstanceOf[js.Any]).asInstanceOf[RectangleEdge]
  
  inline def positionCallout(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCallout")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  inline def positionCallout(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCallout")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  
  inline def positionCard(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCard")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  inline def positionCard(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("positionCard")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[ICalloutPositionedInfo]
  
  inline def positionElement(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): IPositionedData = (^.asInstanceOf[js.Dynamic].applyDynamic("positionElement")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any])).asInstanceOf[IPositionedData]
  inline def positionElement(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: IPositionedData
  ): IPositionedData = (^.asInstanceOf[js.Dynamic].applyDynamic("positionElement")(props.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any], elementToPosition.asInstanceOf[js.Any], previousPositions.asInstanceOf[js.Any])).asInstanceOf[IPositionedData]
}
