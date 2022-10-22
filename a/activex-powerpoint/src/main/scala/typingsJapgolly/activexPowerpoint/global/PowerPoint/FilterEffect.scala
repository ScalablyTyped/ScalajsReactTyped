package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimFilterEffectSubtype
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimFilterEffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.FilterEffect")
@js.native
/* private */ open class FilterEffect ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.FilterEffect {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.FilterEffect = js.native
  
  /* CompleteClass */
  var Reveal: MsoTriState = js.native
  
  /* CompleteClass */
  var Subtype: MsoAnimFilterEffectSubtype = js.native
  
  /* CompleteClass */
  var Type: MsoAnimFilterEffectType = js.native
}
