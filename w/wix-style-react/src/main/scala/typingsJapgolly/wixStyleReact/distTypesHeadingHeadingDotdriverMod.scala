package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesHeadingMod.HeadingAppearance
import typingsJapgolly.wixStyleReact.distTypesHeadingMod.Size
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingHeadingDotdriverMod {
  
  trait HeadingDriver
    extends StObject
       with BaseDriver {
    
    def getAppearance(): HeadingAppearance | Null
    
    def getSize(): Size | Null
    
    def getTagName(): /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
    
    def getText(): String
    
    def isLight(): Boolean
    
    def isMasked(): Boolean
  }
  object HeadingDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getAppearance: CallbackTo[HeadingAppearance | Null],
      getSize: CallbackTo[Size | Null],
      getTagName: CallbackTo[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
        ],
      getText: CallbackTo[String],
      isLight: CallbackTo[Boolean],
      isMasked: CallbackTo[Boolean]
    ): HeadingDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getAppearance = getAppearance.toJsFn, getSize = getSize.toJsFn, getTagName = getTagName.toJsFn, getText = getText.toJsFn, isLight = isLight.toJsFn, isMasked = isMasked.toJsFn)
      __obj.asInstanceOf[HeadingDriver]
    }
    
    extension [Self <: HeadingDriver](x: Self) {
      
      inline def setGetAppearance(value: CallbackTo[HeadingAppearance | Null]): Self = StObject.set(x, "getAppearance", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[Size | Null]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTagName(
        value: CallbackTo[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
            ]
      ): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsLight(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLight", value.toJsFn)
      
      inline def setIsMasked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMasked", value.toJsFn)
    }
  }
}
