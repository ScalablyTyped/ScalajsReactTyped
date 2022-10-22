package typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Theme extends StObject
@JSImport("wix-ui-core/dist/es/src/components/captcha/types", "Theme")
@js.native
object Theme extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Theme & String] = js.native
  
  @js.native
  sealed trait dark
    extends StObject
       with Theme
  /* "dark" */ val dark: typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Theme.dark & String = js.native
  
  @js.native
  sealed trait light
    extends StObject
       with Theme
  /* "light" */ val light: typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Theme.light & String = js.native
}
