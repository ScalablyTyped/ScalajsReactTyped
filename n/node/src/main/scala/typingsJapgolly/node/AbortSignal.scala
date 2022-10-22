package typingsJapgolly.node

import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
@js.native
trait AbortSignal
  extends StObject
     with EventTarget {
  
  /**
    * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
    */
  val aborted: Boolean = js.native
}
