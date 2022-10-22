package typingsJapgolly.adhan

import typingsJapgolly.adhan.adhanInts.`1`
import typingsJapgolly.adhan.adhanInts.`2`
import typingsJapgolly.adhan.adhanStrings.hanafi
import typingsJapgolly.adhan.adhanStrings.shafi
import typingsJapgolly.adhan.anon.Hanafi
import typingsJapgolly.adhan.libTypesTypeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMadhabMod {
  
  @JSImport("adhan/lib/types/Madhab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Madhab {
    
    @JSImport("adhan/lib/types/Madhab", "Madhab.Hanafi")
    @js.native
    val Hanafi: hanafi = js.native
    
    @JSImport("adhan/lib/types/Madhab", "Madhab.Shafi")
    @js.native
    val Shafi: shafi = js.native
  }
  
  inline def shadowLength(madhab: ValueOf[Hanafi]): `1` | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("shadowLength")(madhab.asInstanceOf[js.Any]).asInstanceOf[`1` | `2`]
}
