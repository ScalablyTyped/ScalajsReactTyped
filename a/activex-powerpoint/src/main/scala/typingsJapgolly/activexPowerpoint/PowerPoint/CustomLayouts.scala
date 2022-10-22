package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayouts extends StObject {
  
  def Add(Index: Double): CustomLayout = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): CustomLayout = js.native
  
  val Parent: Any = js.native
  
  /** @param number [Index=-1] */
  def Paste(): CustomLayout = js.native
  def Paste(Index: Double): CustomLayout = js.native
  
  /* private */ @JSName("PowerPoint.CustomLayouts_typekey")
  var PowerPointDotCustomLayouts_typekey: CustomLayouts = js.native
}
