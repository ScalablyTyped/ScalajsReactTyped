package typingsJapgolly.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderBallTriangleMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/BallTriangle", JSImport.Default)
  @js.native
  val default: FunctionComponent[BallTriangleProps] = js.native
  
  trait BallTriangleProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object BallTriangleProps {
    
    inline def apply(): BallTriangleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BallTriangleProps]
    }
    
    extension [Self <: BallTriangleProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[BallTriangleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderBallTriangleMod.foo` */
  override def _to: FunctionComponent[BallTriangleProps] = default
}
