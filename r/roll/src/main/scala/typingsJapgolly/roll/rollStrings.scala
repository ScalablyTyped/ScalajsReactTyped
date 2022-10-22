package typingsJapgolly.roll

import typingsJapgolly.roll.mod.RollTransformationKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollStrings {
  
  @js.native
  sealed trait InvalidInputError extends StObject
  inline def InvalidInputError: InvalidInputError = "InvalidInputError".asInstanceOf[InvalidInputError]
  
  @js.native
  sealed trait add
    extends StObject
       with RollTransformationKey
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait `best-of`
    extends StObject
       with RollTransformationKey
  inline def `best-of`: `best-of` = "best-of".asInstanceOf[`best-of`]
  
  @js.native
  sealed trait divide
    extends StObject
       with RollTransformationKey
  inline def divide: divide = "divide".asInstanceOf[divide]
  
  @js.native
  sealed trait multiply
    extends StObject
       with RollTransformationKey
  inline def multiply: multiply = "multiply".asInstanceOf[multiply]
  
  @js.native
  sealed trait subtract
    extends StObject
       with RollTransformationKey
  inline def subtract: subtract = "subtract".asInstanceOf[subtract]
  
  @js.native
  sealed trait sum
    extends StObject
       with RollTransformationKey
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait `worst-of`
    extends StObject
       with RollTransformationKey
  inline def `worst-of`: `worst-of` = "worst-of".asInstanceOf[`worst-of`]
}
