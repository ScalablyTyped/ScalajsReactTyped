package typingsJapgolly.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderWatchMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Watch", JSImport.Default)
  @js.native
  val default: FunctionComponent[WatchProps] = js.native
  
  trait WatchProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object WatchProps {
    
    inline def apply(): WatchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchProps]
    }
    
    extension [Self <: WatchProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[WatchProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderWatchMod.foo` */
  override def _to: FunctionComponent[WatchProps] = default
}
