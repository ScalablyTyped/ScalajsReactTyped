package typingsJapgolly.wixUiCore.distEsSrcComponentsVideoTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixUiCore.wixUiCoreStrings.auto
import typingsJapgolly.wixUiCore.wixUiCoreStrings.metadata
import typingsJapgolly.wixUiCore.wixUiCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayableConfig extends StObject {
  
  var alwaysShowLogo: js.UndefOr[Boolean] = js.undefined
  
  var hideMainUI: js.UndefOr[Boolean] = js.undefined
  
  var logoUrl: js.UndefOr[String] = js.undefined
  
  var modules: js.UndefOr[js.Object] = js.undefined
  
  var onLogoClick: js.UndefOr[js.Function] = js.undefined
  
  var playButton: js.UndefOr[Node] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  
  var texts: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITextMapConfig */ Any
  ] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object IPlayableConfig {
  
  inline def apply(): IPlayableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlayableConfig]
  }
  
  extension [Self <: IPlayableConfig](x: Self) {
    
    inline def setAlwaysShowLogo(value: Boolean): Self = StObject.set(x, "alwaysShowLogo", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowLogoUndefined: Self = StObject.set(x, "alwaysShowLogo", js.undefined)
    
    inline def setHideMainUI(value: Boolean): Self = StObject.set(x, "hideMainUI", value.asInstanceOf[js.Any])
    
    inline def setHideMainUIUndefined: Self = StObject.set(x, "hideMainUI", js.undefined)
    
    inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setModules(value: js.Object): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setOnLogoClick(value: js.Function): Self = StObject.set(x, "onLogoClick", value.asInstanceOf[js.Any])
    
    inline def setOnLogoClickUndefined: Self = StObject.set(x, "onLogoClick", js.undefined)
    
    inline def setPlayButton(value: VdomNode): Self = StObject.set(x, "playButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPlayButtonNull: Self = StObject.set(x, "playButton", null)
    
    inline def setPlayButtonUndefined: Self = StObject.set(x, "playButton", js.undefined)
    
    inline def setPlayButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "playButton", js.Array(value*))
    
    inline def setPlayButtonVdomElement(value: VdomElement): Self = StObject.set(x, "playButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreload(value: auto | metadata | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setTexts(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITextMapConfig */ Any
    ): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
