package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpPrintColorType
import typingsJapgolly.activexPowerpoint.PowerPoint.PpPrintHandoutOrder
import typingsJapgolly.activexPowerpoint.PowerPoint.PpPrintOutputType
import typingsJapgolly.activexPowerpoint.PowerPoint.PpPrintRangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PrintOptions")
@js.native
/* private */ open class PrintOptions ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.PrintOptions {
  
  /* CompleteClass */
  var ActivePrinter: String = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Collate: MsoTriState = js.native
  
  /* CompleteClass */
  var FitToPage: MsoTriState = js.native
  
  /* CompleteClass */
  var FrameSlides: MsoTriState = js.native
  
  /* CompleteClass */
  var HandoutOrder: PpPrintHandoutOrder = js.native
  
  /* CompleteClass */
  var HighQuality: MsoTriState = js.native
  
  /* CompleteClass */
  var NumberOfCopies: Double = js.native
  
  /* CompleteClass */
  var OutputType: PpPrintOutputType = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.PrintOptions_typekey")
  var PowerPointDotPrintOptions_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /* CompleteClass */
  var PrintColorType: PpPrintColorType = js.native
  
  /* CompleteClass */
  var PrintComments: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintFontsAsGraphics: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintHiddenSlides: MsoTriState = js.native
  
  /* CompleteClass */
  var PrintInBackground: MsoTriState = js.native
  
  /* CompleteClass */
  var RangeType: PpPrintRangeType = js.native
  
  /* CompleteClass */
  override val Ranges: typingsJapgolly.activexPowerpoint.PowerPoint.PrintRanges = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  var sectionIndex: Double = js.native
}
