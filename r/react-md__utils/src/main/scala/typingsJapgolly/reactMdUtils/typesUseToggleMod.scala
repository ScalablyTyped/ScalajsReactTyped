package typingsJapgolly.reactMdUtils

import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseToggleMod {
  
  @JSImport("@react-md/utils/types/useToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useToggle(defaultToggled: js.Function0[Boolean]): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  inline def useToggle(defaultToggled: Boolean): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useToggle")(defaultToggled.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  type Disable = js.Function0[Unit]
  
  type Enable = js.Function0[Unit]
  
  type ReturnValue = js.Tuple5[Boolean, Enable, Disable, Toggle, SetToggle]
  
  type SetToggle = Dispatch[SetStateAction[Boolean]]
  
  type Toggle = js.Function0[Unit]
}
