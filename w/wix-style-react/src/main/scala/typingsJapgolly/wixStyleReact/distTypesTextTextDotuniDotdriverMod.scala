package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextSize
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextSkin
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextWeight
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextTextDotuniDotdriverMod {
  
  trait TextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getId(): js.Promise[String]
    
    def getSize(): js.Promise[TextSize]
    
    def getSkin(): js.Promise[TextSkin]
    
    def getTagName(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def getWeight(): js.Promise[TextWeight]
    
    def isLight(): js.Promise[Boolean]
    
    def isMasked(): js.Promise[Boolean]
    
    def isSecondary(): js.Promise[Boolean]
  }
  object TextUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getId: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[TextSize]],
      getSkin: CallbackTo[js.Promise[TextSkin]],
      getTagName: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]],
      getWeight: CallbackTo[js.Promise[TextWeight]],
      isLight: CallbackTo[js.Promise[Boolean]],
      isMasked: CallbackTo[js.Promise[Boolean]],
      isSecondary: CallbackTo[js.Promise[Boolean]]
    ): TextUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getTagName = getTagName.toJsFn, getText = getText.toJsFn, getWeight = getWeight.toJsFn, isLight = isLight.toJsFn, isMasked = isMasked.toJsFn, isSecondary = isSecondary.toJsFn)
      __obj.asInstanceOf[TextUniDriver]
    }
    
    extension [Self <: TextUniDriver](x: Self) {
      
      inline def setGetId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[TextSize]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[TextSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetWeight(value: CallbackTo[js.Promise[TextWeight]]): Self = StObject.set(x, "getWeight", value.toJsFn)
      
      inline def setIsLight(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLight", value.toJsFn)
      
      inline def setIsMasked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMasked", value.toJsFn)
      
      inline def setIsSecondary(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSecondary", value.toJsFn)
    }
  }
}
