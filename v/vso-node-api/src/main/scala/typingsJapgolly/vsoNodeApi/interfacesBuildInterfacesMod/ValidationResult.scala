package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ValidationResult
  /* 2 */ val Error: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.ValidationResult.Error & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with ValidationResult
  /* 0 */ val OK: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.ValidationResult.OK & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with ValidationResult
  /* 1 */ val Warning: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.ValidationResult.Warning & Double = js.native
}
