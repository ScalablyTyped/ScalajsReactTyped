package typingsJapgolly.ioredis

import typingsJapgolly.redisErrors.mod.AbortError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtErrorsMaxRetriesPerRequestErrorMod {
  
  @JSImport("ioredis/built/errors/MaxRetriesPerRequestError", JSImport.Default)
  @js.native
  open class default protected () extends MaxRetriesPerRequestError {
    def this(maxRetriesPerRequest: Double) = this()
  }
  
  @js.native
  trait MaxRetriesPerRequestError extends AbortError {
    
    @JSName("name")
    def name_MMaxRetriesPerRequestError: String = js.native
  }
}
