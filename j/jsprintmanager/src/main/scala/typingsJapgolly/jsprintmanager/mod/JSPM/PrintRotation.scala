package typingsJapgolly.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintRotation extends StObject
@JSImport("jsprintmanager", "JSPM.PrintRotation")
@js.native
object PrintRotation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintRotation & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with PrintRotation
  /* 3 */ val None: typingsJapgolly.jsprintmanager.mod.JSPM.PrintRotation.None & Double = js.native
  
  @js.native
  sealed trait Rot180
    extends StObject
       with PrintRotation
  /* 6 */ val Rot180: typingsJapgolly.jsprintmanager.mod.JSPM.PrintRotation.Rot180 & Double = js.native
  
  @js.native
  sealed trait Rot270
    extends StObject
       with PrintRotation
  /* 4 */ val Rot270: typingsJapgolly.jsprintmanager.mod.JSPM.PrintRotation.Rot270 & Double = js.native
  
  @js.native
  sealed trait Rot90
    extends StObject
       with PrintRotation
  /* 5 */ val Rot90: typingsJapgolly.jsprintmanager.mod.JSPM.PrintRotation.Rot90 & Double = js.native
}
