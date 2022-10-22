package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedStylableBadgeBadgeDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/stylable-badge/Badge.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def badgeDriverFactory(hasElement: ComponentFactory): BadgeDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("badgeDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[BadgeDriver]
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    /** returns elements innerHtml */
    def getContent(): String
    
    /** returns elements innerText */
    def text(): String
  }
  object BadgeDriver {
    
    inline def apply(exists: CallbackTo[Boolean], getContent: CallbackTo[String], text: CallbackTo[String]): BadgeDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getContent = getContent.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[BadgeDriver]
    }
    
    extension [Self <: BadgeDriver](x: Self) {
      
      inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
}
