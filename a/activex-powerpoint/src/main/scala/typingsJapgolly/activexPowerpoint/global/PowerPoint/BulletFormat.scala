package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpBulletType
import typingsJapgolly.activexPowerpoint.PowerPoint.PpNumberedBulletStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.BulletFormat")
@js.native
/* private */ open class BulletFormat ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.BulletFormat {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Character: Double = js.native
  
  /* CompleteClass */
  override val Font: typingsJapgolly.activexPowerpoint.PowerPoint.Font = js.native
  
  /* CompleteClass */
  override val Number: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Picture(Picture: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.BulletFormat = js.native
  
  /* CompleteClass */
  var RelativeSize: Double = js.native
  
  /* CompleteClass */
  var StartValue: Double = js.native
  
  /* CompleteClass */
  var Style: PpNumberedBulletStyle = js.native
  
  /* CompleteClass */
  var Type: PpBulletType = js.native
  
  /* CompleteClass */
  var UseTextColor: MsoTriState = js.native
  
  /* CompleteClass */
  var UseTextFont: MsoTriState = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
