package typingsJapgolly.angularCommon

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.angularCommon.anon.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesBemMod extends Shortcut {
  
  @JSImport("@angular/common/locales/bem", JSImport.Default)
  @js.native
  val default: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | USD
    ]
  ] = js.native
  
  type _To = js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | USD
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `localesBemMod.foo` */
  override def _to: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | USD
    ]
  ] = default
}
