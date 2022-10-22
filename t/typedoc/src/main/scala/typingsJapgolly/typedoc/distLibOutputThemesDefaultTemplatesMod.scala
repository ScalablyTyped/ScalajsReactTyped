package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import typingsJapgolly.typedoc.distLibOutputEventsMod.PageEvent
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultTemplatesMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indexTemplate(hasMarkdown: DefaultThemeRenderContext, props: PageEvent[ProjectReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("indexTemplate")(hasMarkdown.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
