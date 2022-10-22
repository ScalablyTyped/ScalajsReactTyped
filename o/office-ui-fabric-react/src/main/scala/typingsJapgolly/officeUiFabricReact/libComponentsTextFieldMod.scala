package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.IMaskedTextFieldProps
import typingsJapgolly.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldProps
import typingsJapgolly.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsTextFieldTextFieldDottypesMod.ITextFieldStyles
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextFieldMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "DEFAULT_MASK_CHAR")
  @js.native
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField")
  @js.native
  open class MaskedTextField protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsTextFieldMaskedTextFieldMaskedTextFieldMod.MaskedTextField {
    def this(props: IMaskedTextFieldProps) = this()
  }
  /* static members */
  object MaskedTextField {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField.defaultProps")
    @js.native
    def defaultProps: IMaskedTextFieldProps = js.native
    inline def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "TextField")
  @js.native
  val TextField: FunctionComponent[ITextFieldProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase")
  @js.native
  open class TextFieldBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsTextFieldTextFieldDotbaseMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  /* static members */
  object TextFieldBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase.defaultProps")
    @js.native
    def defaultProps: ITextFieldProps = js.native
    inline def defaultProps_=(x: ITextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getTextFieldStyles(props: ITextFieldStyleProps): ITextFieldStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITextFieldStyles]
}
