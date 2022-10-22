package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedLabelLabelDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/label/Label.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def labelUniDriverFactory(base: UniDriver[Any]): LabelDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("labelUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[LabelDriver]
  
  trait LabelDriver
    extends StObject
       with BaseUniDriver {
    
    /** get the "for" attribute of the component */
    def getForAttribute(): js.Promise[String]
    
    /** get the id of the component */
    def getId(): js.Promise[String]
    
    /** get the label's text */
    def getLabelText(): js.Promise[String]
    
    /** returns true if the label is in ellipsis state */
    def hasEllipsis(): js.Promise[Boolean]
    
    /** true if disabled */
    def isDisabled(): js.Promise[Boolean]
    
    /** send key down on the label */
    def keyDown(key: Any): js.Promise[Unit]
  }
  object LabelDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getForAttribute: CallbackTo[js.Promise[String]],
      getId: CallbackTo[js.Promise[String]],
      getLabelText: CallbackTo[js.Promise[String]],
      hasEllipsis: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      keyDown: Any => js.Promise[Unit]
    ): LabelDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getForAttribute = getForAttribute.toJsFn, getId = getId.toJsFn, getLabelText = getLabelText.toJsFn, hasEllipsis = hasEllipsis.toJsFn, isDisabled = isDisabled.toJsFn, keyDown = js.Any.fromFunction1(keyDown))
      __obj.asInstanceOf[LabelDriver]
    }
    
    extension [Self <: LabelDriver](x: Self) {
      
      inline def setGetForAttribute(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getForAttribute", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setHasEllipsis(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasEllipsis", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setKeyDown(value: Any => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    }
  }
}
