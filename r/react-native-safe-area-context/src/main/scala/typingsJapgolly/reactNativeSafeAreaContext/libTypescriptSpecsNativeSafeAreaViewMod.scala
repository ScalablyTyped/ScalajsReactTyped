package typingsJapgolly.reactNativeSafeAreaContext

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactNative.librariesTypesCodegenTypesMod.WithDefault
import typingsJapgolly.reactNative.mod.HostComponent
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.margin
import typingsJapgolly.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSpecsNativeSafeAreaViewMod extends Shortcut {
  
  @JSImport("react-native-safe-area-context/lib/typescript/specs/NativeSafeAreaView", JSImport.Default)
  @js.native
  val default: HostComponent[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var edges: js.UndefOr[js.Array[String]] = js.undefined
    
    var mode: js.UndefOr[WithDefault[padding | margin, padding]] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setEdges(value: js.Array[String]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      inline def setEdgesVarargs(value: String*): Self = StObject.set(x, "edges", js.Array(value*))
      
      inline def setMode(value: WithDefault[padding | margin, padding]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeNull: Self = StObject.set(x, "mode", null)
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  type _To = HostComponent[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSpecsNativeSafeAreaViewMod.foo` */
  override def _to: HostComponent[NativeProps] = default
}
