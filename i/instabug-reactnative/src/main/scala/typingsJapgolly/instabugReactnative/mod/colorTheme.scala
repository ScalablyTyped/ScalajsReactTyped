package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait colorTheme extends StObject
@JSImport("instabug-reactnative", "colorTheme")
@js.native
object colorTheme extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[colorTheme & Double] = js.native
  
  @js.native
  sealed trait dark
    extends StObject
       with colorTheme
  /* 1 */ val dark: typingsJapgolly.instabugReactnative.mod.colorTheme.dark & Double = js.native
  
  @js.native
  sealed trait light
    extends StObject
       with colorTheme
  /* 0 */ val light: typingsJapgolly.instabugReactnative.mod.colorTheme.light & Double = js.native
}
