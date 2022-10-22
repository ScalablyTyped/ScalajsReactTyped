package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.Reflection
import typingsJapgolly.typedoc.distLibOutputEventsMod.PageEvent
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsToolbarMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toolbar(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toolbar")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
