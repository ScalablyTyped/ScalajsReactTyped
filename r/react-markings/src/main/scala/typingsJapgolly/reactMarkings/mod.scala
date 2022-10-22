package typingsJapgolly.reactMarkings

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMarkings.anon.PartialRenderers
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(strings: (TemplateStringsArray | Element)*): Element = ^.asInstanceOf[js.Dynamic].apply(strings.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Element]
  
  @JSImport("react-markings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customize(opts: Options): Markings = ^.asInstanceOf[js.Dynamic].applyDynamic("customize")(opts.asInstanceOf[js.Any]).asInstanceOf[Markings]
  
  type CodeBlockProps = typingsJapgolly.commonmarkReactRenderer.mod.CodeBlockProps
  
  type CodeProps = typingsJapgolly.commonmarkReactRenderer.mod.CodeProps
  
  type CommonProps = typingsJapgolly.commonmarkReactRenderer.mod.CommonProps
  
  type HeadingProps = typingsJapgolly.commonmarkReactRenderer.mod.HeadingProps
  
  type HtmlInlineBlockProps = typingsJapgolly.commonmarkReactRenderer.mod.HtmlInlineBlockProps
  
  type ImageProps = typingsJapgolly.commonmarkReactRenderer.mod.ImageProps
  
  type LinkProps = typingsJapgolly.commonmarkReactRenderer.mod.LinkProps
  
  type ListProps = typingsJapgolly.commonmarkReactRenderer.mod.ListProps
  
  @js.native
  trait Markings extends StObject {
    
    def apply(strings: (TemplateStringsArray | Element)*): Element = js.native
  }
  
  trait Options extends StObject {
    
    var renderers: js.UndefOr[PartialRenderers] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRenderers(value: PartialRenderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
    }
  }
  
  type Renderers = typingsJapgolly.commonmarkReactRenderer.mod.Renderers
  
  type SoftBreakProps = typingsJapgolly.commonmarkReactRenderer.mod.SoftBreakProps
}
