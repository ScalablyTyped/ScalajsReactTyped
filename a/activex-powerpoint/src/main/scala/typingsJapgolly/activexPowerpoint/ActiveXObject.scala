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
import typingsJapgolly.activexPowerpoint.anon.CancelProtViewWindow
import typingsJapgolly.activexPowerpoint.anon.NEffect
import typingsJapgolly.activexPowerpoint.anon.PresWn
import typingsJapgolly.activexPowerpoint.anon.SelSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: AfterNewPresentation | AfterPresentationOpen | ColorSchemeChanged | NewPresentation | PresentationClose | PresentationCloseFinal | PresentationOpen | PresentationPrint | PresentationSave | ProtectedViewWindowActivate | ProtectedViewWindowDeactivate | ProtectedViewWindowOpen | SlideSelectionChanged | SlideShowBegin | SlideShowEnd | SlideShowNextBuild | SlideShowNextSlide | SlideShowOnNext | SlideShowOnPrevious,
    argNames: js.Array[Pres | ProtViewWindow | SldRange | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typingsJapgolly.activexPowerpoint.anon.Pres) | (/* parameter */ typingsJapgolly.activexPowerpoint.anon.ProtViewWindow) | (/* parameter */ typingsJapgolly.activexPowerpoint.anon.SldRange) | (/* parameter */ typingsJapgolly.activexPowerpoint.anon.Wn), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose | PresentationBeforeSave | WindowActivate | WindowBeforeDoubleClick | WindowBeforeRightClick | WindowDeactivate,
    argNames: js.Tuple2[Pres | Sel, Cancel | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typingsJapgolly.activexPowerpoint.anon.Cancel) | (/* parameter */ PresWn) | (/* parameter */ typingsJapgolly.activexPowerpoint.anon.Sel), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexPowerpoint.anon.Sld, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexPowerpoint.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexPowerpoint.anon.ProtectedViewCloseReason, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ NEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
  ): Unit = js.native
  def on(
    obj: OLEControl,
    event: GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
