package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoPresetTextEffect
import typingsJapgolly.activexOffice.Office.MsoPresetTextEffectShape
import typingsJapgolly.activexOffice.Office.MsoTextEffectAlignment
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TextEffectFormat")
@js.native
/* private */ open class TextEffectFormat ()
  extends StObject
     with typingsJapgolly.activexWord.Word.TextEffectFormat {
  
  /* CompleteClass */
  var Alignment: MsoTextEffectAlignment = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var FontBold: MsoTriState = js.native
  
  /* CompleteClass */
  var FontItalic: MsoTriState = js.native
  
  /* CompleteClass */
  var FontName: String = js.native
  
  /* CompleteClass */
  var FontSize: Double = js.native
  
  /* CompleteClass */
  var KernedPairs: MsoTriState = js.native
  
  /* CompleteClass */
  var NormalizedHeight: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PresetShape: MsoPresetTextEffectShape = js.native
  
  /* CompleteClass */
  var PresetTextEffect: MsoPresetTextEffect = js.native
  
  /* CompleteClass */
  var RotatedChars: MsoTriState = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* CompleteClass */
  override def ToggleVerticalText(): Unit = js.native
  
  /* CompleteClass */
  var Tracking: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.TextEffectFormat_typekey")
  var WordDotTextEffectFormat_typekey: typingsJapgolly.activexWord.Word.TextEffectFormat = js.native
}
