package typingsJapgolly.angularCommon

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.angularCommon.anon.ISK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesDaMod extends Shortcut {
  
  @JSImport("@angular/common/locales/da", JSImport.Default)
  @js.native
  val default: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | ISK
    ]
  ] = js.native
  
  type _To = js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | ISK
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `localesDaMod.foo` */
  override def _to: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | ISK
    ]
  ] = default
}
