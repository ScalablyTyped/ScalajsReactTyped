package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.DocumentTitleOptions
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTitle[RootParamList /* <: js.Object */] extends StObject {
  
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
  
  var fallback: js.UndefOr[Node] = js.undefined
  
  var linking: js.UndefOr[LinkingOptions[RootParamList]] = js.undefined
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[NavigationContainerRef[RootParamList]]] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object DocumentTitle {
  
  inline def apply[RootParamList /* <: js.Object */](): DocumentTitle[RootParamList] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTitle[RootParamList]]
  }
  
  extension [Self <: DocumentTitle[?], RootParamList /* <: js.Object */](x: Self & DocumentTitle[RootParamList]) {
    
    inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
    
    inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLinking(value: LinkingOptions[RootParamList]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setRef(value: Ref[NavigationContainerRef[RootParamList]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: NavigationContainerRef[RootParamList] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: NavigationContainerRef[RootParamList] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
