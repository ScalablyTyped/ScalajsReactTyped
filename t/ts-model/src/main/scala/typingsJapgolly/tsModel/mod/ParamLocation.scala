package typingsJapgolly.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParamLocation extends StObject
@JSImport("ts-model", "ParamLocation")
@js.native
object ParamLocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamLocation & Double] = js.native
  
  @js.native
  sealed trait BODY
    extends StObject
       with ParamLocation
  /* 1 */ val BODY: typingsJapgolly.tsModel.mod.ParamLocation.BODY & Double = js.native
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with ParamLocation
  /* 2 */ val OPTIONS: typingsJapgolly.tsModel.mod.ParamLocation.OPTIONS & Double = js.native
  
  @js.native
  sealed trait OTHER
    extends StObject
       with ParamLocation
  /* 3 */ val OTHER: typingsJapgolly.tsModel.mod.ParamLocation.OTHER & Double = js.native
  
  @js.native
  sealed trait URI
    extends StObject
       with ParamLocation
  /* 0 */ val URI: typingsJapgolly.tsModel.mod.ParamLocation.URI & Double = js.native
}
