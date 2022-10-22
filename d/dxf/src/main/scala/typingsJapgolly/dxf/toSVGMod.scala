package typingsJapgolly.dxf

import typingsJapgolly.dxf.informationMod.FileInfo
import typingsJapgolly.dxf.informationMod.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSVGMod {
  
  @JSImport("dxf/toSVG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: FileInfo): SVG = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any]).asInstanceOf[SVG]
}
