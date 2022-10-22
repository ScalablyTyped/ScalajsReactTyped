package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typingsJapgolly.react.mod.DeprecatedLifecycle because Already inherited
- typingsJapgolly.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typingsJapgolly.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofill because Already inherited
- typingsJapgolly.react.mod.Component because Already inherited
- typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillMod.Autofill because Already inherited
- typingsJapgolly.officeUiFabricReact.libComponentsPickersAutoFillBaseAutoFillMod.Autofill because Inheritance from two classes. Inlined 
- typingsJapgolly.officeUiFabricReact.libComponentsPickersMod.Autofill because Inheritance from two classes. Inlined 
- typingsJapgolly.officeUiFabricReact.libPickersMod.Autofill because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "Autofill")
@js.native
open class Autofill protected ()
  extends typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill {
  def this(props: IAutofillProps) = this()
}
/* static members */
object Autofill {
  
  @JSImport("office-ui-fabric-react", "Autofill")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Autofill.defaultProps")
  @js.native
  def defaultProps: EnableAutofillOnKeyPress = js.native
  inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
