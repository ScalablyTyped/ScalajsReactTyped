package typingsJapgolly.blueprintjsCore.mod

import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsButtonAbstractButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "AnchorButton")
@js.native
open class AnchorButton protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.AnchorButton {
  def this(props: ButtonProps[HTMLAnchorElement] & (/* import warning: importer.ImportType#apply Failed type conversion: std.HTMLAnchorElement extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any)) = this()
  def this(
    props: ButtonProps[HTMLAnchorElement] & (/* import warning: importer.ImportType#apply Failed type conversion: std.HTMLAnchorElement extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any),
    context: Any
  ) = this()
}
/* static members */
object AnchorButton {
  
  @JSImport("@blueprintjs/core", "AnchorButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "AnchorButton.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
