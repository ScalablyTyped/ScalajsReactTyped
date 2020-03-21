package typingsJapgolly.activexPowerpoint

import typingsJapgolly.activexPowerpoint.PowerPoint.Application
import typingsJapgolly.activexPowerpoint.PowerPoint.OLEControl
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.AfterNewPresentation
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.AfterPresentationOpen
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.Cancel
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ColorSchemeChanged
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.GotFocus
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.LostFocus
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.NewPresentation
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.Pres
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationBeforeClose
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationBeforeSave
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationClose
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationCloseFinal
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationNewSlide
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationOpen
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationPrint
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationSave
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.PresentationSync
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtViewWindow
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewCloseReason
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowActivate
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeClose
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeEdit
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowDeactivate
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowOpen
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.Sel
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.Sld
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SldRange
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideSelectionChanged
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowBegin
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowEnd
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowNextBuild
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowNextClick
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowNextSlide
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowOnNext
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SlideShowOnPrevious
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.SyncEventType
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.WindowActivate
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.WindowBeforeDoubleClick
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.WindowBeforeRightClick
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.WindowDeactivate
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.WindowSelectionChange
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.Wn
import typingsJapgolly.activexPowerpoint.activexPowerpointStrings.nEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: AfterNewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AfterPresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ColorSchemeChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeSave,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationCloseFinal,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationClose,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSld, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationPrint,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSave,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtectedViewCloseReason, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideSelectionChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowBegin,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowEnd,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextBuild,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonNEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextSlide,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnNext,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnPrevious,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSelSelection, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

