package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OuterExpressionKinds extends StObject
@JSImport("typescript", "OuterExpressionKinds")
@js.native
object OuterExpressionKinds extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterExpressionKinds & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with OuterExpressionKinds
  /* 15 */ val All: typingsJapgolly.typescript.mod.OuterExpressionKinds.All & Double = js.native
  
  @js.native
  sealed trait Assertions
    extends StObject
       with OuterExpressionKinds
  /* 6 */ val Assertions: typingsJapgolly.typescript.mod.OuterExpressionKinds.Assertions & Double = js.native
  
  @js.native
  sealed trait ExcludeJSDocTypeAssertion
    extends StObject
       with OuterExpressionKinds
  /* 16 */ val ExcludeJSDocTypeAssertion: typingsJapgolly.typescript.mod.OuterExpressionKinds.ExcludeJSDocTypeAssertion & Double = js.native
  
  @js.native
  sealed trait NonNullAssertions
    extends StObject
       with OuterExpressionKinds
  /* 4 */ val NonNullAssertions: typingsJapgolly.typescript.mod.OuterExpressionKinds.NonNullAssertions & Double = js.native
  
  @js.native
  sealed trait Parentheses
    extends StObject
       with OuterExpressionKinds
  /* 1 */ val Parentheses: typingsJapgolly.typescript.mod.OuterExpressionKinds.Parentheses & Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpressions
    extends StObject
       with OuterExpressionKinds
  /* 8 */ val PartiallyEmittedExpressions: typingsJapgolly.typescript.mod.OuterExpressionKinds.PartiallyEmittedExpressions & Double = js.native
  
  @js.native
  sealed trait TypeAssertions
    extends StObject
       with OuterExpressionKinds
  /* 2 */ val TypeAssertions: typingsJapgolly.typescript.mod.OuterExpressionKinds.TypeAssertions & Double = js.native
}
