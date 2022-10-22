package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.ContainerReflection
import typingsJapgolly.typedoc.distLibOutputEventsMod.PageEvent
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultTemplatesReflectionMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/templates/reflection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reflectionTemplate(context: DefaultThemeRenderContext, props: PageEvent[ContainerReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionTemplate")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
