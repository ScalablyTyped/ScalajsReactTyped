package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "FloatingHelper")
@js.native
open class FloatingHelper ()
  extends typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.default
/* static members */
object FloatingHelper {
  
  @JSImport("wix-style-react", "FloatingHelper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "FloatingHelper.Content")
  @js.native
  def Content: ComponentClassP[FloatingHelperContentProps & js.Object] = js.native
  inline def Content_=(x: ComponentClassP[FloatingHelperContentProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
}
