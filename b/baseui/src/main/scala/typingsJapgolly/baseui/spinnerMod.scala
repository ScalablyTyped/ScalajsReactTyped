package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.i
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.medium_
import typingsJapgolly.baseui.baseuiStrings.small_
import typingsJapgolly.baseui.spinnerTypesMod.SpinnerProps
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  object SIZE {
    
    @JSImport("baseui/spinner", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/spinner", "SIZE.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/spinner", "SIZE.small")
    @js.native
    val small: small_ = js.native
  }
  
  @JSImport("baseui/spinner", "Spinner")
  @js.native
  val Spinner: StyletronComponent[i, SpinnerProps] = js.native
}
