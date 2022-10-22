package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderOptions
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderStyleInterpolator
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsHeaderHeaderSegmentMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderSegment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDefaultHeaderHeight(layout: Layout, statusBarHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultHeaderHeight")(layout.asInstanceOf[js.Any], statusBarHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Props
    extends StObject
       with StackHeaderOptions {
    
    @JSName("headerTitle")
    def headerTitle_MProps(props: StackHeaderTitleProps): Node
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var leftLabel: js.UndefOr[String] = js.undefined
    
    var onGoBack: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scene: Scene[NavigationRoute[NavigationParams]]
    
    var styleInterpolator: StackHeaderStyleInterpolator
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(
      headerTitle: StackHeaderTitleProps => Node,
      insets: EdgeInsets,
      layout: Layout,
      scene: Scene[NavigationRoute[NavigationParams]],
      styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
    ): Props = {
      val __obj = js.Dynamic.literal(headerTitle = js.Any.fromFunction1(headerTitle), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setHeaderTitle(value: StackHeaderTitleProps => Node): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setOnGoBack(value: Callback): Self = StObject.set(x, "onGoBack", value.toJsFn)
      
      inline def setOnGoBackUndefined: Self = StObject.set(x, "onGoBack", js.undefined)
      
      inline def setScene(value: Scene[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
