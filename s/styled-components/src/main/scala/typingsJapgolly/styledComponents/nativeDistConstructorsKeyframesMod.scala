package typingsJapgolly.styledComponents

import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistConstructorsKeyframesMod {
  
  @JSImport("styled-components/native/dist/constructors/keyframes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typingsJapgolly.styledComponents.nativeDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.styledComponents.nativeDistModelsKeyframesMod.default]
}
