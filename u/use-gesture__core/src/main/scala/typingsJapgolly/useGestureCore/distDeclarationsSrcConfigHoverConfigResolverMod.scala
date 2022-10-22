package typingsJapgolly.useGestureCore

import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.useGestureCore.anon.Capture
import typingsJapgolly.useGestureCore.anon.Shared
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesConfig
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.DragBounds
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesStateMod.State
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typingsJapgolly.useGestureCore.useGestureCoreStrings.x
import typingsJapgolly.useGestureCore.useGestureCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigHoverConfigResolverMod {
  
  object hoverConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/hoverConfigResolver", "hoverConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def axis(_v: Any, _k: String, hasAxis: CoordinatesConfig[CoordinatesKey]): js.UndefOr[x | y] = (^.asInstanceOf[js.Dynamic].applyDynamic("axis")(_v.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], hasAxis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[x | y]]
    
    inline def axisThreshold(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("axisThreshold")().asInstanceOf[Double]
    inline def axisThreshold(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("axisThreshold")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def bounds(): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")().asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    inline def bounds(value: js.Function1[/* state */ State, DragBounds]): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(value.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    inline def bounds(value: DragBounds): HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null]) = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(value.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | (js.Tuple2[Vector2, Vector2]) | (js.Function0[EventTarget | Null])]
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(value: Unit, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    inline def eventOptions(value: AddEventListenerOptions, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    
    inline def from(value: js.Function1[/* s */ State, Vector2]): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Double): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Vector2): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    
    inline def mouseOnly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOnly")().asInstanceOf[Boolean]
    inline def mouseOnly(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOnly")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def preventDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")().asInstanceOf[Boolean]
    inline def preventDefault(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def rubberband(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")().asInstanceOf[Vector2]
    inline def rubberband(value: Boolean): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Double): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Vector2): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    
    inline def threshold(value: Any): js.Tuple2[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Any, Any]]
    
    inline def transform(value: Any, _k: String, config: Shared): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def triggerAllEvents(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")().asInstanceOf[Boolean]
    inline def triggerAllEvents(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
