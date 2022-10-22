package typingsJapgolly.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpressionType extends StObject
@JSImport("@riotjs/dom-bindings", "ExpressionType")
@js.native
object ExpressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpressionType & Double] = js.native
  
  @js.native
  sealed trait ATTRIBUTE
    extends StObject
       with ExpressionType
  /* 0 */ val ATTRIBUTE: typingsJapgolly.riotjsDomBindings.mod.ExpressionType.ATTRIBUTE & Double = js.native
  
  @js.native
  sealed trait EVENT
    extends StObject
       with ExpressionType
  /* 1 */ val EVENT: typingsJapgolly.riotjsDomBindings.mod.ExpressionType.EVENT & Double = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with ExpressionType
  /* 2 */ val TEXT: typingsJapgolly.riotjsDomBindings.mod.ExpressionType.TEXT & Double = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with ExpressionType
  /* 3 */ val VALUE: typingsJapgolly.riotjsDomBindings.mod.ExpressionType.VALUE & Double = js.native
}
