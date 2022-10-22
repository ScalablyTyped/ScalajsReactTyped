package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libCrosshairBaseMod.default
import typingsJapgolly.antvComponent.libTypesMod.CrosshairBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.HtmlCrossHairCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCrosshairMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/crosshair", "Base")
  @js.native
  open class Base[T /* <: CrosshairBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/crosshair", "Circle")
  @js.native
  open class Circle ()
    extends typingsJapgolly.antvComponent.libCrosshairCircleMod.default
  
  @JSImport("@antv/component/lib/crosshair", "Html")
  @js.native
  open class Html[T /* <: HtmlCrossHairCfg */] ()
    extends typingsJapgolly.antvComponent.libCrosshairHtmlMod.default[T]
  
  @JSImport("@antv/component/lib/crosshair", "Line")
  @js.native
  open class Line ()
    extends typingsJapgolly.antvComponent.libCrosshairLineMod.default
}
