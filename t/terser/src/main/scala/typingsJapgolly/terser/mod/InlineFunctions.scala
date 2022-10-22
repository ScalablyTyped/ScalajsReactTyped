package typingsJapgolly.terser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineFunctions extends StObject
@JSImport("terser", "InlineFunctions")
@js.native
object InlineFunctions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with InlineFunctions
  /* 0 */ val Disabled: typingsJapgolly.terser.mod.InlineFunctions.Disabled & Double = js.native
  
  @js.native
  sealed trait SimpleFunctions
    extends StObject
       with InlineFunctions
  /* 1 */ val SimpleFunctions: typingsJapgolly.terser.mod.InlineFunctions.SimpleFunctions & Double = js.native
  
  @js.native
  sealed trait WithArguments
    extends StObject
       with InlineFunctions
  /* 2 */ val WithArguments: typingsJapgolly.terser.mod.InlineFunctions.WithArguments & Double = js.native
  
  @js.native
  sealed trait WithArgumentsAndVariables
    extends StObject
       with InlineFunctions
  /* 3 */ val WithArgumentsAndVariables: typingsJapgolly.terser.mod.InlineFunctions.WithArgumentsAndVariables & Double = js.native
}
