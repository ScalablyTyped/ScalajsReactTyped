package typingsJapgolly.hellosignSdk.anon

import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`DD - MM - YYYY`
import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`DD Slash MM Slash YYYY`
import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`MM - DD - YYYY`
import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`MM Slash DD Slash YYYY`
import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`YYYY - MM - DD`
import typingsJapgolly.hellosignSdk.hellosignSdkStrings.`YYYY Slash MM Slash DD`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dateformat extends StObject {
  
  var date_format: (`MM Slash DD Slash YYYY`) | (`MM - DD - YYYY`) | (`DD Slash MM Slash YYYY`) | (`DD - MM - YYYY`) | (`YYYY Slash MM Slash DD`) | (`YYYY - MM - DD`)
}
object Dateformat {
  
  inline def apply(
    date_format: (`MM Slash DD Slash YYYY`) | (`MM - DD - YYYY`) | (`DD Slash MM Slash YYYY`) | (`DD - MM - YYYY`) | (`YYYY Slash MM Slash DD`) | (`YYYY - MM - DD`)
  ): Dateformat = {
    val __obj = js.Dynamic.literal(date_format = date_format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dateformat]
  }
  
  extension [Self <: Dateformat](x: Self) {
    
    inline def setDate_format(
      value: (`MM Slash DD Slash YYYY`) | (`MM - DD - YYYY`) | (`DD Slash MM Slash YYYY`) | (`DD - MM - YYYY`) | (`YYYY Slash MM Slash DD`) | (`YYYY - MM - DD`)
    ): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
  }
}
