package typingsJapgolly.storybookAddonA11y

import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsA11YPanelMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11YPanel", "A11YPanel")
  @js.native
  val A11YPanel: FC[js.Object] = js.native
  
  @js.native
  sealed trait RuleType extends StObject
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11YPanel", "RuleType")
  @js.native
  object RuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RuleType & Double] = js.native
    
    @js.native
    sealed trait INCOMPLETION
      extends StObject
         with RuleType
    /* 2 */ val INCOMPLETION: typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType.INCOMPLETION & Double = js.native
    
    @js.native
    sealed trait PASS
      extends StObject
         with RuleType
    /* 1 */ val PASS: typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType.PASS & Double = js.native
    
    @js.native
    sealed trait VIOLATION
      extends StObject
         with RuleType
    /* 0 */ val VIOLATION: typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType.VIOLATION & Double = js.native
  }
}
