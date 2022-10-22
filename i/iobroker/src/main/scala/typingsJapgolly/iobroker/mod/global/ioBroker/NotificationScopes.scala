package typingsJapgolly.iobroker.mod.global.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.accessErrors
import typingsJapgolly.iobroker.iobrokerStrings.fileToJsonl
import typingsJapgolly.iobroker.iobrokerStrings.fsIoErrors
import typingsJapgolly.iobroker.iobrokerStrings.memIssues
import typingsJapgolly.iobroker.iobrokerStrings.noDiskSpace
import typingsJapgolly.iobroker.iobrokerStrings.nonExistingFileErrors
import typingsJapgolly.iobroker.iobrokerStrings.remoteHostErrors
import typingsJapgolly.iobroker.iobrokerStrings.restartLoop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Predefined notification scopes and their categories */
trait NotificationScopes extends StObject {
  
  var system: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
}
object NotificationScopes {
  
  inline def apply(
    system: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
  ): NotificationScopes = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationScopes]
  }
  
  extension [Self <: NotificationScopes](x: Self) {
    
    inline def setSystem(
      value: memIssues | fsIoErrors | noDiskSpace | accessErrors | nonExistingFileErrors | remoteHostErrors | restartLoop | fileToJsonl
    ): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
