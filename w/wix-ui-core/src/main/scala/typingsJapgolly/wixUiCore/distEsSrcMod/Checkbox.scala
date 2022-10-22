package typingsJapgolly.wixUiCore.distEsSrcMod

import typingsJapgolly.wixUiCore.anon.PartialCheckboxProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsCheckboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src", "Checkbox")
@js.native
open class Checkbox protected ()
  extends typingsJapgolly.wixUiCore.distEsSrcComponentsCheckboxMod.Checkbox {
  def this(props: CheckboxProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CheckboxProps, context: Any) = this()
}
/* static members */
object Checkbox {
  
  @JSImport("wix-ui-core/dist/es/src", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src", "Checkbox.defaultProps")
  @js.native
  def defaultProps: PartialCheckboxProps = js.native
  inline def defaultProps_=(x: PartialCheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/es/src", "Checkbox.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
