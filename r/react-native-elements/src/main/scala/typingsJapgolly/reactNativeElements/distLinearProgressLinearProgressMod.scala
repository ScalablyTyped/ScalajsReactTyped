package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.determinate
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.indeterminate
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.primary
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLinearProgressLinearProgressMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/linearProgress/LinearProgress", JSImport.Default)
  @js.native
  val default: RneFunctionComponent[LinearProgressProps] = js.native
  
  trait LinearProgressProps
    extends StObject
       with ViewProps {
    
    var color: js.UndefOr[primary | secondary | String] = js.undefined
    
    var trackColor: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
    
    var variant: js.UndefOr[determinate | indeterminate] = js.undefined
  }
  object LinearProgressProps {
    
    inline def apply(): LinearProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearProgressProps]
    }
    
    extension [Self <: LinearProgressProps](x: Self) {
      
      inline def setColor(value: primary | secondary | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
      
      inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVariant(value: determinate | indeterminate): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = RneFunctionComponent[LinearProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLinearProgressLinearProgressMod.foo` */
  override def _to: RneFunctionComponent[LinearProgressProps] = default
}
