package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.meteor.meteorStrings.close
import typingsJapgolly.meteor.meteorStrings.data
import typingsJapgolly.meteor.meteorStrings.end
import typingsJapgolly.meteor.meteorStrings.error
import typingsJapgolly.meteor.meteorStrings.file
import typingsJapgolly.mongodb.mod.GridFSBucketReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGridFSBucketReadStr
  extends StObject
     with Instantiable0[GridFSBucketReadStream] {
  
  /**
    * Fired when the stream is exhausted and the underlying cursor is killed
    * @event
    */
  val CLOSE: close = js.native
  
  /**
    * Emitted when a chunk of data is available to be consumed.
    * @event
    */
  val DATA: data = js.native
  
  /**
    * Fired when the stream is exhausted (no more data events).
    * @event
    */
  val END: end = js.native
  
  /* Excluded from this release type: s */
  /**
    * An error occurred
    * @event
    */
  val ERROR: error = js.native
  
  /**
    * Fires when the stream loaded the file document corresponding to the provided id.
    * @event
    */
  val FILE: file = js.native
}
