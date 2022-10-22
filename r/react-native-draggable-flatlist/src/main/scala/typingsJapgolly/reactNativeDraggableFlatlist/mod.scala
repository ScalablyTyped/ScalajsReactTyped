package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNativeDraggableFlatlist.anon.AnimationConfig
import typingsJapgolly.reactNativeDraggableFlatlist.anon.FnCall
import typingsJapgolly.reactNativeDraggableFlatlist.anon.FnCallPropsRef
import typingsJapgolly.reactNativeDraggableFlatlist.anon.IsActive
import typingsJapgolly.reactNativeDraggableFlatlist.anon.PartialReadonlyautoscroll
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.OpacityProps
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ScaleProps
import typingsJapgolly.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ShadowProps
import typingsJapgolly.reactNativeDraggableFlatlist.libHooksUseOnCellActiveAnimationMod.Params
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.DraggableFlatListProps
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
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typingsJapgolly.std.Omit
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-draggable-flatlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    props: AnimationConfig[T] & (Omit[
      FlatListProps[T], 
      onDragEnd | keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | outerScrollOffset | containerStyle | onDragBegin | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | onAnimValInit
    ]) & PartialReadonlyautoscroll
  ): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def NestableDraggableFlatList[T](
    props: AnimationConfig[T] & (Omit[
      FlatListProps[T], 
      onDragEnd | keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | outerScrollOffset | containerStyle | onDragBegin | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | onAnimValInit
    ]) & PartialReadonlyautoscroll
  ): ReturnType[FnCallPropsRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatList")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallPropsRef]]
  
  inline def NestableDraggableFlatListInner[T](props: DraggableFlatListProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatListInner")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def NestableDraggableFlatListInner[T](props: DraggableFlatListProps[T], ref: ForwardedRef[FlatList[T]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatListInner")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def NestableScrollContainer(props: ScrollViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def OpacityDecorator(hasActiveOpacityChildren: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(hasActiveOpacityChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(hasActiveScaleChildren: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(hasActiveScaleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(hasElevationColorOpacityRadiusChildren: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(hasElevationColorOpacityRadiusChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[IsActive]
  inline def useOnCellActiveAnimation(hasAnimationConfig: Params): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(hasAnimationConfig.asInstanceOf[js.Any]).asInstanceOf[IsActive]
}
