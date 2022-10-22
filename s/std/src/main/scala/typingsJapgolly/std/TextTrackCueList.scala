package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackCueList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.TextTrackCue] {
  
  /**
    * Returns the first text track cue (in text track cue order) with text track cue identifier id.
    *
    * Returns null if none of the cues have the given identifier or if the argument is the empty string.
    */
  /* standard dom */
  def getCueById(id: java.lang.String): org.scalajs.dom.TextTrackCue | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.TextTrackCue]] = js.native
  
  /** Returns the number of cues in the list. */
  /* standard dom */
  val length: Double = js.native
}
