package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitHint extends StObject
@JSImport("typescript", "EmitHint")
@js.native
object EmitHint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitHint & Double] = js.native
  
  @js.native
  sealed trait EmbeddedStatement
    extends StObject
       with EmitHint
  /* 5 */ val EmbeddedStatement: typingsJapgolly.typescript.mod.EmitHint.EmbeddedStatement & Double = js.native
  
  @js.native
  sealed trait Expression
    extends StObject
       with EmitHint
  /* 1 */ val Expression: typingsJapgolly.typescript.mod.EmitHint.Expression & Double = js.native
  
  @js.native
  sealed trait IdentifierName
    extends StObject
       with EmitHint
  /* 2 */ val IdentifierName: typingsJapgolly.typescript.mod.EmitHint.IdentifierName & Double = js.native
  
  @js.native
  sealed trait JsxAttributeValue
    extends StObject
       with EmitHint
  /* 6 */ val JsxAttributeValue: typingsJapgolly.typescript.mod.EmitHint.JsxAttributeValue & Double = js.native
  
  @js.native
  sealed trait MappedTypeParameter
    extends StObject
       with EmitHint
  /* 3 */ val MappedTypeParameter: typingsJapgolly.typescript.mod.EmitHint.MappedTypeParameter & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with EmitHint
  /* 0 */ val SourceFile: typingsJapgolly.typescript.mod.EmitHint.SourceFile & Double = js.native
  
  @js.native
  sealed trait Unspecified
    extends StObject
       with EmitHint
  /* 4 */ val Unspecified: typingsJapgolly.typescript.mod.EmitHint.Unspecified & Double = js.native
}
