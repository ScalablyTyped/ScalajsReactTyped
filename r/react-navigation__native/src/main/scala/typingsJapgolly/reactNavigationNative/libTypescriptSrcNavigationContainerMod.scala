package typingsJapgolly.reactNavigationNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerProps
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationNative.anon.DocumentTitle
import typingsJapgolly.reactNavigationNative.anon.Linking
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.DocumentTitleOptions
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.Theme
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigationContainerMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/NavigationContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RootParamList /* <: js.Object */](props: DocumentTitle[RootParamList] & NavigationContainerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object global {
    
    @JSGlobal("REACT_NAVIGATION_DEVTOOLS")
    @js.native
    def REACT_NAVIGATION_DEVTOOLS: WeakMap[NavigationContainerRef[Any], Linking] = js.native
    inline def REACT_NAVIGATION_DEVTOOLS_=(x: WeakMap[NavigationContainerRef[Any], Linking]): Unit = js.Dynamic.global.updateDynamic("REACT_NAVIGATION_DEVTOOLS")(x.asInstanceOf[js.Any])
  }
  
  trait Props[ParamList /* <: js.Object */]
    extends StObject
       with NavigationContainerProps {
    
    var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
    
    var fallback: js.UndefOr[Node] = js.undefined
    
    var linking: js.UndefOr[LinkingOptions[ParamList]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply[ParamList /* <: js.Object */](): Props[ParamList] = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props[ParamList]]
    }
    
    extension [Self <: Props[?], ParamList /* <: js.Object */](x: Self & Props[ParamList]) {
      
      inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
      
      inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
      
      inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLinking(value: LinkingOptions[ParamList]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
      
      inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
      
      inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
