package typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation[T /* <: AnimationObject */]
  extends StObject
     with AnimationObject {
  
  def onStart(
    nextAnimation: T,
    current: /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any,
    timestamp: Timestamp,
    previousAnimation: T
  ): Unit
}
object Animation {
  
  inline def apply[T /* <: AnimationObject */](
    callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Callback,
    onFrame: (Any, Timestamp) => Boolean,
    onStart: (T, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, T) => Callback
  ): Animation[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* finished */ js.UndefOr[Boolean], t1: /* current */ js.UndefOr[AnimatableValue]) => (callback(t0, t1)).runNow()), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4((t0: T, t1: /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, t2: Timestamp, t3: T) => (onStart(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[Animation[T]]
  }
  
  extension [Self <: Animation[?], T /* <: AnimationObject */](x: Self & Animation[T]) {
    
    inline def setOnStart(
      value: (T, /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, Timestamp, T) => Callback
    ): Self = StObject.set(x, "onStart", js.Any.fromFunction4((t0: T, t1: /* import warning: importer.ImportType#apply Failed type conversion: T extends react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NumericAnimation ? number : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimatableValue */ js.Any, t2: Timestamp, t3: T) => (value(t0, t1, t2, t3)).runNow()))
  }
}
