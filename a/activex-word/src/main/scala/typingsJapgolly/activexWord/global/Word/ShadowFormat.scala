package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoShadowStyle
import typingsJapgolly.activexOffice.Office.MsoShadowType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ShadowFormat")
@js.native
/* private */ open class ShadowFormat ()
  extends StObject
     with typingsJapgolly.activexWord.Word.ShadowFormat {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Blur: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val ForeColor: typingsJapgolly.activexWord.Word.ColorFormat = js.native
  
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  var Obscured: MsoTriState = js.native
  
  /* CompleteClass */
  var OffsetX: Double = js.native
  
  /* CompleteClass */
  var OffsetY: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var RotateWithShape: MsoTriState = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
  
  /* CompleteClass */
  var Style: MsoShadowStyle = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  var Type: MsoShadowType = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: typingsJapgolly.activexWord.Word.ShadowFormat = js.native
}
