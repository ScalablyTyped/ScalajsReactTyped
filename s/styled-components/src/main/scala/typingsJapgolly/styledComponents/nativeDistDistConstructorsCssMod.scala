package typingsJapgolly.styledComponents

import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.IsCss
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistConstructorsCssMod {
  
  @JSImport("styled-components/native/dist/dist/constructors/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
}
