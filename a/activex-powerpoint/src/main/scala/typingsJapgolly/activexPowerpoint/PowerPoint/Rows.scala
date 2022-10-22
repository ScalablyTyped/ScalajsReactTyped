package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rows extends StObject {
  
  /** @param number [BeforeRow=-1] */
  def Add(): Row = js.native
  def Add(BeforeRow: Double): Row = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): Row = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Rows_typekey")
  var PowerPointDotRows_typekey: Rows = js.native
}
