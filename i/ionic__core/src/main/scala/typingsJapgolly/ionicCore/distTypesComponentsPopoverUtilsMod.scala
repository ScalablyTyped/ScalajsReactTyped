package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.ionicCore.anon.ArrowHeight
import typingsJapgolly.ionicCore.anon.ContentHeight
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverSize
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionAlign
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionReference
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionSide
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.TriggerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPopoverUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/popover/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Double,
    coordArrowLeft: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Double,
    coordArrowLeft: Double,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Double,
    coordArrowLeft: Unit,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Unit,
    coordArrowLeft: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Unit,
    coordArrowLeft: Double,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: Unit,
    coordArrowTop: Unit,
    coordArrowLeft: Unit,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Double,
    coordArrowLeft: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Double,
    coordArrowLeft: Double,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Double,
    coordArrowLeft: Unit,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Unit,
    coordArrowLeft: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Unit,
    coordArrowLeft: Double,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  inline def calculateWindowAdjustment(
    side: PositionSide,
    coordTop: Double,
    coordLeft: Double,
    bodyPadding: Double,
    bodyWidth: Double,
    bodyHeight: Double,
    contentWidth: Double,
    contentHeight: Double,
    safeAreaMargin: Double,
    contentOriginX: String,
    contentOriginY: String,
    triggerCoordinates: ReferenceCoordinates,
    coordArrowTop: Unit,
    coordArrowLeft: Unit,
    arrowHeight: Double
  ): PopoverStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateWindowAdjustment")(side.asInstanceOf[js.Any], coordTop.asInstanceOf[js.Any], coordLeft.asInstanceOf[js.Any], bodyPadding.asInstanceOf[js.Any], bodyWidth.asInstanceOf[js.Any], bodyHeight.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], safeAreaMargin.asInstanceOf[js.Any], contentOriginX.asInstanceOf[js.Any], contentOriginY.asInstanceOf[js.Any], triggerCoordinates.asInstanceOf[js.Any], coordArrowTop.asInstanceOf[js.Any], coordArrowLeft.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any])).asInstanceOf[PopoverStyles]
  
  inline def configureDismissInteraction(
    triggerEl: HTMLElement,
    triggerAction: TriggerAction,
    popoverEl: HTMLIonPopoverElement,
    parentPopoverEl: HTMLIonPopoverElement
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureDismissInteraction")(triggerEl.asInstanceOf[js.Any], triggerAction.asInstanceOf[js.Any], popoverEl.asInstanceOf[js.Any], parentPopoverEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def configureKeyboardInteraction(popoverEl: HTMLIonPopoverElement): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureKeyboardInteraction")(popoverEl.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def configureTriggerInteraction(triggerEl: HTMLElement, triggerAction: TriggerAction, popoverEl: HTMLIonPopoverElement): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("configureTriggerInteraction")(triggerEl.asInstanceOf[js.Any], triggerAction.asInstanceOf[js.Any], popoverEl.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def getArrowDimensions(): ArrowHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowDimensions")().asInstanceOf[ArrowHeight]
  inline def getArrowDimensions(arrowEl: HTMLElement): ArrowHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrowDimensions")(arrowEl.asInstanceOf[js.Any]).asInstanceOf[ArrowHeight]
  
  inline def getIndexOfItem(items: js.Array[HTMLIonItemElement]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexOfItem")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getIndexOfItem(items: js.Array[HTMLIonItemElement], item: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndexOfItem")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextItem(items: js.Array[HTMLIonItemElement]): HTMLIonItemElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextItem")(items.asInstanceOf[js.Any]).asInstanceOf[HTMLIonItemElement]
  inline def getNextItem(items: js.Array[HTMLIonItemElement], currentItem: HTMLElement): HTMLIonItemElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextItem")(items.asInstanceOf[js.Any], currentItem.asInstanceOf[js.Any])).asInstanceOf[HTMLIonItemElement]
  
  inline def getPopoverDimensions(size: PopoverSize, contentEl: HTMLElement): ContentHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverDimensions")(size.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any])).asInstanceOf[ContentHeight]
  inline def getPopoverDimensions(size: PopoverSize, contentEl: HTMLElement, triggerEl: HTMLElement): ContentHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverDimensions")(size.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any])).asInstanceOf[ContentHeight]
  
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition,
    triggerEl: HTMLElement
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition,
    triggerEl: HTMLElement,
    event: CustomEvent
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition,
    triggerEl: HTMLElement,
    event: MouseEvent
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition,
    triggerEl: Unit,
    event: CustomEvent
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  inline def getPopoverPosition(
    isRTL: Boolean,
    contentWidth: Double,
    contentHeight: Double,
    arrowWidth: Double,
    arrowHeight: Double,
    reference: PositionReference,
    side: PositionSide,
    align: PositionAlign,
    defaultPosition: PopoverPosition,
    triggerEl: Unit,
    event: MouseEvent
  ): PopoverPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverPosition")(isRTL.asInstanceOf[js.Any], contentWidth.asInstanceOf[js.Any], contentHeight.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], arrowHeight.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], side.asInstanceOf[js.Any], align.asInstanceOf[js.Any], defaultPosition.asInstanceOf[js.Any], triggerEl.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[PopoverPosition]
  
  inline def getPrevItem(items: js.Array[HTMLIonItemElement]): HTMLIonItemElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrevItem")(items.asInstanceOf[js.Any]).asInstanceOf[HTMLIonItemElement]
  inline def getPrevItem(items: js.Array[HTMLIonItemElement], currentItem: HTMLElement): HTMLIonItemElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrevItem")(items.asInstanceOf[js.Any], currentItem.asInstanceOf[js.Any])).asInstanceOf[HTMLIonItemElement]
  
  inline def isTriggerElement(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTriggerElement")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldShowArrow(side: PositionSide): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Boolean, ev: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Boolean, ev: Event, trigger: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Boolean, ev: Unit, trigger: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Unit, ev: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Unit, ev: Event, trigger: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldShowArrow(side: PositionSide, didAdjustBounds: Unit, ev: Unit, trigger: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldShowArrow")(side.asInstanceOf[js.Any], didAdjustBounds.asInstanceOf[js.Any], ev.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait PopoverPosition extends StObject {
    
    var arrowLeft: js.UndefOr[Double] = js.undefined
    
    var arrowTop: js.UndefOr[Double] = js.undefined
    
    var left: Double
    
    var originX: String
    
    var originY: String
    
    var referenceCoordinates: js.UndefOr[ReferenceCoordinates] = js.undefined
    
    var top: Double
  }
  object PopoverPosition {
    
    inline def apply(left: Double, originX: String, originY: String, top: Double): PopoverPosition = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverPosition]
    }
    
    extension [Self <: PopoverPosition](x: Self) {
      
      inline def setArrowLeft(value: Double): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowLeftUndefined: Self = StObject.set(x, "arrowLeft", js.undefined)
      
      inline def setArrowTop(value: Double): Self = StObject.set(x, "arrowTop", value.asInstanceOf[js.Any])
      
      inline def setArrowTopUndefined: Self = StObject.set(x, "arrowTop", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginY(value: String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setReferenceCoordinates(value: ReferenceCoordinates): Self = StObject.set(x, "referenceCoordinates", value.asInstanceOf[js.Any])
      
      inline def setReferenceCoordinatesUndefined: Self = StObject.set(x, "referenceCoordinates", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverStyles extends StObject {
    
    var addPopoverBottomClass: Boolean
    
    var arrowLeft: Double
    
    var arrowTop: Double
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var checkSafeAreaLeft: Boolean
    
    var checkSafeAreaRight: Boolean
    
    var left: Double
    
    var originX: String
    
    var originY: String
    
    var top: Double
  }
  object PopoverStyles {
    
    inline def apply(
      addPopoverBottomClass: Boolean,
      arrowLeft: Double,
      arrowTop: Double,
      checkSafeAreaLeft: Boolean,
      checkSafeAreaRight: Boolean,
      left: Double,
      originX: String,
      originY: String,
      top: Double
    ): PopoverStyles = {
      val __obj = js.Dynamic.literal(addPopoverBottomClass = addPopoverBottomClass.asInstanceOf[js.Any], arrowLeft = arrowLeft.asInstanceOf[js.Any], arrowTop = arrowTop.asInstanceOf[js.Any], checkSafeAreaLeft = checkSafeAreaLeft.asInstanceOf[js.Any], checkSafeAreaRight = checkSafeAreaRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverStyles]
    }
    
    extension [Self <: PopoverStyles](x: Self) {
      
      inline def setAddPopoverBottomClass(value: Boolean): Self = StObject.set(x, "addPopoverBottomClass", value.asInstanceOf[js.Any])
      
      inline def setArrowLeft(value: Double): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowTop(value: Double): Self = StObject.set(x, "arrowTop", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCheckSafeAreaLeft(value: Boolean): Self = StObject.set(x, "checkSafeAreaLeft", value.asInstanceOf[js.Any])
      
      inline def setCheckSafeAreaRight(value: Boolean): Self = StObject.set(x, "checkSafeAreaRight", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginY(value: String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceCoordinates extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object ReferenceCoordinates {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): ReferenceCoordinates = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceCoordinates]
    }
    
    extension [Self <: ReferenceCoordinates](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
