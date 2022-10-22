package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.TypeParameterReflection
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsTypeParametersMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/typeParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeParameters(context: DefaultThemeRenderContext, typeParameters: js.Array[TypeParameterReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("typeParameters")(context.asInstanceOf[js.Any], typeParameters.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
