package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexOffice.Office.MsoPictureColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PictureFormat")
@js.native
/* private */ open class PictureFormat ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.PictureFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  var ColorType: MsoPictureColorType = js.native
  
  /* CompleteClass */
  var Contrast: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Crop: typingsJapgolly.activexOffice.Office.Crop = js.native
  
  /* CompleteClass */
  var CropBottom: Double = js.native
  
  /* CompleteClass */
  var CropLeft: Double = js.native
  
  /* CompleteClass */
  var CropRight: Double = js.native
  
  /* CompleteClass */
  var CropTop: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PictureFormat_typekey")
  var ExcelDotPictureFormat_typekey: typingsJapgolly.activexExcel.Excel.PictureFormat = js.native
  
  /* CompleteClass */
  override def IncrementBrightness(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementContrast(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var TransparencyColor: MsoRGBType = js.native
  
  /* CompleteClass */
  var TransparentBackground: MsoTriState = js.native
}
