package typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepKeywordType extends StObject
@JSImport("@cucumber/messages/dist/cjs/src/messages", "StepKeywordType")
@js.native
object StepKeywordType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepKeywordType & String] = js.native
  
  @js.native
  sealed trait ACTION
    extends StObject
       with StepKeywordType
  /* "Action" */ val ACTION: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.ACTION & String = js.native
  
  @js.native
  sealed trait CONJUNCTION
    extends StObject
       with StepKeywordType
  /* "Conjunction" */ val CONJUNCTION: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.CONJUNCTION & String = js.native
  
  @js.native
  sealed trait CONTEXT
    extends StObject
       with StepKeywordType
  /* "Context" */ val CONTEXT: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.CONTEXT & String = js.native
  
  @js.native
  sealed trait OUTCOME
    extends StObject
       with StepKeywordType
  /* "Outcome" */ val OUTCOME: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.OUTCOME & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with StepKeywordType
  /* "Unknown" */ val UNKNOWN: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.StepKeywordType.UNKNOWN & String = js.native
}
