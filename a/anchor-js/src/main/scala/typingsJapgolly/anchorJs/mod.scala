package typingsJapgolly.anchorJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.anchorJs.mod.anchorjs.Anchor
import typingsJapgolly.anchorJs.mod.anchorjs.AnchorOptions
import typingsJapgolly.anchorJs.mod.anchorjs.AnchorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Anchor {
    def this(options: AnchorOptions) = this()
  }
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AnchorStatic = js.native
  
  object global {
    
    @JSGlobal("anchors")
    @js.native
    val anchors: Anchor = js.native
  }
  
  type _To = js.Object & AnchorStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AnchorStatic = ^
  
  object anchorjs {
    
    @js.native
    trait Anchor extends StObject {
      
      def add(): Anchor = js.native
      def add(selector: String): Anchor = js.native
      
      var options: AnchorOptions = js.native
      
      def remove(): Anchor = js.native
      def remove(selector: String): Anchor = js.native
      
      def removeAll(): Unit = js.native
    }
    
    trait AnchorOptions extends StObject {
      
      var ariaLabel: js.UndefOr[String] = js.undefined
      
      var base: js.UndefOr[String] = js.undefined
      
      var `class`: js.UndefOr[String] = js.undefined
      
      var icon: js.UndefOr[String] = js.undefined
      
      var placement: js.UndefOr[AnchorPlacement] = js.undefined
      
      var titleText: js.UndefOr[String] = js.undefined
      
      var truncate: js.UndefOr[Double] = js.undefined
      
      var visible: js.UndefOr[AnchorVisibility] = js.undefined
    }
    object AnchorOptions {
      
      inline def apply(): AnchorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnchorOptions]
      }
      
      extension [Self <: AnchorOptions](x: Self) {
        
        inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setPlacement(value: AnchorPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
        
        inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
        
        inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
        
        inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
        
        inline def setVisible(value: AnchorVisibility): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.anchorJs.anchorJsStrings.left
      - typingsJapgolly.anchorJs.anchorJsStrings.right
    */
    trait AnchorPlacement extends StObject
    object AnchorPlacement {
      
      inline def left: typingsJapgolly.anchorJs.anchorJsStrings.left = "left".asInstanceOf[typingsJapgolly.anchorJs.anchorJsStrings.left]
      
      inline def right: typingsJapgolly.anchorJs.anchorJsStrings.right = "right".asInstanceOf[typingsJapgolly.anchorJs.anchorJsStrings.right]
    }
    
    @js.native
    trait AnchorStatic
      extends StObject
         with Instantiable0[Anchor]
         with Instantiable1[/* options */ AnchorOptions, Anchor]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.anchorJs.anchorJsStrings.always
      - typingsJapgolly.anchorJs.anchorJsStrings.hover
      - typingsJapgolly.anchorJs.anchorJsStrings.touch
    */
    trait AnchorVisibility extends StObject
    object AnchorVisibility {
      
      inline def always: typingsJapgolly.anchorJs.anchorJsStrings.always = "always".asInstanceOf[typingsJapgolly.anchorJs.anchorJsStrings.always]
      
      inline def hover: typingsJapgolly.anchorJs.anchorJsStrings.hover = "hover".asInstanceOf[typingsJapgolly.anchorJs.anchorJsStrings.hover]
      
      inline def touch: typingsJapgolly.anchorJs.anchorJsStrings.touch = "touch".asInstanceOf[typingsJapgolly.anchorJs.anchorJsStrings.touch]
    }
  }
}
