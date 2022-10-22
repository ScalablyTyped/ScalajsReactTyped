package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distCssMod.CSSUnitValue
import typingsJapgolly.antvGLite.distCssParserTransformMod.ParsedTransform
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsGroupMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Group", "Group")
  @js.native
  open class Group () extends DisplayObject[Any, Any] {
    def this(hasStyleRest: DisplayObjectConfig[GroupStyleProps]) = this()
  }
  
  trait GroupStyleProps
    extends StObject
       with BaseStyleProps {
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object GroupStyleProps {
    
    inline def apply(): GroupStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupStyleProps]
    }
    
    extension [Self <: GroupStyleProps](x: Self) {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ParsedGroupStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var height: js.UndefOr[CSSUnitValue] = js.undefined
    
    var width: js.UndefOr[CSSUnitValue] = js.undefined
    
    var x: CSSUnitValue
    
    var y: CSSUnitValue
  }
  object ParsedGroupStyleProps {
    
    inline def apply(transform: js.Array[ParsedTransform], x: CSSUnitValue, y: CSSUnitValue): ParsedGroupStyleProps = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedGroupStyleProps]
    }
    
    extension [Self <: ParsedGroupStyleProps](x: Self) {
      
      inline def setHeight(value: CSSUnitValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: CSSUnitValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: CSSUnitValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: CSSUnitValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
