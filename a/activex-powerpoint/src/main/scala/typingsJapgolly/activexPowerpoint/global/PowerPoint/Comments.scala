package typingsJapgolly.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Comments")
@js.native
/* private */ open class Comments ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Comments {
  
  /* CompleteClass */
  override def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): typingsJapgolly.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typingsJapgolly.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Comments = js.native
}
