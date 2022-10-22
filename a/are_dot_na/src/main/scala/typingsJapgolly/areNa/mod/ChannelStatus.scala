package typingsJapgolly.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Can be "private" (only open for reading and adding to the channel by channel author and collaborators),
  * "closed" (open for reading by everyone, only channel author and collaborators can add) or "public"
  * (everyone can read and add to the channel)
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.areNa.areNaStrings.`private`
  - typingsJapgolly.areNa.areNaStrings.closed
  - typingsJapgolly.areNa.areNaStrings.open
*/
trait ChannelStatus extends StObject
object ChannelStatus {
  
  inline def closed: typingsJapgolly.areNa.areNaStrings.closed = "closed".asInstanceOf[typingsJapgolly.areNa.areNaStrings.closed]
  
  inline def open: typingsJapgolly.areNa.areNaStrings.open = "open".asInstanceOf[typingsJapgolly.areNa.areNaStrings.open]
  
  inline def `private`: typingsJapgolly.areNa.areNaStrings.`private` = "private".asInstanceOf[typingsJapgolly.areNa.areNaStrings.`private`]
}
