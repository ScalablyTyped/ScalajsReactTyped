package typingsJapgolly.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeKind extends StObject
@JSGlobal("Srch.DateTimeKind")
@js.native
object DateTimeKind extends StObject {
  
  @js.native
  sealed trait local
    extends StObject
       with DateTimeKind
  
  @js.native
  sealed trait unspecified
    extends StObject
       with DateTimeKind
  
  @js.native
  sealed trait utc
    extends StObject
       with DateTimeKind
}
