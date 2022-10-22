package typingsJapgolly.useGestureCore

import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.useGestureCore.anon.Capture
import typingsJapgolly.useGestureCore.anon.Shared
import typingsJapgolly.useGestureCore.anon.sharedGenericOptionsenabl
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.ModifierKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.PinchConfig
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesStateMod.State
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typingsJapgolly.useGestureCore.useGestureCoreStrings.gesture
import typingsJapgolly.useGestureCore.useGestureCoreStrings.pointer
import typingsJapgolly.useGestureCore.useGestureCoreStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigPinchConfigResolverMod {
  
  object pinchConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/pinchConfigResolver", "pinchConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bounds(_v: Any, _k: String, hasScaleBoundsAngleBounds: PinchConfig): js.Array[js.Array[Double]] | (js.Function1[/* state */ State, js.Array[js.Array[Double]]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasScaleBoundsAngleBounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]] | (js.Function1[/* state */ State, js.Array[js.Array[Double]]])]
    
    inline def device(_v: Any, _k: String, hasSharedHasTouch: sharedGenericOptionsenabl): js.UndefOr[touch | pointer | gesture] = (^.asInstanceOf[js.Dynamic].applyDynamic("device")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasSharedHasTouch.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[touch | pointer | gesture]]
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(value: Unit, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    inline def eventOptions(value: AddEventListenerOptions, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    
    inline def from(value: js.Function1[/* s */ State, Vector2]): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Double): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Vector2): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    
    inline def modifierKey(value: ModifierKey): ModifierKey = ^.asInstanceOf[js.Dynamic].applyDynamic("modifierKey")(value.asInstanceOf[js.Any]).asInstanceOf[ModifierKey]
    
    inline def preventDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")().asInstanceOf[Boolean]
    inline def preventDefault(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def rubberband(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")().asInstanceOf[Vector2]
    inline def rubberband(value: Boolean): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Double): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Vector2): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    
    inline def threshold(value: Double, _k: String, config: PinchConfig): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    inline def threshold(value: Vector2, _k: String, config: PinchConfig): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def transform(value: Any, _k: String, config: Shared): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def triggerAllEvents(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")().asInstanceOf[Boolean]
    inline def triggerAllEvents(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
