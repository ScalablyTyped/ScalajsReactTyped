package typingsJapgolly.styledComponents

import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistConstructorsCreateGlobalStyleMod {
  
  @JSImport("styled-components/native/dist/dist/constructors/createGlobalStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
}
