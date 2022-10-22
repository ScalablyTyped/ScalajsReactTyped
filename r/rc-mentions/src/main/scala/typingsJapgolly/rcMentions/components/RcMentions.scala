package typingsJapgolly.rcMentions.components

import typingsJapgolly.rcMentions.esMentionsMod.MentionsProps
import typingsJapgolly.rcMentions.esMentionsMod.MentionsRef
import typingsJapgolly.rcMentions.esOptionMod.OptionProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcMentions {
  
  object Option {
    
    @JSImport("rc-mentions", "default.Option")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Option.type): SharedBuilder_OptionProps1642403849 = new SharedBuilder_OptionProps1642403849(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps1642403849 = new SharedBuilder_OptionProps1642403849(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-mentions", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcMentions.type): SharedBuilder_MentionsPropsRefAttributes89069021[MentionsRef] = new SharedBuilder_MentionsPropsRefAttributes89069021[MentionsRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MentionsProps & RefAttributes[MentionsRef]): SharedBuilder_MentionsPropsRefAttributes89069021[MentionsRef] = new SharedBuilder_MentionsPropsRefAttributes89069021[MentionsRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
