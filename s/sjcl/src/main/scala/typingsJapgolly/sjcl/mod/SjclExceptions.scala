package typingsJapgolly.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclExceptions extends StObject {
  
  var bug: SjclExceptionFactory
  
  var corrupt: SjclExceptionFactory
  
  var invalid: SjclExceptionFactory
  
  var notReady: SjclExceptionFactory
}
object SjclExceptions {
  
  inline def apply(
    bug: SjclExceptionFactory,
    corrupt: SjclExceptionFactory,
    invalid: SjclExceptionFactory,
    notReady: SjclExceptionFactory
  ): SjclExceptions = {
    val __obj = js.Dynamic.literal(bug = bug.asInstanceOf[js.Any], corrupt = corrupt.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], notReady = notReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclExceptions]
  }
  
  extension [Self <: SjclExceptions](x: Self) {
    
    inline def setBug(value: SjclExceptionFactory): Self = StObject.set(x, "bug", value.asInstanceOf[js.Any])
    
    inline def setCorrupt(value: SjclExceptionFactory): Self = StObject.set(x, "corrupt", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: SjclExceptionFactory): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setNotReady(value: SjclExceptionFactory): Self = StObject.set(x, "notReady", value.asInstanceOf[js.Any])
  }
}
