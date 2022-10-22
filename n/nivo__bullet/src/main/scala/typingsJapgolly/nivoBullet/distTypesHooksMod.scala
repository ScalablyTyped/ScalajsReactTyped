package typingsJapgolly.nivoBullet

import typingsJapgolly.nivoBullet.anon.Id
import typingsJapgolly.nivoBullet.anon.PickCommonBulletPropslayo
import typingsJapgolly.nivoBullet.distTypesTypesMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/bullet/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEnhancedData(data: js.Array[Datum], hasLayoutMaxValueMinValueReverseHeightWidth: PickCommonBulletPropslayo): js.Array[Id] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEnhancedData")(data.asInstanceOf[js.Any], hasLayoutMaxValueMinValueReverseHeightWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Id]]
}
