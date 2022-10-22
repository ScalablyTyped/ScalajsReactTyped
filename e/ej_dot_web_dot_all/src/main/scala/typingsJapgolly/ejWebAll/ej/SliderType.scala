package typingsJapgolly.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SliderType extends StObject
@JSGlobal("ej.SliderType")
@js.native
object SliderType extends StObject {
  
  @js.native
  sealed trait Default
    extends StObject
       with SliderType
  
  @js.native
  sealed trait MinRange
    extends StObject
       with SliderType
  
  @js.native
  sealed trait Range
    extends StObject
       with SliderType
}
