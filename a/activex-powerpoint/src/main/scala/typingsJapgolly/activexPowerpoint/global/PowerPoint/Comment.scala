package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Comment")
@js.native
/* private */ open class Comment ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Comment {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Author: String = js.native
  
  /* CompleteClass */
  override val AuthorIndex: Double = js.native
  
  /* CompleteClass */
  override val AuthorInitials: String = js.native
  
  /* CompleteClass */
  override val DateTime: VarDate = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Left: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Text: String = js.native
  
  /* CompleteClass */
  override val Top: Double = js.native
}
