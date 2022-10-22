package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesPageFooterCenterMod.CenterProps
import typingsJapgolly.wixStyleReact.distTypesPageFooterEndMod.EndProps
import typingsJapgolly.wixStyleReact.distTypesPageFooterMod.PageFooterProps
import typingsJapgolly.wixStyleReact.distTypesPageFooterStartMod.StartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageFooter {
  
  object Center {
    
    @JSImport("wix-style-react", "PageFooter.Center")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Center.type): SharedBuilder_CenterProps_227782348[typingsJapgolly.wixStyleReact.mod.PageFooter.Center] = new SharedBuilder_CenterProps_227782348[typingsJapgolly.wixStyleReact.mod.PageFooter.Center](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CenterProps): SharedBuilder_CenterProps_227782348[typingsJapgolly.wixStyleReact.mod.PageFooter.Center] = new SharedBuilder_CenterProps_227782348[typingsJapgolly.wixStyleReact.mod.PageFooter.Center](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object End {
    
    @JSImport("wix-style-react", "PageFooter.End")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: End.type): SharedBuilder_EndProps951730815[typingsJapgolly.wixStyleReact.mod.PageFooter.End] = new SharedBuilder_EndProps951730815[typingsJapgolly.wixStyleReact.mod.PageFooter.End](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: EndProps): SharedBuilder_EndProps951730815[typingsJapgolly.wixStyleReact.mod.PageFooter.End] = new SharedBuilder_EndProps951730815[typingsJapgolly.wixStyleReact.mod.PageFooter.End](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Start {
    
    @JSImport("wix-style-react", "PageFooter.Start")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Start.type): SharedBuilder_StartProps1350180991[typingsJapgolly.wixStyleReact.mod.PageFooter.Start] = new SharedBuilder_StartProps1350180991[typingsJapgolly.wixStyleReact.mod.PageFooter.Start](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StartProps): SharedBuilder_StartProps1350180991[typingsJapgolly.wixStyleReact.mod.PageFooter.Start] = new SharedBuilder_StartProps1350180991[typingsJapgolly.wixStyleReact.mod.PageFooter.Start](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "PageFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
