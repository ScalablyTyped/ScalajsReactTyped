package typingsJapgolly.winrtUwp.global.Windows.UI

import typingsJapgolly.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static helper methods for processing Color values. C# and Microsoft Visual Basic code should use methods of Color instead. */
/* note: abstract class */ @JSGlobal("Windows.UI.ColorHelper")
@js.native
open class ColorHelper ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.ColorHelper
object ColorHelper {
  
  @JSGlobal("Windows.UI.ColorHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a Color structure, based on discrete Byte values for ARGB components. C# and Microsoft Visual Basic code should use Color.FromArgb instead.
    * @param a The A (transparency) component of the desired color. Range is 0-255.
    * @param r The R component of the desired color. Range is 0-255.
    * @param g The G component of the desired color. Range is 0-255.
    * @param b The B component of the desired color. Range is 0-255.
    * @return The generated Color value.
    */
  /* static member */
  inline def fromArgb(a: Double, r: Double, g: Double, b: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArgb")(a.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Color]
}
