package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.bson.mod.Document
import typingsJapgolly.meteor.meteorStrings.change
import typingsJapgolly.meteor.meteorStrings.close
import typingsJapgolly.meteor.meteorStrings.end
import typingsJapgolly.meteor.meteorStrings.error
import typingsJapgolly.meteor.meteorStrings.init
import typingsJapgolly.meteor.meteorStrings.more
import typingsJapgolly.meteor.meteorStrings.response
import typingsJapgolly.meteor.meteorStrings.resumeTokenChanged
import typingsJapgolly.mongodb.mod.ChangeStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofChangeStream
  extends StObject
     with Instantiable0[ChangeStream[Document, Document]] {
  
  /**
    * Fired for each new matching change in the specified namespace. Attaching a `change`
    * event listener to a Change Stream will switch the stream into flowing mode. Data will
    * then be passed as soon as it is available.
    * @event
    */
  val CHANGE: change = js.native
  
  /** @event */
  val CLOSE: close = js.native
  
  /** @event */
  val END: end = js.native
  
  /** @event */
  val ERROR: error = js.native
  
  /** @event */
  val INIT: init = js.native
  
  /** @event */
  val MORE: more = js.native
  
  /* Excluded from this release type: [kCursorStream] */
  /* Excluded from this release type: [kClosed] */
  /* Excluded from this release type: [kMode] */
  /** @event */
  val RESPONSE: response = js.native
  
  /**
    * Emitted each time the change stream stores a new resume token.
    * @event
    */
  val RESUME_TOKEN_CHANGED: resumeTokenChanged = js.native
}
