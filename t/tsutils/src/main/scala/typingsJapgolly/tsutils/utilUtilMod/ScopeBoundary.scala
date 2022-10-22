package typingsJapgolly.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScopeBoundary extends StObject
@JSImport("tsutils/util/util", "ScopeBoundary")
@js.native
object ScopeBoundary extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundary & Double] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with ScopeBoundary
  /* 2 */ val Block: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Block & Double = js.native
  
  @js.native
  sealed trait ConditionalType
    extends StObject
       with ScopeBoundary
  /* 8 */ val ConditionalType: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.ConditionalType & Double = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with ScopeBoundary
  /* 1 */ val Function: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Function & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ScopeBoundary
  /* 0 */ val None: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.None & Double = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with ScopeBoundary
  /* 4 */ val Type: typingsJapgolly.tsutils.utilUtilMod.ScopeBoundary.Type & Double = js.native
}
