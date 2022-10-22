package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNativeDraggableFlatlist.anon.AutoscrollSpeed
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Fn0
import typingsJapgolly.reactNativeDraggableFlatlist.anon.OnActiveAnim
import typingsJapgolly.reactNativeDraggableFlatlist.anon.PartialReadonlyautoscrollActivationDistance
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.OpacityProps
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.ScaleProps
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.ShadowProps
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptHooksUseOnCellActiveAnimationMod.Params
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptTypesMod.DraggableFlatListProps
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.activationDistance
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.animationConfig
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.autoscrollSpeed
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.autoscrollThreshold
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.containerStyle
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.data
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.debug
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.dragHitSlop
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.dragItemOverflow
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.keyExtractor
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onAnimValInit
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onContainerLayout
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onDragBegin
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onDragEnd
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onPlaceholderIndexChange
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onRelease
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onScrollOffsetChange
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.outerScrollOffset
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.renderItem
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.renderPlaceholder
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.scrollEnabled
import typingsJapgolly.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.simultaneousHandlers
import typingsJapgolly.std.Omit
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    props: AutoscrollSpeed[T] & (Omit[
      FlatListProps[T], 
      keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | containerStyle | onDragBegin | onDragEnd | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | outerScrollOffset | onAnimValInit | onContainerLayout
    ]) & PartialReadonlyautoscrollActivationDistance
  ): ReturnType[Fn0] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[Fn0]]
  
  inline def NestableDraggableFlatList[T](props: DraggableFlatListProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NestableScrollContainer(props: ScrollViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def OpacityDecorator(hasActiveOpacityChildren: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(hasActiveOpacityChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(hasActiveScaleChildren: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(hasActiveScaleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(hasElevationColorOpacityRadiusChildren: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(hasElevationColorOpacityRadiusChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[OnActiveAnim]
  inline def useOnCellActiveAnimation(hasAnimationConfig: Params): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(hasAnimationConfig.asInstanceOf[js.Any]).asInstanceOf[OnActiveAnim]
}
