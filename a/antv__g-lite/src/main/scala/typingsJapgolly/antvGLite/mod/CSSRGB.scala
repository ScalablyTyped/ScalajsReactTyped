package typingsJapgolly.antvGLite.mod

import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorPercent
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorRGBComp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "CSSRGB")
@js.native
open class CSSRGB protected ()
  extends typingsJapgolly.antvGLite.distCssMod.CSSRGB {
  def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp) = this()
  def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp, alpha: CSSColorPercent) = this()
  def this(
    r: CSSColorRGBComp,
    g: CSSColorRGBComp,
    b: CSSColorRGBComp,
    alpha: Unit,
    /**
    * 'transparent' & 'none' has the same rgba data
    */
  isNone: Boolean
  ) = this()
  def this(
    r: CSSColorRGBComp,
    g: CSSColorRGBComp,
    b: CSSColorRGBComp,
    alpha: CSSColorPercent,
    /**
    * 'transparent' & 'none' has the same rgba data
    */
  isNone: Boolean
  ) = this()
}
