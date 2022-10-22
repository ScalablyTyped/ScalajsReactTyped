package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypePredicateKind extends StObject
@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind & Double] = js.native
  
  @js.native
  sealed trait AssertsIdentifier
    extends StObject
       with TypePredicateKind
  /* 3 */ val AssertsIdentifier: typingsJapgolly.typescript.mod.TypePredicateKind.AssertsIdentifier & Double = js.native
  
  @js.native
  sealed trait AssertsThis
    extends StObject
       with TypePredicateKind
  /* 2 */ val AssertsThis: typingsJapgolly.typescript.mod.TypePredicateKind.AssertsThis & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TypePredicateKind
  /* 1 */ val Identifier: typingsJapgolly.typescript.mod.TypePredicateKind.Identifier & Double = js.native
  
  @js.native
  sealed trait This
    extends StObject
       with TypePredicateKind
  /* 0 */ val This: typingsJapgolly.typescript.mod.TypePredicateKind.This & Double = js.native
}
