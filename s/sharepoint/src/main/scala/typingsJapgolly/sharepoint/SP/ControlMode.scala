package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlMode extends StObject
/** Represents display mode for a control or form */
@JSGlobal("SP.ControlMode")
@js.native
object ControlMode extends StObject {
  
  @js.native
  sealed trait displayMode
    extends StObject
       with ControlMode
  
  @js.native
  sealed trait editMode
    extends StObject
       with ControlMode
  
  @js.native
  sealed trait invalid
    extends StObject
       with ControlMode
  
  @js.native
  sealed trait newMode
    extends StObject
       with ControlMode
}
