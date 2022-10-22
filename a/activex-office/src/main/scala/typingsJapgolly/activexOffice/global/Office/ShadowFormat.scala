package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoShadowStyle
import typingsJapgolly.activexOffice.Office.MsoShadowType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ShadowFormat")
@js.native
/* private */ open class ShadowFormat ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.ShadowFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Blur: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ForeColor: typingsJapgolly.activexOffice.Office.ColorFormat = js.native
  
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  var Obscured: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ShadowFormat_typekey")
  var OfficeDotShadowFormat_typekey: typingsJapgolly.activexOffice.Office.ShadowFormat = js.native
  
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
}
