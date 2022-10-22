package typingsJapgolly.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timezone extends StObject {
  
  var timezone: js.UndefOr[String] = js.undefined
}
object Timezone {
  
  inline def apply(): Timezone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timezone]
  }
  
  extension [Self <: Timezone](x: Self) {
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
