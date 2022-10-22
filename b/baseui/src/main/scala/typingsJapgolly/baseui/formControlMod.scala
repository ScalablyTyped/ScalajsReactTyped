package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Caption
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.label
import typingsJapgolly.baseui.formControlFormControlMod.default
import typingsJapgolly.baseui.formControlTypesMod.StyleProps
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("baseui/form-control", "FormControl")
  @js.native
  open class FormControl () extends default
  /* static members */
  object FormControl {
    
    @JSImport("baseui/form-control", "FormControl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/form-control", "FormControl.defaultProps")
    @js.native
    def defaultProps: Caption = js.native
    inline def defaultProps_=(x: Caption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/form-control", "StyledCaption")
  @js.native
  val StyledCaption: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/form-control", "StyledControlContainer")
  @js.native
  val StyledControlContainer: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/form-control", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[label, StyleProps] = js.native
}
