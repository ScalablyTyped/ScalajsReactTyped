package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import typingsJapgolly.blueprintjsCore.anon.PartialTextProps
import typingsJapgolly.blueprintjsCore.anon.TextPropsOmitHTMLAttribut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Text")
@js.native
open class Text protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsTextTextMod.Text {
  def this(props: TextPropsOmitHTMLAttribut) = this()
  def this(props: TextPropsOmitHTMLAttribut, context: Any) = this()
}
/* static members */
object Text {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Text.defaultProps")
  @js.native
  def defaultProps: PartialTextProps = js.native
  inline def defaultProps_=(x: PartialTextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Text.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
