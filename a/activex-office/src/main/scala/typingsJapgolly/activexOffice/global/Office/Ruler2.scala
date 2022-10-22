package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.RulerLevels2
import typingsJapgolly.activexOffice.Office.TabStops2
import typingsJapgolly.activexOffice.activexOfficeInts.`1`
import typingsJapgolly.activexOffice.activexOfficeInts.`2`
import typingsJapgolly.activexOffice.activexOfficeInts.`3`
import typingsJapgolly.activexOffice.activexOfficeInts.`4`
import typingsJapgolly.activexOffice.activexOfficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Ruler2")
@js.native
/* private */ open class Ruler2 ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.Ruler2 {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Levels(Index: `1` | `2` | `3` | `4` | `5`): typingsJapgolly.activexOffice.Office.RulerLevel2 = js.native
  /* CompleteClass */
  @JSName("Levels")
  override val Levels_Original: RulerLevels2 = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Ruler2_typekey")
  var OfficeDotRuler2_typekey: typingsJapgolly.activexOffice.Office.Ruler2 = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def TabStops(Index: Double): typingsJapgolly.activexOffice.Office.TabStop2 = js.native
  /* CompleteClass */
  @JSName("TabStops")
  override val TabStops_Original: TabStops2 = js.native
}
