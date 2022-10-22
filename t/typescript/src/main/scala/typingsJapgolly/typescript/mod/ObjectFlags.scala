package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectFlags extends StObject
@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags & Double] = js.native
  
  @js.native
  sealed trait Anonymous
    extends StObject
       with ObjectFlags
  /* 16 */ val Anonymous: typingsJapgolly.typescript.mod.ObjectFlags.Anonymous & Double = js.native
  
  @js.native
  sealed trait ArrayLiteral
    extends StObject
       with ObjectFlags
  /* 16384 */ val ArrayLiteral: typingsJapgolly.typescript.mod.ObjectFlags.ArrayLiteral & Double = js.native
  
  @js.native
  sealed trait Class
    extends StObject
       with ObjectFlags
  /* 1 */ val Class: typingsJapgolly.typescript.mod.ObjectFlags.Class & Double = js.native
  
  @js.native
  sealed trait ClassOrInterface
    extends StObject
       with ObjectFlags
  /* 3 */ val ClassOrInterface: typingsJapgolly.typescript.mod.ObjectFlags.ClassOrInterface & Double = js.native
  
  @js.native
  sealed trait ContainsSpread
    extends StObject
       with ObjectFlags
  /* 2097152 */ val ContainsSpread: typingsJapgolly.typescript.mod.ObjectFlags.ContainsSpread & Double = js.native
  
  @js.native
  sealed trait EvolvingArray
    extends StObject
       with ObjectFlags
  /* 256 */ val EvolvingArray: typingsJapgolly.typescript.mod.ObjectFlags.EvolvingArray & Double = js.native
  
  @js.native
  sealed trait FreshLiteral
    extends StObject
       with ObjectFlags
  /* 8192 */ val FreshLiteral: typingsJapgolly.typescript.mod.ObjectFlags.FreshLiteral & Double = js.native
  
  @js.native
  sealed trait Instantiated
    extends StObject
       with ObjectFlags
  /* 64 */ val Instantiated: typingsJapgolly.typescript.mod.ObjectFlags.Instantiated & Double = js.native
  
  @js.native
  sealed trait InstantiationExpressionType
    extends StObject
       with ObjectFlags
  /* 8388608 */ val InstantiationExpressionType: typingsJapgolly.typescript.mod.ObjectFlags.InstantiationExpressionType & Double = js.native
  
  @js.native
  sealed trait Interface
    extends StObject
       with ObjectFlags
  /* 2 */ val Interface: typingsJapgolly.typescript.mod.ObjectFlags.Interface & Double = js.native
  
  @js.native
  sealed trait JSLiteral
    extends StObject
       with ObjectFlags
  /* 4096 */ val JSLiteral: typingsJapgolly.typescript.mod.ObjectFlags.JSLiteral & Double = js.native
  
  @js.native
  sealed trait JsxAttributes
    extends StObject
       with ObjectFlags
  /* 2048 */ val JsxAttributes: typingsJapgolly.typescript.mod.ObjectFlags.JsxAttributes & Double = js.native
  
  @js.native
  sealed trait Mapped
    extends StObject
       with ObjectFlags
  /* 32 */ val Mapped: typingsJapgolly.typescript.mod.ObjectFlags.Mapped & Double = js.native
  
  @js.native
  sealed trait ObjectLiteral
    extends StObject
       with ObjectFlags
  /* 128 */ val ObjectLiteral: typingsJapgolly.typescript.mod.ObjectFlags.ObjectLiteral & Double = js.native
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties
    extends StObject
       with ObjectFlags
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: typingsJapgolly.typescript.mod.ObjectFlags.ObjectLiteralPatternWithComputedProperties & Double = js.native
  
  @js.native
  sealed trait ObjectRestType
    extends StObject
       with ObjectFlags
  /* 4194304 */ val ObjectRestType: typingsJapgolly.typescript.mod.ObjectFlags.ObjectRestType & Double = js.native
  
  @js.native
  sealed trait Reference
    extends StObject
       with ObjectFlags
  /* 4 */ val Reference: typingsJapgolly.typescript.mod.ObjectFlags.Reference & Double = js.native
  
  @js.native
  sealed trait ReverseMapped
    extends StObject
       with ObjectFlags
  /* 1024 */ val ReverseMapped: typingsJapgolly.typescript.mod.ObjectFlags.ReverseMapped & Double = js.native
  
  @js.native
  sealed trait Tuple
    extends StObject
       with ObjectFlags
  /* 8 */ val Tuple: typingsJapgolly.typescript.mod.ObjectFlags.Tuple & Double = js.native
}
