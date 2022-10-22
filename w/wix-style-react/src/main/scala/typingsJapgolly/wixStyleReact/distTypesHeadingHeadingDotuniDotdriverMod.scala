package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesHeadingMod.HeadingAppearance
import typingsJapgolly.wixStyleReact.distTypesHeadingMod.Size
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingHeadingDotuniDotdriverMod {
  
  trait HeadingUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAppearance(): js.Promise[HeadingAppearance | Null]
    
    def getSize(): js.Promise[Size | Null]
    
    def getTagName(): js.Promise[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
      ]
    
    def getText(): js.Promise[String]
    
    def isLight(): js.Promise[Boolean]
    
    def isMasked(): js.Promise[Boolean]
  }
  object HeadingUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAppearance: CallbackTo[js.Promise[HeadingAppearance | Null]],
      getSize: CallbackTo[js.Promise[Size | Null]],
      getTagName: CallbackTo[
          js.Promise[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
          ]
        ],
      getText: CallbackTo[js.Promise[String]],
      isLight: CallbackTo[js.Promise[Boolean]],
      isMasked: CallbackTo[js.Promise[Boolean]]
    ): HeadingUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAppearance = getAppearance.toJsFn, getSize = getSize.toJsFn, getTagName = getTagName.toJsFn, getText = getText.toJsFn, isLight = isLight.toJsFn, isMasked = isMasked.toJsFn)
      __obj.asInstanceOf[HeadingUniDriver]
    }
    
    extension [Self <: HeadingUniDriver](x: Self) {
      
      inline def setGetAppearance(value: CallbackTo[js.Promise[HeadingAppearance | Null]]): Self = StObject.set(x, "getAppearance", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[Size | Null]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTagName(
        value: CallbackTo[
              js.Promise[
                /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
              ]
            ]
      ): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsLight(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLight", value.toJsFn)
      
      inline def setIsMasked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMasked", value.toJsFn)
    }
  }
}
