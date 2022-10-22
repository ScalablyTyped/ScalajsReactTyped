package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoColorType
import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoThemeColorIndex
import typingsJapgolly.activexPowerpoint.PowerPoint.PpColorSchemeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ColorFormat")
@js.native
/* private */ open class ColorFormat ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.ColorFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  var RGB: MsoRGBType = js.native
  
  /* CompleteClass */
  var SchemeColor: PpColorSchemeIndex = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}
