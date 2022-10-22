package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsCustomElementMod {
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/display-objects/CustomElement", "CustomElement")
  @js.native
  open class CustomElement[CustomElementStyleProps] () extends DisplayObject[CustomElementStyleProps & BaseCustomElementStyleProps, Any] {
    def this(hasStyleRest: DisplayObjectConfig[CustomElementStyleProps]) = this()
    
    var attributeChangedCallback: js.UndefOr[
        js.Function5[
          /* keyof CustomElementStyleProps */ /* name */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: CustomElementStyleProps[keyof CustomElementStyleProps] */ /* oldValue */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: CustomElementStyleProps[keyof CustomElementStyleProps] */ /* newValue */ js.Any, 
          /* oldParsedValue */ js.UndefOr[Any], 
          /* newParsedValue */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    /**
      * fired after element insert into DOM tree
      */
    var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * fired before element removed from DOM tree
      */
    var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  trait BaseCustomElementStyleProps
    extends StObject
       with BaseStyleProps {
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object BaseCustomElementStyleProps {
    
    inline def apply(): BaseCustomElementStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCustomElementStyleProps]
    }
    
    extension [Self <: BaseCustomElementStyleProps](x: Self) {
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
