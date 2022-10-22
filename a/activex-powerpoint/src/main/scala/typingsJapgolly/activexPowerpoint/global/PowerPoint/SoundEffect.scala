package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexPowerpoint.PowerPoint.PpSoundEffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SoundEffect")
@js.native
/* private */ open class SoundEffect ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.SoundEffect {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def ImportFromFile(FileName: String): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Play(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var Type: PpSoundEffectType = js.native
}
