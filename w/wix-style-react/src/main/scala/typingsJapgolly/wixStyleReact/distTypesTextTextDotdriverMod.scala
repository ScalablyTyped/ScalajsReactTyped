package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextSize
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextSkin
import typingsJapgolly.wixStyleReact.distTypesTextMod.TextWeight
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextTextDotdriverMod {
  
  trait TextDriver
    extends StObject
       with BaseDriver {
    
    def getId(): String
    
    def getSize(): TextSize
    
    def getSkin(): TextSkin
    
    def getTagName(): String
    
    def getText(): String
    
    def getWeight(): TextWeight
    
    def isLight(): Boolean
    
    def isMasked(): Boolean
    
    def isSecondary(): Boolean
  }
  object TextDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getId: CallbackTo[String],
      getSize: CallbackTo[TextSize],
      getSkin: CallbackTo[TextSkin],
      getTagName: CallbackTo[String],
      getText: CallbackTo[String],
      getWeight: CallbackTo[TextWeight],
      isLight: CallbackTo[Boolean],
      isMasked: CallbackTo[Boolean],
      isSecondary: CallbackTo[Boolean]
    ): TextDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getId = getId.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getTagName = getTagName.toJsFn, getText = getText.toJsFn, getWeight = getWeight.toJsFn, isLight = isLight.toJsFn, isMasked = isMasked.toJsFn, isSecondary = isSecondary.toJsFn)
      __obj.asInstanceOf[TextDriver]
    }
    
    extension [Self <: TextDriver](x: Self) {
      
      inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[TextSize]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[TextSkin]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[String]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetWeight(value: CallbackTo[TextWeight]): Self = StObject.set(x, "getWeight", value.toJsFn)
      
      inline def setIsLight(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLight", value.toJsFn)
      
      inline def setIsMasked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMasked", value.toJsFn)
      
      inline def setIsSecondary(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSecondary", value.toJsFn)
    }
  }
}
