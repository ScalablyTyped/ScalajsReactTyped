package typingsJapgolly.openfin

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.openfin.entityTypeMod.EntityTypeHelpers
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.mainMod.Frame
import typingsJapgolly.openfin.mainMod.Window
import typingsJapgolly.openfin.viewViewMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/fin", JSImport.Namespace)
@js.native
object finMod extends js.Object {
  @js.native
  trait Fin extends EventEmitter {
    var Application: typingsJapgolly.openfin.applicationMod.default = js.native
    var Clipboard: typingsJapgolly.openfin.clipboardMod.default = js.native
    var ExternalApplication: typingsJapgolly.openfin.externalApplicationExternalApplicationMod.default = js.native
    var ExternalWindow: typingsJapgolly.openfin.externalWindowExternalWindowMod.default = js.native
    var Frame: typingsJapgolly.openfin.frameFrameMod.default = js.native
    var GlobalHotkey: typingsJapgolly.openfin.apiGlobalHotkeyMod.default = js.native
    var InterApplicationBus: typingsJapgolly.openfin.interappbusMod.default = js.native
    var Notification: typingsJapgolly.openfin.notificationMod.default = js.native
    var Platform: typingsJapgolly.openfin.platformMod.default = js.native
    var System: typingsJapgolly.openfin.systemSystemMod.default = js.native
    var View: typingsJapgolly.openfin.viewViewMod.default = js.native
    var Window: typingsJapgolly.openfin.windowWindowMod.default = js.native
    val me: (View | Window | Frame | js.Object) with Identity with EntityTypeHelpers = js.native
    var wire: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Fin {
    def this(wire: typingsJapgolly.openfin.transportMod.default) = this()
  }
  
}

