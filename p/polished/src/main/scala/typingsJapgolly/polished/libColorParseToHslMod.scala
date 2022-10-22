package typingsJapgolly.polished

import typingsJapgolly.polished.libTypesColorMod.HslColor
import typingsJapgolly.polished.libTypesColorMod.HslaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorParseToHslMod {
  
  @JSImport("polished/lib/color/parseToHsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String): HslColor | HslaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[HslColor | HslaColor]
}
