package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`console-api`
import typingsJapgolly.electron.electronStrings.deprecation
import typingsJapgolly.electron.electronStrings.intervention
import typingsJapgolly.electron.electronStrings.javascript
import typingsJapgolly.electron.electronStrings.network
import typingsJapgolly.electron.electronStrings.other
import typingsJapgolly.electron.electronStrings.recommendation
import typingsJapgolly.electron.electronStrings.rendering
import typingsJapgolly.electron.electronStrings.security
import typingsJapgolly.electron.electronStrings.storage
import typingsJapgolly.electron.electronStrings.violation
import typingsJapgolly.electron.electronStrings.worker
import typingsJapgolly.electron.electronStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDetails extends StObject {
  
  /**
    * The log level, from 0 to 3. In order it matches `verbose`, `info`, `warning` and
    * `error`.
    */
  var level: Double
  
  /**
    * The line number of the source that triggered this console message
    */
  var lineNumber: Double
  
  /**
    * The actual console message
    */
  var message: String
  
  /**
    * The type of source for this message.  Can be `javascript`, `xml`, `network`,
    * `console-api`, `storage`, `rendering`, `security`, `deprecation`, `worker`,
    * `violation`, `intervention`, `recommendation` or `other`.
    */
  var source: javascript | xml | network | `console-api` | storage | rendering | security | deprecation | worker | violation | intervention | recommendation | other
  
  /**
    * The URL the message came from
    */
  var sourceUrl: String
  
  /**
    * The version ID of the service worker that sent the log message
    */
  var versionId: Double
}
object MessageDetails {
  
  inline def apply(
    level: Double,
    lineNumber: Double,
    message: String,
    source: javascript | xml | network | `console-api` | storage | rendering | security | deprecation | worker | violation | intervention | recommendation | other,
    sourceUrl: String,
    versionId: Double
  ): MessageDetails = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDetails]
  }
  
  extension [Self <: MessageDetails](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSource(
      value: javascript | xml | network | `console-api` | storage | rendering | security | deprecation | worker | violation | intervention | recommendation | other
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
