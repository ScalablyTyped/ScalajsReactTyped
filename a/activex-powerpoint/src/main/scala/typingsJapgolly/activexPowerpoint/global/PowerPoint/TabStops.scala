package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexPowerpoint.PowerPoint.PpTabStopType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.TabStops")
@js.native
/* private */ open class TabStops ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.TabStops {
  
  /* CompleteClass */
  override def Add(Type: PpTabStopType, Position: Double): typingsJapgolly.activexPowerpoint.PowerPoint.TabStop = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  var DefaultSpacing: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typingsJapgolly.activexPowerpoint.PowerPoint.TabStop = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.TabStops = js.native
}
