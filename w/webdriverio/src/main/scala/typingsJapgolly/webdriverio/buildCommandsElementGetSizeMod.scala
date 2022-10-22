package typingsJapgolly.webdriverio

import typingsJapgolly.webdriverio.webdriverioStrings.height
import typingsJapgolly.webdriverio.webdriverioStrings.width
import typingsJapgolly.webdriverio.webdriverioStrings.x
import typingsJapgolly.webdriverio.webdriverioStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementGetSizeMod {
  
  @JSImport("webdriverio/build/commands/element/getSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Size] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Size]]
  inline def default(prop: /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ x | y | width | height): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /* Inlined std.Pick<@wdio/protocols.@wdio/protocols.RectReturn, 'width' | 'height'> */
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
