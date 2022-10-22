package typingsJapgolly.twilioSync.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.twilioSync.twilioSyncStrings.debug
import typingsJapgolly.twilioSync.twilioSyncStrings.error
import typingsJapgolly.twilioSync.twilioSyncStrings.info
import typingsJapgolly.twilioSync.twilioSyncStrings.silent
import typingsJapgolly.twilioSync.twilioSyncStrings.trace
import typingsJapgolly.twilioSync.twilioSyncStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client options.
  */
trait SyncClientOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * The level of logging to enable.
    */
  var logLevel: js.UndefOr[silent | error | warn | info | debug | trace] = js.undefined
}
object SyncClientOptions {
  
  inline def apply(): SyncClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncClientOptions]
  }
  
  extension [Self <: SyncClientOptions](x: Self) {
    
    inline def setLogLevel(value: silent | error | warn | info | debug | trace): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
  }
}
