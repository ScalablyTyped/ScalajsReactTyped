package typingsJapgolly.wixUiCore.distEsSrcMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiCore.anon.PickClearButtonPropschild
import typingsJapgolly.wixUiCore.anon.PickSigningPadPropschildr
import typingsJapgolly.wixUiCore.anon.PickTitlePropschildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src", "SignatureInput")
@js.native
open class SignatureInput protected ()
  extends typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputMod.SignatureInput {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: Any) = this()
}
/* static members */
object SignatureInput {
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput.ClearButton")
  @js.native
  def ClearButton: FunctionComponent[PickClearButtonPropschild] = js.native
  inline def ClearButton_=(x: FunctionComponent[PickClearButtonPropschild]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput.SigningPad")
  @js.native
  def SigningPad: FunctionComponent[PickSigningPadPropschildr] = js.native
  inline def SigningPad_=(x: FunctionComponent[PickSigningPadPropschildr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput.Title")
  @js.native
  def Title: FunctionComponent[PickTitlePropschildren] = js.native
  inline def Title_=(x: FunctionComponent[PickTitlePropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
