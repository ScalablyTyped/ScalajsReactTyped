package typingsJapgolly.imapflow.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxLockObject extends StObject {
  
  var path: String
  
  def release(): Unit
}
object MailboxLockObject {
  
  inline def apply(path: String, release: Callback): MailboxLockObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], release = release.toJsFn)
    __obj.asInstanceOf[MailboxLockObject]
  }
  
  extension [Self <: MailboxLockObject](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
  }
}
