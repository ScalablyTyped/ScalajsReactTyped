package typingsJapgolly.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlign extends StObject
@JSGlobal("ej.TextAlign")
@js.native
object TextAlign extends StObject {
  
  //string
  @js.native
  sealed trait Center
    extends StObject
       with TextAlign
  
  //string
  @js.native
  sealed trait Justify
    extends StObject
       with TextAlign
  
  //string
  @js.native
  sealed trait Left
    extends StObject
       with TextAlign
  
  //string
  @js.native
  sealed trait Right
    extends StObject
       with TextAlign
}
