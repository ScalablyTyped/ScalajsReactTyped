package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.nextAuthInts.`2`
import typingsJapgolly.nextAuth.nextAuthInts.`3`
import typingsJapgolly.nextAuth.nextAuthInts.`4`
import typingsJapgolly.nextAuth.nextAuthInts.`5`
import typingsJapgolly.nextAuth.nextAuthInts.`6`
import typingsJapgolly.nextAuth.nextAuthInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform extends StObject {
  
  var platform: js.UndefOr[typingsJapgolly.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
}
object Platform {
  
  inline def apply(): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Platform]
  }
  
  extension [Self <: Platform](x: Self) {
    
    inline def setPlatform(value: typingsJapgolly.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
