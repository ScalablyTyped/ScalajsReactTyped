package typingsJapgolly.reactNativeReanimated

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.ILayoutAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2ComponentFlatListMod extends Shortcut {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/component/FlatList", JSImport.Default)
  @js.native
  val default: ReanimatedFlatListFC[Any] = js.native
  
  type ReanimatedFlatListFC[T] = FC[ReanimatedFlatListProps[T]]
  
  trait ReanimatedFlatListProps[ItemT]
    extends StObject
       with FlatListProps[ItemT] {
    
    var itemLayoutAnimation: js.UndefOr[ILayoutAnimationBuilder] = js.undefined
  }
  object ReanimatedFlatListProps {
    
    inline def apply[ItemT](): ReanimatedFlatListProps[ItemT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReanimatedFlatListProps[ItemT]]
    }
    
    extension [Self <: ReanimatedFlatListProps[?], ItemT](x: Self & ReanimatedFlatListProps[ItemT]) {
      
      inline def setItemLayoutAnimation(value: ILayoutAnimationBuilder): Self = StObject.set(x, "itemLayoutAnimation", value.asInstanceOf[js.Any])
      
      inline def setItemLayoutAnimationUndefined: Self = StObject.set(x, "itemLayoutAnimation", js.undefined)
    }
  }
  
  type _To = ReanimatedFlatListFC[Any]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesReanimated2ComponentFlatListMod.foo` */
  override def _to: ReanimatedFlatListFC[Any] = default
}
