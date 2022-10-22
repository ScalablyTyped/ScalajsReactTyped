package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.anon.PartialMultistepDialogPro
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogMultistepDialogMod.MultistepDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "MultistepDialog")
@js.native
open class MultistepDialog protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.MultistepDialog {
  def this(props: MultistepDialogProps) = this()
  def this(props: MultistepDialogProps, context: Any) = this()
}
/* static members */
object MultistepDialog {
  
  @JSImport("@blueprintjs/core", "MultistepDialog")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "MultistepDialog.defaultProps")
  @js.native
  def defaultProps: PartialMultistepDialogPro = js.native
  inline def defaultProps_=(x: PartialMultistepDialogPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MultistepDialog.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
