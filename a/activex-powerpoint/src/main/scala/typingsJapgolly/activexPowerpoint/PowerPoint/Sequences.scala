package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequences extends StObject {
  
  /** @param number [Index=-1] */
  def Add(): Sequence = js.native
  def Add(Index: Double): Sequence = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Sequence = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Sequences_typekey")
  var PowerPointDotSequences_typekey: Sequences = js.native
}
