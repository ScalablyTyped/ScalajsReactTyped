package typingsJapgolly.timezonecomplete

import typingsJapgolly.timezonecomplete.distLibPeriodMod.PeriodDstJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezonecompleteStrings {
  
  @js.native
  sealed trait local
    extends StObject
       with PeriodDstJson
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait regular
    extends StObject
       with PeriodDstJson
  inline def regular: regular = "regular".asInstanceOf[regular]
}
