package typingsJapgolly.remarkPrism

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-prism", JSImport.Namespace)
  @js.native
  val ^ : Prism = js.native
  
  trait Options extends StObject {
    
    var plugins: js.UndefOr[js.Array[SupportedPlugins]] = js.undefined
    
    var transformInlineCode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPlugins(value: js.Array[SupportedPlugins]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: SupportedPlugins*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setTransformInlineCode(value: Boolean): Self = StObject.set(x, "transformInlineCode", value.asInstanceOf[js.Any])
      
      inline def setTransformInlineCodeUndefined: Self = StObject.set(x, "transformInlineCode", js.undefined)
    }
  }
  
  /**
    * Plugin to use prism with remark.
    * https://github.com/unifiedjs/unified/blob/main/index.d.ts#L488-L489
    */
  type Prism = js.Function1[/* settings */ js.UndefOr[Options], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.remarkPrism.remarkPrismStrings.autolinker
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`command-line`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`data-uri-highlight`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`diff-highlight`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`inline-color`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`keep-markup`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`line-numbers`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.`show-invisibles`
    - typingsJapgolly.remarkPrism.remarkPrismStrings.treeview
  */
  trait SupportedPlugins extends StObject
  object SupportedPlugins {
    
    inline def autolinker: typingsJapgolly.remarkPrism.remarkPrismStrings.autolinker = "autolinker".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.autolinker]
    
    inline def `command-line`: typingsJapgolly.remarkPrism.remarkPrismStrings.`command-line` = "command-line".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`command-line`]
    
    inline def `data-uri-highlight`: typingsJapgolly.remarkPrism.remarkPrismStrings.`data-uri-highlight` = "data-uri-highlight".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`data-uri-highlight`]
    
    inline def `diff-highlight`: typingsJapgolly.remarkPrism.remarkPrismStrings.`diff-highlight` = "diff-highlight".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`diff-highlight`]
    
    inline def `inline-color`: typingsJapgolly.remarkPrism.remarkPrismStrings.`inline-color` = "inline-color".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`inline-color`]
    
    inline def `keep-markup`: typingsJapgolly.remarkPrism.remarkPrismStrings.`keep-markup` = "keep-markup".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`keep-markup`]
    
    inline def `line-numbers`: typingsJapgolly.remarkPrism.remarkPrismStrings.`line-numbers` = "line-numbers".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`line-numbers`]
    
    inline def `show-invisibles`: typingsJapgolly.remarkPrism.remarkPrismStrings.`show-invisibles` = "show-invisibles".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.`show-invisibles`]
    
    inline def treeview: typingsJapgolly.remarkPrism.remarkPrismStrings.treeview = "treeview".asInstanceOf[typingsJapgolly.remarkPrism.remarkPrismStrings.treeview]
  }
  
  type _To = Prism
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Prism = ^
}
