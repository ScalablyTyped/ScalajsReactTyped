package typingsJapgolly.baseui

import typingsJapgolly.baseui.inputTypesMod.BaseInputProps
import typingsJapgolly.baseui.inputTypesMod.InputProps
import typingsJapgolly.baseui.inputTypesMod.InternalState
import typingsJapgolly.baseui.inputTypesMod.SharedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUtilsMod {
  
  @JSImport("baseui/input/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSharedProps[T](props: BaseInputProps[T], state: InternalState): SharedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SharedProps]
  inline def getSharedProps[T](props: InputProps, state: InternalState): SharedProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SharedProps]
}
