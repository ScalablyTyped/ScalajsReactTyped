package typingsJapgolly.reactTypist.components

import typingsJapgolly.reactTypist.mod.Typist.BackSpaceProps
import typingsJapgolly.reactTypist.mod.Typist.DelayProps
import typingsJapgolly.reactTypist.mod.TypistProps
import typingsJapgolly.reactTypist.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypist {
  
  object Backspace {
    
    @JSImport("react-typist", "default.Backspace")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Backspace.type): SharedBuilder_BackSpaceProps_279751480[typingsJapgolly.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_279751480[typingsJapgolly.reactTypist.mod.default.Backspace](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BackSpaceProps): SharedBuilder_BackSpaceProps_279751480[typingsJapgolly.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_279751480[typingsJapgolly.reactTypist.mod.default.Backspace](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Delay {
    
    inline def apply(ms: Double): SharedBuilder_DelayProps1267675164[typingsJapgolly.reactTypist.mod.default.Delay] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new SharedBuilder_DelayProps1267675164[typingsJapgolly.reactTypist.mod.default.Delay](js.Array(this.component, __props.asInstanceOf[DelayProps]))
    }
    
    @JSImport("react-typist", "default.Delay")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DelayProps): SharedBuilder_DelayProps1267675164[typingsJapgolly.reactTypist.mod.default.Delay] = new SharedBuilder_DelayProps1267675164[typingsJapgolly.reactTypist.mod.default.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-typist", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactTypist.type): SharedBuilder_TypistProps761552895[default] = new SharedBuilder_TypistProps761552895[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TypistProps): SharedBuilder_TypistProps761552895[default] = new SharedBuilder_TypistProps761552895[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
