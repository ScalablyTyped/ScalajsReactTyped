package typingsJapgolly.phonon.Phonon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.awesomplete.mod.Options
import typingsJapgolly.phonon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Main object ***/
@js.native
trait Phonon extends StObject {
  
  def ajax(request: PhononAjaxObject): PhononAjaxReturnObject = js.native
  
  def alert(text: String): PhononDialogComponent = js.native
  def alert(text: String, title: String): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def alert(text: String, title: String, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  def alert(text: String, title: Unit, cancelable: Boolean): PhononDialogComponent = js.native
  def alert(text: String, title: Unit, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def alert(text: String, title: Unit, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  
  def autocomplete(input: String): Any = js.native
  def autocomplete(input: String, o: Options): Any = js.native
  def autocomplete(input: HTMLElement): Any = js.native
  def autocomplete(input: HTMLElement, o: Options): Any = js.native
  def autocomplete(input: Element): Any = js.native
  def autocomplete(input: Element, o: Options): Any = js.native
  
  var browser: PhononBrowserObject = js.native
  
  def confirm(text: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Boolean, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Unit, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: String, cancelable: Unit, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Boolean): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Boolean, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Unit, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def confirm(text: String, title: Unit, cancelable: Unit, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  
  var device: PhononDeviceObject = js.native
  
  def dialog(id: String): PhononCustomDialogComponent = js.native
  
  var event: PhononEventObject = js.native
  
  def i18n(): PhononI18n = js.native
  
  def indicator(title: String): PhononIndicatorComponent = js.native
  def indicator(title: String, cancelable: Boolean): PhononIndicatorComponent = js.native
  
  def navigator(): PhononNavigator = js.native
  
  def notif(textOrId: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: Boolean): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: Boolean, textButton: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Double, showButton: Unit, textButton: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Unit, showButton: Boolean): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Unit, showButton: Boolean, textButton: String): PhononNotifComponent = js.native
  def notif(textOrId: String, timeout: Unit, showButton: Unit, textButton: String): PhononNotifComponent = js.native
  
  def onReady(callback: js.Function0[Unit]): Unit = js.native
  
  def options(options: PhononOptions): Unit = js.native
  
  def panel(id: String): PhononPanelComponent = js.native
  
  def popover(): PhononPopoverComponent = js.native
  def popover(id: String): PhononPopoverComponent = js.native
  
  def preloader(element: String): PhononPreloaderComponent = js.native
  def preloader(element: Element): PhononPreloaderComponent = js.native
  
  def prompt(text: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Boolean, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Unit, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: String, cancelable: Unit, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Boolean): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Boolean, textOk: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Boolean, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Boolean, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Unit, textOk: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Unit, textOk: String, textCancel: String): PhononDialogComponent = js.native
  def prompt(text: String, title: Unit, cancelable: Unit, textOk: Unit, textCancel: String): PhononDialogComponent = js.native
  
  def sidePanel(id: String): PhononSidePanelComponent = js.native
  
  def tab(): PhononTabComponent = js.native
  
  def updateLocale(language: String): Unit = js.native
}
