package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorThemeKind extends StObject
@JSImport("vscode", "ColorThemeKind")
@js.native
object ColorThemeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorThemeKind & Double] = js.native
  
  @js.native
  sealed trait Dark
    extends StObject
       with ColorThemeKind
  /* 2 */ val Dark: typingsJapgolly.vscode.mod.ColorThemeKind.Dark & Double = js.native
  
  @js.native
  sealed trait HighContrast
    extends StObject
       with ColorThemeKind
  /* 3 */ val HighContrast: typingsJapgolly.vscode.mod.ColorThemeKind.HighContrast & Double = js.native
  
  @js.native
  sealed trait HighContrastLight
    extends StObject
       with ColorThemeKind
  /* 4 */ val HighContrastLight: typingsJapgolly.vscode.mod.ColorThemeKind.HighContrastLight & Double = js.native
  
  @js.native
  sealed trait Light
    extends StObject
       with ColorThemeKind
  /* 1 */ val Light: typingsJapgolly.vscode.mod.ColorThemeKind.Light & Double = js.native
}
