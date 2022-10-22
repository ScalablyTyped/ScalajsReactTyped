package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsControlsMod.CheckboxProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsControlsMod.ICheckboxState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Checkbox")
@js.native
open class Checkbox protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsFormsControlsMod.Checkbox {
  def this(props: CheckboxProps) = this()
  def this(props: CheckboxProps, context: Any) = this()
}
/* static members */
object Checkbox {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Checkbox.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(hasIndeterminate: CheckboxProps): ICheckboxState | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasIndeterminate.asInstanceOf[js.Any]).asInstanceOf[ICheckboxState | Null]
}
